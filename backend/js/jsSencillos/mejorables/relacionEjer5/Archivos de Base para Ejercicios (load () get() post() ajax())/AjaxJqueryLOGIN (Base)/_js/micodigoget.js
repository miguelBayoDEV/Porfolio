$(document).ready(function() {

	/*$("#login").submit(function () {

		$(this).get("login.php", [
			username: $(this).children("input:text[name='username']"), 
			password: $(this).children("input:text[name='password']")
			]
		);

	});*/

	// Otra forma:
	/*$("#login").submit(function () {

		$(this).get("login.php", [
			username: $("#username").val(), 
			password: $("#password").val()
			]
		);

	});*/


	// Forma final:
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

		// La función también se puede hacer anónima function(){...}.
		$.get(
			"login.php", 
			datosLogin, 
			procesarDatos
		);

		// Para no cargar la página por el formulario
		return false;
	});

});