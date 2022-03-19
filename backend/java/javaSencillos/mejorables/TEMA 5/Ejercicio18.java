package Ejercicio18;
import java.awt.*;

import bpc.daw.consola.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		//Declaracion de variables
		int i = 0;
		int x = 0;
		int seg = 0;
		int x1 = 0;
		int r = 255;
		int g = 0;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		x = d.width;
				
		Consola c = new Consola();
		CapaTexto text = c.getCapaTexto();
		Teclado kb = c.getTeclado();
		CapaCanvas cv = c.getCapaCanvas();
		
		text.print("Introduce el numero de Segundos: ");
		seg = kb.leerNumeroEntero();
		
		x1 = ((x-200)/seg);
		int x2 = x1;
		int x3 = 0;
		for(i=0;i<seg;i++) {
			Graphics pict1 = cv.getGraphics();
			pict1.setColor(Color.white);
			pict1.drawRect(100, 150, (x-200), 50);
						
			Color color = new Color(r,g,0);
			pict1.setColor(color);
			
			pict1.fillRect(100+x3 , 150, x2-x3, 50);
			x2=x2+x1;
			x3 = x3+x1;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException error) {}
			if(r>=255/seg) {
				r-=255/seg;
			}
			if(g<=255-255/seg) {
				g+=255/seg;
			}
		}
		
	}

}
