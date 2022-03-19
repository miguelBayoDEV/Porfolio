<?php

class ComentarioModel 
{
	private $id;
	private $texto;
	private $id_usuario;
	private $id_post;
	private $fecha;
	
	public function __construct($datos)
	{
		$this->id=$datos['id'];
		$this->texto=$datos['texto'];
		$this->id_usuario=$datos['id_usuario'];
		$this->id_post=$datos['id_post'];
		$this->fecha=$datos['fecha'];
	}

	public function getId(){
		return $this->id;
	}
	public function getTexto(){
		return $this->texto;
	}
	public function getIdUsuario(){
		return $this->id_usuario;
	}
	public function getIdPost(){
		return $this->id_post;
	}
	public function getFecha(){
		return $this->fecha;
	}
}

?>