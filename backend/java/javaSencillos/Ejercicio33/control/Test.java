package control;

import model.Mes;
import model.Meses;

public class Test {

	public static void test() {
		int yearBisiesto = 2020;
		int yearNoBisiesto = 2021;
		
		if(Meses.isBisiesto(yearBisiesto)) {
			Meses mesFebreroBisiesto = new Meses(Mes.FEBREROBISIESTO);
			System.out.println(mesFebreroBisiesto.toString());
		}else {
			Meses mesFebreroNoBisiesto = new Meses(Mes.FEBRERO);
			System.out.println(mesFebreroNoBisiesto.toString());
		}
		
		if(Meses.isBisiesto(yearNoBisiesto)) {
			Meses mesFebreroBisiesto = new Meses(Mes.FEBREROBISIESTO);
			System.out.println(mesFebreroBisiesto.toString());
		}else {
			Meses mesFebreroNoBisiesto = new Meses(Mes.FEBRERO);
			System.out.println(mesFebreroNoBisiesto.toString());
		}
		
		Meses mesJulio = new Meses(Mes.JULIO);
		System.out.println(mesJulio.toString());
		
		Meses mesDiciembre = new Meses(Mes.DICIEMBRE);
		System.out.println(mesDiciembre.toString());
		
		Meses mesAbril = new Meses(Mes.ABRIL);
		System.out.println(mesAbril.toString());
	}
}
