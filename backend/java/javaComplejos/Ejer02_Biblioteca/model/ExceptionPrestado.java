package model;

public class ExceptionPrestado extends Exception {

	public ExceptionPrestado() {}
	
	public ExceptionPrestado(String msg) {
		System.out.println(msg);
	}
	
}
