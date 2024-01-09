package pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	List<Integer> numerosList = new ArrayList();
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(-5);
		somaNumeros.adicionarNumero(3);
		somaNumeros.adicionarNumero(4);
		somaNumeros.adicionarNumero(9);
		System.out.println("Os nomeros adicionados foram:");
		somaNumeros.exibirNumeros();
		
		System.out.println("A soma dos números é igual a: " + somaNumeros.calcularSoma());
		
		System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());
	
		System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());
	
	}
	
	public void adicionarNumero(int numero) {
		numerosList.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		if(!numerosList.isEmpty()) {
			for(int contador : numerosList) {
				soma += contador;
			}
		}else {
			System.out.println("A lista está vazia");
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maior= Integer.MIN_VALUE;
		for(int numero : numerosList) {
			if(numero >= maior) {
				maior = numero;
			}
		}
		return maior;
	}
	
	public int encontrarMenorNumero() {
	int menor = Integer.MAX_VALUE;
	for(int numero : numerosList) {
		if(numero <= menor) {
			menor = numero;
			}
		}
		return menor;
	}
	
	public void exibirNumeros() {
       System.out.println(this.numerosList);
    }
}
