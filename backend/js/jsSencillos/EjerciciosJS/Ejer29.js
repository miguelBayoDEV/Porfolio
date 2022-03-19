function mediaNotas() {
    let arrayNotas = [];
    let arrayAsignaturas = ["matemáticas", "lengua", "dibujo técnico", "informática", "inglés", "francés", "alemán", "japonés", "biología", "tecnología"];
    for(let nota in arrayAsignaturas) {
        arrayNotas[nota] = parseFloat(window.prompt("Introduzca nota de " + arrayAsignaturas[nota] + ":"));
    }
    let media = 0.0;
    arrayNotas.forEach(element => {
        media += Number(element);
    });
    document.write("Media de todas las notas: " + Number(media/arrayNotas.length) + "<br/>");
}
mediaNotas();