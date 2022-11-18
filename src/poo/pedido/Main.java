package poo.pedido;

public class Main {
	public static void main(String[] args) {
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido("Maria","computador",5, (float)2000.00);
		Pedido p3 = new Pedido("Fabia", "acai", 12, (float)10.00);
		
		System.out.println(p1.getNomeCliente());
		p2.setNomeCliente("Maria Madalena");
		System.out.println(p2.getNomeCliente());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p1.getValor());
	}
}
