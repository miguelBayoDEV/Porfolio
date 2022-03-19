function calculo() {
    var ladoA = parseInt(window.prompt("Introduzca lado A base:"));
    var ladoB = parseInt(window.prompt("Introduzca lado B:"));
    var ladoC = parseInt(window.prompt("Introduzca lado C:"));
    var altura = parseInt(window.prompt("Introduzca altura:"));
    document.write("Área triángulo: " + (ladoA*altura)/2 + "<br/>");
    document.write("Perímetro triángulo: " + Number(ladoA+ladoB+ladoC) + "<br/>");
}
calculo();