import java.lang.*;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Consola c = new Consola("Consola",1000,1000); //Crear consola.
		CapaTexto ct = c.getCapaTexto();
		ct.println("");
		ct.print("Se dibujarán ocho rectangulos.");
		Teclado t = c.getTeclado();
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		t.leerCadenaCaracteres();
		ct.cls();
		CapaFondo cf = c.getCapaFondo();
		FondoColorSolido fondo = new FondoColorSolido(255,255,255);
		cf.setFondo(fondo);
		for(int i=0; i<8; i++) {
			Random r = new Random(); //Crear clase random con sus números aleatorios de los colores.
			int rojo = r.nextInt(256);
			int verde = r.nextInt(256);
			int azul = r.nextInt(256);
			Color color = new Color(rojo,verde,azul); //Crear color.
			//Crear los números aleatorios de las coordenadas y sus dimensiones.
			int x = r.nextInt(801);
			int y = r.nextInt(801);
			int a = 1; //He usado la formula para que no de nunca 0 de ancho y alto.
			int w = a+r.nextInt(300-a);
			int h = a+r.nextInt(100-a);
			g.setColor(color);
			g.drawRect(x, y, w, h);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException error) {
				ct.print("Interrupción.");
			}
		}
		g.dispose();
		t.leerCadenaCaracteres();
	}

}
