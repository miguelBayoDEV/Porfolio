function conversorMetros() {
    var metros = parseInt(window.prompt("Introduzca número de metros:"));
    document.write("Conversor a centímetros: " + Number(metros*100) + " cm<br/>");
    document.write("Conversor a kilometros: " + Number(metros/1000) + " km<br/>");
    document.write("Conversor a pies: " + Number(metros*3.2808399) + " pies<br/>");
    document.write("Conversor a pulgadas: " + Number(metros*39.3700787) + " pulgadas<br/>");
}
conversorMetros();