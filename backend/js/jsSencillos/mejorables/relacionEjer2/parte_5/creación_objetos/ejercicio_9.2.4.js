// Función botón.
function datos() {
	var result = window.prompt("Introduzca nombre titular, apellidos titular, saldo cuenta").split(",");

	// Función constructora.
	function CuentaBancaria(nombreTitular, apellidosTitular, saldoCuenta) {
		this.nombreTitular = nombreTitular;
		this.apellidosTitular = apellidosTitular;
		this.saldoCuenta = saldoCuenta;
	}

	CuentaBancaria.prototype.stringDatos = function() {return "Nombre titular: " + this.nombreTitular + " - Apellidos titular: " + this.apellidosTitular + " - Saldo cuenta: " + this.saldoCuenta + " euros."};

	var cuentaBancaria = new CuentaBancaria(result[0], result[1], result[2]);
	alert("Se ha creado la cuenta bancaria.");
	document.getElementById("mostrar").innerHTML = cuentaBancaria.stringDatos();
}