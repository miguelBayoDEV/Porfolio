package Ejercicios;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoImagen;
import bpc.daw.consola.Teclado;

public class Ejer3 {

	public static void main(String[] args) {
		Consola consola = new Consola();
		Teclado teclado = consola.getTeclado();
		CapaTexto capaTexto = consola.getCapaTexto();
		Image fondo = null;
		try {
			fondo = ImageIO.read(new File("src/recursos/ImagenFondo.png"));
		} catch (IOException e) {
			capaTexto.println("Error al leer el fichero.");
		}
		FondoImagen fondoImagen = new FondoImagen(fondo);
		fondoImagen.setEscalado(true);
		consola.getCapaFondo().setFondo(fondoImagen);
		teclado.setTipoCursor(Teclado.CURSOR_NULO);
		capaTexto.println("Pulsa una tecla para salir.");
		char tecla = teclado.leerCaracter();
	}
}

