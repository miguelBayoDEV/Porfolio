// Programa que visualice los números del 1 al 10 en orden inverso.
for(var i = 10; i > 0; i--) {
	document.write(i + "<br/>");
}

var i = 10;

while(i > 0) {
	document.write(i + "<br/>");
	i--;
}

// Programa que visualice una cuenta de números del 1 a 10 y ala vez una cuenta inversa de 10 a 1.
for(var i = 10, j = 1; i > 0 && j<=10; i--, j++) {
	document.write("Cuenta atras: " + i + " - Cuenta adelante: " + j + "<br/>");
}

var i = 10;
var j = 1;

while(i > 0 && j<=10) {
	document.write("Cuenta atras: " + i + " - Cuenta adelante: " + j + "<br/>");
	i--;
	j++;
}

// Programa que visualice los números primos del 1 al 20.
for (var i = 1; i <= 20; i++) {
	var primo = true;
	var contador = 2;
	while((contador <= i / 2) && primo) {
		if ((i % contador) === 0) {
			primo = false;
		}
		contador++;
	}

	if(primo) {
		document.write("Es número primo: " + i + "<br/>");
	}else {
		document.write("No es número primo: " + i + "<br/>");
	}
}