import java.util.*;

public class Ejercicio25 {

	public static void main(String[] args) {

		// Crear la tabla.
		String[][] horario = {
				{ "", "Lunes", "Martes", "Mi�rcoles", "Jueves","Viernes"},
				{ "16:00h-16:55h", "Fol", "Sistemas", "Base Datos", "Lenguajes Marcas","Programaci�n"},
				{ "16:55h-17:50h", "Fol", "Sistemas", "Base Datos", "Lenguajes Marcas","Programaci�n"},
				{ "17:50h-18:45h", "Fol", "Sistemas", "Entornos", "Base Datos","Programaci�n"},
				{ "18:45h-19:00h", "Recreo", "Recreo", "Recreo", "Recreo","Recreo"},
				{ "19:00h-19:55h", "Sistemas", "Base Datos", "Programaci�n", "Entornos","Entornos"},
				{ "19:55h-20:50h", "Sistemas", "Base Datos", "Programaci�n", "Programaci�n","Lenguajes Marcas"},
				{ "20:50h-21:45h", "Sistemas", "Base Datos", "Programaci�n", "Programaci�n","Lenguajes Marcas"}
		};
		
		//Escribir nombre asignatura y sus horas y d�as.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca nombre de la asignatura: ");
		String asignatura = s.nextLine();
		int horas = 0;
		for(int i=1;i<horario.length;i++) {
			for(int j=1;j<horario[i].length;j++) {
				//System.out.println(horario[i][j]);
				if(horario[i][j].equalsIgnoreCase(asignatura)) {
					horas++;
					System.out.println("D�a: "+horario[0][j]+"--> Hora: "+horario[i][0]);
				}
			}
		}
		System.out.println("Total de horas a la semana: "+horas);
	}

}
