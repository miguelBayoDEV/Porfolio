package ejercicio10;

import java.util.*;
import java.util.List;
import bpc.daw.consola.*;
import java.awt.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		Consola c = new Consola();
		CapaTexto texto = c.getCapaTexto();
		Teclado t = c.getTeclado();
		CapaCanvas canvas = c.getCapaCanvas();
		Graphics lapiz = canvas.getGraphics();
		Random posicionX = new Random();
		Random posicionY = new Random();
		int opcion = 0;

		List<Rectangle> rectangulos = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			int randomX = posicionX.nextInt(1300);
			int randomY = posicionY.nextInt(700);
			rectangulos.add(new Rectangle(randomX, randomY, 50, 50));
		}
		while (opcion != 4) {
			texto.println("1. Dibujar los rectángulos sin ningún color.");
			texto.println("2. Dibujar los rectángulos con color rojo.");
			texto.println("3. Dibujar los rectángulos con color verde.");
			texto.println("4. Salir");
			opcion = t.leerNumeroEntero();
			
			if (opcion == 1) {
				lapiz.setColor(Color.WHITE);

			} else if (opcion == 2) {
				lapiz.setColor(Color.RED);
			
			} else if (opcion == 3) {
				lapiz.setColor(Color.GREEN);
			
				
			} else if (opcion == 4) {
				lapiz.dispose();
			}
			
			if(opcion!=4) {
				texto.cls();
				for (int i = 0; i < rectangulos.size(); i++) {
					lapiz.fillRect(rectangulos.get(i).x, rectangulos.get(i).y, rectangulos.get(i).width,
							rectangulos.get(i).height);
				}
				t.leerCaracter();
				canvas.cls();
			}
	

		}

	}

}
