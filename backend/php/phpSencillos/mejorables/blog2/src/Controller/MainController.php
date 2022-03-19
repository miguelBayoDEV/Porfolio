<?php

namespace App\Controller;

use App\Entity\Empresa;
use App\Entity\User;
use App\Entity\Logged;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class MainController extends AbstractController
{
    /**
     * @Route("/main", name="main")
     */
    public function index(): Response
    {
        // Conseguir las empresas totales
        if($this->isGranted("ROLE_ADMIN")) {
            $empresas = $this->getDoctrine()->getRepository(Empresa::class)->findAll();
        }else if($this->isGranted("ROLE_OWNER")) {
            // Si es perfil OWNER conseguir las empresas por su id
            $empresas = $this->getDoctrine()->getRepository(Empresa::class)->findBy(array('user' => $this->getUser()->getId()));
        }else if($this->isGranted("ROLE_USER")) {

            $entityManager = $this->getDoctrine()->getManager();

            if($this->getUser()->getLoggeds()->last() && $this->getUser()->getLoggeds()->last()->getFechaEntrada()->format("Y-MM-dd") == date("Y-MM-dd"))
            {
                if($this->getUser()->getLoggeds()->last()->getFechaSalida() == null)
                {
                    $this->getUser()->getLoggeds()->last()->setFechaSalida(new \DateTime());

                    $entityManager->flush();
                }
            }
            else
            {
                $logged = new Logged();
                $logged->setFechaEntrada(new \DateTime());
                $this->getUser()->addLogged($logged);

                $entityManager->persist($logged);
                $entityManager->flush();
            }

            $empresas = array();
        }else {
            $empresas = array();
        }

        

        return $this->render('main/index.html.twig', [
            'controller_name' => 'MainController',
            'empresas' => $empresas
        ]);
    }

    /**
     * @Route("/habilitar/{id}", name="habilitar")
     */
    public function habilitar($id): Response
    {

        $empresa = $this->getDoctrine()->getRepository(Empresa::class)->find($id);
        $entityManager = $this->getDoctrine()->getManager();

        // Poner status true
        $empresa->setStatus(!$empresa->getStatus());

        $entityManager->persist($empresa);
        $entityManager->flush();

        return $this->redirectToRoute("main");
    }

    /**
     * @Route("/cuadrante/{id}", name="cuadrante")
     */
    public function cuadrante($id): Response
    {
        // Conseguir todos los usuarios mirar en que he fallado
        $empleado = $this->getDoctrine()->getRepository(User::class)->find($id);

        return $this->render('main/cuadrante.html.twig', [
            'empleado' => $empleado
        ]);
    }

    /**
     * @Route("/cuadranteEmpresa/{id}&{fecha}&{nombre}", name="cuadranteEmpresa")
     */
    public function cuadranteEmpresa($id, $fecha, $nombre): Response
    {
        // Conseguir todos los usuarios mirar en que he fallado
        $empleados = $this->getDoctrine()->getRepository(User::class)->findBy(array('empresa' => $id));

        // Conseguir filtro fecha
        $fechaEntrada= "";
        $fechaSalida= "";
        foreach($empleados as $empleado) {
            $loggeds = $empleado->getLoggeds();
            for($i=0; $i<count($loggeds);$i++) {
                if($loggeds[$i]->getFechaEntrada()->format("Y-m-d") == $fecha) {
                    $fechaEntrada = $loggeds[$i]->getFechaEntrada()->format("Y:m:d H:m:s");
                }

                if($loggeds[$i]->getFechaSalida()->format("Y-m-d") == $fecha) {
                    $fechaSalida = $loggeds[$i]->getFechaSalida()->format("Y:m:d H:m:s");
                }
            }
        }

        return $this->render('main/cuadranteEmpresa.html.twig', [
            'empleados' => $empleados,
            'nombre' => $nombre,
            'fechaEntrada' => $fechaEntrada,
            'fechaSalida' => $fechaSalida
        ]);
    }
}
