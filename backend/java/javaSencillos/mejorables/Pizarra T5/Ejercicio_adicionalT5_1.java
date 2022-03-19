import java.awt.event.KeyEvent;
import java.lang.*;
import bpc.daw.consola.*;
public class Ejercicio_adicionalT5_1 {

	public static void main(String[] args) {
		
		//Crea un programa que pregunte tu nombre por teclado y uses lectura instantánea te lo muestre en pantalla con distinto tamaño.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaTexto ct = c.getCapaTexto();
		ct.print("Introduzca nombre y dale al espacio para saltarlo rápido: ");
		String n = t.leerCadenaCaracteres();
		boolean repetir = true;
		int i = 0;
		boolean con = t.teclaPulsada(KeyEvent.VK_A);
		while(repetir) {
			if(con) {
				ct.cls();
				repetir=false;
				ct.print(n);
			}else {
				ct.print(n.charAt(i));
				try {
					Thread.sleep(2000);
				}catch(InterruptedException error) {
					ct.print(error.getMessage());
				}
				i++;
			}
		}
		t.leerCaracter();
	}

}
