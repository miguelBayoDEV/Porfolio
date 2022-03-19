import java.lang.*;
import javax.imageio.ImageIO;
import bpc.daw.consola.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		ct.println("Menu de imagenes: ");
		ct.println("1");
		ct.println("2");
		ct.println("3");
		ct.println("4");
		ct.println("5");
		ct.println("6");
		ct.println("7");
		ct.println("8");
		ct.println("9");
		ct.println("10");
		Teclado t = c.getTeclado();
		CapaFondo cf = c.getCapaFondo();
		try {
			ct.print("Seleccione número de imagen: ");
			int n_pulsado = t.leerNumeroEntero();
			if(n_pulsado==1) {
				File f1 = new File("f1.jpg");
				BufferedImage i1 = ImageIO.read(f1);
				FondoImagen fondo1 = new FondoImagen(i1);
				fondo1.setEscalado(true);
				cf.setFondo(fondo1);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==2) {
				File f2 = new File("f2.jpg");
				BufferedImage i2 = ImageIO.read(f2);
				FondoImagen fondo2 = new FondoImagen(i2);
				fondo2.setEscalado(true);
				cf.setFondo(fondo2);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==3) {
				File f3 = new File("f3.jpg");
				BufferedImage i3 = ImageIO.read(f3);
				FondoImagen fondo3 = new FondoImagen(i3);
				fondo3.setEscalado(true);
				cf.setFondo(fondo3);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==4) {
				File f4 = new File("f4.jpg");
				BufferedImage i4 = ImageIO.read(f4);
				FondoImagen fondo4 = new FondoImagen(i4);
				fondo4.setEscalado(true);
				cf.setFondo(fondo4);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==5) {
				File f5 = new File("f5.jpg");
				BufferedImage i5 = ImageIO.read(f5);
				FondoImagen fondo5 = new FondoImagen(i5);
				fondo5.setEscalado(true);
				cf.setFondo(fondo5);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==6) {
				File f6 = new File("f6.jpg");
				BufferedImage i6 = ImageIO.read(f6);
				FondoImagen fondo6 = new FondoImagen(i6);
				fondo6.setEscalado(true);
				cf.setFondo(fondo6);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==7) {
				File f7 = new File("f7.jpg");
				BufferedImage i7 = ImageIO.read(f7);
				FondoImagen fondo7 = new FondoImagen(i7);
				fondo7.setEscalado(true);
				cf.setFondo(fondo7);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==8) {
				File f8 = new File("f8.jpg");
				BufferedImage i8 = ImageIO.read(f8);
				FondoImagen fondo8 = new FondoImagen(i8);
				fondo8.setEscalado(true);
				cf.setFondo(fondo8);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==9) {
				File f9 = new File("f9.jpg");
				BufferedImage i9 = ImageIO.read(f9);
				FondoImagen fondo9 = new FondoImagen(i9);
				fondo9.setEscalado(true);
				cf.setFondo(fondo9);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else if(n_pulsado==10) {
				File f10 = new File("f10.jpg");
				BufferedImage i10 = ImageIO.read(f10);
				FondoImagen fondo10 = new FondoImagen(i10);
				fondo10.setEscalado(true);
				cf.setFondo(fondo10);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else {
				if(n_pulsado>10||n_pulsado<=0) {
					ct.print("Estos números no tienen imágenes.");
					t.setTipoCursor(Teclado.CURSOR_NULO);
					t.leerCaracter();
				}
			}
		}catch(Exception error) {
			ct.print("Tecla incorrecta.");
		}
	}

}
