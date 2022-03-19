<?php
//cargamos el modelo
require_once("models/PeliModel.php");
require_once("models/PeliRepository.php");
require_once("models/UserModel.php");
require_once("models/UserRepository.php");
session_start();
if(!isset($_SESSION['u']))
	$_SESSION['u']=FALSE;

if(isset($_GET['user']))
	require('controllers/userController.php');
	

	
if(isset($_POST['busca'])){
	//usar el repositorio para cargar los datos
	
	$movies = PeliRepository::getOrderMovies($_POST['busca']);
}else 
	$movies=PeliRepository::getMovies();


// cargar la vista
require_once("views/ListView.phtml");
?>