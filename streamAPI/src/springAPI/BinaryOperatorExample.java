package springAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		//Usando binaryOperator com lambda para somar dois numeros inteiros
		BinaryOperator<Integer> somar = Integer::sum;
		
		//Usando o binaryOperator para somar todos os números no Stream
		int resultado = numeros.stream()
				.reduce(0, Integer::sum);
		
		System.out.println("A soma dos números é: " + resultado);
		
	}

}
