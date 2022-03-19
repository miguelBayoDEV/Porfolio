import java.lang.*;
public class Ejercicio15{
	public static void main(String[]args){
		double fcero=0.0;
		double funo=1.0;
		double fmenosdos=(-2.0);
		double funcion0=(3*((fcero/2)*(fcero/2)*(fcero/2)))/((fcero*fcero)-fcero+3);
		double funcion1=(3*((funo/2)*(funo/2)*(funo/2)))/((funo*funo)-funo+3);
		double funcion2=(3*((fmenosdos/2)*(fmenosdos/2)*(fmenosdos/2)))/((fmenosdos*fmenosdos)-fmenosdos+3);
		System.out.println("El resultado para x=0 es: "+funcion0+"");
		System.out.println("El resultado para x=1 es: "+funcion1+"");
		System.out.println("El resultado para x=-2 es: "+funcion2+"");
	}
}