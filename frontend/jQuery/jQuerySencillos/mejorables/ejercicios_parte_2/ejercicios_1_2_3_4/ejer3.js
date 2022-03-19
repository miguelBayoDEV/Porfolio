// Igual que el ejercicio anterior. Suponemos que el encabezado y el primer párrafo tienen el atributo class=”intro”. Deberás ocultar al clickar el botón, dicho párrafo.
$("h1, p:first").addClass("intro");
$("form > input").click(function() {
	$("p").eq(0).hide();
});