package set.ordenacaoSet.listaDeAlunos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double nota) {
		alunoSet.add(new Aluno(nome, matricula, nota));
	}
	
	public void removerAluno(long matricula) {
		if(!alunoSet.isEmpty()) {
			for(Aluno aluno : alunoSet) {
				if(aluno.getMatricula() == matricula) {
					alunoSet.remove(aluno);
					break;
				}
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	 public void exibirAlunosPorNome()	{
		 Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		 if(!alunoSet.isEmpty()) {
			 System.out.println(alunosPorNome);
		 }else {
			 System.out.println("A lista está vazia");
		 }
	 }
	 
	 public void exibirAlunosPorNota() {
		 Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
		 alunosPorNota.addAll(alunoSet);
		 System.out.println(alunosPorNota);
	 }
	 
	 public void exibirAlunos() {
		 if(!alunoSet.isEmpty()) {
			 System.out.println(alunoSet);
		 }else {
			 System.out.println("A coleção está vazia"); 
		 }
	 }
	 
	 public static void main(String[] args) {
		 GerenciadorAlunos gerenciadorDeAlunos = new GerenciadorAlunos();
		 
		 //Adicionando alunos
		 gerenciadorDeAlunos.adicionarAluno("Philipe", 00020L, 8.5);
		 gerenciadorDeAlunos.adicionarAluno("Henrique", 00021L, 6.8);
		 gerenciadorDeAlunos.adicionarAluno("Eva", 00022L, 9.9);
		 gerenciadorDeAlunos.adicionarAluno("Ana Luiza", 00024L, 6.8);
		 gerenciadorDeAlunos.adicionarAluno("Camila", 00025L, 7.2);
		 gerenciadorDeAlunos.adicionarAluno("Lucas", 00026L, 5.2);
		 
		 //Exibindo coleção
		 gerenciadorDeAlunos.exibirAlunos();
		 
		 //Removendo aluno
		 gerenciadorDeAlunos.removerAluno(00026);
		 
		 //Exibindo alunos por nome
		 gerenciadorDeAlunos.exibirAlunosPorNome();
		 
		 //Exibindo alunos por nota
		 gerenciadorDeAlunos.exibirAlunosPorNota();
	 }
}
