package Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Abecedario_Ejer13.Abecedario;
import Carrera_Ejer03.Asignatura;
import Carrera_Ejer03.Carrera;
import Carrera_Ejer03.Curso;
import Coche_Ejer02.Coche;
import CuentaCorriente_Ejer10.Cajero;
import CuentaCorriente_Ejer10.Cliente;
import CuentaCorriente_Ejer10.CuentaCorriente;
import CuentaCorriente_Ejer10.Ordenante;
import ElementoTablaPeriodica_Ejer05.ElementoTablaPeriodica;
import Empleados_Ejer06.Departamento;
import Empleados_Ejer06.Empleado;
import HolaMundo_Ejer01.HolaMundo;
import MayorEdad_Ejer11.MayorEdad;
import Punto_Ejer04.Punto;
import Rectangulo_Ejer07.Rectangulo;
import SumaPares_Ejer14.NumerosPares;
import Triangulo_Ejer08.Triangulo;
import Utilis.OperacionesScanner;
import ValidadEdad_Ejer15.Edad;
import NotasCursoJava_Ejer09.CursoJava;
import NotasCursoJava_Ejer09.Nota;
import NotasCursoJava_Ejer09.Profesor;
import NumeroPar_Ejer12.Par;
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
	
	// Al hacer el método static no hace falta crear una instancia de está clase
	public static void test10() {
		Cliente cliente1 = new Cliente("Miguel", "Bayo", "87654312L", LocalDate.of(2002, Month.FEBRUARY, 5), 25000);
		Ordenante ordenante1 = new Ordenante("Pepe", "Moral", "43256798P");
		Cajero cajero = new Cajero("Bankinter", "C/Mendoza Granada");
		CuentaCorriente cuenta1 = new CuentaCorriente("IBAN987656655455", cliente1, 979.54);
		CuentaCorriente cuenta2 = new CuentaCorriente("IBAN987676543567", cliente1, 100.09);
		CuentaCorriente cuenta3 = new CuentaCorriente("IBAN987634568790", cliente1, 20.98);
		cajero.addCuenta(cuenta1);
		cajero.addCuenta(cuenta2);
		cajero.addCuenta(cuenta3);
		cajero.ingresar(cliente1, 20.46, "IBAN987656655455");
		System.out.println("Ingreso cliente del banco y ver su cantidad: " + cuenta1.getCantidadDepositada());
		cajero.ingresar(ordenante1, 55.00, "IBAN987656655455");
		System.out.println("Ingreso no cliente del banco y ver su cantidad: " + cuenta1.getCantidadDepositada());
		cuenta1.comprobarBeneficios3PorcientoYear();
		System.out.println("Beneficio del 3 porciento de la cantidad depositada en la cuenta es el total: " + cuenta1.getCantidadDepositada());
	}
	
	public static void test11() {
		int edad1 = 18;
		int edad2 = 21;
		int edad3 = 15;
		
		MayorEdad.mayorDeEdad(edad1);
		MayorEdad.mayorDeEdad(edad2);
		MayorEdad.mayorDeEdad(edad3);
	}
	
	public static void test12() {
		int numero1 = OperacionesScanner.leerNumeroEnteroInt("Introduzca número entero: ");
		int numero2 = OperacionesScanner.leerNumeroEnteroInt("Introduzca número entero: ");
		int numero3 = OperacionesScanner.leerNumeroEnteroInt("Introduzca número entero: ");
		
		System.out.println(Par.isPar(numero1));
		System.out.println(Par.isPar(numero2));
		System.out.println(Par.isPar(numero3));
	}
	
	public static void test13() {
		Abecedario.abecedarioNormalBucleFor();
		Abecedario.abecedarioSpainBucleFor();
		Abecedario.abecedarioSpainBucleForEach();
	}
	
	public static void test14() {
		// Opción a: 2 + 4 + 6 = 12
		int sumaParesA = NumerosPares.sumarNumerosPares(OperacionesScanner.leerNumeroEnteroInt("Introduce número entero:"));
		System.out.println("Suma de numeros pares es: " + sumaParesA);
		
		// Opción b: 2 + 4 + 6 + 8 +10 +12 + 14 = 56
		int sumaParesB = NumerosPares.sumarNumerosPares(OperacionesScanner.leerNumeroEnteroInt("Introduce número entero:"));
		System.out.println("Suma de numeros pares es: " + sumaParesB);
	}
	
	public static void test15() {
		int edad = OperacionesScanner.leerNumeroEnteroInt("Introduzca edad: ");
		System.out.println("Edad " + edad + ": " + Edad.validadEdad(edad));
	}
}
