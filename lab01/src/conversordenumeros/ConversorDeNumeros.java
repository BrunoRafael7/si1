package conversordenumeros;

public class ConversorDeNumeros {
	private String [] nomesDasUnidades;
	
	public ConversorDeNumeros(){
		nomesDasUnidades = new String[21];
		preencheArrayDeNomes();
	}
	
	private void preencheArrayDeNomes() {
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
		nomesDasUnidades[10] = "dez";
		nomesDasUnidades[11] = "onze";
		nomesDasUnidades[12] = "doze";
		nomesDasUnidades[13] = "treze";
		nomesDasUnidades[14] = "quatorze";
		nomesDasUnidades[15] = "quinze";
		nomesDasUnidades[16] = "dezesseis";
		nomesDasUnidades[17] = "dezessete";
		nomesDasUnidades[18] = "dezoito";
		nomesDasUnidades[19] = "dezenove";
		nomesDasUnidades[20] = "vinte";
		
	}

	public String converte(int i) {
		if(i >= 0 && i <= 20){
			return nomesDasUnidades[i];
		}
		return null;
	}

}
