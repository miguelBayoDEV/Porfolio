package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.ExceptionFueraRangoInt;
import tool.Calculo;

class Factorial {

	private int factorial;
	private int numero;
	private char letra;
	
	@Test
	void factorial0() {
		numero = 0;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 1);
	}
	
	@Test
	void factorial1() {
		numero = 1;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 1);
	}
	
	@Test
	void factorial5() {
		numero = 5;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 120);
	}
	
	@Test
	void factorialMenos1() {
		numero = -1;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 1);
	}
	
	@Test
	void factorialMenos5() {
		numero = -5;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 120);
	}
	
	@Test
	void factorialLetraa() {
		letra = 'a';
		boolean resultado = false;
		
		if(Calculo.isChar(letra)) {
			resultado = true;
		}
		assertTrue(resultado, "El valor es true porque se ha metido un char.");
	}
	
	@Test
	void factorialLetraA() {
		letra = 'B';
		boolean resultado = false;
		
		if(Calculo.isChar(letra)) {
			resultado = true;
		}
		assertTrue(resultado, "El valor es true porque se ha metido un char.");
	}
	
	@Test
	void factorial777ThrowExceptionValorSuperaRangoInt() {
		numero = 777;
		assertThrows(ExceptionFueraRangoInt.class, () -> {Calculo.factorial(numero);});
	}
	
	@Test
	void factorialMenos997ThrowExceptionValorSuperaRangoInt() {
		numero = -997;
		assertThrows(ExceptionFueraRangoInt.class, () -> {Calculo.factorial(numero);});
	}
	
	@Test
	void factorial32ThrowExceptionValorSuperaRangoIntValorLimitePositivo() {
		numero = 32;
		assertThrows(ExceptionFueraRangoInt.class, () -> {Calculo.factorial(numero);});
	}
	
	@Test
	void factorialMenos32ThrowExceptionValorSuperaRangoIntValorLimiteNegativo() {
		numero = -32;
		assertThrows(ExceptionFueraRangoInt.class, () -> {Calculo.factorial(numero);});
	}
	
	@Test
	void factorial31ValorLimite() {
		numero = 31;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 738197504);
	}
	
	@Test
	void factorialMenos31ValorLimite() {
		numero = -31;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 738197504);
	}
	
	@Test
	void factorialMenos0ValorLimite() {
		numero = -0;
		try{
			factorial = Calculo.factorial(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(factorial, 1, "Ignora el signo menos.");
	}

}
