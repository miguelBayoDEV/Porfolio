// Programa que pregunta al usuario si es culpable o no.
var result = window.prompt("¿Eres culpable (Sí o no)?");

if((result.toLowerCase() == "si") || (result.toLowerCase() == "sí")) {
	document.write("Irás a la cárcel, la documentación por favor.");
	console.log("Irás a la cárcel, la documentación por favor.");
}else if(result.toLowerCase() == "no") {
	document.write("Irás a casa, la documentación por favor.");
	console.log("Irás a casa, la documentación por favor.");
}