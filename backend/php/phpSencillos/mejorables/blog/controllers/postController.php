<?php
// Crear post.
if(isset($_POST['post'])) {
	$db=Conectar::conexion();
	//Meter codigo
	$nombre= "";
	if (isset($_FILES["imagen"])) {
	    $nombre_tmp = $_FILES["imagen"]["tmp_name"];
	    $nombre = basename($_FILES["imagen"]["name"]);
	    move_uploaded_file($nombre_tmp, "imagenes/".$nombre);
	}
	$result=$db->query("INSERT INTO post VALUES ( NULL, '".$_POST['titulo']."','".$_POST['texto']."','".$_POST['fecha']."','".$_POST['autor']."','".$nombre."')");
	$_SESSION['error']="Registro correcto";

}

// Editar post.
if(isset($_GET['edit'])) {
	$post=PostRepository::getPostById($_GET['edit']);
	require('views/EditPostView.phtml');
	exit;
}



if(isset($_POST['editPost'])) {
	$db=Conectar::conexion();
	$nombre= "";
	if (isset($_FILES["editImagen"])) {
	    $nombre_tmp = $_FILES["editImagen"]["tmp_name"];
	    $nombre = basename($_FILES["editImagen"]["name"]);
	    move_uploaded_file($nombre_tmp, "imagenes/".$nombre);
	}
	$result=$db->query("UPDATE post SET titulo = '".$_POST['editTitulo']."', texto = '".$_POST['editTexto']."', fecha = '".$_POST['editFecha']."', autor = '".$_POST['editAutor']."', imagen = '".$nombre."' WHERE id = '".$_POST['id']."'");
	$_SESSION['error']="Post editado correctamente";
}

// Paginación.

?>