import bpc.daw.consola.*;
import java.awt.*;
public class ej1 {

	public static void main(String[] args) {

		//Se muestra por pantalla en rojo "Bienvenidos al instituto"
		Consola c = new Consola();
		CapaTexto texto = c.getCapaTexto();
		texto.setColorTexto(Color.red);
		texto.print("Bienvenidos al instituto");
		
		//Se finaliza el programa en 10seg
		try{
			Thread.sleep(10000);
		}catch(InterruptedException error) {
			System.out.println("Error");
		}
	}

}
