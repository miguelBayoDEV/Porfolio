// 1 - Crear instancia de objeto (XMLHttpRequest - XHR):
var mi_xhr = new XMLHttpRequest();

// 2 - Open() -> petición al servidor. Método con get o post:
open("metodo", "url");

/* 
3 - Preparar función JS para procesar la respuesta:
Respuesta: txt, xml, JSON, ...
XHR -> responseText (respuesta)
Valores de respuesta:
"404 file not found"
"500 internal server error"
"403 Acces forbidden"
*/

// Método get(url, [datos_enviar], [función_proceso_respuesta], [tipo]).
// Método post(url, [datos_enviar], [función_proceso_respuesta], [tipo]).
/*
Pasos de los métodos get() y post():
1 - Empaquetado de datos.
2 - Procesar envío del paquete de datos.
3 - Procesado de datos en el servidor.
4 - Servidor envía respuesta.
5 - Procesar la respuesta recibida (modificación del DOM).
*/

// Para hacer un empaquetado de datos con un solo método:
var datosFormulario = $(this).serialize();