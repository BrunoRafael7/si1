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
	public void testaEntradaSimples(){
		
		//Testes Simples cenário 1
		assertEquals("dez", conversor.converte(10));
		assertEquals("um", conversor.converte(1));
		assertEquals("zero", conversor.converte(0));
		
		//Testes Simples cenário 2
		assertEquals("quinze", conversor.converte(15));
		assertEquals("vinte", conversor.converte(20));
	}
	/**
	 * Se a entrada for vazia (simbolizado por -1)
	 * o método retorna null
	 */
	@Test
	public void testaEntradaVazia(){
		assertEquals(null, conversor.converte(-1));
	}
}
