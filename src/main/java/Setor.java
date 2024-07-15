import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

	private List<Pedido> pedidosComPendencia = new ArrayList<>();

	public void adicionarPedidoPendente(Pedido pedido) {
		this.pedidosComPendencia.add(pedido);
	}

	public boolean verificarPedidoComPendencia(Pedido pedido) {
		return this.pedidosComPendencia.contains(pedido);
	}
}
