package ejercicio19;
public class Ejercicio19 {

	public static void main(String[] args) {
		int[] ingresos = {15000, 16000, 10000, 9000, 12000, 13000, 
						   7000, 6000, 11000, 13000, 14000, 15000};
		int[] gastos = {8000, 9000, 11000, 10000, 12000, 10000, 
						9000, 8000, 9000, 9000, 12000, 14000};
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
						  "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		//a Si cada mes ha tenido un balance + o -
		for(int i=0; i<meses.length; i++) {
			String resultadoBalance = "";
			if(ingresos[i]>gastos[i]) {
				resultadoBalance="positivo";
			} else if (ingresos[i]<gastos[i]) {
				resultadoBalance="negativo";
			} else if (ingresos[i]==gastos[i]) {
				resultadoBalance="neutro";
			}
			
			System.out.println("El balance de "+meses[i]+" ha sido "+resultadoBalance);
		}
		
		//b Media de ingresos y gastos anuales
		// Ingresos
		int sumaIngresos = 0;
		for(int n:ingresos) {
			sumaIngresos+=n;
		}
		double mediaIngresos = sumaIngresos / ingresos.length;
		System.out.println("La media de ingresos anual es "+mediaIngresos);
		
		// Gastos
		int sumaGastos = 0;
		for(int m:gastos) {
			sumaGastos+=m;
		}
		double mediaGastos = sumaGastos / gastos.length;
		System.out.println("La media de gastos anual es "+mediaGastos);
		
		//c Balance final y si ha sido + o no
		System.out.println("Ingresos totales: "+sumaIngresos+" || Gastos totales: "+sumaGastos);
		String balanceAnual = "";
		if(sumaIngresos>sumaGastos) {
			balanceAnual="positivo";
		} else if (sumaIngresos<sumaGastos) {
			balanceAnual="negativo";
		} else if (sumaIngresos==sumaGastos) {
			balanceAnual="neutro";
		}
		System.out.println("El balance anual ha resultado "+balanceAnual);
	}

}
