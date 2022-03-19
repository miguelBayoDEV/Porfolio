<?php
abstract class Vehiculo {
	// Propiedades
	protected $color;
	protected $peso;

	//Constructor
	public function __construct($color, $peso) {
		$this->color = $color;
		$this->peso = $peso;
	}

	//Getter y Setter
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

	public function circula() {
		return "El vehículo circula.";
	}

	abstract public function add_persona($peso_persona);

	public static function ver_atributo($objeto) {
		$result = "";
		foreach ($objeto as $key => $value) {
			$result .=" - " . $value;
		}
		return $result;
	}
}

?>