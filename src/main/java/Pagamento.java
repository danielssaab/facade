public class Pagamento extends Setor {

	private static Pagamento instancia = new Pagamento();

	private Pagamento() {}

	public static Pagamento getInstancia() {
		return instancia;
	}
}
