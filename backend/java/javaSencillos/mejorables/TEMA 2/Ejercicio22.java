import java.lang.*;
public class Ejercicio22 {
	public static void main (String args[]){

		int lenguajemarcas = 128;
		int redes = 192;
		int hardware = 96;
		int maximoporcentajehoras = 20;
		int porcentajelenguaje = ((lenguajemarcas*maximoporcentajehoras)/100);
		int porcentajeredes = ((redes*maximoporcentajehoras)/100);
		int porcentajehardware = ((hardware*maximoporcentajehoras)/100);

		System.out.println ("Las maximas horas permitidas para faltar en Lenguaje de Marcas es "+porcentajelenguaje+"horas.");
		System.out.println ("Las maximas horas permitidas para faltar en Redes es "+porcentajeredes+"horas.");
		System.out.println ("Las maximas horas permitidas para faltar en Hardware es "+porcentajehardware+"horas.");
	}
}