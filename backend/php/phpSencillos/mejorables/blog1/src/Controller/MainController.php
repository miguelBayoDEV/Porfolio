<?php

namespace App\Controller;

use App\Entity\Category;
use App\Entity\Article;
use App\Entity\Comentary;
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
        // Conseguir todas las categorias
        $em = $this->getDoctrine()->getRepository(Category::class)->findAll();

        return $this->render('main/index.html.twig', [
            'controller_name' => 'MainController',
            'categories' => $em
        ]);
    }

    /**
     * @Route("/cat", name="cat")
     */
    public function cat(): Response
    {
        $em = $this->getDoctrine()->getRepository(Category::class)->findAll();
        return $this->render('category/index.html.twig', [
            'categories' => $em
        ]);
    }

    /**
     * @Route("/art", name="art")
     */
    public function art(): Response
    {
        $em = $this->getDoctrine()->getRepository(Article::class)->findAll();
        return $this->render('article/index.html.twig', [
            'articles' => $em
        ]);
    }

    /**
     * @Route("/com", name="com")
     */
    public function com(): Response
    {
        $em = $this->getDoctrine()->getRepository(Comentary::class)->findAll();
        return $this->render('comentary/index.html.twig', [
            'comentaries' => $em
        ]);
    }

    /**
     * @Route("/cat/{id}", name="category", methods={"GET"})
     */
    public function category($id): Response
    {
        // Conseguir todas los artículos con array asociativo
        $em = $this->getDoctrine()->getRepository(Category::class)->find($id);

        return $this->render('category/show.html.twig', [
            'category' => $em
        ]);
    }

    /**
     * @Route("/art/{id}", name="article", methods={"GET"})
     */
    public function article($id): Response
    {
        // Conseguir todas los artículos con array asociativo
        $em = $this->getDoctrine()->getRepository(Article::class)->find($id);

        return $this->render('article/show.html.twig', [
            'article' => $em
        ]);
    }

    /**
     * @Route("/publicar/{id}", name="publicar", methods={"GET"})
     */
    public function publicar($id): Response
    {
        $article = $this->getDoctrine()->getRepository(Article::class)->find($id);
        $swamp = $article->getStatus();
        $article->setStatus(!$swamp);
        $entityManager = $this->getDoctrine()->getManager();
        $entityManager->persist($article);
        $entityManager->flush();
        return $this->render('category/show.html.twig', [
            'category' => $article->getCategory()
        ]);
    }

    /**
     * @Route("/swap/{id}", name="swamp", methods={"GET"})
     */
    public function swap($id): Response
    {
        // Conseguir todas los artículos con array asociativo
        $em = $this->getDoctrine()->getRepository(Comentary::class)->find($id);
        $swamp = $em->getStatus();
        $em->setStatus(!$swamp);
        $entityManager = $this->getDoctrine()->getManager();
        $entityManager->persist($em);
        $entityManager->flush();
        return $this->render('article/show.html.twig', [
            'article' => $em->getArticle()
        ]);
    }
}
