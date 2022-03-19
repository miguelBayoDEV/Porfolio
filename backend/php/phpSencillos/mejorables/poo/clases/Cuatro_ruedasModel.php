<?php
class Cuatro_ruedas extends Vehiculo {
	// Propiedades
	protected $numero_puertas;

	//Constructor
	public function __construct($color, $peso, $numero_puertas) {
		parent::__construct($color, $peso);
		$this->numero_puertas = $numero_puertas;
	}
	
	public function repintar($color) {
		return $this->color = $color;
	}

	public function add_persona($peso_persona) {
		return $this->peso += $peso_persona;
	}
}

?>