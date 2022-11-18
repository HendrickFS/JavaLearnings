package poo.pedido;

public class Pedido {
	
	private String nomeCliente;
	private String nomeProduto;
	private int quantidade;
	private float preco;
	
	public static int quantidadePedido = 0;
	
	public Pedido(String nomeCliente, String nomeProduto, int quantidade, float preco) {
		this.nomeCliente = nomeCliente;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
		quantidadePedido++;
	}
	public Pedido () {
		this.nomeCliente = "João";
		this.nomeProduto = "Celular";
		this.preco = 1500;
		this.quantidade = 2;
		quantidadePedido++;
	}
	public String getNomeCliente() { 
		return nomeCliente;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void setPreco(float Preco) {
		this.preco = Preco;
	}
	public void setQuantidade(int Quantidade) {
		this.quantidade = Quantidade;
	}
	public String toString() {
		return "Nome do cliente: "+ nomeCliente +"\nNome do produto: "+ nomeProduto +"\nQuantidade: "+ quantidade +"\nPreço: "+ preco;
	}
	
	
	public float getValor() {
		if(quantidade < 10) {
			return quantidade * preco;
		} else if(quantidade < 100) {
			return ((quantidade * preco)/100)*90;
		} else {
			return ((quantidade * preco)/100)*80; 
		}
		
	}
	
}
