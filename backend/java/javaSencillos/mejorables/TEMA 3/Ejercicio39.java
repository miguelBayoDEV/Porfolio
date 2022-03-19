

public class Ejercicio39 {
	
	public static void main (String[] args) {
		
		Runtime r = Runtime.getRuntime();
		int procesadores = r.availableProcessors();
		long memoria = r.totalMemory();
		
		System.out.println("Nº de procesadores en el equipo:   "+procesadores);
		System.out.println("Memoria asociada al proceso Java por el SO:   "+((memoria/1024)/1024)+"MB");
		
		
	}

}
