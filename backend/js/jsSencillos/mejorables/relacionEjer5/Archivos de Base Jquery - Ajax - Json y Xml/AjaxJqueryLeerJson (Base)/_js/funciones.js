$(document).ready(() => {
  
	$("button#importarJson").click(function() {

		// Método $.ajax({});
		$.ajax({
			type: "GET",
			url: "personas.json",
			dataType: "json"
		})
		.done(

			// Pasarle a la función anónima los datos (data):
			function(data) {
				$.each(data, function(indice, persona) {
			        let row = $("<tr>");
			        row.append($(`<td>${persona.id}</td>`));
			        row.append($(`<td>${persona.nombre}</td>`));
			        row.append($(`<td>${persona.apellido}</td>`));
			        row.append($(`<td>${persona.edad}</td>`));
			        $("#personas tbody").append(row);
		    	});
			}

		);
	});

});