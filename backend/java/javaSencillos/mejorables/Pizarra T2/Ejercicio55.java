import java.lang.*;
public class Ejercicio55 {
	public static void main(String[] args){
		String a1 = args[0];
		String b1 = args[1];
		double a = Double.parseDouble(a1);
		double b = Double.parseDouble(b1);
		/*
		int resto = b%10;
		int resto1 = a%10;
		a = resto;
		b = resto1;
		System.out.println("A invertido: "+a);
		System.out.println("B invertido: "+b);
		*/
		/*
		Otra forma sería intercambiar los valores:
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		System.out.println("A invertido: "+b);
		System.out.println("B invertido: "+a);
		*/
		double B = (a*b)/a;
		double A = (a*b)/b;
		System.out.println("A invertido: "+B);
		System.out.println("B invertido: "+A);
	}
}