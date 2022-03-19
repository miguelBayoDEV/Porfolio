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
}


?>