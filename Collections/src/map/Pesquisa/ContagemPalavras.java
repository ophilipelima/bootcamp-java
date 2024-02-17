package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	Map<String, Integer> palavrasMap;

	public ContagemPalavras() {
		this.palavrasMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		palavrasMap.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!palavrasMap.isEmpty()) {
			if(palavrasMap.containsKey(palavra)){
				palavrasMap.remove(palavra);
			}
		}
	}
	
	public int exibirContagemPalavras() {
		 int contagemTotal = 0;
		 for(int contagem : palavrasMap.values()) {
			 contagemTotal += contagem;
		 }
		 return contagemTotal;
	}
	
	 public String encontrarPalavrasMaisFrequente() {
		 String linguagemMaisFrequente = null;
		 int maiorContagem = 0;
		 for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
			 if (entry.getValue() > maiorContagem) {
		        maiorContagem = entry.getValue();
		        linguagemMaisFrequente = entry.getKey();
			 }
		 }
		 return linguagemMaisFrequente;
	}
	 
	 public static void main(String[] args) {
		    ContagemPalavras contagemLinguagens = new ContagemPalavras();

		    // Adiciona linguagens e suas contagens
		    contagemLinguagens.adicionarPalavra("C#", 3);
		    contagemLinguagens.adicionarPalavra("Python", 5);
		    contagemLinguagens.adicionarPalavra("Java", 8);
		    contagemLinguagens.adicionarPalavra("Ruby", 2);

		    // Exibe a contagem total de linguagens
		    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

		    // Encontra e exibe a linguagem mais frequente
		    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
		    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
		  }
}
