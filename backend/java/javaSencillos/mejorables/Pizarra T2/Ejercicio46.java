import java.lang.*;
public class Ejercicio46 {
	public static void main(String[] args){
		int alumnos = 5;
		double asignaturas = 10;
		double asignaturasTotales = asignaturas*alumnos;
		// Alumnos suspensos o no.
		int suspensosAntonio = 3;
		boolean pasarAntonio = suspensosAntonio==0;
		System.out.println("Antonio,¿pasa de curso? "+pasarAntonio);
		int suspensosJaime = 8;
		boolean pasarJaime = suspensosJaime==0;
		System.out.println("Jaime,¿pasa de curso? "+pasarJaime);
		int suspensosPedro = 2;
		boolean pasarPedro = suspensosPedro==0;
		System.out.println("Pedro,¿pasa de curso? "+pasarPedro);
		int suspensosManuel = 0;
		boolean pasarManuel = suspensosManuel==0;
		System.out.println("Manuel,¿pasa de curso? "+pasarManuel);
		int suspensosMaite = 0;
		boolean pasarMaite = suspensosMaite==0;
		System.out.println("Maite,¿pasa de curso? "+pasarMaite);
		// Número medio de asignaturas suspensas que sería 13/50=0.26*10=2.6.
		double asignaturasMedia_suspensas = ((suspensosAntonio+suspensosJaime+suspensosPedro+suspensosManuel+suspensosMaite)/asignaturasTotales)*asignaturas;
		int asignaturaMedia = (int) asignaturasMedia_suspensas;
		System.out.println("El número medio de asignaturas suspensas son: "+asignaturaMedia+" asignaturas.");
		// Todos los alumnos van a pasar de curso.
		boolean todosPasar = pasarAntonio&&pasarJaime&&pasarPedro&&pasarManuel&&pasarMaite;
		System.out.println("¿Todos los alumnos van a pasar de curso? "+todosPasar);
		/*
		Hay algún alumnos con más de 4 suspensos.
		boolean más4Antonio = suspensosAntonio>4;
		System.out.println("Antonio,¿tiene más de 4 suspensos? "+más4Antonio);
		boolean más4Jaime = suspensosJaime>4;
		System.out.println("Jaime,¿tiene más de 4 suspensos? "+más4Jaime);
		boolean más4Pedro = suspensosPedro>4;
		System.out.println("Pedro,¿tiene más de 4 suspensos? "+más4Pedro);
		boolean más4Manuel = suspensosManuel>4;
		System.out.println("Manuel,¿tiene más de 4 suspensos? "+más4Manuel);
		boolean más4Maite = suspensosMaite>4;
		System.out.println("Maite,¿tiene más de 4 suspensos? "+más4Maite);
		*/
		boolean más4 = (suspensosJaime>4)||(suspensosAntonio>4)||(suspensosPedro>4)||(suspensosManuel>4)||(suspensosMaite>4);
		System.out.println("¿Hay algún alumno con más de 4 suspensas? "+más4);
	}
}