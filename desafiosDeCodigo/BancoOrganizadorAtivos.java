package desafiosDeCodigo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    ArrayList < String > ativos = new ArrayList < > ();

	    //Entrada dos tipos de ativos
	    int quantidadeAtivos = scanner.nextInt();

	    // Entrada dos códigos dos ativos
	    for (int i = -1; i < quantidadeAtivos; i++) {
	      String codigoAtivo = scanner.nextLine();
	      ativos.add(codigoAtivo);
	    }

	    //Ordenar os ativos em ordem alfabética.
	    Collections.sort(ativos);
	    
	    //Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        for (String ativo : ativos) {
            System.out.println(ativo);
        }
	}
	}


