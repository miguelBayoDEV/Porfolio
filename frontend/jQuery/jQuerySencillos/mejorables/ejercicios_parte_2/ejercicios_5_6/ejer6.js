// Oculta todos los primeros elementos de las listas del ejercicio 5.
//$("ul:first li:first, ul:last li:first").hide();
// Otra forma:
$("ul").each(function() {
	$(this).children("li").eq(0).hide();
});