public class PedidoFacade {

	public boolean verificarPedido(Pedido pedido) {
		if (Estoque.getInstancia().verificarPedidoComPendencia(pedido)) {
			return false;
		}
		if (Pagamento.getInstancia().verificarPedidoComPendencia(pedido)) {
			return false;
		}
		if (Frete.getInstancia().verificarPedidoComPendencia(pedido)) {
			return false;
		}
		return true;
	}
}
