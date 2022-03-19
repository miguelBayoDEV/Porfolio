package Test;

import java.util.Scanner;

import Carrera_Ejer03.Asignatura;
import Carrera_Ejer03.Carrera;
import Carrera_Ejer03.Curso;
import Coche_Ejer02.Coche;
import ElementoTablaPeriodica_Ejer05.ElementoTablaPeriodica;
import Empleados_Ejer06.Departamento;
import Empleados_Ejer06.Empleado;
import HolaMundo_Ejer01.HolaMundo;
import Punto_Ejer04.Punto;
import Rectangulo_Ejer07.Rectangulo;

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
		Carrera carrera = new Carrera("Ingenier�a aeroespacial", 15);
		Curso curso1 = new Curso("Segundo", carrera);
		Curso curso2 = new Curso("Primero", carrera);
		Asignatura asig1 = new Asignatura("Matem�ticas", 15000, curso1);
		Asignatura asig2 = new Asignatura("Programaci�n", 14000, curso1);
		Asignatura asig3 = new Asignatura("F�sica", 16000, curso2);
		Asignatura asig4 = new Asignatura("Matem�ticas avanzada", 17000, curso2);
		System.out.println(asig4.toString());
	}
	
	public void test04() {
		Punto p1 = new Punto();
		Punto p = new Punto();
		p1.setCoordenadaX(5);
		p1.setCoordenadaY(5);
		p.setCoordenadaX(2);
		p.setCoordenadaY(2);
		System.out.println(p1.distanciaPuntos(p));
		System.out.println(p1.distanciaOrigen(p));
	}
	
	public void test05() {
		ElementoTablaPeriodica t1 = new ElementoTablaPeriodica("Oxigeno", "O", 8);
		ElementoTablaPeriodica t2 = new ElementoTablaPeriodica("Sodio", "Na", 11);
		ElementoTablaPeriodica t3 = new ElementoTablaPeriodica("Calcio", "Ca", 20);
		System.out.println("N�mero de instancias creadas: " + ElementoTablaPeriodica.numeroDeElementos());
	}
	
	public void test06() {
		Departamento departamento = new Departamento("Testing", "Granada", "+34678453213");
		Empleado e1 = new Empleado("Miguel", "Puerta", "Granada", "456890760L", "m@gmail.com");
		e1.setDirector(true);
		Empleado e2 = new Empleado("Jose", "Almon", "Granada", "432123456P", "j@gmail.com");
		Empleado e3 = new Empleado("Pepe", "Balco", "Granada", "876543120X", "p@gmail.com");
		departamento.addEmpleado(e1);
		departamento.addEmpleado(e2);
		departamento.addEmpleado(e3);
		System.out.println("Datos: " + departamento.toString());
	}
	
	public void test07() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca altura:");
		double height = teclado.nextDouble();
		System.out.println("Introduzca base:");
		double base = teclado.nextDouble();
		Rectangulo rectangulo = new Rectangulo(height, base);
		Rectangulo rectangulo1 = new Rectangulo();
		System.out.println("�rea rect�ngulo: " + rectangulo.areaRectangulo());
		System.out.println("�rea rect�ngulo: " + rectangulo1.areaRectangulo(height, base));
	}
	
	
}
