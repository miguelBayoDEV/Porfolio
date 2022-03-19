package Test;

import Carrera_Ejer03.Asignatura;
import Carrera_Ejer03.Carrera;
import Carrera_Ejer03.Curso;
import Coche_Ejer02.Coche;
import HolaMundo_Ejer01.HolaMundo;

public class Test {

	public void test01() {
		new HolaMundo().imprimir();
	}
	
	public void test02() {
		Coche coche = new Coche();
		coche.setModelo("Seat Ibiza");
		coche.setColor("rojo");
		coche.setMetalizada(true);
		coche.setMatricula("FDS4765");
		coche.setTipoCoche("deportivo");
		coche.setYearFabricacion(1990);
		coche.setModalidadSeguro("todo riesgo");
		System.out.println(coche.toString());
	}
	
	public void test03() {
		Carrera carrera = new Carrera("Ingeniería aeroespacial", 15);
		Curso curso1 = new Curso("Segundo", carrera);
		Curso curso2 = new Curso("Primero", carrera);
		Asignatura asig1 = new Asignatura("Matemáticas", 15000, curso1);
		Asignatura asig2 = new Asignatura("Programación", 14000, curso1);
		Asignatura asig3 = new Asignatura("Física", 16000, curso2);
		Asignatura asig4 = new Asignatura("Matemáticas avanzada", 17000, curso2);
		System.out.println(asig4.toString());
	}
	
	
}
