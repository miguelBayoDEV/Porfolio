import bpc.daw.objetos.*;
import java.lang.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// Crear mensaje, consultarlo, sustituirlo y volverlo a consultar.
		Caja c = new Caja("Examen de programación es el Miércoles.");
		c.abrirCaja();
		String consulta = c.getMensaje();
		System.out.println(consulta);
		boolean sustituir = c.cambiarMensaje("Examen de programación es el Jueves.");
		consulta = c.getMensaje();
		System.out.println(consulta);
	}

}
