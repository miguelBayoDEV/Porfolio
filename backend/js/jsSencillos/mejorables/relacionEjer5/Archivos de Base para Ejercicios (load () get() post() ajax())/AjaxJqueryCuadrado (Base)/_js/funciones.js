$(document).ready(function(){

	$("#formulario").submit(function() {
		
		var n = {
			numero: $("#nro").val()
		}

		// Función success:
		function resultado(respuesta) {
			$("#resultados").html(respuesta);
		}

		// No es necesario poner el parámetro async: true porque por defecto es asíncrono.
		$.ajax({
			url: "pagina1.php",
			type: "GET",
			data: n,
			success: resultado
		});

		// Para que no se recargue la página:
		return false;
	});
 
});