package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	 private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	 
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		 for(Convidado c : convidadoSet) {
			 if(c.getCodigoConvite() == codigoConvite) {
				 convidadoParaRemover = c;
				 break;
			 }
		 }
		 convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		// Criando uma instância da classe ConjuntoConvidados
	    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

	    // Adicionando convidados ao conjunto
	    conjuntoConvidados.adicionarConvidado("Ana Luiza", 1234);
	    conjuntoConvidados.adicionarConvidado("Philipe", 1235);
	    conjuntoConvidados.adicionarConvidado("Bianca", 1235);
	    conjuntoConvidados.adicionarConvidado("Camila", 1236);

	    System.out.println("Convidados no conjunto:");
	    conjuntoConvidados.exibirConvidados();

	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

	    conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

	    System.out.println("Convidados no conjunto após a remoção:");
	    conjuntoConvidados.exibirConvidados();
	}
	
}
