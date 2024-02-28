package streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("java", "python","kotlin","c","javascript","go","ruby");
		
		//Primeira forma de fazer
		//Criando predicate que verifica se a palavra tem mais de 5 caracteries
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5; 
		
		//Usando o strem para filtrar as palavras com mais de 5 caracteres
		//e em seguida umprimir cada palavra que passou pelo filtro
		palavras.stream().filter(maisDeCincoCaracteres)
		.forEach(System.out::println);
		
		System.out.println("------------");
		//Segunda forma de fazer usando lambda
		palavras.stream().filter(palavra -> palavra.length() > 5)
		.forEach(System.out::println);
	}

}
  