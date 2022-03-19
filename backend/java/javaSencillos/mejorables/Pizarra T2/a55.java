import java.lang.*;
public class a55 {
	public static void main(String[] args){
		int a = 9;
		int b = 4;
		/*
		int resto = b%10;
		int resto1 = a%10;
		a = resto;
		b = resto1;
		System.out.println("A invertido: "+a);
		System.out.println("B invertido: "+b);
		*/
		char B = (char) a;
		char A = (char) b;
		a = A;
		b = B;
		System.out.println("A invertido: "+a);
		System.out.println("B invertido: "+b);
	}
}