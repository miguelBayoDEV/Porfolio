<?php

class GameRepository {

	public static function getGames() {
		$db = Conectar::conexion();
		$games = array();
		$result = $db->query("SELECT * FROM games");
		while($row = $result->fetch_assoc()) {
			$games[] = new GameModel($row);
		}
		return $games;
	}

	public static function getGameByTitle($t) {
		$db = Conectar::conexion();
		$games = array();
		$result= $db->query("SELECT * FROM games WHERE title LIKE '%".$t."%'");
		while($row=$result->fetch_assoc()) {
			$games[]= new GameModel($row);
		}
		return $games;
	}

}

?>