package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	Set<String> palavrasList;

	public ConjuntoPalavrasUnicas() {
		this.palavrasList = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavrasList.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if(!palavrasList.isEmpty()) {
			if(palavrasList.contains(palavra)){
				palavrasList.remove(palavra);
			}else {
				System.out.println("A palavra não foi encontrada no conjunto");
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public void verificarPalavra(String palavra) {
		boolean palavraEncontrada = false;
		if(!palavrasList.isEmpty()) {
			for(String elemento : palavrasList) {
				if(palavra.equalsIgnoreCase(elemento)) {
					System.out.println("A palavra encontrada foi: " + elemento);
					palavraEncontrada = true;
					break;
				}
			}
			if(!palavraEncontrada) {
				System.out.println("Não existe essa palavra no conjunto");
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public void exibirPalavrasUnicas() {
		if(!palavrasList.isEmpty()) {
			System.out.println(palavrasList);
		}else {
			System.out.println("O conjunto está vazio");
		}
	}


	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		//Adicionando palavras
		conjuntoPalavrasUnicas.adicionarPalavra("Quadro");
		conjuntoPalavrasUnicas.adicionarPalavra("Porta");
		conjuntoPalavrasUnicas.adicionarPalavra("Caneta");
		conjuntoPalavrasUnicas.adicionarPalavra("Cobra");
		
		//Exibindo palavars
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		//Verificando palavra
		conjuntoPalavrasUnicas.verificarPalavra("porta");
		
		//Removemdo palavra
		conjuntoPalavrasUnicas.removerPalavra("Porta");
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
	}
	

}
