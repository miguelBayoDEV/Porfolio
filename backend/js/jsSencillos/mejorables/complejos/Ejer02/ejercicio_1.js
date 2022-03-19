// Función crear cuenta cliente
function crearCuenta() {

	// a) Pedirse al usuario un nombre, apellidos, dirección y edad.
	var nombre = window.prompt("Introduzca nombre del titular de la cuenta:");
	var apellidos = window.prompt("Introduzca apellidos del titular de la cuenta:");
	var direccion = window.prompt("Introduzca dirección del titular de la cuenta:");
	var edad = parseInt(window.prompt("Introduzca edad del titular de la cuenta:"));

	// b) Crear un nuevo objeto cuentacliente que se inicializará con los datos facilitados por el usuario.
	// Función constructora:
	function CuentaBancariaCliente(nombreTitular, apellidosTitular, direccionTitular, edadTitular) {
		this.nombreTitular = nombreTitular;
		this.apellidosTitular = apellidosTitular;
		this.direccionTitular = direccionTitular;
		this.edadTitular = edadTitular;
	}
	// Método añadido con prototype para que muestre los datos de la cuenta creada:
	CuentaBancariaCliente.prototype.datosCuentaClienteCreada = function() {
		return "Nombre titular: " + this.nombreTitular + " - Apellidos titular: " + this.apellidosTitular + " - Dirección titular: " + this.direccionTitular + " - Edad titular: " + this.edadTitular;
	};
	// Crear objeto con los datos:
	var cuentaCliente = new CuentaBancariaCliente(nombre, apellidos, direccion, edad);


	// c) Mostrar un mensaje por pantalla informando de que se ha creado la nueva cuenta cliente imprimiendo los datos asociados a la cuenta creada.
	alert("Se ha creado la nueva cuenta bancaria del cliente.");
	document.getElementById("mostrarDatos").innerHTML = cuentaCliente.datosCuentaClienteCreada();

}

// Modelo de registro de W3C
document.getElementById("crearCuenta").addEventListener("click", crearCuenta, false);