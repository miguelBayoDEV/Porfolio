import java.lang.*;
public class Ejercicio51 {
	public static void main(String[]args) {
		int nJugadores=7;
		int nDedos1=4;
		int nDedos2=5;
		int nDedos3=1;
		int nDedos4=0;
		int nDedos5=3;
		int nDedos6=2;
		int nDedos7=3;
		int nTotal = nDedos1+nDedos2+nDedos3+nDedos4+nDedos5+nDedos6+nDedos7;
		int numeroJugador = nTotal%nJugadores;
		numeroJugador++;
		System.out.println("Al jugador numero "+ numeroJugador+ " le toca jugar de portero");



















	}
}