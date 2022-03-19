function operacionesNumeros() {
    var numero1 = parseInt(window.prompt("Introduzca número 1:"));
    var numero2 = parseInt(window.prompt("Introduzca número 2:"));
    document.write("Suma: " + Number(numero1+numero2) + "<br/>");
    document.write("Resta: " + Number(numero1-numero2) + "<br/>");
    document.write("Multiplicación: " + Number(numero1*numero2) + "<br/>");
    document.write("División: " + Number(numero1/numero2) + "<br/>");
    document.write("Media: " + Number((numero1+numero2)/2) + "<br/>");
}
operacionesNumeros();