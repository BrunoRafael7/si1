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
	
	/**
	 * Se a entrada for vazia
	 * o método retorna null
	 */
	@Test
	public void testaEntradaVazia(){
		assertEquals(null, conversor.converte(""));
	}
	
	public void testaEntradasInvalidas(){
		try{
			conversor.converte("carro");
			fail("Entrada inválida");
		}catch (Exception e) {}
	}
}
