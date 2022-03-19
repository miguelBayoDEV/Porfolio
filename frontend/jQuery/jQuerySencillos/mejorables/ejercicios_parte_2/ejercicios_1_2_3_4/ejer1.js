// Al pulsar el botón mediante el selector $(“*”) se debe ocultar todo. Puedes emplear el método hide().
$("form > input").click(function() {
	$("*").hide();
});