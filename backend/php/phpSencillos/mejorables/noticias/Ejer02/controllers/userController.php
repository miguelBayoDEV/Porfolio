<?php
// Crear sesión usuario.
if(isset($_POST['username'])) {
	$_SESSION['user'] = UserRepository::checkLogin($_POST['username'], $_POST['password']);
}

// Logout de sesion
if(isset($_GET['logout'])){
	session_destroy();
	header('location: index.php');
}

// Vista del registro
if(isset($_GET['register'])){
	require_once('views/RegisterView.phtml');
	exit;
}

// Comprobación contraseña y usuario creación del registro
if(isset($_POST['password2'])){
	if($_POST['password1']==$_POST['password2'] && !empty($_POST['newusername'])){
		$db=Conectar::conexion();
		$result=$db->query("SELECT * FROM usuarios WHERE username = '".$_POST['newusername']."'");
		if($row=$result->fetch_assoc()) {
			$_SESSION['error']="Usuario ya existe";
		}else {
			$result=$db->query("INSERT INTO usuarios VALUES ( NULL, '".$_POST['newusername']."','".$_POST['password1']."','".$_POST['rol']."','".$_POST['correo']."')");
			$_SESSION['error']="Registro correcto";
		}
	}else {
		$_SESSION['error']="Usuario ya existe o contraseñas diferentes";
	}
	
}
?>