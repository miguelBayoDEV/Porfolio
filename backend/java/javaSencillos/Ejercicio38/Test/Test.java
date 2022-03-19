package Test;

import java.time.LocalDate;

import Ejer38_EstructuraEstudianteProfesor.Estudiante;
import Ejer38_EstructuraEstudianteProfesor.Persona;
import Ejer38_EstructuraEstudianteProfesor.Profesor;

public class Test {

	public static void test38() {
		Persona profesor = new Profesor("Mig", "Bay", "57657656O", LocalDate.of(1985, 3, 21), "Granada", "m@gmail.com", "+34 876876866");
		Persona estudiante = new Estudiante("Migy", "Bayy", "57657651O", LocalDate.of(1985, 5, 21), "Granada", "mg@gmail.com", "+34 846876866");
		System.out.println(profesor.datosPersonales());
		System.out.println(estudiante.datosPersonales());
	}
	
}
