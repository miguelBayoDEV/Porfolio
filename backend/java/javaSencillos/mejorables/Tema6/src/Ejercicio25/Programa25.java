package Ejercicio25;
/* Realiza un programa que cree una tabla con tu horario de clases. El programa preguntará al usuario que escriba el 
 * nombre de una asigntura, y mostrará por pantalla todos los días y horas en los que hay clase de esa asignatura. */

import java.util.Scanner;

public class Programa25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[][] horario = {

			{ "Horas", "Martes", "Miercoles", "Jueves", "Viernes" },
			{ "16:00-16:55", "Sistemas", "Base de Datos", "Lenguaje de Marcas", "Programacion" },
			{ "16:55-17:50", "Sistemas", "Base de Datos", "Lenguaje de Marcas", "Programacion" },
			{ "17:50-18:45", "Sistemas", "Base de Datos", "Base de Datos", "Programacion" },
			{ "19:00-19:55", "Base de Datos", "Programacion", "Entornos", "Entornos" },
			{ "19:55-20:50", "Base de Datos", "Programacion", "Programacion", "Lenguaje de Marcas" },
			{ "20:50-21:45", "Base de Datos", "Programacion", "Programacion", "Lenguaje de Marcas" }

		};
		
		System.out.println("Escribe el nombre de una asignatura.");
		String asignatura = scanner.nextLine();
		
		for (int i=0; i<horario.length; i++) {
			for (int j=0; j<horario[i].length;j++) {
				if(asignatura.equalsIgnoreCase(horario[i][j])) {			
					System.out.println(horario[0][j]+" - "+horario[i][0]+" - "+horario[i][j]+" - ");
				} 		
			}
			
			//System.out.println();
		}
	}
}

