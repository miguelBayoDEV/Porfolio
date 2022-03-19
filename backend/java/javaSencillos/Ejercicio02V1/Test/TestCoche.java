package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Coche_Ejer02.Coche;
import Coche_Ejer02.ModalidadSeguro;
import Coche_Ejer02.TipoCoche;

class TestCoche {

	private Coche coche;
	
	@BeforeEach
	void beforeEach() {
		coche = null;
	}
	
	@Test
	void cocheIsNull() {
		assertNull(coche, "La instancia coche es nula.");
	}
	
	@Test
	void cocheInNotNull() {
		coche = new Coche("Corsa", "Rojo", true, "4333LKJ", TipoCoche.DEPORTIVO, 2002, ModalidadSeguro.TERCEROS);
		assertNotNull(coche, "La instancia de coche no es nula.");
	}
	
	@Test
	void tipoCocheIsDeportivo() {
		coche = new Coche("Corsa", "Rojo", true, "4333LKJ", TipoCoche.DEPORTIVO, 2002, ModalidadSeguro.TERCEROS);
		assertSame(TipoCoche.DEPORTIVO, coche.getTipoCoche(), "Como es un enumerado los dos objetos son iguales.");
	}
	
	@Test
	void modeloCocheIsCorsa() {
		coche = new Coche("Corsa", "Rojo", true, "4333LKJ", TipoCoche.DEPORTIVO, 2002, ModalidadSeguro.TERCEROS);
		assertEquals("Corsa", coche.getModelo(), "El modelo del coche es corsa.");
	}
	//
	
	@Test
	void datosCocheTrue() {
		coche = new Coche("Corsa", "Rojo", true, "4333LKJ", TipoCoche.DEPORTIVO, 2002, ModalidadSeguro.TERCEROS);
		assertEquals("Coche [modelo=Corsa, color=Rojo, metalizada=true, matricula=4333LKJ, tipoCoche=DEPORTIVO, yearFabricacion=2002, modalidadSeguro=TERCEROS]", coche.toString());
	}
	
}
