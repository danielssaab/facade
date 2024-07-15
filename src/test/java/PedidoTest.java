import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

	private PedidoFacade facade;
	private Pedido pedido;

	@BeforeEach
	void setUp() {
		facade = new PedidoFacade();
		pedido = new Pedido(facade);
	}

	@Test
	void deveProcessarPedidoComSucesso() {

		assertTrue(facade.verificarPedido(pedido));
	}

	@Test
	void deveInterromperPedidoComPendenciaEstoque() {
		Estoque.getInstancia().adicionarPedidoPendente(pedido);

		assertFalse(facade.verificarPedido(pedido));
	}

	@Test
	void deveInterromperPedidoComPendenciaPagamento() {
		Pagamento.getInstancia().adicionarPedidoPendente(pedido);

		assertFalse(facade.verificarPedido(pedido));
	}

	@Test
	void deveInterromperPedidoComPendenciaFrete() {
		Frete.getInstancia().adicionarPedidoPendente(pedido);

		assertFalse(facade.verificarPedido(pedido));
	}
}
