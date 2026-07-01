package games.controller;

public class Validacao {
// validacao -- tipos
	public static void validarNome(String modelo) {
		if (modelo == null || modelo.trim().isEmpty())
			throw new IllegalArgumentException("Modelo não pode ser vazio!");
	}
}
