import java.io.IOException;
import java.lang.*;
import java.nio.file.*;
public class Ejercicio2_MiguelPuertaBayo {

	public static void main(String[] args) {
		
		//Dos rutas se pondrán en arguments de Run COnfigurations del botón de ejecutar.
		
		
		try {
			String ruta1 = args[0];
			String ruta2 = args[1];
			if(args.length==2) {
				Path p1 = Paths.get(ruta1); //Primer parámetro.
				Path p2 = Paths.get(ruta2); //Segundo parámetro.
				try {
					Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
					if(Files.exists(p2)&&!Files.isDirectory(p2)) {
						Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
					}
				}catch(IOException error) {
					System.out.println(error.getMessage());
				}
			}else {
				System.out.println("Se deben introducir dos argumentos en la línea de comandos.");
			}
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Se deben introducir dos argumentos en la línea de comandos.");
		}
		
	}

}
