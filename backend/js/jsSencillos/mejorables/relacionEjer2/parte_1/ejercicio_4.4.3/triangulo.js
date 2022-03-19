// Programa triángulo.
var num = parseInt(prompt("Introduzca un número entero positivo: "));
var i, j;

if(!isNaN(num) && num > 0) {
	for(i = 1; i <= num; i++) {
    	for(j = 1; j <= i; j++) {
            document.write("*");
        }
        document.write("<br>");
    }

    // Otra forma de hacer un triángulo.
    /*
    for(i=1;i<=num;i++) {
        for(j=1;j<=11-i;j++) {
            document.write("&nbsp");
        }
        for(j=1;j<=i;j++) {
            document.write("*");
        }
        document.write("<br>");
    }
    */
}