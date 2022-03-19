import java.lang.*;
public class Ejercicio47 {
	public static void main(String[] args){
		int número = 97;
		char carácter = (char) número;
		int número1 = 92;
		char carácter1 = (char) número1;
		// Saber si un carácter es número: carácter>='0'&&carácter<='9'; (carácter>='a'&&carácter<='z')||(carácter>='A'&&carácter<='Z'); el primer paréntesis es minúscula y el segundo mayúscula.
		boolean primer_número = (carácter>='a'&&carácter<='z')||(carácter>='A'&&carácter<='Z');
		System.out.println(carácter+",¿corresponde a una letra? "+primer_número);
		boolean segundo_número = (carácter1>='a'&&carácter1<='z')||(carácter1>='A'&&carácter1<='Z');
		System.out.println(carácter1+",¿corresponde a una letra? "+segundo_número);
	}
}