package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Philipe", 123456);
		agendaContatos.adicionarContato("Sofia", 654321);
		agendaContatos.adicionarContato("Lucas", 589214);
		agendaContatos.adicionarContato("Sofia escola", 856148);
		agendaContatos.adicionarContato("Philipe", 123457);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("Sofia escola");
		agendaContatos.exibirContatos();
		
		System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Philipe"));
	}
	
}
