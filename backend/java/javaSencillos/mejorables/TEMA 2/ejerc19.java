import java.lang.*;
public class ejerc19 {
	public static void main(String[] args){
		int longitudVagon = 10;
		int numeroVagones = 6;
		int longitudTren = longitudVagon*numeroVagones;
		int velocidad = 70; 
		double velocidadms = velocidad*1000/3600.0;
		int recorrido = 4000 + 1000 + longitudTren;
		
		System.out.println("El tren tardara "+ recorrido / velocidadms +" segundos");
		
		
	}
}