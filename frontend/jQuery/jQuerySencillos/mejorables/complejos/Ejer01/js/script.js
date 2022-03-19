// Función para que se ejecute el código de jQuery al cargarse la página
$( function () {

	// Prevenir que se recargue la página al enviar el formulario
    $("#formulario").submit(function(e) {
        e.preventDefault();
    });


	// Crear artículo nuevo en el div de lista
	$("#btnAnadir").click(function() {
		// Calcular valores que se pasa del formulario producto y crear el artículo:
		var producto = $("#producto").val();
		var precio = $("#precio").val();
		var cantidad = $("#cantidad").val();
		var total = precio * cantidad;
		$("#lista").append("<article class='lineaArticulo'><span>"+producto+"</span><span>"+precio+"</span><span>Cantidad:<input type='number'  min='1' max='100' class='cant' value='"+cantidad+"'></span><span class='lineaTotal'>"+total+"</span><button class='botonBorrar'>Borrar</button></article>");
	});

	

});