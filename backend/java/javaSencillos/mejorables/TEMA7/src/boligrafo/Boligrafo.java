package daw.boligrafo;

import java.awt.Color;

import bpc.daw.consola.CapaTexto;

public class Boligrafo {
	private static final Color[] COLORES={
	        new Color(255, 0, 0),
	        new Color(0, 255, 0),
	        new Color(0, 0, 255),
	        new Color(255, 255, 255),
	        new Color(255, 255, 0)
	    };
	private int color;
	private CapaTexto ct;
	
	/*static {
		COLORES= new Color[]{
		        new Color(255, 0, 0),
		        new Color(0, 255, 0),
		        new Color(0, 0, 255),
		        new Color(255, 255, 255),
		        new Color(255, 255, 0)
		    };
	}*/
	
	public Boligrafo (CapaTexto ct) {
		this.ct = ct;
	}
	
	public void setColor (int n) {
		if (n>=0 && n<COLORES.length) {
			ct.setColorTexto(COLORES[n]);
		}
	}
	
	public void escribir(String Texto) {
		ct.println(Texto);
	}
	
	public void escribirGuay (String texto) {
		int rotaColores = 0;
		for(int i = 0; i<texto.length(); i++) {
			ct.print(texto.charAt(i));
			if (rotaColores >= COLORES.length) rotaColores = 0;
			ct.setColorTexto(COLORES[rotaColores]);
			rotaColores++;
		}
	}
	
}
