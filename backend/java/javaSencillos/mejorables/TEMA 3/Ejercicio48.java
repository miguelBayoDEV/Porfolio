import java.util.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class Ejercicio48 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String ruta= "";
		System.out.println("Introduce una ruta de una imagen");
		ruta= entrada.nextLine();
		File direccion= new File(ruta);
		
		int invertir= EfectoBuilder.INVERTIR;
		int blurred= EfectoBuilder.BLURRED;
		int grises= EfectoBuilder.ESCALA_GRISES;
		
		try {
			BufferedImage  foto= ImageIO.read(direccion);
			EfectoBuilder editor= new EfectoBuilder(foto);
			editor.build();
			EfectoBuilder edita1= editor.aplicarEfecto(invertir);
			EfectoBuilder edita2= editor.aplicarEfecto(blurred);
			EfectoBuilder edita3= editor.aplicarEfecto(grises);
			editor.build();
		}catch(IOException error) {
			System.out.println("Error al cargar imagen");
		}
		
		

	}

}
