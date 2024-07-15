public class Frete extends Setor {

	private static Frete instancia = new Frete();

	private Frete() {}

	public static Frete getInstancia() {
		return instancia;
	}
}
