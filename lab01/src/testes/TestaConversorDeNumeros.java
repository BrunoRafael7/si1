package testes;

import static org.junit.Assert.*;
import org.junit.*;

import conversordenumeros.ConversorDeNumeros;

public class TestaConversorDeNumeros {
	
	private ConversorDeNumeros conversor;
	
	@Before
	public void init(){
		conversor = new ConversorDeNumeros();
	}
	
	@Test
	public void entradaSimples(){
		assertEquals(conversor.convert(10), "dez");
		assertEquals(conversor.convert(1), "um");
	}

}
