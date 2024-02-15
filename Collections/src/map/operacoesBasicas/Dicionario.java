package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	Map<String, String>dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pesquisarDefinicao = null;
		if(!dicionarioMap.isEmpty()) {
			pesquisarDefinicao = dicionarioMap.get(palavra);
		}
		return pesquisarDefinicao;
	}
	
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Desmistificar", "Destituir o caráter místico ou misterioso de.");
		dicionario.adicionarPalavra("Irrisório", "Pequeno demais ou demasiado insignificante para ser levado em consideração.");
		dicionario.adicionarPalavra("Errôneo", "Que contém erro.");
		dicionario.adicionarPalavra("Atrelar", "Tornar dependente; submeter");
		dicionario.adicionarPalavra("Competência", "capacidade que um indivíduo possui de expressar um juízo de valor sobre algo a respeito de que é versado; idoneidade");
		
		dicionario.exibirPalavras();
		
		dicionario.removerPalavra("Irrisório");
		dicionario.exibirPalavras();
		
		System.out.println("A definiçaõ é: " + dicionario.pesquisarPorPalavra("Atrelar"));
	}
}
