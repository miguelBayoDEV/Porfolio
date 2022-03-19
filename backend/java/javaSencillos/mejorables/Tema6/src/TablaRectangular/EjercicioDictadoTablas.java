package TablaRectangular;
public class EjercicioDictadoTablas {
public static void main(String[] args) {
	
		String[][] cosas= {
				{"rectangulo","circulo","cosa","triangulo","hola"},
				{"Rojo","Azul","Amarillo","Verde","Naranja"},
				{"Jose","David","asdñflkj","asdfjk","asdf"}
		};
	
		
		boolean noCuadrada=true;
		
		for(int i=0;i<cosas.length;i++) {
			if(cosas[i].length!=cosas[0].length) {
					noCuadrada=false;
				}
			
		}
		
		if(noCuadrada) {
			System.out.println("La tabla es cuadrada/rectangular");
		}else if(!noCuadrada) {
			System.out.println("La tabla no es cuadrada/rectangular");
		}
		
		
	}
}
