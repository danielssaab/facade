public class Pedido {

	private PedidoFacade pedidoFacade;

	public Pedido(PedidoFacade pedidoFacade) {
		this.pedidoFacade = pedidoFacade;
	}

	public boolean processarPedido() {
		return pedidoFacade.verificarPedido(this);
	}
}
