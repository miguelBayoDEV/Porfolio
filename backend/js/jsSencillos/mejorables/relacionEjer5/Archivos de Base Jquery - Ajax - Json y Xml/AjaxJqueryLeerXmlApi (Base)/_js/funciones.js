$(document).ready(() => {
  
	$("button#importarXml").click(function() {

		// Método $.ajax({});
		$.ajax({
			type: "GET",
			url: "https://randomuser.me/api/?results=5&format=XML",
			dataType: "xml"
		})
		.done((data) => {
			$(data).find('results').each(function() {
                let row = $("<tr>");
                row.append($(`<td>${$(this).find('id').find("value").text()}</td>`));
                row.append($(`<td>${$(this).find('name').find("first").text()}</td>`));
                row.append($(`<td>${$(this).find('login').find("username").text()}</td>`));
                row.append($(`<td>${$(this).find("dob").find('age').text()}</td>`));
                $("#personas tbody").append(row);
			});
		});
	});

});