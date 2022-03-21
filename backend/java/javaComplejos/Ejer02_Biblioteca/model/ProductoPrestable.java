package model;

import java.time.LocalDate;

public interface ProductoPrestable {

	public void prestar() throws ExceptionPrestado;
	public void devolver() throws ExceptionPrestado;
	public LocalDate getFechaPublicacion();
	
}
