<?php
if(isset($_POST['username'])){
	$_SESSION['u'] = UserRepository::checkLogin($_POST['username'], $_POST['password']);
	}
	
if(isset($_GET['logout'])){
	//$_SESSION['u']=FALSE;
	session_destroy();
	header('location: index.php');
}

if(isset($_GET['register'])){
	require_once('views/RegisterView.phtml');
	exit;
}

if(isset($_POST['password2'])){
	if($_POST['password1']==$_POST['password2'] && !empty($_POST['newusername'])){
			$db=Conectar::conexion();
			$result=$db->query("SELECT * FROM usuarios WHERE username = '".$_POST['newusername']."'");
			if($row=$result->fetch_assoc())
				{$_SESSION['error']="Usuario ya existe";}
			else {
				$result=$db->query("INSERT INTO usuarios VALUES ( NULL, '".$_POST['newusername']."','".md5($_POST['password1'])."')");
				$_SESSION['error']="Registro correcto";
			}
		}
		else {$_SESSION['error']="Usuario ya existe o contraseñas diferentes";}
	
}


?>