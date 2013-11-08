package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import conversordenumeros.ConversorDeNumeros;

public class TestaConversorDeNumeros {
	
	private ConversorDeNumeros conversorDeNumeros;
	
	@Before
	public void init(){
		conversorDeNumeros = new ConversorDeNumeros();
	}
	
	@Test
	public void testaEntradaSimples(){
		//Testes Simples cenário 1
		assertEquals("dez", conversorDeNumeros.get("10"));
		assertEquals("um", conversorDeNumeros.get("1"));
		assertEquals("zero", conversorDeNumeros.get("0"));
		
		//Testes Simples cenário 2
		assertEquals("quinze", conversorDeNumeros.get("15"));
		assertEquals("vinte", conversorDeNumeros.get("20"));
	}
	
	@Test
	public void testaNomenclaturaDosNumeros(){
		
		//cenário números entre 21 e 99
		assertEquals("Vinte e um", conversorDeNumeros.get("21"));
		assertEquals("Vinte e dois", conversorDeNumeros.get("22"));
		assertEquals("Vinte e cinco", conversorDeNumeros.get("25"));
		assertEquals("Vinte e três", conversorDeNumeros.get("23"));
		
		assertEquals("Trinta", conversorDeNumeros.get("30"));
		assertEquals("Trinta e cinco", conversorDeNumeros.get("35"));
		assertEquals("Trinta e sete", conversorDeNumeros.get("37"));
		assertEquals("Trinta e nove", conversorDeNumeros.get("39"));
		
		assertEquals("Quarenta", conversorDeNumeros.get("40"));
		assertEquals("Quarenta e quatro", conversorDeNumeros.get("44"));
		assertEquals("Quarenta e cinco", conversorDeNumeros.get("45"));
		assertEquals("Quarenta e oito", conversorDeNumeros.get("48"));
		
		assertEquals("Cinquenta", conversorDeNumeros.get("50"));
		assertEquals("Cinquenta e três", conversorDeNumeros.get("53"));
		assertEquals("Cinquenta e quatro", conversorDeNumeros.get("54"));
		assertEquals("Cinquenta e cinco", conversorDeNumeros.get("55"));
		
		assertEquals("Sessenta", conversorDeNumeros.get("60"));
		assertEquals("Sessenta e quatro", conversorDeNumeros.get("64"));
		assertEquals("Sessenta e seis", conversorDeNumeros.get("66"));
		assertEquals("Sessenta e sete", conversorDeNumeros.get("67"));
		
		assertEquals("Setenta", conversorDeNumeros.get("70"));
		assertEquals("Setenta e quatro", conversorDeNumeros.get("74"));
		assertEquals("Setenta e sete", conversorDeNumeros.get("77"));
		assertEquals("Setenta e nove", conversorDeNumeros.get("79"));
		
		assertEquals("Oitenta", conversorDeNumeros.get("80"));
		assertEquals("Oitenta e nove", conversorDeNumeros.get("89"));
		
		assertEquals("Noventa", conversorDeNumeros.get("90"));
		assertEquals("Noventa e quatro", conversorDeNumeros.get("94"));
		
	}
	
	
}
