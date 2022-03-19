function media5Numeros() {
    var numeros = window.prompt("Introduzca 5 números con coma:");
    var arrayMedia = numeros.split(",");
    let media = 0;
    arrayMedia.forEach(element => {
        media += Number(element);
    });
    document.write("Media aritmética: " + Number(media/arrayMedia.length) + "<br/>");
}
media5Numeros();