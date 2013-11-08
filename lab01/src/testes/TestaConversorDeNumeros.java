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
		
		//Testes Simples cenário 1
		assertEquals(conversor.converte(10), "dez");
		assertEquals(conversor.converte(1), "um");
		assertEquals(conversor.converte(0), "zero");
		
		//Testes Simples cenário 2
		assertEquals(conversor.converte(15), "quinze");
		assertEquals(conversor.converte(20), "vinte");
	}

}
