$(document).ready(function(){

	$("#menu a").click(function() {

		var signo = $(this).attr("href");

		$("#detalles").load(signo);

		// Para que no se recargue la página:
		return false;

	});

});