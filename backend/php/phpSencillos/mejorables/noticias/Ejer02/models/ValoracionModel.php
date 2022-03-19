<?php
class Valoracion {

	// Propiedades
	private $val;

	// Método mágico constructor, getter y setter
	public function __construct($datos) {
		$this->id = $datos['valoracion'];
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