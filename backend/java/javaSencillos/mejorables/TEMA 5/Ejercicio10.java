package tema5Ejercicio10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		String DNI = "";
		String nombre="";
		String direccion="";
		String telefono="";
		int opcion=0;
		
		Scanner s = new Scanner(System.in);
		
		
		while(opcion!=3) { //bucle para generar el menú 
			
			System.out.println("1) añadir nuevo alumno ");
			System.out.println("2) ver los datos del alumno ");
			System.out.println("3) salir ");
			opcion = Integer.parseInt(s.nextLine()); //Scanner se bugea y he tenido que hacer esto
			
			if(opcion==1){
				
				System.out.println("Introduce el DNI del alumno "); //Introducimos dni
				DNI = s.nextLine();	
				String ruta = DNI+".txt";
				File f = new File(ruta); //Creamos archivo DNI.txt
				
				try{
					f.createNewFile();
				}catch(IOException e) {
					System.out.println("error");
				}
				
				PrintWriter p = null;
				
				try {
					p = new PrintWriter(ruta); //Creamos objeto printwriter para escribir en el txt
				}catch(FileNotFoundException e) {
					System.out.println("error");
				}
				
				p.println("DNI: "+DNI);
				
				System.out.println("Introduce el nombre del alumno: "); //metemos datos (lo elegante sería hacer un bucle for)
				nombre =s.nextLine();
				p.println("Nombre: "+nombre);
				System.out.println("Introduce la direccion del alumno: ");
				direccion =s.nextLine();
				p.println("Dirección: "+direccion);
				
				System.out.println("Introduce el teléfono del alumno: ");
				telefono =s.nextLine();
				p.println("Teléfono: "+telefono);
				p.flush();
				p.close(); //cerramos printwriter
				
			}else if (opcion == 2) {
				System.out.println("Dime el DNI del alumno "); //pedimos el dni y calculamos ruta
				DNI = s.nextLine();
				String ruta = DNI+".txt";
				FileInputStream f = null;
				
				try {
					 f = new FileInputStream(ruta);}
				catch(FileNotFoundException e) {
					System.out.println("error");
				}
				
				InputStreamReader isr = new InputStreamReader(f);
				BufferedReader r = new BufferedReader(isr);
				
				boolean condicion=true;
				
				while(condicion) {
					try {
						System.out.println(r.readLine());
						condicion=r.ready();}
					catch(IOException e) {
						System.out.println("error");
					}
				}
				
				try{
					r.close();
				}catch(IOException e) {
					System.out.println("error");
				}
				
				
			}
			
			}
		
			
	}

		
}
