import java.lang.*;
public class Ejercicio22 {
	public static void main(String[] args){
		double porcentajeFaltas = 20;
		// Número de faltas permitados para cada asignatura.
		double lenguajes_marcas = 128;
		double faltas_lenguajes_marcas = (lenguajes_marcas*porcentajeFaltas)/100;
		System.out.println("La cantidad máxima de faltas permitidas para Lenguajes de marcas son: "+faltas_lenguajes_marcas+" faltas.");
		double redes = 192;
		double faltas_redes = (redes*porcentajeFaltas)/100;
		System.out.println("La cantidad máxima de faltas permitidas para Redes son: "+faltas_redes+" faltas.");
		double hardware = 96;
		double faltas_hardware = (hardware*porcentajeFaltas)/100;
		System.out.println("La cantidad máxima de faltas permitidas para Hardware son: "+faltas_hardware+" faltas.");
	}
}