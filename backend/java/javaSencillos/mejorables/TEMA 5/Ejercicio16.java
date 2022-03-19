package T_5_ejercicio_16;
import java.net.InetAddress;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		// Recibe como argumento una dirección IP y un número entero 
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Introduce una dirección IP");
		String iP = s.nextLine();
		
		System.out.println("Introduce un numero entero");
		String numero = s.nextLine();
		
		//Si en el numero no se pasa nada, se toma n=4
		
		int n = 0;
		
		if (numero.equals ("")) {
			
			numero = "4";
			
		}
		
		n = Integer.parseInt(numero);
		
		//Representamos al equipo cuya dirección IP o nombre de dominio se pasa como parámetro.
		
		InetAddress direccion=null;
		
		try {
			
			direccion = InetAddress.getByName(iP);
			
		}catch (Exception error) {
			
			System.out.println("error");
		}
		
		System.out.println("Haciendo ping a "+direccion);
		
		//Realizamos el for tantas veces como hayamos indicado en el n
		
		for (int i = 0 ; i < n ; i++) {
		
			//Representamos dos instantes de tiempo 
			
			Instant instante1 = Instant.now();	
			
			try {
				
				direccion = InetAddress.getByName(iP);
				
				// hacer ping al equipo dentro del tiempo indicado por el parámetro timeout.
				
				direccion.isReachable(30);
				
			}catch (Exception error) {
				
				System.out.println("error");
			}
			
			Instant instante2 = Instant.now();

			//Mostramos el resultado en milisegundos con Duration:
				
				Duration duracion = Duration.between (instante1, instante2);
			
				double ms = duracion.toMillis();
				
				System.out.println("Respuesta desde "+iP+ " "+ms+" ms");
				
		}	
	}
		
}


