import java.awt.Toolkit;
import java.lang.*;
import bpc.daw.consola.*;
public class Ejercicio25 {

	public static void main(String[] args) {
		
		Consola c = new Consola("Consola",1000,500);
		Teclado t = c.getTeclado();
		CapaTexto ct = c.getCapaTexto();
		int s = 0;
		ct.println("");
		ct.print("Introduzca una cantidad de segundos en número entero: ");
		try {
			s = t.leerNumeroEntero();
		}catch(Exception error) {
			ct.print(error.getMessage());
		}
		ct.cls();
		Toolkit tool = Toolkit.getDefaultToolkit();
		int re = tool.getScreenResolution();
		for(int i=s;i>=0;i--) {
			ct.setTamTexto(100); //Conversión implícita de int a float que es mayor.
			ct.print((re/50), (re/12), Integer.toString(i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException error) {
				ct.print(error.getMessage());
			}
		}
	}

}
