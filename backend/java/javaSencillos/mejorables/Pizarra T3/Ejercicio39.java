import java.lang.*;
public class Ejercicio39 {

	public static void main(String[] args) {
		// Crear un programa que devuelva el número procesadores y memoria de JAVA en el ordenador.
		Runtime r = Runtime.getRuntime(); // Obtener objeto de la clase Runtime.
		int np = r.availableProcessors();
		// Para calcular la memoria libre: long fm = r.freeMemory(); System.out.println("Memoria libre de la máquina virtual Java: "+fm);
		long tm = r.totalMemory();
		System.out.println("Números de procesadores del ordenador: "+np);
		System.out.println("Memoria total de la máquina virtual Java: "+tm);
	}

}
