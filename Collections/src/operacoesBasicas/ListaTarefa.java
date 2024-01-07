package operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		 
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);	
	}
	
	public int obterNumeroTotalTarefas() {
		//vai retornar a quantidade de elementos dentro da List
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("Numero total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Resolver exercicios da faculdade");
		listaTarefa.adicionarTarefa("Fazer exercícios físicos");
		listaTarefa.adicionarTarefa("Fazer compras");
		System.out.println("Numero total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Fazer compras");
		System.out.println("Numero total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}
	
}
