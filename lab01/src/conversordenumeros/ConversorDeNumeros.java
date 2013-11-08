package conversordenumeros;

public class ConversorDeNumeros {
	
private String [] nomesDasUnidades;
private String [] nomesDosvaloresEntreDezEvinte;
private String [] nomesDasDezenas;
private String [] nomesDeMilhares;

	
	public ConversorDeNumeros(){
		nomesDasUnidades = new String[10];
		nomesDosvaloresEntreDezEvinte = new String[10];
		nomesDasDezenas = new String[10];
		preencheArrayDeNomes();
	}
	
	private void preencheArrayDeNomes() {
		preencheArrayDeUnidades();
		preencheArrayDeValoresEntreDezEvinte();
		preencheArrayDeDezenas();
		preencheArrayDeCentenas();
		preencheArrayDeMilhares();
	}

	private void preencheArrayDeMilhares() {
		// TODO Auto-generated method stub
		
	}

	private void preencheArrayDeCentenas() {
		// TODO Auto-generated method stub
		
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
		nomesDosvaloresEntreDezEvinte[0] = "onze";
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

	public String get(int numero) {
		if(numero >= 0 && numero <= 20){
			return nomesDasUnidades[numero];
		}
		return null;
	}
}
