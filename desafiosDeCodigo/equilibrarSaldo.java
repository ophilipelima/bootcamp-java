package desafiosDeCodigo;
import java.util.Scanner;

public class equilibrarSaldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        
        
        saldoAtual = saldoAtual + valorDeposito;
        saldoAtual = saldoAtual - valorRetirada;
        
        System.out.println("Saldo atualizado na conta: " + saldoAtual);
	}

}
