var vehículo = window.prompt("¿Qué tipo de vehículo es: coche, moto ó autobús?");
var litros_consumidos = window.prompt("¿Cuántos litros has consumido?");
var precio_kilometro, kms_recorridos, total;

switch(vehículo) {
	case "coche":
		precio_kilometro = 0.10;
		break;
	case "moto":
		precio_kilometro = 0.20;
		break;
	case "autobús":
		precio_kilometro = 0.5;
		break;
	default:
		document.write('Vehículo incorrecto.');
		precio_kilometro = 0;
		break;
}

kms_recorridos = litros_consumidos * precio_kilometro;

if(litros_consumidos >= 0 && litros_consumidos <= 100) {
	total = kms_recorridos + 1;
}else if(litros_consumidos > 100) {
	total = kms_recorridos + 2;
}

document.write("El total a pagar es: " + total.toFixed(2) + " euros.");