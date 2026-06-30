package games.model;

public abstract class Produto {

	private int id;
	private String nome;
	private int tipo;
	private float preco;

	public Produto(int id, String nome, int tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipo = " ";

		switch (this.tipo) {
		case 1 -> tipo = "Console";
		case 2 -> tipo = "Preiféricos";
		default -> tipo = "Inválido";
		}
		
		System.out.println("\n********************************************");
		System.out.println("Dados do Produto");
		System.out.println("********************************************");
		System.out.printf("Id do produto: %d%n", this.id);
		System.out.printf("Categoria do produto: %s%n", tipo);
		System.out.printf("Nome do produto: %s%n", this.nome);
		System.out.printf("Preço do produto: R$ %.2f%n", this.preco);

	}
}
