<?php

namespace App\Controller;

use App\Entity\Foro;
use App\Entity\Tema;
use App\Entity\Hilo;
use App\Entity\User;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

use Sensio \ Bundle \ FrameworkExtraBundle \ Configuration \ IsGranted ;

class MainController extends AbstractController
{
    /**
     * @Route("/main", name="main")
     */
    public function index(): Response
    {
        // Conseguir los foros
        $foros = $this->getDoctrine()->getRepository(Foro::class)->findAll();

        return $this->render('main/index.html.twig', [
            'controller_name' => 'MainController',
            'foros' => $foros
        ]);
    }

    /**
     * @Route("/habilitarTema/{id}&{foro}", name="habilitarTema")
     */
    public function habilitarTema($id, $foro): Response
    {
        $foro = $this->getDoctrine()->getRepository(Foro::class)->find($foro);
        $tema = $this->getDoctrine()->getRepository(Tema::class)->find($id);
        $entityManager = $this->getDoctrine()->getManager();

        // Habilitar o deshabilitar
        $tema->setStatus(!$tema->getStatus());

        $entityManager->persist($tema);
        $entityManager->flush();

        return $this->render('foro/show.html.twig', [
            'foro' => $foro
        ]);
    }

    /**
     * @Route("/habilitarHilo/{id}&{tema}", name="habilitarHilo")
     */
    public function habilitarHilo($id, $tema): Response
    {
        $tema = $this->getDoctrine()->getRepository(Tema::class)->find($tema);
        $hilo = $this->getDoctrine()->getRepository(Hilo::class)->find($id);
        $entityManager = $this->getDoctrine()->getManager();

        // Habilitar o deshabilitar
        $hilo->setStatus(!$hilo->getStatus());

        $entityManager->persist($hilo);
        $entityManager->flush();

        return $this->render('tema/show.html.twig', [
            'tema' => $tema
        ]);
    }

    /**
     * @Route("/users", name="users")
     */
    public function users(): Response
    {
        $users = $this->getDoctrine()->getRepository(User::class)->findAll();

        return $this->render('main/users.html.twig', [
            'users' => $users
        ]);
    }

    /**
     * @Route("/cambioAdmin", name="cambioAdmin"),
     * @IsGranted("ROLE_ADMIN")
     */
    public function cambioAdmin(Request $request): Response
    {
        $user = $this->getDoctrine()->getRepository(User::class)->find($request->query->get('id_user'));
        $entityManager = $this->getDoctrine()->getManager();
        $admin = '1';

        // Cambio de rol
        if($user->getRoles()[0] == "ROLE_ADMIN") {
            $user->setRoles(array("ROLE_USER"));
        }else {
            $user->setRoles(array("ROLE_ADMIN"));
            $admin = '0';
        }

        $entityManager->persist($user);
        $entityManager->flush();

        return new Response($admin);
    }

    /**
     * @Route("/banear/{id}&{tema}", name="banear")
     */
    public function banear($id, $tema): Response
    {
        $tema = $this->getDoctrine()->getRepository(Tema::class)->find($tema);
        $user = $this->getDoctrine()->getRepository(User::class)->find($id);
        $entityManager = $this->getDoctrine()->getManager();

        // Cambio de rol
        if($user->getBanear() == true) {
            $user->setBanear(false);
        }else {
            $user->setBanear(true);
        }

        $entityManager->persist($user);
        $entityManager->flush();

        return $this->render('tema/show.html.twig', [
            'tema' => $tema
        ]);
    }
}
