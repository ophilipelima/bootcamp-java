package desafioControleFluxo;
import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException.java exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			 System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException.java {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		  if (parametroUm > parametroDois) {
	            throw new ParametrosInvalidosException.java();
	      

	        int contagem = parametroDois - parametroUm;
	        for(int i = 1; i <= contagem; i++) {
	            System.out.println(i);
	        }
	}


	}
}
