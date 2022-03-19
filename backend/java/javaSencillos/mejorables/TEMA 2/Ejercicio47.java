import java.lang.*;
public class Ejercicio47{
	public static void main(String[] args){
		char caracter='f';
		
			boolean minusculua1 = (int)caracter >=97;
			boolean minuscula2 = (int)caracter <=122;
			boolean minuscula= minusculua1 && minuscula2;
			
			boolean mayusculua1 = (int)caracter >=65;
			boolean mayuscula2 = (int)caracter <=90;
			
			boolean mayuscula= mayusculua1 && mayuscula2;
			
			boolean letra = mayuscula || minuscula;
			
			System.out.println(" El caracter "+caracter+" es una letra? "+letra);
	}
}