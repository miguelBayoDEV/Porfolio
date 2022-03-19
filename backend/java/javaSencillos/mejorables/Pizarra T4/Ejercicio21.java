import java.lang.*;
import javax.imageio.ImageIO;
import bpc.daw.consola.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Ejercicio21 {

	public static void main(String[] args) {
		Consola co = new Consola();
		CapaTexto ct = co.getCapaTexto();
		Teclado t = co.getTeclado();
		CapaFondo cf = co.getCapaFondo();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		ct.print("Pulsa una tecla para empezar: ");
		t.leerCadenaCaracteres();
		String a = " ";
		String b = " ";
		String c = " ";
		String d = "escopeta";
		ct.println("Son 7 escenas así que debes pulsar del 1 al 7: ");
		String s = t.leerCadenaCaracteres();
		if(s.equals("1")) {
			try {
				File f1 = new File("1.jpg");
				BufferedImage imagen1 = ImageIO.read(f1);
				FondoImagen fondo1 = new FondoImagen(imagen1);
				fondo1.setEscalado(true);
				cf.setFondo(fondo1);
				ct.println("Esta es tu cuarto con un dolor fuerte en la cabeza. Mira tu cuarto, ¿qué piensas? ");
				ct.println("a)Me han robado.");
				ct.println("b)Estaba borracho.");
				ct.println("c)No me importa.");
				String r = t.leerCadenaCaracteres();
				if(r.equalsIgnoreCase("a b c")) {
					ct.cls();
				}
				File f2 = new File("3.jpg");
				BufferedImage imagen2 = ImageIO.read(f2);
				FondoImagen fondo2 = new FondoImagen(imagen2);
				fondo2.setEscalado(true);
				cf.setFondo(fondo2);
				ct.println("Esta tu puerta de tu piso abierta y en el suelo hay varias cosas, ¿qué coges? ");
				ct.println("a)Llaves coche.");
				ct.println("b)Móvil.");
				ct.println("c)Chaqueta.");
				ct.println("d)Escopeta.");
				r = t.leerCadenaCaracteres();
				if(r.equalsIgnoreCase("a b c d")) {
					ct.cls();
				}
				File f3 = new File("5.jpg");
				BufferedImage imagen3 = ImageIO.read(f3);
				FondoImagen fondo3 = new FondoImagen(imagen3);
				fondo3.setEscalado(true);
				cf.setFondo(fondo3);
				ct.println("Bajas las escaleras y llegas al portal de tu edificio, ¿qué decides hacer? ");
				ct.println("a)Mirar afuera sin abrir la puerta y como no ves nada sales.");
				ct.println("b)Abres la puerta y sales.");
				r = t.leerCadenaCaracteres();
				if(r.equalsIgnoreCase("a b")) {
					ct.cls();
				}
				File f4 = new File("7.jpg");
				BufferedImage imagen4 = ImageIO.read(f4);
				FondoImagen fondo4 = new FondoImagen(imagen4);
				fondo4.setEscalado(true);
				cf.setFondo(fondo4);
				ct.println("Al salir escuchas un ruido, te das la vuelta y ves a un zombie, ¿qué haces? ");
				ct.println("a)Huyes");
				ct.println("b)Te quedas parado.");
				ct.println("c)Gritas.");
				ct.println("d)Le disparas con la escopeta.");
				r = t.leerCadenaCaracteres();
				if(r.equalsIgnoreCase("d")) {
					ct.print("¡¡¡Eres un superviviente!!!");
				}else {
					ct.print("Game Over.");
				}
				t.leerCadenaCaracteres();
			}catch(IOException error) {
				ct.print("Error al cargar imagen.");
			}
		}
		
	}

}
