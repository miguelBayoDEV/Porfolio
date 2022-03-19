package Abecedario_Ejer13;

public class Abecedario {

	private static final String[] abecedarioSpain = {"a", "b", "c", "ch", "d", "e", "f", "g", "h",
													"i", "j", "k", "l", "ll", "m", "n", "ñ", "o",
													"p", "q", "r", "s", "t", "u", "v", "w", "x",
													"y", "z"};
	
	public static void abecedarioNormalBucleFor() {
		String abecedario = "";
		for(char i='a'; i<='z'; i++) {
			if(i == 'z') {
				abecedario += i + ".";
			}else {
				abecedario += i + ", ";
			}
		}
		System.out.println("Abecedario normal Ascci: " + abecedario);
	}
	
	public static void abecedarioSpainBucleFor() {
		String abecedario = "";
		for(char i=0; i<abecedarioSpain.length; i++) {
			if(i == abecedarioSpain.length - 1) {
				abecedario += abecedarioSpain[i] + ".";
			}else {
				abecedario += abecedarioSpain[i] + ", ";
			}
		}
		System.out.println("Abecedario español: " + abecedario);
	}
	
	public static void abecedarioSpainBucleForEach() {
		String abecedario = "";
		for(String item: abecedarioSpain) {
			if(item == "z") {
				abecedario += item + ".";
			}else {
				abecedario += item + ", ";
			}
		}
		System.out.println("Abecedario español: " + abecedario);
	}
	
}
