// Programa adivinar número.
var min = 1, max = 10;
var num_calculado = Math.floor(Math.random() * max - min + 1) + min;
console.log(num_calculado);
var condicion = true;
var intentos = 0;
var num;

num = prompt("Introduzca un número del 1 al 10: ");

while(condicion == true) {
	// Comprobar si es un número.
	if(isNaN(num)) {
		document.write("Número incorrecto, haz introducido una letra o palabra.");
		num = prompt("Introduzca un número del 1 al 10: ");
	}

	// Comprobar si el número es correcto.
	if(num_calculado == num) {
		intentos++;
		document.write("Se ha acertado, fin del juego. Número de intentos: " + intentos);
		condicion = false;
	}else {
		// Decir si el número es mayor o menor al calculado.
		if(num < num_calculado) {
			document.write("Número es menor.");
		}else {
			document.write("Número es mayor.");
		}
		num = prompt("Introduzca un número del 1 al 10: ");
	}

	// Número de intentos aumentando cada vez.
	intentos++;

	if(condicion == false) {
		nuevo_juego = prompt("¿Quieres volver a jugar de nuevo (sí o no)?");
		if(nuevo_juego.toLowerCase() == "sí" || nuevo_juego.toLowerCase() == "si") {
			condicion = true;
			num_calculado = Math.floor(Math.random() * max - min + 1) + min;
			intentos = 0;
			console.log(num_calculado);
		}
	}

	// Pulsar cancelar en cualquier recuadro.
	if(num == null || num == "") {
		document.write("El juego se ha cancelado.");
		condicion = false;
	}
}