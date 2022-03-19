<?php
//cargamos el modelo
require_once("models/PostModel.php");
require_once("models/PostRepository.php");
require_once("models/UserModel.php");
require_once("models/UserRepository.php");
require_once("models/ComentarioModel.php");
require_once("models/ComentarioRepository.php");
session_start();
if(!isset($_SESSION['u'])) {
	$_SESSION['u']=FALSE;
}

if(isset($_GET['user'])) {
	require('controllers/userController.php');
}

if(isset($_GET['posts'])) {
	require('controllers/postController.php');
}

if(isset($_GET['comentarios'])) {
	require('controllers/comentarioController.php');
}

if(isset($_GET['pagina'])) {
	$npagina=$_GET['pagina'];
}else {
	$npagina=1;
}

if(isset($_POST['buscar'])){
	$posts = PostRepository::getPostSearch($_POST['buscador'], $npagina);
	//$posts=PostRepository::getPaginacion($npagina);
	$users=UserRepository::getUsers();
}else {
	$posts=PostRepository::getPaginacion($npagina);
	$users=UserRepository::getUsers();
}

$total=PostRepository::getCount();


require_once("views/ListView.phtml");
?>