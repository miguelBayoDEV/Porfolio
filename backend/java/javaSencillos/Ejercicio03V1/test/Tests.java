package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Asignatura;
import model.Carrera;
import model.Curso;


class Tests {

	private Asignatura asignatura;
	private Carrera carrera;
	private Curso curso;
	
	@BeforeEach
	void beforeEach() {
		asignatura = null;
		carrera = null;
		curso = null;
	}
	
	@Test
	void asignaturaIsNull() {
		assertNull(asignatura);
	}
	
	@Test
	void carreraIsNullWithOptional() {
		assertThrows(NullPointerException.class, () -> Optional.of(carrera));
	}
	
	@Test
	void cursoIsNullWithOptional() {
		assertThrows(NullPointerException.class, () -> Optional.of(carrera));
	}
	
	@Test
	void asignaturaIsNotNullWithOptional() {
		carrera = new Carrera("Lógica", 10002);
		curso = new Curso("SegundoGrado", carrera);
		asignatura = new Asignatura("Matematicas", 0234, curso);
		Optional<Carrera> optional = Optional.of(carrera);
		assertTrue(optional.isPresent());
		assertEquals(carrera, curso.getCarrera());
		assertEquals(curso, asignatura.getCurso());
	}
}
