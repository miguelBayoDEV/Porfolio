import bpc.daw.objetos.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Creamos las cajas
		
		Caja c1=new Caja("Soy la caja 1");
		Caja c2= new Caja ("Soy la caja 2");
		
		
		//Mostramos los mensajes
		
		c1.abrirCaja();
		c2.abrirCaja();
		
		String mensaje1=c1.getMensaje();
		String mensaje2=c2.getMensaje();
		System.out.println(mensaje1);
		System.out.println(mensaje2);
		
		//Intercambiamos los mensajes

		c1.cambiarMensaje(mensaje2);//Aqui cambio el mensaje 1 por el 2
		c2.cambiarMensaje(mensaje1);//Aqui cambio el mensaje 2 por el 1
		
		String nuevo1=c1.getMensaje();//Consulta, si la caja está abierta, el mensaje que hay dentro de la caja.
		String nuevo2=c2.getMensaje();
		
		System.out.println(nuevo1);//Mostramos por pantalla los nuevos mensajes
		System.out.println(nuevo2);
	
	
	}

}
