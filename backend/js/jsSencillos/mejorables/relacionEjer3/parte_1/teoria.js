// Nodo HTML
var obj_html = document.documentElement;
//var obj_head = document.head;
//var obj_body = document.body;

// Hijos de nodos HTML
var obj_head = obj_html.firstChild;
var obj_body = obj_html.lastChild;
var obj_head = obj_html.childNodes[0];
var obj_body = obj_html.childNodes[1];

// Números de hijos de HTML
var numHijos = obj_html.childNodes.length;

// Comparaciones de nodos con propiedades
obj_head.parentNode == obj_html;
obj_body.parentNode == obj_html;
obj_body.previousSibling == obj_head;
obj_head.previousSibling == obj_body;
obj_head.ownerDocument == document;

// Acceso a los atributos de un nodo tipo element
var p = document.getElementById('parrafo');

// Se le cambia el valor del atributo style a color rojo
p.atributes.getNamedItem('Style').nodeValue = "color=red";

// Ejemplo 1
document.getElementsByTagName("p")[0].childNodes[1].childNodes[0];