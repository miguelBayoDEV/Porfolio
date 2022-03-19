import java.lang.*;
import bpc.daw.consola.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		try {
			ct.print("Cantidad de color rojo: ");
			int rojo = t.leerNumeroEntero();
			ct.print("Cantidad de color verde: ");
			int verde = t.leerNumeroEntero();
			ct.print("Cantidad de color azul: ");
			int azul = t.leerNumeroEntero();
			boolean color = (rojo>=0&&rojo<=255)&&(verde>=0&&verde<=255)&&(azul>=0&&azul<=255);
			if(color) {
				CapaFondo cf = c.getCapaFondo();
				FondoColorSolido fcs = new FondoColorSolido(rojo,verde,azul);
				cf.setFondo(fcs);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				char car = t.leerCaracter();
			}
		}catch(Exception error) {
			ct.println("Debe poner un número entero.");
		}
	}

}
