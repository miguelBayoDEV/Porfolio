<?php
require_once('VehiculoModel.php');
require_once('Cuatro_ruedasModel.php');
require_once('Dos_ruedasModel.php');
require_once('CocheModel.php');
require_once('CamionModel.php');

//Ejercicio 2
//Crear objeto vehiculo sin clase abstracta
//$vehiculo = new Vehiculo("negro", 1500);
//Método circula()
//echo $vehiculo->circula();
//echo '<br/>';
//Añade una persona
//$vehiculo->add_persona(70);
//echo "Nuevo peso del vehículo: " . $vehiculo->peso;
echo '<br/>';
//Crear un vehiculo de la clase cuatro ruedas y usar método repintar() cambia su color
$cuatro=new Cuatro_ruedas("negro", 1500, 5);
echo "Nuevo color: " . $cuatro->repintar("verde");
echo '<br/>';

//Ejercicio 3
//Crear coche
$coche_verde = new Coche("verde", 1400, 5, 0);
//Añadir dos personas
$coche_verde->add_persona(65);
$coche_verde->add_persona(65);
echo "Color: " . $coche_verde->color . " - Nuevo peso: " . $coche_verde->peso;
echo '<br/>';
//Cambiar color coche con repintar()
$coche_verde->repintar("rojo");
//Añadir cadenas de nieve
$coche_verde->añadir_cadenas_nieve(2);
//Mostrar color coche repintado y numero de cadenas para nieve
echo "Color: " . $coche_verde->color . " - Número cadenas nieve: " . $coche_verde->numero_cadenas_nieve;
echo '<br/>';
// Crear objeto dos_ruedas
$dos_ruedas = new Dos_ruedas("negro", 120, 0);
//Añadir persona
$dos_ruedas->add_persona(80);
//Poner 20 litros gasolina que cambia peso en relación a los litros que le pasas al método poner_gasolina()
$dos_ruedas->poner_gasolina(20);
//Mostrar color dos_ruedas y su peso
echo "Color: " . $dos_ruedas->color . " - Peso: " . $dos_ruedas->peso;
echo '<br/>';
//Crear objeto camion
$camion = new Camion("azul", 10000, 2, 10);
//Añadir longitud de remolque
$camion->añadir_remolque(5);
//Añadir persona
$camion->add_persona(80);
//Mostrar color, peso, longitud y número de puertas
echo "Color: " . $camion->color . " - Peso: " . $camion->peso . "Longitud: " . $camion->longitud . "Número de puertas: " . $camion->numero_puertas;
echo '<br/>';

// Ejercicio 4
//Crear un objeto de dos_ruedas
$dos_ruedas1 = new Dos_ruedas("rojo", 150, 0);
//Añadir persona
$dos_ruedas1->add_persona(70);
//Mostrar peso del vehículo
echo "Nuevo peso del vehículo: " . $dos_ruedas1->peso;
echo '<br/>';
//Cambiar color del objeto dos_ruedas
$dos_ruedas1->color = "verde";
//Cambiar la cilindrada del objeto dos_ruedas con método mágico heredado __set()
$dos_ruedas1->cilindrada = 1000;
// Mostrar los valores de los atributos del objeto de dos_ruedas de la función estática ver_atributo
echo Vehiculo::ver_atributo($dos_ruedas1);
echo '<br/>';
// Crear objeto camión
$camion1 = new Camion("blanco", 6000, 0, 0);
//Añadir persona
$camion1->add_persona(84);
//Usar método repintar() al objeto camión
$camion1->repintar("azul");
//Incluir dos puertas al objeto camion
$camion1->numero_puertas = 2;
// Mostrar los valores de los atributos del objeto de camión de la función estática ver_atributo
echo Vehiculo::ver_atributo($camion1);
echo '<br/>';
?>