/*Ejercicio 28*/

package daw.cosas;

public class Altavoz {

	public static final int VOL_MAX=255;
	public static final int VOL_MIN=0;
	
	private int volumen;
	
	public Altavoz() {
		volumen=Altavoz.VOL_MIN;
	}
	
	public void ponerVolumenMaximo() {
		volumen=Altavoz.VOL_MAX;
	}
	
	public void setVolumen(int v) {
		if(v> VOL_MAX || v<VOL_MIN) {
			throw  new IllegalArgumentException("Volumen fuera de rango.");
		}else {
			volumen=v;
		}
		
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public String toString() {
		String linea = "[" +volumen+"]";
		
		for(int i=1; i<=10; i++) {
			
			
			if(i>=(int) (volumen/25.5) ) {
				linea+="*";
			}else {
				linea+="-";
			}
		}
		
		
		return linea;
	}
	
	
}
