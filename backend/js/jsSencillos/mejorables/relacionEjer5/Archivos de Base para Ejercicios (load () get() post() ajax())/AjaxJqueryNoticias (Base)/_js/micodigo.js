$(document).ready(function(){

	$("#newslinks a").click(function() {
		var url = $(this).attr("href");
		$("#headlines").load(url + " #newsItem");
		// Para que no se recargue la página (otra forma sería $(this).preventDefault();):
		return false;
	});

});