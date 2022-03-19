function conversionGradoFarinheit() {
    var temperatura = parseInt(window.prompt("Introduzca temperatura celsius:"));
    document.write("Farinheit: " + Number((temperatura*1.8)+32));
}
conversionGradoFarinheit();