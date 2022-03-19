// Programa comprar helado.
var result = window.prompt("¿Qué tipo de helado quieres (sin topping, oreo, KitKat, brownie y lacasitos)?");
var precio = 0;
switch(result) {
	case 'oreo':
		precio = 1.90 + 1;
		break;
	case 'KitKat':
		precio = 1.90 + 1.50;
		break;
	case 'brownie':
		precio = 1.90 + 0.75;
		break;
	case 'lacasitos':
		precio = 1.90 + 0.95;
		break;
	case 'sin topping':
		precio = 1.90;
		break;
	default:
		document.write("No tenemos este topping, lo sentimos.");
		precio = 1.90;
		document.write("El precio del helado sin ningún topping es: " + precio);
		break;
}

document.write("Precio total del helado " + result + " es: " + precio.toFixed(2) + " euros.");