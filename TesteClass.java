
public class TesteClass {
	public static void main(String args[]) {
		
		Carrinho car = new Carrinho();
		
		Pedido p1 = new Pedido(new Computador("Asus", 2000.00), 1);
		car.addPedido(p1);
		
		Pedido p2 = new Pedido(new Cerveja("Brahma Duplo Malta", 2.79), 10);
		car.addPedido(p2);
		
		Pedido p3 = new Pedido(new Televisao("Cristal Uhd", 4000.00), 1);
		car.addPedido(p3);
		
		
		System.out.println("Total: " + car.totalCarrinho());
	}
}
