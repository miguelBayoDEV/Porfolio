<?php
class Coche extends Cuatro_ruedas {
	// Propiedades
	protected $numero_cadenas_nieve;

	//Constructor
	public function __construct($color, $peso, $numero_puertas, $numero_cadenas_nieve) {
		parent::__construct($color, $peso, $numero_puertas);
		$this->numero_cadenas_nieve;
	}

	public function añadir_cadenas_nieve($num) {
		return $this->numero_cadenas_nieve = $num;
	}

	public function quitar_cadenas_nieve($num) {
		return $this->numero_cadenas_nieve = $num;
	}
}

?>