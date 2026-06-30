package games.model;

public class Console extends Produto {
	
	private String videoGame;

	public Console(int id, String nome, int tipo, float preco, String videoGame) {
		super(id, nome, tipo, preco);
		
		this.videoGame = videoGame;
		
			}

	public String getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(String videoGame) {
		this.videoGame = videoGame;
	}
	
	
	@Override 
	public void visualizar() {
		super.visualizar();
		System.out.printf("Nome genérico: %s\n", this.videoGame);
		
	}

}
