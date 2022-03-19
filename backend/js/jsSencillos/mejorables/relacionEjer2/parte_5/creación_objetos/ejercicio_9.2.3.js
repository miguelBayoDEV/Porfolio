// Función constructora.
function Cilindro(radio, altura) {
	this.radio = radio;
	this.altura = altura;
}

Cilindro.prototype.volumen = function() {
	return Math.PI * Math.pow(this.radio, 2) * this.altura;
}

var radio = parseInt(window.prompt("Introduzca el radio del cilindro: "));
var altura = parseInt(window.prompt("Introduzca la altura del cilindro: "));

var objeto = new Cilindro(radio, altura);
document.write("Volumen de un cilindro con cuatro decimales: " + objeto.volumen().toFixed(4) + "cm");