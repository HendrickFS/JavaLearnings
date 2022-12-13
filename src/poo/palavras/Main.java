package poo.palavras;

import java.util.ArrayList;

public class Main {
	public void main(String[] args) {
		String[] minhasPalavras = {"str", "arara"};
		JogoPalavras meuJogo = new JogoPalavras(minhasPalavras);
		
		char[] letras = {'s','t','r'};
		
		ArrayList<String> palavrasComMinhasLetras = meuJogo.apenas(letras);
		
		System.out.println(palavrasComMinhasLetras);
		
	}
}
