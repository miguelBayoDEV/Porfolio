// Programa que muestre números pares del 2 al 20.
for (var i = 2; i <= 20; i+=2) {
	document.write("Número par: " + i + "<br/>");
}

// Otra forma.
for (var i = 2; i <= 20; i++) {
	if(i % 2 == 0) {
		document.write("Número par: " + i + "<br/>");
	}
	// Sino sería impar y no se muestra.
}

// Con while.
var i = 2;
while(i <= 20) {
	if(i % 2 == 0) {
		document.write("Número par: " + i + "<br/>");
	}
	// Sino sería impar y no se muestra.
	i++;
}