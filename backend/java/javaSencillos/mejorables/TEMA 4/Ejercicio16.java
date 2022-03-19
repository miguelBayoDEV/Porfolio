package Ejercicio16;
import java.lang.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		Consola consola = new Consola();
		Teclado t = consola.getTeclado();
		CapaTexto ct = consola.getCapaTexto();
		try {
			ct.print("Longitud de A (en píxel): ");
			int a = t.leerNumeroEntero();
			ct.print("Longitud de B (en píxel): ");
			int b = t.leerNumeroEntero();
			ct.print("Longitud de C (en píxel): ");
			int c = t.leerNumeroEntero();
			boolean condición = a>0&&b>0&&c>0;
			if(condición) {
				double x = (Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/(2*a);
				double k = Math.pow(b, 2)-Math.pow(x, 2);
				double y = Math.sqrt(k);
				int X = (int) x;
				int K = (int) k;
				int Y = (int) y;
				if(k<0) {
					ct.print("Debido a que k es negativo no se forma ningún triángulo.");
					char z = t.leerCaracter();
				}else {
					ct.cls();
					CapaCanvas cc = consola.getCapaCanvas();
					Graphics g = cc.getGraphics();
					g.drawLine(0, 0, a, 0);
					g.drawLine(0, 0, X, Y);
					g.drawLine(a, 0, X, Y);
					g.dispose();
					t.setTipoCursor(Teclado.CURSOR_NULO);
					char p = t.leerCaracter();
				}
			}else {
				ct.print("Los valores introducidos son 0 o negativos.");
				char m = t.leerCaracter();
			}
		}catch(Exception error) {
			ct.print("El número no es entero.");
		}
		
	}

}
