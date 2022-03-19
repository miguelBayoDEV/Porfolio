import bpc.daw.objetos.*;
import java.lang.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		// Crear dos cajas e intercambiar sus mensajes.
		String caja = "Mensaje 1.";
		String caja1 = "Mensaje 2.";
		Caja c = new Caja(caja);
		Caja c1 = new Caja(caja1);
		c.abrirCaja();
		c1.abrirCaja();
		String consulta = c.getMensaje();
		String consulta1 = c1.getMensaje();
		System.out.println("Caja 1: "+consulta);
		System.out.println("Caja 2: "+consulta1);
		boolean sustituir = c.cambiarMensaje(caja1);
		boolean sustituir1 = c1.cambiarMensaje(caja);
		consulta = c.getMensaje();
		consulta1 = c1.getMensaje();
		System.out.println("Caja 1: "+consulta);
		System.out.println("Caja 2: "+consulta1);
	}

}
