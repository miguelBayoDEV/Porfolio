import java.lang.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		/*Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		ct.print("Se escribirá 20 frase por desigual: ");
		t.leerCadenaCaracteres();
		ct.cls();
		CapaCanvas cc = c.getCapaCanvas(); //Como no lo podía hacer con CapaTexto lo he hecho con Graphics.
		Graphics g = cc.getGraphics();
		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				g.drawString(i+") En clase no se juega.", 20, 0+i*10);
			}else {
				g.drawString(i+") En clase no se juega.", 200, i*10);
			}
		}
		t.leerCadenaCaracteres();*/
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		ct.print("Se escribirá 20 frase por desigual: ");
		t.leerCadenaCaracteres();
		ct.cls();
		c.esperarSiguienteFrame();
		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				ct.print(i, 1, i+") En clase no se juega.");
				ct.saltoLinea();
			}else {
				ct.print(i, 30, i+") En clase no se juega.");
				ct.saltoLinea();
			}
		}
		t.leerCadenaCaracteres();
	}

}
