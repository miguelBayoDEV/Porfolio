package daw.persona;

public class DNI {
	private int numero;
	private char letra;
	
	/*public DNI(int n,char l){
		numero=n;
		letra=l;
	}
	public DNI(String dni){
		this(Integer.parseInt(dni.substring(0,8)),dni.charAt(8));
	}*/
	
	
	
	
	
	/*public DNI(int n,char l){
		numero=n;
		letra=l;
	}
	public DNI(String dni){
		numero=Integer.parseInt(dni.substring(0,8));
		letra=dni.charAt(8);	
	}*/
	
	
	
	
	
	
	public DNI(int n,char l){
		this(""+n+l);
	}
	
	
	public DNI(String dni){
		numero=Integer.parseInt(dni.substring(0,8));
		letra=dni.charAt(8);		
	}
	
	
}
