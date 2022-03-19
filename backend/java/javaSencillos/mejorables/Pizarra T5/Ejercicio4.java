import java.lang.*;
import java.util.Scanner;
import bpc.daw.consola.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		
		int límite = 30;
		System.out.println("¿Cuántas piezas se pueden cazar hoy? "+límite);
		System.out.println("---Empezemos la caza: ");
		int contador = 0;
		boolean repetir = true;
		while(repetir) {
			System.out.println("Introduzca el número de piezas cazadas: ");
			int piezas = s.nextInt();
			contador += piezas;
			System.out.println("Usted lleva cazadas "+contador+" piezas de "+límite+" posibles.");
			if(contador>límite) {
				repetir = false;
				System.out.println("El número máximo de piezas ha sido excedido.");
			}
		}
		System.out.println("Pulse una tecla para finalizar.");
		*/
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		try {
			ct.print("Introduzca límite de hoy: ");
			int límite = t.leerNumeroEntero();
			ct.println("¿Cuántas piezas se pueden cazar hoy? "+límite);
			ct.println("---Empezemos la caza: ");
			int contador = 0;
			boolean repetir = true;
			while(repetir) {
				ct.println("Introduzca el número de piezas cazadas: ");
				int piezas = t.leerNumeroEntero();
				contador += piezas;
				if(contador>límite) {
					repetir = false;
					ct.println("El número máximo de piezas ha sido excedido.");
				}else {
					ct.println("Usted lleva cazadas "+contador+" piezas de "+límite+" posibles.");
				}
			}
			ct.println("Pulse una tecla para finalizar.");
			t.setTipoCursor(Teclado.CURSOR_NULO);
			t.leerCadenaCaracteres();
		}catch(Exception error) {
			ct.print("Número incorrecto.");
		}
		
	}
}
