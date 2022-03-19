package ValidadEdad_Ejer15;

public class Edad {

	public static String validadEdad(int edad) {
		String edadValidada = "";
		
		if(edad > 0 && edad <= 4) {
			edadValidada = "pequeñín";
		}else if(edad > 4 && edad <= 10) {
			edadValidada = "niño";
		}else if(edad > 10 && edad <= 40) {
			edadValidada = "adolescente";
		}else if(edad > 40 && edad <= 80) {
			edadValidada = "talludito";
		}else {
			edadValidada = "Edad invalida";
		}
		
		return edadValidada;
	}
	
}
