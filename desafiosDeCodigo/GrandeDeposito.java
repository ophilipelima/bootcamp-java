package desafiosDeCodigo;
import java.util.Scanner;

public class GrandeDeposito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
   
        double saldoAtual = 0;
        
        if(valor > 0){
          saldoAtual = valor;
        	   System.out.printf("Deposito realizado com sucesso!" + "Saldo atual: R$ %.2f",saldoAtual);
        }      
        else if(valor == 0){
          System.out.println("Encerrando o programa...");
       }
       else{
         System.out.println("Valor invalido! Digite um valor maior que zero.");
       }
	}

}
