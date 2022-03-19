// Ejercicio 1 - Selecciones:
// 1-Seleccionar todos los elementos div que poseen la clase “module”.
$("div.module");
// 2-Especificar tres selecciones que puedan seleccionar el tercer ítem de la lista desordenada #myList. ¿Cuál es el mejor para utilizar? ¿Por qué? El primero creo que es mejor porque es más directo.
$("#myListItem");
$("#myList li:nth-child(3)");
$("#myList").children().eq(2);
$("#myList").children("#myListItem");
$("#myList").children().first().next().next();
// 3-Seleccionar el elemento label del elemento input utilizando un selector de atributo.
$("label[for=q]");
// 4-Averiguar cuantos elementos en la página están ocultos (ayuda: .length).
$(":hidden").length;
// 5-Averiguar cuantas imágenes en la página poseen el atributo alt.
$("img[alt]").length;
// 6-Seleccionar todas las filas impares del cuerpo de la tabla.
$("table#fruits tr:odd");

// Ejercicio 2 - Recorrer el DOM:
// 1-Seleccionar todas las imágenes en la página; registrar en la consola el atributo alt de cada imagen.
$("img[alt]").each(function() {
	console.log($(this).attr("alt"));
});
// 2-Seleccionar el elemento input, luego dirigirse hacia el formulario y añadirle una clase al mismo.
$("input").parent().addClass("nuevaClase");
// 3-Seleccionar el ítem que posee la clase “current” dentro de la lista #myList y remover dicha clase en el elemento; luego añadir la clase “current” al siguiente ítem de la lista.
$("#myList li.current").removeClass("current").next().addClass("current");
// 4-Seleccionar el elemento select dentro de #specials; luego dirigirse hacia el botón submit.
$("#specials select").parent().next().children("input[type=submit]");
// Otra forma:
$("#specials select").closest("form").find("input[type=submit]").val("Ir"); // Cambia el valor de Go a Ir con val()
// 5-Seleccionar el primer ítem de la lista en el elemento #slideshow; añadirle la clase “current” al mismo y luego añadir la clase “disabled” a los elementos hermanos.
$("ul#slideshow li").children().first()addClass("current").siblings().addClass("disabled");
// Otra forma:
$("ul#slideshow li:first").addClass("current").siblings().addClass("disabled");

// Ejercicio 3 - Manipulación:
// 1-Añadir 5 nuevos ítems al final de la lista desordenada #myList. Ayuda: for(var i=0; i<5; i++) {...}
for(var i = 8; i< 13; i++)
{
	$("#myList").append("<li>Nuevo elemento " + i + "</li>");
}
// Otra forma:
var count = $("#myList li").length;
for(var i=i; i <= count + 5; i++) {
	$("#myList").append("<li>Nuevo elemento " + i + "</li>");
}
// 2-Remover los ítems impares de la lista.
$("#myList li:even").remove();
// 3-Añadir otro elemento h2 y otro párrafo al último div.module.
$("div.module:last").append("<h2>Nuevo título</h2>").append("<p>Nuevo párrafo</p>");
// 4-Añadir otra opción al elemento select; darle a la opción añadida el valor “Wednesday”.
$("select").append("<option value='wednesday'>Wednesday</option>");
// 5-Añadir un nuevo div.module a la página después del último; luego añadir una copia de una de las imágenes existentes dentro del nuevo div.
$("div.module:last").after("<div class='module' id='Nueva'></div>");
$img = $("img");
$("#Nueva").append("<img src='" + $img.attr("src") + "' alt='" + $img.attr("alt") + "'>");