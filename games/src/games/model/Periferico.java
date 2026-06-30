package games.model;

public class Periferico extends Produto {

	private String periferico;

	public Periferico(int id, String nome, int tipo, float preco, String periferico) {
		super(id, nome, tipo, preco);

		this.periferico = periferico;

	}

	public String getPeriferico() {
		return periferico;
	}

	public void setPeriferico(String periferico) {
		this.periferico = periferico;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Nome genérico: %s\n", this.periferico);

	}

}
