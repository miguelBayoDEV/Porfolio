import java.lang.*;
public class Ejercicio13 {
	public static void main(String[] args){
		/*
			Si la variable gradosCentígrados fuera de tipo decimal 
			(double), entonces el resultado sería más preciso = 80.6.
		*/
		int gradosCentígrados = 27;
		double gradosFarenheit = (gradosCentígrados * 9.0/5) + 32;
		System.out.println("La conversión de 27 grados centígrados a Farenheit son: "+gradosFarenheit+" grados.");
	}
}