function frecuenciaVocales() {
    var cadenaTexto = window.prompt("Introduzca una cadena de texto:");
    var numeroA = 0;
    var numeroE = 0;
    var numeroI = 0;
    var numeroO = 0;
    var numeroU = 0;
    numeroA = vocalA(cadenaTexto);
    numeroE = vocalE(cadenaTexto);
    numeroI = vocalI(cadenaTexto);
    numeroO = vocalO(cadenaTexto);
    numeroU = vocalU(cadenaTexto);
    document.write("Contador a en cadena de texto: " + numeroA + "<br/>");
    document.write("Contador e en cadena de texto: " + numeroE + "<br/>");
    document.write("Contador i en cadena de texto: " + numeroI + "<br/>");
    document.write("Contador o en cadena de texto: " + numeroO + "<br/>");
    document.write("Contador u en cadena de texto: " + numeroU + "<br/>");
}

// Métodos contar vocal
function vocalA(cadena) {
    const contador = cadena.match(/[aA]/gi).length;
    return contador;
}

function vocalE(cadena) {
    const contador = cadena.match(/[eE]/gi).length;
    return contador;
}

function vocalI(cadena) {
    const contador = cadena.match(/[iI]/gi).length;
    return contador;
}

function vocalO(cadena) {
    const contador = cadena.match(/[oO]/gi).length;
    return contador;
}

function vocalU(cadena) {
    const contador = cadena.match(/[uU]/gi).length;
    return contador;
}

frecuenciaVocales();