<?php

class PostRepository
{
	public static function getPosts(){
		$db=Conectar::conexion();
		$posts= array();
		$result= $db->query("SELECT * FROM post");
		while($row=$result->fetch_assoc()){
			$posts[]=new PostModel($row);
		}
		return $posts;
	}

	public static function getPostById($id){
		$db=Conectar::conexion();
		$result= $db->query("SELECT * FROM post WHERE id = ".$id."");
		return new PostModel($result->fetch_assoc());
	}

	public static function getPostSearch($search, $limit){
		$db=Conectar::conexion();
		$posts= array();
		$result= $db->query("SELECT * FROM post WHERE titulo LIKE '%".$search."%' OR texto LIKE '%".$search."%' LIMIT ".$limit.",5");
		while($row=$result->fetch_assoc()){
			$posts[]=new PostModel($row);
		}
		return $posts;
	}

	public static function getCount() {
		$db=Conectar::conexion();
		$result= $db->query("SELECT COUNT(*) FROM post");
		return $result->fetch_assoc();
	}

	public static function getPaginacion($limit) {
		$db=Conectar::conexion();
		$paginacion= array();
		$limit = $limit *5 - 5;
		$result=$db->query("SELECT * FROM post LIMIT ".$limit.",5");
		while($row=$result->fetch_assoc()){
			$paginacion[]=new PostModel($row);
		}
		return $paginacion;
	}
}


?>