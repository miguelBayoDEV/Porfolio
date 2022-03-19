// Ejercicio 2: Escriba un programa para probar si una fecha es un fin de semana.
//Pedir día, mes y año de la fecha con el método prompt de window y con parseInt() hacer que se número entero.
var dia = parseInt(window.prompt("Introduzca el día (en número): "));
var mes = parseInt(window.prompt("Introduzca el mes (en número: 0-11): "));
var año = parseInt(window.prompt("Introduzca el año (en número): "));

// Crear un objeto de la clase Date.
var fecha = new Date(año, mes, dia);

// Función flecha que le pasa el objeto y consigue el día de la semana que comienza por 0
var festivo = x => x.getDay();

// Variable para saber si es festivo el día con true o false.
var resultado = false;
// El mes y el día de la semana comienzan en 0 y acaban en 11 y 6 (los día de la semana empiezan en domingo con cero y el sábado es 6).
//document.write(festivo(fecha));
if(festivo(fecha) == 6 || festivo(fecha) == 0) {
	resultado = true;
}
 // Mostrar resultado por pantalla.
document.write("¿El día " + dia + " - " + mes + " - " + año + " es festivo? " + resultado);