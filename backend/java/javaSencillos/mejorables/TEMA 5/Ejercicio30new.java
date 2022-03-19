package t5ej32;

import java.util.*;

public class Ejercicio30new {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Introduce el dni: ");
		String dni=s.nextLine();
		
		boolean correcto=true;
		int num=0;
		String letra="";
		char digito='a';

		if(dni.length()!=9) {
			correcto=false;
		}else{
			for(int i=0; i<8&&correcto;i++) {
				digito=dni.charAt(i);
				if(digito>='0'&& digito<='9') {
					int n=Integer.parseInt(""+digito);
					num=num+n*(int)(Math.pow(10,7-i));
				}else {
					correcto=false;
				}
			}
			String dniletra=""+dni.charAt(8);
			
			int x=num%23;
			
			if(x==0) {
				letra="T";
			}else if(x==1) {
				letra="R";
			}else if(x==2) {
				letra="W";
			}else if(x==3) {
				letra="A";
			}else if(x==4) {
				letra="G";
			}else if(x==5) {
				letra="M";
			}else if(x==6) {
				letra="Y";
			}else if(x==7) {
				letra="F";
			}else if(x==8) {
				letra="P";
			}else if(x==9) {
				letra="D";
			}else if(x==10) {
				letra="X";
			}else if(x==11) {
				letra="B";
			}else if(x==12) {
				letra="N";
			}else if(x==13) {
				letra="J";
			}else if(x==14) {
				letra="Z";
			}else if(x==15) {
				letra="S";
			}else if(x==16) {
				letra="Q";
			}else if(x==17) {
				letra="V";
			}else if(x==18) {
				letra="H";
			}else if(x==19) {
				letra="L";
			}else if(x==20) {
				letra="C";
			}else if(x==21) {
				letra="K";
			}else if(x==22) {
				letra="E";
			}else if(x==23) {
				letra="T";
			}
			if(!letra.equalsIgnoreCase(dniletra)) {
				correcto=false;
			}
		}
		if(correcto) {
			System.out.println("El dni es correcto");
		}else {
			System.out.println("El dni es incorrecto");
		}
		

	}

}
