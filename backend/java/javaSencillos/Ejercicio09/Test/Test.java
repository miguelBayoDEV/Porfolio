package Test;

import java.util.ArrayList;
import java.util.List;
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
import Triangulo_Ejer08.Triangulo;
import NotasCursoJava_Ejer09.CursoJava;
import NotasCursoJava_Ejer09.Nota;
import NotasCursoJava_Ejer09.Profesor;
import NotasCursoJava_Ejer09.Alumno;
import NotasCursoJava_Ejer09.AsignaturaJava;

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
		System.out.println("Número de instancias creadas: " + ElementoTablaPeriodica.numeroDeElementos());
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
		System.out.println("Área rectángulo: " + rectangulo.areaRectangulo());
		System.out.println("Área rectángulo: " + rectangulo1.areaRectangulo(height, base));
	}
	
	public void test08() {
		Scanner teclado1 = new Scanner(System.in);
		Triangulo triangulo = new Triangulo(7.1, 8.5, 10.1);
		System.out.println("Lado mayor mide: " + triangulo.ladoMasLargo());
		Triangulo triangulo1 = new Triangulo();
		System.out.println("Introduzca el lado A:");
		double ladoA = teclado1.nextDouble();
		System.out.println("Introduzca el lado B:");
		double ladoB = teclado1.nextDouble();
		System.out.println("Introduzca el lado C:");
		double ladoC = teclado1.nextDouble();
		System.out.println(triangulo1.ladoMasLargo(ladoA, ladoB, ladoC));
	}
	
	public void test09() {
		CursoJava curso = new CursoJava("Curso Java 1", 203);
		Alumno alumno1 = new Alumno("Miguel", "Bayo", "98765405D", "m@gmail.com");
		Alumno alumno2 = new Alumno("Jose", "Almon", "12345698P", "j@gmail.com");
		Profesor profesor1 = new Profesor("Jaime", "Perez", "13465897F", "ja@gmail.com");
		Profesor profesor2 = new Profesor("Jesus", "Palma", "76543219M", "je@gmail.com");
		AsignaturaJava asignatura1 = new AsignaturaJava("Programacion front-end", 3098, profesor1);
		AsignaturaJava asignatura2 = new AsignaturaJava("Programacion back-end", 4567, profesor2);
		Nota nota1 = new Nota(asignatura1, 5.67);
		Nota nota2 = new Nota(asignatura2, 9.02);
		Nota nota3 = new Nota(asignatura1, 7.65);
		Nota nota4 = new Nota(asignatura2, 8.06);
		alumno1.addNota(nota1);
		alumno1.addNota(nota2);
		alumno2.addNota(nota3);
		alumno2.addNota(nota4);
		curso.addAlumno(alumno2);
		curso.addAlumno(alumno1);
		curso.addAsignatura(asignatura1);
		curso.addAsignatura(asignatura2);
		System.out.println(curso.toString());
	}
}
