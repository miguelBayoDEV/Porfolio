function jubilacion() {
    var nombre = window.prompt("Introduzca nombre:");
    var edad = parseInt(window.prompt("Introduzca edad:"));
    const edadJubilacion = 80;
    document.write(nombre + " te queda " + Number(edadJubilacion-edad) + " años para jubilarte.<br/>");
}
jubilacion();