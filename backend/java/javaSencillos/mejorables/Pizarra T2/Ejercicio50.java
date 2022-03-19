import java.lang.*;
public class Ejercicio50 {
	public static void main(String[] args){
		int archivoDescarga_gigas_seg = 5;
		// Pasar 5 gigas a kilobytes multiplicando por 1024 dos veces.
		int archivoDescarga_kilo_seg = (archivoDescarga_gigas_seg*1024)*1024;
		// Pasar de minutos a segundos multiplicando por 60.
		int primeros10_minutos = 10*60;
		int kilobytes_segundoPrimeros10_minutos = 128;
		// Resultado de descarga de kilobytes por segundo en los primeros 10 minutos y luego se restan al archivo.
		int totaldescargaPrimeros10_minutos = primeros10_minutos*kilobytes_segundoPrimeros10_minutos;
		// Restar del archivo a descargar los primeros 10 minutos descargados.
		int totalResto_minutos = archivoDescarga_kilo_seg - totaldescargaPrimeros10_minutos;
		int kilobytes_segundoResto_tiempo = 64;
		// Dividir lo que queda por descargar entre los kilobytes de la siguiente velocidad.
		int restoTiempo = totalResto_minutos/kilobytes_segundoResto_tiempo;
		// Sumar el tiempo de los 10 primeros minutos y el resto en segundos.
		int totalTiempo_descarga = primeros10_minutos + restoTiempo;
		System.out.println("El tiempo que tardará en descargarse un archivo de 5 gigas es: "+totalTiempo_descarga+" segundos.");
	}
}