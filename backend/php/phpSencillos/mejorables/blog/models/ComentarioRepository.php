<?php

class ComentarioRepository
{
	public static function getComentarioByPost(){
		$db=Conectar::conexion();
		$comentarios= array();
		$result= $db->query("SELECT * FROM comentario");
		while($row=$result->fetch_assoc()){
			$comentarios[]=new ComentarioModel($row);
		}
		return $comentarios;
	}
}


?>