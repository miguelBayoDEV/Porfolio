import java.lang.*;
public class Ejercicio46 {
	public static void main(String[] args){
		int alumnos = 5;
		double asignaturas = 10;
		double asignaturasTotales = asignaturas*alumnos;
		// Alumnos suspensos o no.
		int suspensosAntonio = 3;
		boolean pasarAntonio = suspensosAntonio==0;
		System.out.println("Antonio,�pasa de curso? "+pasarAntonio);
		int suspensosJaime = 8;
		boolean pasarJaime = suspensosJaime==0;
		System.out.println("Jaime,�pasa de curso? "+pasarJaime);
		int suspensosPedro = 2;
		boolean pasarPedro = suspensosPedro==0;
		System.out.println("Pedro,�pasa de curso? "+pasarPedro);
		int suspensosManuel = 0;
		boolean pasarManuel = suspensosManuel==0;
		System.out.println("Manuel,�pasa de curso? "+pasarManuel);
		int suspensosMaite = 0;
		boolean pasarMaite = suspensosMaite==0;
		System.out.println("Maite,�pasa de curso? "+pasarMaite);
		// N�mero medio de asignaturas suspensas que ser�a 13/50=0.26*10=2.6.
		double asignaturasMedia_suspensas = ((suspensosAntonio+suspensosJaime+suspensosPedro+suspensosManuel+suspensosMaite)/asignaturasTotales)*asignaturas;
		int asignaturaMedia = (int) asignaturasMedia_suspensas;
		System.out.println("El n�mero medio de asignaturas suspensas son: "+asignaturaMedia+" asignaturas.");
		// Todos los alumnos van a pasar de curso.
		boolean todosPasar = pasarAntonio&&pasarJaime&&pasarPedro&&pasarManuel&&pasarMaite;
		System.out.println("�Todos los alumnos van a pasar de curso? "+todosPasar);
		/*
		Hay alg�n alumnos con m�s de 4 suspensos.
		boolean m�s4Antonio = suspensosAntonio>4;
		System.out.println("Antonio,�tiene m�s de 4 suspensos? "+m�s4Antonio);
		boolean m�s4Jaime = suspensosJaime>4;
		System.out.println("Jaime,�tiene m�s de 4 suspensos? "+m�s4Jaime);
		boolean m�s4Pedro = suspensosPedro>4;
		System.out.println("Pedro,�tiene m�s de 4 suspensos? "+m�s4Pedro);
		boolean m�s4Manuel = suspensosManuel>4;
		System.out.println("Manuel,�tiene m�s de 4 suspensos? "+m�s4Manuel);
		boolean m�s4Maite = suspensosMaite>4;
		System.out.println("Maite,�tiene m�s de 4 suspensos? "+m�s4Maite);
		*/
		boolean m�s4 = (suspensosJaime>4)||(suspensosAntonio>4)||(suspensosPedro>4)||(suspensosManuel>4)||(suspensosMaite>4);
		System.out.println("�Hay alg�n alumno con m�s de 4 suspensas? "+m�s4);
	}
}