package Tema5Ejercicio11;
import java.util.*; 
public class Tema5Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Inicializamos las variables
		int i=0;
		double totalNotas = 0;
		double media = 0;
		int notaAlumno = 0;
		int notaMaxima = 0;
		int notaMinima = Integer.MAX_VALUE;
		while((notaAlumno>=0) && (notaAlumno<=10)) { //Creamos las condiciones para el bucle
				totalNotas+= notaAlumno; //Incrementamos el total de notas para hacer la media
				System.out.println("Introduce las notas de los alumnos:");
				try { //Creamos un try-catch, por si se introduce un double
					notaAlumno = s.nextInt(); //Introducimos una nueva nota
					if (notaAlumno!=-1) {
						if (notaAlumno!=-1 && notaAlumno>=notaMaxima) { //Introducimos las condiciones para hallar la nota m�xima
							notaMaxima = notaAlumno;
						}
						if (notaAlumno!=-1 && notaAlumno<notaMinima) {//Introducimos las condiciones para hallar la nota m�nima
							notaMinima = notaAlumno;
						}
						i++; // Incrementamos el contador
					}
				}catch(NumberFormatException error) {
					System.out.println("N�mero incorrecto.");
				}
		}
		if ((notaAlumno<=0||notaAlumno>=10) && (notaAlumno!=-1) ) { //Si el n�mero se sale del rango, entrar� aqu�.
			System.out.println("N�mero incorrecto.");
			}else if(notaAlumno==-1) {
			media = totalNotas/i; //Hallamos la media
			System.out.println("La nota m�xima es: "+notaMaxima);
			System.out.println("La nota m�nima es: "+notaMinima);
			System.out.println("La media es: "+media);
		}
	}
}