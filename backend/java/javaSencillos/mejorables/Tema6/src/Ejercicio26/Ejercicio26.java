package Ejercicio26;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// Realiza un programa que cree una tabla con tu horario de clases. El programa preguntará 
		//al usuario que escriba el nombre de una asigntura, y contará cuántas clases semanales se
		//imparten de esa asignatura, y cuántas de ellas son a primera hora.
		String [][] horario = {
				
				{"FOL","Sistemas","Base de Datos","Lenguaje de marcas","Entornos"},
				{"FOL","Sistemas","Base de Datos","Lenguaje de marcas","Programación"},
				{"FOL","Sistemas","Programación ","Base de Datos","Programación"},
				{"Sistemas","Base de Datos","Programación","Programación","Programación"},
				{"Sistemas","Base de Datos","Programación","Programación","Lenguaje de marcas"},
				{"Sistemas","Base de Datos","Entornos","Entornos","Lenguaje de marcas"}
				
		};
		Scanner s = new Scanner (System.in);
		System.out.println("Escribe el nombre de una asignatura");
		String asignatura = s.nextLine();
		String hora = "No";
		int contador = 0 ; 
		boolean primeraHora = false;
		for (int i = 0 ; i<horario.length;i++) {
			for (int j = 0 ; j<horario[i].length;j++) {
				if (asignatura.equalsIgnoreCase(horario[i][j])) {
					contador++;
					
					if (asignatura.equalsIgnoreCase(horario[0][j])) {
						primeraHora=true;
						hora="Si";
						
					}
					
				}
				
			}
		}
		
		System.out.println("Se imparten "+contador+" veces a la semana");
		System.out.println("Se imparte a primera hora? "+hora);
	}

}
