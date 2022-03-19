import java.lang.*;
public class Ejercicio20{
	public static void main(String[] args){
		int velCamion = 60;
		double tardaCamion = 40.0/60;
		int velCoche1 = 100;
		int velCoche2 = 140;
		// V = S/T
		double distCamion = velCamion*tardaCamion;
		double tardaCoche1 = (distCamion/velCoche1)*60;
		double tardaCoche2 = (distCamion/velCoche2)*60;
		
		System.out.println("El camión a recorrido "+ distCamion +" km.");
		System.out.println("El coche 1 a tardado "+ tardaCoche1 +" minutos.");
		System.out.println("El coche 2 a tardado "+ tardaCoche2 +" minutos.");
	}
}