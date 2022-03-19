$(document).ready(function() {

	$("#login").submit(function () {

		// Empaquetar datos:
		var datosLogin = {
			username: $("#username").val(), 
			password: $("#password").val()
		}

		// Funcion procesar datos de la respuesta del servidor:
		function procesarDatos(result) {

			if(result == "pass") {
				$("#respuesta").html("<p>Pass</p>");
			}else {
				$("#respuesta").html("<p>Fail</p>");
			};

		}

		// La función también se puede hacer anónima function(){...}. Método always() sería perfecto para este caso porque siempre se realiza.
		$.ajax({
			url: "login.php",
			type: "GET",
			async: true,
			data: datosLogin,
			success: procesarDatos
		});

		// Para no cargar la página por el formulario
		return false;
	});
    
});