<?php

namespace App\Controller;

use App\Entity\Comentary;
use App\Entity\Article;
use App\Form\ComentaryType;
use App\Repository\ComentaryRepository;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

/**
 * @Route("/comentary")
 */
class ComentaryController extends AbstractController
{
    /**
     * @Route("/", name="comentary_index", methods={"GET"})
     */
    public function index(ComentaryRepository $comentaryRepository): Response
    {
        return $this->render('comentary/index.html.twig', [
            'comentaries' => $comentaryRepository->findAll(),
        ]);
    }

    /**
     * @Route("/new/{id}&{coment}", name="comentary_new", methods={"GET","POST"})
     */
    public function new(Request $request, $id, $coment): Response
    {
        $comentary = new Comentary();
        $form = $this->createForm(ComentaryType::class, $comentary);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $entityManager = $this->getDoctrine()->getManager();

            // Modificar valores en la creación de los comentarios
            $comentary->setStatus(true);
            $article = $this->getDoctrine()->getRepository(Article::class)->find($id);
            $comentary->setArticle($article);

            $c = $this->getDoctrine()->getRepository(Comentary::class)->find($coment);
            if($coment == 'null') {
                $comentary->setComentary(null);
            }else {
                $comentary->setComentary($c);
            }

            $entityManager->persist($comentary);
            $entityManager->flush();

            return $this->redirectToRoute('article_show', array('id' => $id));
        }

        return $this->render('comentary/new.html.twig', [
            'comentary' => $comentary,
            'form' => $form->createView(),
        ]);
    }

    /**
     * @Route("/{id}", name="comentary_show", methods={"GET"})
     */
    public function show(Comentary $comentary): Response
    {
        return $this->render('comentary/show.html.twig', [
            'comentary' => $comentary,
        ]);
    }

    /**
     * @Route("/{id}/edit", name="comentary_edit", methods={"GET","POST"})
     */
    public function edit(Request $request, Comentary $comentary): Response
    {
        $form = $this->createForm(ComentaryType::class, $comentary);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $this->getDoctrine()->getManager()->flush();

            return $this->redirectToRoute('comentary_index');
        }

        return $this->render('comentary/edit.html.twig', [
            'comentary' => $comentary,
            'form' => $form->createView(),
        ]);
    }

    /**
     * @Route("/{id}", name="comentary_delete", methods={"DELETE"})
     */
    public function delete(Request $request, Comentary $comentary): Response
    {
        if ($this->isCsrfTokenValid('delete'.$comentary->getId(), $request->request->get('_token'))) {
            $entityManager = $this->getDoctrine()->getManager();
            $entityManager->remove($comentary);
            $entityManager->flush();
        }

        return $this->redirectToRoute('comentary_index');
    }
}
