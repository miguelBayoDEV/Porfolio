$(document).ready(() => {
  
	/*$("select#pelis").load("peliculas.json", function(data) {
		$.each(data, function (){
			var m = data.movies;
			for(var i=0; i<m.length; i++) {
				console.log(m[i]);
				$("#year").append(`<option value='${m[i].title}'>${m[i].title}</option>`);
			}
        });
	});*/

	$("select#pelis").change(function() {

		// Método $.ajax({});
		$.ajax({
			type: "GET",
			url: "peliculas.json",
			dataType: "json"
		})
		.done((data) =>{
			$.each(data, function (){
				var m = data.movies;
				for(var i=0; i<m.length; i++) {
					if($("select[name='pelis']").val() == m[i].title) {
						$("#year").html(`<h5>Year: ${m[i].year}</h5>`);
						$("#genre").html(`<h5>Year: ${m[i].genre}</h5>`);
						$("#director").html(`<h5>Year: ${m[i].director}</h5>`);
					}
				}
            });
		});
	});

});