import java.lang.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		
		Consola c = new Consola("Consola", 1000, 700);
		Teclado t = c.getTeclado();
		int s = 0;
		CapaTexto ct = c.getCapaTexto();
		ct.println("");
		ct.print("Introduzca un número de segundos entero: ");
		try {
			s = t.leerNumeroEntero();
		}catch(Exception error) {
			ct.print("Número incorrecto o formato incorrecto.");
		}
		int seg = 100/s;
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		CapaFondo cf = c.getCapaFondo();
		FondoColorSolido fondo = new FondoColorSolido(255,255,255);
		cf.setFondo(fondo);
		Color color = new Color(0,0,255);
		Color color1 = new Color(0,0,0);
		Toolkit tool = Toolkit.getDefaultToolkit();
		int re = tool.getScreenResolution();
		for(int i=0;i<s;i++) {
			int sol = ((i*re)/s)*(re/seg);
			g.setColor(color1);
			g.drawRect(25, 350, sol, 25);
			g.setColor(color);
			g.fillRect(25, 350, sol, 25);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException error) {
				ct.print("Interrupción.");
			}
			g.drawString(Integer.toString(sol)+"%", sol+70, 360);
			g.drawString("Esperando finalización...("+i+" seg de "+s+")", 30, 420);
		}
		t.leerCadenaCaracteres();
	}

}
