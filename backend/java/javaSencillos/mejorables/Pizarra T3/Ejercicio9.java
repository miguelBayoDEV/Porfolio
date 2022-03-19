import bpc.daw.objetos.*;
import java.lang.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		// Mostrar mensaje de la caja.
		Caja c = new Caja("Bienvenidos al instituto.");
		boolean abierta = c.estaAbierta();
		System.out.println("¿Está la caja abierta? "+abierta);
		String consulta = c.getMensaje();
		System.out.println(consulta);
		c.abrirCaja();
		String consulta1 = c.getMensaje();
		System.out.println(consulta1);
	}

}
