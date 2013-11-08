package testes;

import static org.junit.Assert.*;
import org.junit.*;

import conversordenumeros.NumerosEmPortugues;

public class TestaNumerosEmPortugues {
	
	private NumerosEmPortugues numerosEmPortugues;
	
	@Before
	public void init(){
		numerosEmPortugues = new NumerosEmPortugues();
	}
	
	@Test
	public void testaEntradaSimples(){
		
		//Testes Simples cenário 1
		assertEquals("dez", numerosEmPortugues.converte(10));
		assertEquals("um", numerosEmPortugues.converte(1));
		assertEquals("zero", numerosEmPortugues.converte(0));
		
		//Testes Simples cenário 2
		assertEquals("quinze", numerosEmPortugues.converte(15));
		assertEquals("vinte", numerosEmPortugues.converte(20));
	}
	
}
