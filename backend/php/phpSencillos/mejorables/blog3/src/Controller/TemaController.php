<?php

namespace App\Controller;

use App\Entity\Hilo;
use App\Entity\Tema;
use App\Entity\Foro;
use App\Form\TemaType;
use App\Repository\TemaRepository;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

use Sensio \ Bundle \ FrameworkExtraBundle \ Configuration \ IsGranted ;

/**
 * @Route("/tema")
 */
class TemaController extends AbstractController
{
    /**
     * @Route("/", name="tema_index", methods={"GET"})
     */
    public function index(TemaRepository $temaRepository): Response
    {
        return $this->render('tema/index.html.twig', [
            'temas' => $temaRepository->findAll(),
        ]);
    }

    /**
     * @Route("/new/{id}", name="tema_new", methods={"GET","POST"}),
     * @IsGranted("ROLE_USER")
     */
    public function new(Request $request, $id): Response
    {
        $tema = new Tema();
        $form = $this->createForm(TemaType::class, $tema);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $entityManager = $this->getDoctrine()->getManager();

            // Modificar status a true == 0
            $tema->setStatus(true);
            $foro = $this->getDoctrine()->getRepository(Foro::class)->find($id);
            $tema->setForo($foro);

            $entityManager->persist($tema);
            $entityManager->flush();

            return $this->redirectToRoute('foro_show', array('id' => $id));
        }

        return $this->render('foro/new.html.twig', [
            'tema' => $tema,
            'form' => $form->createView(),
        ]);
    }

    /**
     * @Route("/{id}", name="tema_show", methods={"GET"})
     */
    public function show(Tema $tema, $id): Response
    {

        // Conseguir los foros
        $hilos = $this->getDoctrine()->getRepository(Hilo::class)->findBy(array('tema' => $id));

        return $this->render('tema/show.html.twig', [
            'tema' => $tema,
            'hilos' => $hilos
        ]);
    }

    /**
     * @Route("/{id}/edit", name="tema_edit", methods={"GET","POST"})
     */
    public function edit(Request $request, Tema $tema): Response
    {
        $form = $this->createForm(TemaType::class, $tema);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $this->getDoctrine()->getManager()->flush();

            return $this->redirectToRoute('tema_index');
        }

        return $this->render('tema/edit.html.twig', [
            'tema' => $tema,
            'form' => $form->createView(),
        ]);
    }

    /**
     * @Route("/{id}", name="tema_delete", methods={"DELETE"})
     */
    public function delete(Request $request, Tema $tema): Response
    {
        if ($this->isCsrfTokenValid('delete'.$tema->getId(), $request->request->get('_token'))) {
            $entityManager = $this->getDoctrine()->getManager();
            $entityManager->remove($tema);
            $entityManager->flush();
        }

        return $this->redirectToRoute('tema_index');
    }
}
