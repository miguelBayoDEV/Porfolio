// Programa que visualice del 1 al 10 en orden creciente y decreciente a la vez.
for(var i = 1, j = 10; i <= 10 && j > 0; i++, j--) {
	document.write(i + " - " + j + "<br/>");
}

var i = 1;
var j = 10;

while(i <= 10 && j > 0) {
	document.write(i + " - " + j + "<br/>");
	i++;
	j--;
}