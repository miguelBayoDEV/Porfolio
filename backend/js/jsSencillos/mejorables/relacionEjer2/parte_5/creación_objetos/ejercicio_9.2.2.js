var alumno = {
	nombre: "Pepe",
	apellidos: "Pue Mil",
	clase: "A",
	edad: "15"
}

document.write("Primera forma: " + alumno.nombre + " - " + alumno["apellidos"] + " - " + alumno.clase + " - " +  + alumno["edad"] + "<br/>");

var x,txt="";
for(x in alumno) {
txt += alumno[x] + " - ";
}
document.write("Segunda forma: " + txt + "<br/>");

var al = Object.values(alumno);
document.write("Tercera forma: " + al + "<br/>");

var a = JSON.stringify(alumno);
document.write("Cuarta forma: " + a + "<br/>");