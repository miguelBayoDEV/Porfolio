// Pedir número
var x = parseInt(window.prompt("Introduzca un número entero: "));

// Función normal con todas las opciones se hace un for con el parametro pedido.
// Luego con clase Math un random para saber el carácter que se mostrará y se va sumando cada carácter.
function resultado(x) {
	var final = "";
	var caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	var longitud = caracter.length;
	for(let i=0; i<x; i++) {
		final += " - " + caracter.charAt(Math.floor(Math.random() * longitud));
	}
	return final;
}

// Mostrar resultado
document.getElementById("resultado").innerHTML = "Cadena de carácteres: " + resultado(x);