import bpc.daw.objetos.*;
public class Caja1 {
	public static void main(String[] args) {
		Caja c=new Caja("Bienvenidos al instituto");
		
		String mensaje=c.getMensaje();
		System.out.println(mensaje);
		
		c.abrirCaja();
		String men2=c.getMensaje();
		System.out.println(men2);
	}
}
