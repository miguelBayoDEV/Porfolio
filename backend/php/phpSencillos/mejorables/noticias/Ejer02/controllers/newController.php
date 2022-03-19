<?php
// Insertar noticia
if(isset($_GET['create'])) {
	$db=Conectar::conexion();
	$result=$db->query("INSERT INTO noticias VALUES ( NULL, '".$_POST['new']."','".$_POST['url']."','".$_SESSION['user']->username."', 1)");
}
?>