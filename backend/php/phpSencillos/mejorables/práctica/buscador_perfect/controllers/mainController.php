<?php

require_once('models/GameModel.php');
require_once('models/GameRepository.php');

if(isset($_POST['buscar'])) {
		$games = GameRepository::getGameByTitle($_POST['buscar']);
}else {
		$games = GameRepository::getGames();

}


require_once('views/ListView.phtml');

?>