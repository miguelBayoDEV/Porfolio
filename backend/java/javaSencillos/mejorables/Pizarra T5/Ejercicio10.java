import java.lang.*;
import java.util.*;
import java.io.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String respuesta = "";
		boolean repetir = true;
		while(repetir) {
			System.out.println("Menu de opciones: ");
			System.out.println("1) Añadir nuevo alumno.");
			System.out.println("2) Ver los datos de un alumno.");
			System.out.println("3) Salir.");
			respuesta = s.nextLine();
			if(respuesta.equals("1")) {
				System.out.println("Introduzca DNI: ");
				String dni = s.nextLine();
				System.out.println("Introduzca nombre alumno: ");
				String nombre = s.nextLine();
				System.out.println("Introduzca dirección alumno: ");
				String dirección = s.nextLine();
				System.out.println("Introduzca teléfono alumno: ");
				int tel = s.nextInt();
				try {
					PrintWriter crear = new PrintWriter(dni+".txt");
					crear.println(nombre);
					crear.println(dirección);
					crear.println(tel);
					crear.flush();
					crear.close();
				}catch(FileNotFoundException error) {
					System.out.println("No se crea el archivo.");
				}catch(IOException error) {
					System.out.println("No se puede leer.");
				}
			}
			if(respuesta.equals("2")) {
				try {
					System.out.println("Introduzca ruta: ");
					String ruta1 = s.nextLine();
					FileInputStream f = new FileInputStream(ruta1);
					InputStreamReader lector = new InputStreamReader(f);
					BufferedReader leer = new BufferedReader(lector);
					boolean repite = true;
					while(repite) {
						String línea = leer.readLine();
						if(línea==null) {
							repite = false;
							f.close();
							lector.close();
							leer.close();
						}else {
							System.out.println(línea);
						}
					}
				}catch(IOException error) {
					System.out.println("No se puede leer.");
				}
					
			}
			if(respuesta.equals("3")) {
				repetir = false;
				System.out.println("Finalizado.");
			}
		}
	}

}
