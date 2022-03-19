<?php
if(isset($_GET['create'])){
	require_once("views/ComentarioView.phtml");
	exit;
}
// Crear comentario.
if(isset($_POST['comentario'])) {
	$db=Conectar::conexion();
	$result=$db->query("SELECT * FROM comentario WHERE texto = '".$_POST['texto']."'");
	if($row=$result->fetch_assoc()) {
		$_SESSION['error']="Comentario ya existe";
	}else {
		$result=$db->query("INSERT INTO comentario VALUES ( NULL, '".$_POST['texto']."','".$_POST['id_usuario']."','".$_POST['id_post']."','".$_POST['fecha']."')");
		$_SESSION['error']="Registro correcto";
	}
}
?>