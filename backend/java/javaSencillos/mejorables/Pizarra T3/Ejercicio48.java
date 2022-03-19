import java.lang.*;
import java.util.Scanner;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
public class Ejercicio48 {

	public static void main(String[] args) {
		// Crear un programa para darle efectos a una imagen.
		final int INVERTIR = EfectoBuilder.INVERTIR;
		final int BLURRED = EfectoBuilder.BLURRED;
		final int EFECTOGRIS = EfectoBuilder.ESCALA_GRISES;
		//La otra constante es: final int REFLEXION = EfectoBuilder.REFLEXION;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca ruta de la imagen: ");
		String ruta = s.nextLine();
		File f = new File(ruta);
		try {
			BufferedImage cargar = ImageIO.read(f); //Creo un objeto de BufferedImage.
			EfectoBuilder imagen = new EfectoBuilder(cargar); //Creo un objeto de EfectoBuilder.
			imagen.build();
			EfectoBuilder e1 = imagen.aplicarEfecto(INVERTIR);
			EfectoBuilder e2 = imagen.aplicarEfecto(BLURRED);
			EfectoBuilder e3 = imagen.aplicarEfecto(EFECTOGRIS);
			System.out.println("Imagen con efectos.");
			imagen.build();
		}catch(IOException error) {
			System.out.println("Error al leer la imagen.");
		}
		
	}

}
