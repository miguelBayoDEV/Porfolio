package Test;

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
	
	
}
