import java.lang.*;
public class Ejer18{
	public static void main(String[] args){
		int capacidadDelCamion=3;
		int viajes=15;
		int viajesPorTonelada=viajes/capacidadDelCamion;
		int toneladasNuevas=5;
		int viajesPor5Toneladas=toneladasNuevas*viajesPorTonelada;
		System.out.println("El camion debe dar "+viajesPor5Toneladas+" viajes");
	}
}