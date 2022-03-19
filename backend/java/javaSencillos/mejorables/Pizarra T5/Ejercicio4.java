import java.lang.*;
import java.util.Scanner;
import bpc.daw.consola.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		
		int l�mite = 30;
		System.out.println("�Cu�ntas piezas se pueden cazar hoy? "+l�mite);
		System.out.println("---Empezemos la caza: ");
		int contador = 0;
		boolean repetir = true;
		while(repetir) {
			System.out.println("Introduzca el n�mero de piezas cazadas: ");
			int piezas = s.nextInt();
			contador += piezas;
			System.out.println("Usted lleva cazadas "+contador+" piezas de "+l�mite+" posibles.");
			if(contador>l�mite) {
				repetir = false;
				System.out.println("El n�mero m�ximo de piezas ha sido excedido.");
			}
		}
		System.out.println("Pulse una tecla para finalizar.");
		*/
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		try {
			ct.print("Introduzca l�mite de hoy: ");
			int l�mite = t.leerNumeroEntero();
			ct.println("�Cu�ntas piezas se pueden cazar hoy? "+l�mite);
			ct.println("---Empezemos la caza: ");
			int contador = 0;
			boolean repetir = true;
			while(repetir) {
				ct.println("Introduzca el n�mero de piezas cazadas: ");
				int piezas = t.leerNumeroEntero();
				contador += piezas;
				if(contador>l�mite) {
					repetir = false;
					ct.println("El n�mero m�ximo de piezas ha sido excedido.");
				}else {
					ct.println("Usted lleva cazadas "+contador+" piezas de "+l�mite+" posibles.");
				}
			}
			ct.println("Pulse una tecla para finalizar.");
			t.setTipoCursor(Teclado.CURSOR_NULO);
			t.leerCadenaCaracteres();
		}catch(Exception error) {
			ct.print("N�mero incorrecto.");
		}
		
	}
}
