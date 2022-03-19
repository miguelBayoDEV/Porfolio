<?php

/**
 * 
 */
class PeliRepository
{
	//metodo para sacar todas las peliculas
	public static function getMovies(){
		$db=Conectar::conexion();
		$movies= array();
		$result= $db->query("SELECT * FROM peliculas");
		while($row=$result->fetch_assoc()){
				$movies[]=new PeliModel($row);
			}
		return $movies;
	}

	public static function getMovieByTitle($t){
		$db=Conectar::conexion();
		$movies= array();
		$result= $db->query("SELECT * FROM peliculas WHERE titulo LIKE '%".$t."%'");
		while($row=$result->fetch_assoc()){
			$movies[]=new PeliModel($row);
		}
		return $movies;
	}

	public static function getOrderMovies($t) {
		$db=Conectar::conexion();
		$movies= array();
		$order= "";
		$condicion = "";

		if($_POST['order'] == 'titulo') {
			$order = $_POST['order'];
		}elseif($_POST['order'] == 'año') {
			$order = $_POST['order'];
		}elseif($_POST['order'] == 'id') {
			$order = $_POST['order'];
		}else {
			$condicion = true;
		}

		if($condicion) {
			$movies = PeliRepository::getMovieByTitle($t);
		}else {
			$result = $db->query("SELECT * FROM peliculas WHERE titulo LIKE '%".$t."%' ORDER BY ".$order."");

			while($row=$result->fetch_assoc()){
				$movies[]=new PeliModel($row);
			}
		}

		return $movies;
	}
}


?>