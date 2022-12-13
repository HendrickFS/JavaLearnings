package poo.loja;
import java.util.ArrayList;
public class Pedido { 
	private ArrayList<ItemPedido> itens = new ArrayList<>();
	private double precoTotal;
	
	public Pedido (ArrayList<ItemPedido> itens) {
		this.itens = itens;
		this.precoTotal = 0;
		for (int i = 0;  i < itens.size(); i++) {
			this.precoTotal += itens.get(i).getQuantidade() * itens.get(i).getProduto().getPreco();
		}
		
	}

	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
}
