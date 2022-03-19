<?php
require_once("Models/ErrorHandler.php");
require_once("Models/UserModel.php");
require_once("Models/UserRepository.php");
require_once("Models/NewsModel.php");
require_once("Models/NewsRepository.php");
require_once("Models/ValModel.php");
require_once("Models/ValorationsRepository.php");
session_start();

if(isset($_GET['logout'])){
	$_SESSION['user'] = new User();
}
if(!isset($_SESSION['user']))
	$_SESSION['user']=new User();

if(isset($_GET['userlogin'])){
	require_once("Views/loginView.phtml");
	exit();
}
if(isset($_GET['register'])){
	require_once("Views/registerView.phtml");
	exit();
}
if(isset($_GET['newUser'])){
	UserRepository::register($_POST);
}
if(isset($_GET['login'])){
	$_SESSION['user']->init($_POST['username'], $_POST['pass']);
}
if(isset($_GET['addNews']) AND $_SESSION['user']->isLogged()){
	require_once("Views/addNewsView.phtml");
	exit();
}
if(isset($_POST['newNews'])){
	NewsRepository::addNews($_POST);
	header('location: index.php');
}

if(isset($_GET['valoration']) AND $_SESSION['user']->isLogged()){
	ValorationsRepository::valorarNews($_GET['id'], $_GET['valoration']);
}

if(isset($_GET['del']) AND $_SESSION['user']->isAdmin()){
	NewsRepository::hideNews($_GET['del']);
}

$news=NewsRepository::getNews();

require_once("Views/mainView.phtml");


?>