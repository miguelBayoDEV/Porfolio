import java.lang.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		/*Consola c = new Consola("Consola",500,500);
		CapaTexto ct = c.getCapaTexto();
		ct.println("");
		ct.print("Escribir 20 frases por igual: ");
		Teclado t = c.getTeclado();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		t.leerCadenaCaracteres();
		ct.cls();
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		for(int i=1; i<=20; i++) {
			if(i<=10) {
				g.drawString(i+") En clase no se juega.", 2, 30+i*10);
			}else {
				g.drawString(i+") En clase no se juega.", 300, 0+i*10-70);
			}
		}
		t.leerCadenaCaracteres();*/
		
		Consola c = new Consola("Consola",1500,1000);
		CapaTexto ct = c.getCapaTexto();
		ct.println("");
		ct.print("");
		ct.print("Escribir 20 frases por igual: ");
		Teclado t = c.getTeclado();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		t.leerCadenaCaracteres();
		ct.cls();
		c.esperarSiguienteFrame();
		for(int i=1; i<=20; i++) {
			if(i<=10) {
				ct.print(i, 1, i+") En clase no se juega.");
				ct.saltoLinea();
			}else {
				ct.situarCursor(i-10, 45);
				ct.print(i+") En clase no se juega.");
				ct.saltoLinea();
			}
		}
		t.leerCadenaCaracteres();
	}

}
