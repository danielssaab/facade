public class Estoque extends Setor {

	private static Estoque instancia = new Estoque();

	private Estoque() {}

	public static Estoque getInstancia() {
		return instancia;
	}
}
