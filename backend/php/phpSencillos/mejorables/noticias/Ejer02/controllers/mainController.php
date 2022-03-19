<?php
// Cargar los modelos
require_once('models/UserModel.php');
require_once('models/UserRepository.php');
require_once('models/NoticiaModel.php');
require_once('models/NoticiaRepository.php');
require_once('models/ValoracionModel.php');
require_once('models/ValoracionRepository.php');

// Iniciar sesión
session_start();
if(!isset($_SESSION['user'])) {
	$_SESSION['user'] = FALSE;
}

// User controller
if(isset($_GET['user'])) {
	require('controllers/userController.php');
}

// Noticia controller
if(isset($_GET['new'])) {
	require('controllers/newController.php');
}

// Valorar noticia
if(isset($_GET['val'])){
	ValoracionRepository::valorarNews($_GET['id'], $_GET['val']);
}

// 
if(isset($_GET['delete'])){
	NoticiaRepository::hideNews($_GET['delete']);
}

// Mostrar noticias
$news = NoticiaRepository::getNews();

// Vista principal
require_once("views/MainView.phtml");
?>