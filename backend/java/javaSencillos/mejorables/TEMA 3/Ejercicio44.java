/*Ejercicio 44 : Consulta el pdf de la librería “java time”
  y busca las clases LocalDate y DayOfWeek. Haz un programa
  que muestre por pantalla el nombre del día de la semana 
  que será el 28 de febrero de 2100.*/
import java.time.*;
import java.time.format.DateTimeFormatter;



public class Ejercicio44 {

	public static void main(String[] args) {
		// Declaracion de variables y objetos:
		LocalDate futuro =LocalDate.of(2100, 02, 28);
		DateTimeFormatter patron1 = DateTimeFormatter.ofPattern("eeee");
		String salida1=futuro.format(patron1);
	
		//Salida de resultados:
		System.out.println("Dia de la semana futuro: "+salida1);
	}

}
