<?php
//cargamos el modelo
require_once("models/PeliModel.php");
require_once("models/PeliRepository.php");


if(isset($_POST['busca'])){
//usar el repositorio para cargar los datos
$movies=PeliRepository::getMovieByTitle($_POST['busca']);
}else 
$movies=PeliRepository::getMovies();


// cargar la vista
require_once("views/ListView.phtml");
?>