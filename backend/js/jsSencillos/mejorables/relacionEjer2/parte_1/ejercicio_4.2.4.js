// Descomponer este número: 123456.
var num = 123456;
let arr = ['Unidades: ', 'Decenas: ', 'Centenas: ', 'Unidades de millar: ', 'Decenas de millar: ', 'Centenas de millar: '];
var i = 0;
var resto = 0;
while(num > 0) {
	resto = num % 10;
	num = parseInt(num / 10);
	document.write(arr[i] + resto + "<br/>");
	i++;
}