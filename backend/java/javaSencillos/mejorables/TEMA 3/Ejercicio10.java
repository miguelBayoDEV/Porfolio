import bpc.daw.objetos.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caja c = new Caja("Hola");
		c.abrirCaja();
		String abierta = c.getMensaje();
		System.out.println(abierta);
		c.cambiarMensaje("Adios");
		String abierta2 = c.getMensaje();
		System.out.println(abierta2);

	}

}
