// Realiza el mismo código que en el ejercicio 3 pero ahora selecciona dicho párrafo mediante otro selector, p:first.
$("h1, p:first").addClass("intro");
$("form > input").click(function() {
	$("p:first").hide();
});