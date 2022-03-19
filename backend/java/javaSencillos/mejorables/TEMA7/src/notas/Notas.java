package daw.notas;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Notas {
	private List<Double> notas;
	
	public Notas() {
		notas = new ArrayList<>();
	}
	public void añadirNota(double n) {
		notas.add(n);
	}
	public int getTotalNotas() {
		return notas.size();
	}
	public OptionalDouble calcularNotaMedia() {
		OptionalDouble notaMediaFinal = OptionalDouble.empty();
		if(!notas.isEmpty()) {
			double sumaNotas = 0;	
			for (int i=0;i<this.getTotalNotas();i++) {
				sumaNotas+=notas.get(i);
			}
			double notaMedia = sumaNotas/notas.size();
			notaMediaFinal = OptionalDouble.of(notaMedia);				
		}
		return notaMediaFinal;
	}
	public OptionalDouble calcularNotaMaxima() {
		OptionalDouble notaMaxima = OptionalDouble.empty();
		if(!notas.isEmpty()) {
			double notaNueva = 0;
			for (int i=0;i<this.getTotalNotas();i++) {
				if(notaNueva<notas.get(i)) {
					notaNueva = notas.get(i);
				}
			}
			notaMaxima = OptionalDouble.of(notaNueva);
		}
		return notaMaxima;
	}
}
