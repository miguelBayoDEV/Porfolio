$(document).ready(function(){

	$("#menu a").click(function() {
		var signo = $(this).attr("href");

		// Función succes:
		function detalleSigno(respuesta) {
			$("#detalles").html(respuesta);
		}

		// No es necesario poner el parámetro async: true porque por defecto es asíncrono.
		$.ajax({
			url: signo,
			type: "GET",
			success: detalleSigno
		});

		// Para que no se recargue la página:
		return false;
	});
 
});