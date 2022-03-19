package Ejercicio22;
import java.awt.Graphics;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

public class E22 {

	public static void main(String[] args) {
		//creo lo necesario
		Consola c=new Consola();
		CapaTexto ct=c.getCapaTexto();
		Teclado t=c.getTeclado();
		CapaCanvas cc=c.getCapaCanvas();
		Graphics g=cc.getGraphics();
		//Pregunto los vertices
		boolean repetir=true;
		while(repetir==true) {
			ct.println("introduzca el número de vértices");
			String vertices=t.leerCadenaCaracteres();
			int v=Integer.parseInt(vertices);
			ct.cls();
			if(v>1) {
				//creo la lista con el tamaño del número de vertices
			int[] coordenadaX=new int[v];
			int[] coordenadaY=new int[v];
			//hago un for para pedir las coordenadas y meterlas en la lista
			for(int i=0;i<v;i++) {
				ct.println("introduzca la coordenada x");
				String cX=t.leerCadenaCaracteres();
				int x=Integer.parseInt(cX);
				coordenadaX[i]=x;
				ct.println("introduzca la coordenada y");
				String cY=t.leerCadenaCaracteres();
				int y=Integer.parseInt(cY);
				coordenadaY[i]=y;
				ct.cls();
			}
			//dibujo
			g.drawPolygon(coordenadaX, coordenadaY, v);
			t.leerCaracter();
			}else {
				ct.println("");
			}
			
		}
				
	}

}
