import java.lang.*;
import java.util.*;
import java.awt.*;
import bpc.daw.consola.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		Consola c = new Consola("Consola",1000,1000);
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		CapaCanvas cc = c.getCapaCanvas();
		ct.println(" ");
		ct.println("¿Cuántos círculos desea dibujar? ");
		try {
			int n = t.leerNumeroEntero();
			int contador = 0;
			boolean repetir = true;
			if(n<0) {
				ct.print("Número incorrecto.");
				repetir = false;
			}else {
				ct.cls();
				Random r = new Random();
				Graphics g = cc.getGraphics();
				while(repetir) {
					int rojo = r.nextInt(256);
					int verde = r.nextInt(256);
					int azul = r.nextInt(256);
					Color color = new Color(rojo,verde,azul);
					int x = r.nextInt(950);
					int y = r.nextInt(950);
					g.setColor(color);
					g.fillOval(x, y, 50, 50);
					Thread.sleep(1000);
					contador++;
					if(contador==n) {
						repetir = false;
					}
				}
				g.dispose();
			}
		}catch(Exception error) {
			ct.print("Número incorrecto.");
		}
		t.setTipoCursor(Teclado.CURSOR_NULO);
		t.leerCadenaCaracteres();
	}
}
