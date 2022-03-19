package ej27;
import java.util.*;
public class ej27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String palabra=s.nextLine();
		int numero=palabra.length();
		
		for (int i=0;i<palabra.length();i++) {
			System.out.println(palabra.charAt(i));
		}
	}
}
