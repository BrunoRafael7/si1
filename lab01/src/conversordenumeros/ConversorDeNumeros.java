package conversordenumeros;

public class ConversorDeNumeros {
	
	private String [] nomesDasUnidades;
	private String [] nomesDosvaloresEntreDezEvinte;
	private String [] nomesDasDezenas;
	private String[][] arrayDeReferencias;

	
	public ConversorDeNumeros(){
		nomesDasUnidades = new String[10];
		nomesDosvaloresEntreDezEvinte = new String[10];
		nomesDasDezenas = new String[10];
		arrayDeReferencias = new String[3][10];
		preencheArrayDeNomes();
		preencheArrayDeReferencias();
	}
	
	private void preencheArrayDeReferencias() {
		
		arrayDeReferencias[0] = nomesDasDezenas;
		arrayDeReferencias[1] = nomesDosvaloresEntreDezEvinte;
		arrayDeReferencias[2] = nomesDasUnidades;
		
	}

	private void preencheArrayDeNomes() {
		preencheArrayDeUnidades();
		preencheArrayDeValoresEntreDezEvinte();
		preencheArrayDeDezenas();
	}

	private void preencheArrayDeDezenas() {
		nomesDasDezenas[0] = "";
		nomesDasDezenas[1] = "dez";
		nomesDasDezenas[2] = "vinte";
		nomesDasDezenas[3] = "trinta";
		nomesDasDezenas[4] = "quarenta";
		nomesDasDezenas[5] = "cinquenta";
		nomesDasDezenas[6] = "sessenta";
		nomesDasDezenas[7] = "setenta";
		nomesDasDezenas[8] = "oitenta";
		nomesDasDezenas[9] = "noventa";
		
	}

	private void preencheArrayDeValoresEntreDezEvinte() {
		nomesDosvaloresEntreDezEvinte[0] = "";
		nomesDosvaloresEntreDezEvinte[1] = "onze";
		nomesDosvaloresEntreDezEvinte[2] = "doze";
		nomesDosvaloresEntreDezEvinte[3] = "treze";
		nomesDosvaloresEntreDezEvinte[4] = "quatorze";
		nomesDosvaloresEntreDezEvinte[5] = "quinze";
		nomesDosvaloresEntreDezEvinte[6] = "dezesseis";
		nomesDosvaloresEntreDezEvinte[7] = "dezessete";
		nomesDosvaloresEntreDezEvinte[8] = "dezoito";
		nomesDosvaloresEntreDezEvinte[9] = "dezenove";
		
	}

	private void preencheArrayDeUnidades() {
		nomesDasUnidades[0] = "zero";
		nomesDasUnidades[1] = "um";
		nomesDasUnidades[2] = "dois";
		nomesDasUnidades[3] = "três";
		nomesDasUnidades[4] = "quatro";
		nomesDasUnidades[5] = "cinco";
		nomesDasUnidades[6] = "seis";
		nomesDasUnidades[7] = "sete";
		nomesDasUnidades[8] = "oito";
		nomesDasUnidades[9] = "nove";
		
	}

	public String get(String valor) {
		String nomeDoNumero = "";
		char[] caracteresNumericos = valor.toCharArray();
		for(int i = 0 ; i <= caracteresNumericos.length; i--){
			char c = caracteresNumericos[i];
			int j = Integer.parseInt(String.valueOf(c));
			nomeDoNumero += (i != caracteresNumericos.length - 1 && j == 0 ? " e " : "") + arrayDeReferencias[i][j];
		}
		return nomeDoNumero;
	}
}