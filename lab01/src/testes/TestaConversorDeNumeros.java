package testes;

import static org.junit.Assert.*;
import org.junit.*;

import conversordenumeros.ConversorDeNumeros;

public class TestaConversorDeNumeros {
	
	private ConversorDeNumeros numerosEmPortugues;
	
	@Before
	public void init(){
		numerosEmPortugues = new ConversorDeNumeros();
	}
	
	@Test
	public void testaEntradaSimples(){
		
		//Testes Simples cenário 1
		assertEquals("dez", numerosEmPortugues.get(10));
		assertEquals("um", numerosEmPortugues.get(1));
		assertEquals("zero", numerosEmPortugues.get(0));
		
		//Testes Simples cenário 2
		assertEquals("quinze", numerosEmPortugues.get(15));
		assertEquals("vinte", numerosEmPortugues.get(20));
	}
	
	
}
