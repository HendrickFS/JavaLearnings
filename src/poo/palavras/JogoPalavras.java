package poo.palavras;

import java.util.ArrayList;

public class JogoPalavras {

	private ArrayList<String> palavras = new ArrayList<String>();
	
	public JogoPalavras(String[] palavras) {
		for(int i = 0; i < palavras.length; i++) {
			this.palavras.add(palavras[i]);
		}
	}
	
	public ArrayList<String> palavra_tamanho(int t){
		ArrayList<String> doTamanho = new ArrayList<String>();
		for(int i = 0; i < palavras.size(); i++) {
			String palavraAtual = palavras.get(i);
			if(palavraAtual.length() == t) {
				doTamanho.add(palavraAtual);
			}
		}
		return doTamanho;
	}
	
	public ArrayList<String> comeca_com(char s){
		ArrayList<String> comecaCom = new ArrayList<String>();
		for(int i = 0; i < palavras.size(); i++) {
			String palavraAtual = palavras.get(i);
			if(palavraAtual.charAt(0) == s) {
				comecaCom.add(palavraAtual);
			}
		}
		return comecaCom;
	}
	
	public ArrayList<String> termina_com(char s){
		ArrayList<String> terminaCom = new ArrayList<String>();
		for(int i = 0; i < palavras.size(); i++) {
			String palavraAtual = palavras.get(i);
			if(palavraAtual.charAt(palavraAtual.length()-1) == s) {
				terminaCom.add(palavraAtual);
			}
		}
		return terminaCom;
	}
	
	public ArrayList<String> palindromos(){
		ArrayList<String> palindromos = new ArrayList<String>();
		for(int i = 0; i < palavras.size(); i++) {
			String palavraAtual = palavras.get(i);
			boolean palavraPalindroma = true;
			for(int j = 0; j < palavraAtual.length(); j++) {
				if(palavraAtual.charAt(j) != palavraAtual.charAt((palavraAtual.length()-1)-j)){
					palavraPalindroma = false;
				}
			}
			if(palavraPalindroma == true) {
				palindromos.add(palavraAtual);
			}
		}
		return palindromos;
	}
	
	public ArrayList<String> apenas(char[] L) {
		ArrayList<String> comAsLetras = new ArrayList<String>();
		for(int i = 0; i < palavras.size(); i++) {	
			String palavraAtual = palavras.get(i);
			boolean palavraCorreta = true;
			for(int j = 0; j < palavraAtual.length(); j++) {
				boolean letraCorreta = false;
				for(int k = 0; k < L.length; k++) {
					if(palavraAtual.charAt(j) == L[k]) {
						letraCorreta = true;
					}
				}
				if(letraCorreta == false) {
					palavraCorreta = false;
				}
			}
			if(palavraCorreta == true) {
				comAsLetras.add(palavraAtual);
			}
		}
		return comAsLetras;
	}

	
}
