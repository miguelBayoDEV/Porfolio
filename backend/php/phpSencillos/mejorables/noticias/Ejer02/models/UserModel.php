<?php
class UserModel {
	
	// Propiedades
	private $id;
	private $username;
	private $password;
	private $rol;

	// Método mágico constructor, getter y setter
	public function __construct($datos) {
		$this->id = $datos['id'];
		$this->username = $datos['username'];
		$this->password = $datos['password'];
		$this->rol = $datos['rol'];
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