import java.util.*;

public class Carrinho {
	
	private List<Pedido> pedidos = new ArrayList();
	
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public double totalCarrinho() {
		double total = 0;
		for(Pedido p: pedidos) {
			double valor_tot_pedido = p.produto.valor * p.quantidade;
			total = total + valor_tot_pedido;
		}
		
		return total;
	}
}
