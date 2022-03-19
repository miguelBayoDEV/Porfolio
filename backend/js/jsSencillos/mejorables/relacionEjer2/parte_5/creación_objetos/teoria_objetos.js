// Forma 1: Objeto literal Crea objetos aislados (de uno en uno).
// Se suele usar esta forma.
var persona1 = {
	nombre: "María",
	apellido: "Ortega",
	edad: "50",
	colorOjos: "azul"
};

// Forma 2: new Object();
var persona2 = new Object();

persona2.nombre = "María";
persona2.apellido = "Oetega";
persona2.edad = 50;
persona2.colorOjos = "azul";

// Forma 3: Función constructora o constructor (genera más de un objeto con su constructor).
// Se ponen en mayúscula como las clases en Java (primera letra).
function Persona(nombre, apellido, edad, ojos) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.colorOjos = ojos;
}

// Ejemplos para crear objetos con constructor:
var miPadre = new Persona("Luis", "Lopéz", 50, "azul");
var miMadre = new Persona("María", "Reche", 48, "rojo");

// Añadir propiedades a un objeto:
miPadre.nacionalidad = "Española";

// Añadir métodos a un objeto:
miPadre.nombreCompleto = function() {
	return this.nombre + " " + this.apellido;
}

// La herencia se haría con la palabra clave prototype (función que está por encima de los objetos heredados que se crean con la función constructora).
// Persona.prototype (nombre de la función.prototype).
Persona.prototype.nacionalidad = "Española";
Persona.prototype.nombreCompleto = function() {
	return this.nombre + " " + this.apellido;
}

// Eliminar propiedad (palabra clave delete):
delete miPadre.edad;

// Visualización:
document.write(persona); // ....[object Object]
document.getElement("").innerHTML = persona; // ......[object Object]

// Forma 1 (por el nombre de la propiedad):
document.write(miPadre.nombre);
document.write(miPadre["nombre"]);

// Forma 2 (Bucle FOR ... IN):
var x, txt = "";
for(x in miPadre) {
	txt += miPadre[x] + "";
}
document.write(txt);

// Forma 3 (Object.values(objeto)):
var miArray = Object.values(miPadre);

// Forma 4 (JSON.stringify(objeto)):
var miString = JSON.stringify(miPadre);