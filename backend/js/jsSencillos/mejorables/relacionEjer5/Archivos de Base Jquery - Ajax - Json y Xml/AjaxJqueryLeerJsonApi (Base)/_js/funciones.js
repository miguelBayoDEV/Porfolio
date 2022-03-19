$(document).ready(() => {
  
	$("button#importarJson").click(function() {

		// Método $.ajax({});
		$.ajax({
			type: "GET",
			url: "https://jsonplaceholder.typicode.com/users",
			dataType: "json"
		})
		.done(

			// Pasarle a la función anónima los datos (data):
			function(data) {
				$.each(data, function(indice, persona) {
			        let row = $("<tr>");
			        row.append($(`<td>${persona.id}</td>`));
			        row.append($(`<td>${persona.name}</td>`));
			        row.append($(`<td>${persona.username}</td>`));
			        row.append($(`<td>${persona.email}</td>`));
			        $("#personas tbody").append(row);
		    	});
			}

		);
	});

});