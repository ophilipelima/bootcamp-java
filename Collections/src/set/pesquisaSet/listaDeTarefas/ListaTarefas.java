package set.pesquisaSet.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	Set<Tarefa> tarefas;

	public ListaTarefas() {
		this.tarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		if(!tarefas.isEmpty()) {
			//percorrer a coleção
			for(Tarefa tarefa : tarefas) {
				if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
					tarefas.remove(tarefa);
					break;
				}
			}
		}else {
			System.out.println("A lista está vazia");
		}
	}
	
	public void exibirTarefas() {
		if(!tarefas.isEmpty()) {
			System.out.println(tarefas);
		}else {
			System.out.println("A coleção está vazia");
		}
	}
	
	public int contarTarefas(){
		return tarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for(Tarefa t : tarefas) {
			if(t.isTarefaConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa>obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for(Tarefa t : tarefas) {
			if(!t.isTarefaConcluida()) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa t : tarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(true);
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
	    Tarefa tarefaParaMarcarComoPendente = null;
	    for (Tarefa t : tarefas) {
	      if (t.getDescricao().equalsIgnoreCase(descricao)) {
	        tarefaParaMarcarComoPendente = t;
	        break;
	      }
	    }

	    if (tarefaParaMarcarComoPendente != null) {
	      if(tarefaParaMarcarComoPendente.isTarefaConcluida()) {
	        tarefaParaMarcarComoPendente.setTarefaConcluida(false);
	      }
	    } else {
	      System.out.println("Tarefa não encontrada na lista.");
	    }
	  }
	
	public void limparListaTarefas() {
	    if(!tarefas.isEmpty()) {
	       tarefas.clear();
	    } else {
	      System.out.println("A lista já está vazia!");
	    }
	  }
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Fazer compras");
	    listaTarefas.adicionarTarefa("Exercitar");
	    listaTarefas.adicionarTarefa("Limpar casa");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Ler artigo");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer compras");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Limpar casa");

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Ler artigo");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	  }
}
