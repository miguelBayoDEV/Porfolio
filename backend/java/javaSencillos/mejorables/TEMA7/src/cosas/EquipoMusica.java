package daw.cosas;

import java.sql.Array;

public class EquipoMusica {
	private Altavoz[] altavoces;
	
	public EquipoMusica(int numeroAltavoces) {
		altavoces= new Altavoz[numeroAltavoces];
		
		for(int i=0;i<altavoces.length;i++) {
			altavoces[i]= new Altavoz();
		}
	}
	
	public Altavoz getAltavoz(int posicion) {
		if(posicion<0||posicion>altavoces.length) {
			throw new IllegalArgumentException();
		}else {
			return altavoces[posicion];
		}
	}
	
	public void setVolumen(int numeroAltavoz, int volumen) {
		getAltavoz(numeroAltavoz).setVolumen(volumen);
	}
}
