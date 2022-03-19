// Pedir número entero o decimal también.
var a = parseFloat(window.prompt("Introduzca en número entero el lado a de la hipotenusa: "));
var b = parseFloat(window.prompt("Introduzca en número entero el lado b de la hipotenusa: "));

// Hacer la función flecha para hallar el lado c de la hipotenusa.
var c = (a,b) => Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

// Mostrar resultado en la etiqueta de HTML5 con id = "resultado"
document.getElementById("resultado").innerHTML = "El resultado del Teorema de Pitágoras del lado C es: " + c(a, b);