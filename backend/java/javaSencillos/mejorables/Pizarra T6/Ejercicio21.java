import java.util.*;
public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int N = s.nextInt();
		
		//Introducir N palabras.
		String[] palabras = new String[N];
		for(int i=0;i<palabras.length;i++) {
			System.out.println("Introduzca palabra: ");
			String palabra = s1.nextLine();
			palabras[i] = palabra;
		}
		
		//Mostrar array con las palabras, sin llaves y con paréntesis.
		//System.out.println(Arrays.toString(palabras));
		
		//For con llaves. No se puede hacer en esté caso For mejorado.
		System.out.print("{");
		for(int i=0;i<N;i++) {
			if(i!=palabras.length-1) {
				System.out.print(palabras[i]+",");
			}else {
				System.out.print(palabras[i]);
			}
		}
		System.out.println("}");
		
		
	}

}
