import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Ejercicio45 {

	public static void main(String[] args) {
		Random r = new Random();
		int numero = r.nextInt(10);
		int conversion = numero*1000;
		Instant comienzo =  Instant.now();
		try {
			
			Thread.sleep(conversion);
			
		}catch(InterruptedException e){
			e.getMessage();
		}
		Instant fin =  Instant.now();
		Duration duracion =Duration.between(comienzo, fin);
		long duracion1 = duracion.getSeconds();
		System.out.println("La pausa ha durado unos "+duracion1+" segundos");
		
		
		
	}

}
/*
 Consulta la �Librer�a est�ndar de Java� y busca las clases Thread y Random. 
 Haz un programa que haga una pausa de una cantidad aleatoria de segundos entre 0 y 10.  
 Consulta ahora el pdf de la librer�a �java time� y busca las clases Instant y Duration. 
 Obt�n un objeto Instant antes de que empiece la pausa y luego otro objeto Instant cuando la pausa termine. 
 A partir de dichos dos objetos, obt�n un objeto Duration y �salo para mostrar cu�ntos segundos ha durado la pausa. 
 */