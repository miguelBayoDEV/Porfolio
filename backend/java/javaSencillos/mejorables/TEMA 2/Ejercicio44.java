import java.lang.*;
public class Ejercicio44 {
	public static void main(String[] args){
		/*
		int a = 5;
		int b = 4;
		int c = 3;
		*/
		String letraA = args[0];
		String letraB = args[1];
		String letraC = args[2];
		int a = Integer.parseInt(letraA);
		int b = Integer.parseInt(letraB);
		int c = Integer.parseInt(letraC);
		boolean rect�ngulo = a*a==(b*b)+(c*c);
		boolean acut�ngulo = a*a<(b*b)+(c*c);
		boolean obtus�ngulo = a*a>(b*b)+(c*c);
		System.out.println("�Es un rect�ngulo? "+rect�ngulo);
		System.out.println("�Es un acut�ngulo? "+acut�ngulo);
		System.out.println("�Es un obtus�ngulo? "+obtus�ngulo);
				
	}
}