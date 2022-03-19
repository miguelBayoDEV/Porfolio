var alumno = {
	nombre: "Pepe",
	apellidos: "Pue Mil",
	clase: "A",
	edad: "15"
}

var x, txt = "";	
for(x in alumno) {
	txt += alumno[x] + " - ";
}
document.write(txt + "<br/>");

console.log(alumno);

// Borrar propiedad edad.
delete alumno.edad;

var x, txt = "";
for(x in alumno) {
	txt += alumno[x] + " - ";
}
document.write(txt);

console.log(alumno);