package Ejercicio17;
import bpc.daw.consola.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ejercicio17 {

	public static void main(String[] args) {
		Consola c=new Consola();
		CapaTexto tex= c.getCapaTexto();
		
		DateTimeFormatter patron= DateTimeFormatter.ofPattern("HH:mm:ss");
		
		for(int i=0;i<30;i++) {
			LocalTime ahora= LocalTime.now();
			String formato= ahora.format(patron);
			tex.print(11, 26, formato);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException error) {
				System.out.println("interupcion en sleep");
			}
			tex.cls();

			
		}

	}

}
