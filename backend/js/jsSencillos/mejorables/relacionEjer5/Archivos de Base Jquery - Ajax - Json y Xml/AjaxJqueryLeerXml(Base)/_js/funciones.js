$(document).ready(() => {
  
	$("button#importarXml").click(function() {

		// Método $.ajax({});
		$.ajax({
			type: "GET",
			url: "personas.xml",
			dataType: "xml"
		})
		.done((data) => {
			$(data).find('persona').each(function() {
                let row = $("<tr>");
                row.append($(`<td>${$(this).find('id').text()}</td>`));
                row.append($(`<td>${$(this).find('nombre').text()}</td>`));
                row.append($(`<td>${$(this).find('apellido').text()}</td>`));
                row.append($(`<td>${$(this).find('edad').text()}</td>`));
                $("#personas tbody").append(row);
			});
		});
	});

});