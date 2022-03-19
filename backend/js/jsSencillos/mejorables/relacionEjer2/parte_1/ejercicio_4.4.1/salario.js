// Cálculo de salario.
var nombre = window.prompt("¿Cuál es tu nombre?");
var apellidos = window.prompt("¿Cuáles son tus apellidos?");
var salario = parseFloat(window.prompt("¿Cuál es tu salario (número con decimales)?"));
var edad = window.prompt("¿Cuál es tu edad?");

if(salario < 1000) {	
	if(edad < 30) {
		salario = 1100;
	}else if(edad >= 30 && edad <= 45) {
		salario += (salario * 3.0) / 100;
	}else if(salario > 45) {
		salario += (salario * 15) / 100;
	}
}else if(salario >= 1000 && salario <= 2000) {
	if(edad > 45) {
		salario += (salario * 3) / 100;
	}else if(edad <= 45) {
		salario += (salario * 10) / 100;
	}
}

document.write("Nombre: " + nombre + " - Apellidos: " + apellidos + " - Edad: " + edad + " - Salario: " + salario.toFixed(2) + " euros.");