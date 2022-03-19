<?php
class NoticiaModel {

	// Propiedades
	private $id;
	private $titulo;
	private $enlace;
	private $username_user;
    private $positives;
    private $negatives;

	// Método mágico constructor, getter y setter
	public function __construct($datos) {
		$this->id = $datos['id'];
		$this->titulo = $datos['titulo'];
		$this->enlace = $datos['enlace'];
		$this->username_user = $datos['username_user'];
		$this->positives=ValoracionRepository::getPositivesByNews($datos['id']);
    
        $this->negatives=ValoracionRepository::getNegativesByNews($datos['id']);
	}

	public function __get($propiedad) {
		if(property_exists($this, $propiedad)) {
			return $this->$propiedad;
		}
	}

	public function __set($propiedad, $valor) {
		if(property_exists($this, $propiedad)) {
			return $this->$propiedad = $valor;
		}
	}
}
?>