package Ejer15Tema5; 
import bpc.daw.consola.*;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consola c = new Consola();
		CapaTexto text = c.getCapaTexto();
		Teclado kb = c.getTeclado();
		
		for(int i=1;i<=20;i++) {
			if(i<=10) {
				text.situarCursor(i, 0);
				text.print(i+") No se juega en clase");
			}else {
				text.situarCursor(i-10, 70);
				text.print(i+") No se juega en clase");
			}
		}
		kb.leerCaracter();
	}

}
