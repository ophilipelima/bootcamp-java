package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> listaItem;

	public CarrinhoDeCompras() {
		this.listaItem = new ArrayList<>();;
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Farinha", 15.0, 5);
		carrinhoDeCompras.adicionarItem("Ovos", 10.0, 1);
		carrinhoDeCompras.adicionarItem("Café", 5.0, 4);
		
		carrinhoDeCompras.removerItem("Farinha");
		
		System.out.println(carrinhoDeCompras);
		System.out.println("Valor Total  = " + carrinhoDeCompras.calcularValorTotal());
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaItem.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
	    List<Item> itensParaRemover = new ArrayList<>();
	    if (!listaItem.isEmpty()) {
	      for (Item i : listaItem) {
	        if (i.getNome().equalsIgnoreCase(nome)) {
	          itensParaRemover.add(i);
	        }
	      }
	      listaItem.removeAll(itensParaRemover);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		double valorItem;
		for (Item item : listaItem) {
			valorItem = item.getPreco() * item.getQuantidade();
			valorTotal = valorTotal + valorItem;
		}
		return valorTotal;
	}
	
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (Item item : listaItem) {
	            sb.append(item.getNome()).append(" - ").append(item.getQuantidade()).append(" unidades\n");
	        }
	        return sb.toString();
	    }

}

