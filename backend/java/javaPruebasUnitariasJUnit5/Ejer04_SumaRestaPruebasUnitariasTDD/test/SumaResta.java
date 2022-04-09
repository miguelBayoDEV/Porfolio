package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Exception.ExceptionFueraRangoInt;
import tools.OperacionesBasicas;

class SumaResta {

	private int numeroA;
	private int numeroB;
	private int resultado;
	private char letra;
	
	@BeforeEach
	void inicializacion() {
		numeroA = 0;
		numeroB = 0;
		resultado = 0;
	}
	
	@Test
	void sumaDosNumerosIgual0() {
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, 0);
	}
	
	@Test
	void sumaNumeroPositivoNumeroNegativo() {
		numeroA = 5;
		numeroB = -2;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, 3);
	}
	
	@Test
	void sumaNumeroNegativoNumeroPositivo() {
		numeroA = -7;
		numeroB = 2;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, -5);
	}
	
	@Test
	void sumaDosNumerosIgualMenos0() {
		numeroA = -0;
		numeroB = -0;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, 0);
	}
	
	@Test
	void sumaNumeroNegativoNumeroNegativo() {
		numeroA = -9;
		numeroB = -1;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, -10);
	}
	
	@Test
	void sumaNumeroPositivoNumeroPositivo() {
		numeroA = 34;
		numeroB = 3;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, 37);
	}
	
	@Test
	void restaDosNumerosIgual0() {
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertEquals(resultado, 0);
	}
	
	@Test
	void restaDosNumerosIgualMenos0() {
		numeroA = -0;
		numeroB = -0;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertEquals(resultado, 0);
	}
	
	@Test
	void restaNumeroPositivoNumeroPositivo() {
		numeroA = 29;
		numeroB = 2;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertEquals(resultado, 27);
	}
	
	@Test
	void restaNumeroNegativoNumeroPositivo() {
		numeroA = -5;
		numeroB = 7;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertEquals(resultado, -12, "Signo negativo por positivo en resta cambia signo a negativo del segundo y se suman.");
	}
	
	@Test
	void restaNumeroPositivoNumeroNegativo() {
		numeroA = 5;
		numeroB = -2;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertEquals(resultado, 7, "Como al restar un número negativo cambia el signo porque negativo y negativo es positivo y se suman.");
	}
	
	@Test
	void restaNumeroNegativoNumeroNegativo() {
		numeroA = -1;
		numeroB = -3;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertEquals(resultado, 2, "Como al restar un número negativo cambia el signo porque negativo y negativo es positivo y se suman.");
	}
	
	@Test
	void sumaNumeroLimitePositivoIntMas1() {
		numeroA = Integer.MAX_VALUE;
		numeroB = 1;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertThrows(ExceptionFueraRangoInt.class, () -> {OperacionesBasicas.errorFueraRangoInt(resultado);});
	}
	
	@Test
	void sumaNumeroLimitePositivoIntMasMenos1() {
		numeroA = Integer.MAX_VALUE;
		numeroB = -1;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, 2147483646);
	}
	
	@Test
	void sumaNumeroLimitePositivoIntMas0() {
		numeroA = Integer.MAX_VALUE;
		numeroB = 0;
		resultado = OperacionesBasicas.sumar(numeroA, numeroB);
		assertEquals(resultado, 2147483647);
	}
	
	@Test
	void sumaNumeroLimiteNegativoIntMenosMenos1() {
		numeroA = Integer.MIN_VALUE;
		numeroB = -1;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertThrows(ExceptionFueraRangoInt.class, () -> {OperacionesBasicas.errorFueraRangoInt(resultado);});
	}
	
	@Test
	void sumaNumeroLimiteNegativoIntMenos1() {
		numeroA = Integer.MIN_VALUE;
		numeroB = 1;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertThrows(ExceptionFueraRangoInt.class, () -> {OperacionesBasicas.errorFueraRangoInt(resultado);});
	}
	
	@Test
	void sumaNumeroLimiteNegativoIntMenos0() {
		numeroA = Integer.MIN_VALUE;
		numeroB = 0;
		resultado = OperacionesBasicas.restar(numeroA, numeroB);
		assertEquals(resultado, -2147483648);
	}
	
	@Test
	void factorialLetraa() {
		letra = 'a';
		boolean resultado = false;
		
		if(OperacionesBasicas.isChar(letra)) {
			resultado = true;
		}
		assertTrue(resultado, "El valor es true porque se ha metido un char.");
	}
	
	@Test
	void factorialLetraA() {
		letra = 'B';
		boolean resultado = false;
		
		if(OperacionesBasicas.isChar(letra)) {
			resultado = true;
		}
		assertTrue(resultado, "El valor es true porque se ha metido un char.");
	}

}
