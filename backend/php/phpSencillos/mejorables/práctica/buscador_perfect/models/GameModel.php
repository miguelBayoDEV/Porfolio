<?php

class GameModel {

	private $id;
	private $title;
	private $year;
	private $img;

	function __construct($datos) {

		$this->id = $datos['ID'];
		$this->title = $datos['TITLE'];
		$this->year = $datos['YEAR'];
		$this->img = $datos['IMG'];

	}

	public function getId() {
		return $this->id;
	}

	public function getTitle() {
		return $this->title;
	}

	public function getYear() {
		return $this->year;
	}

	public function getImg() {
		return $this->img;
	}
	
}

?>