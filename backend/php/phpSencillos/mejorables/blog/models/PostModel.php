<?php

class PostModel 
{
	private $id;
	private $titulo;
	private $texto;
	private $fecha;
	private $autor;
	private $imagen;
	private $comentarios;
	
	public function __construct($datos) {
		$this->id=$datos['id'];
		$this->titulo=$datos['titulo'];
		$this->texto=$datos['texto'];
		$this->fecha=$datos['fecha'];
		$this->autor=$datos['autor'];
		$this->imagen=$datos['imagen'];
		$this->comentarios=ComentarioRepository::getComentarioByPost();
	}

	public function getId(){
		return $this->id;
	}
	public function getTitulo(){
		return $this->titulo;
	}
	public function getTexto(){
		return $this->texto;
	}
	public function getFecha(){
		return $this->fecha;
	}
	public function getAutor(){
		return $this->autor;
	}
	public function getImagen(){
		return $this->imagen;
	}
	public function getComentarios(){
		return $this->comentarios;
	}
}

?>