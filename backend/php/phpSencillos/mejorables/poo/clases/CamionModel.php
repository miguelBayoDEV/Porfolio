<?php
class Camion extends Cuatro_ruedas {
	// Propiedades
	protected $longitud;

	//Constructor
	public function __construct($color, $peso, $numero_puertas, $longitud) {
		parent::__construct($color, $peso, $numero_puertas);
		$this->longitud = $longitud;
	}

	public function añadir_remolque($longitud_remolque) {
		return $this->longitud += $longitud_remolque;
	}
}

?>