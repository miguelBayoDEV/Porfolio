<?php
class Dos_ruedas extends Vehiculo {
	// Propiedades
	protected $cilindrada;

	//Constructor
	public function __construct($color, $peso, $cilindrada) {
		parent::__construct($color, $peso);
		$this->cilindrada = $cilindrada;
	}

	public function poner_gasolina($litros) {
		return $this->peso = $litros;
	}

	public function add_persona($peso_persona) {
		return $this->peso += $peso_persona + 2;
	}
}

?>