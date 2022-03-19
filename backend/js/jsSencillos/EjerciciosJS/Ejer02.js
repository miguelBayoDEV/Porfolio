function calculo() {
    var numero = window.prompt("Introduzca número:");
    document.write("Cuadrado número: " + Math.pow(numero, 2) + "<br/>");
    document.write("Cubo número: " + Math.pow(numero, 3) + "<br/>");
    document.write("Raíz número: " + Math.sqrt(numero) + "<br/>");
    document.write("Mitad número: " + numero/2 + "<br/>");
    var invertir = numero.toString().split("").reverse().join("");
    document.write("Invertir número: " + Number(invertir) + "<br/>");
}
calculo();