package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> numeros;
	
	
	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}


	public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		
		numeros.adicionarNumero(5);
		numeros.adicionarNumero(7);
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(9);
		numeros.adicionarNumero(21);
		
		System.out.println(numeros);
		System.out.println("Ordem ascendente: "	+ numeros.ordenarAscendente());
		System.out.println("Ordem descendente: " + numeros.ordenarDescendente());
			
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> ordemAscendente = new ArrayList<>(numeros);
		Collections.sort(ordemAscendente);
		return ordemAscendente;
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> ordemDescendente = new ArrayList<>(numeros);
		Collections.reverse(ordemDescendente);
		return ordemDescendente;
	}


	@Override
	public String toString() {
		return "OrdenacaoNumeros [numeros=" + numeros + "]";
	}
	
	
}
