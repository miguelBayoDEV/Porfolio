import java.lang.*;
public class Ejercicio13 {
	public static void main(String[] args){
		/*
			Si la variable gradosCent�grados fuera de tipo decimal 
			(double), entonces el resultado ser�a m�s preciso = 80.6.
		*/
		int gradosCent�grados = 27;
		double gradosFarenheit = (gradosCent�grados * 9.0/5) + 32;
		System.out.println("La conversi�n de 27 grados cent�grados a Farenheit son: "+gradosFarenheit+" grados.");
	}
}