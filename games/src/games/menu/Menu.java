package games.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import games.controller.ProdutoController;
import games.model.Console;
import games.model.Periferico;
import games.model.Produto;

public class Menu {

	public static final Scanner leia = new Scanner(System.in);
	public static final ProdutoController produtoController = new ProdutoController();

	public static void main(String[] args) {

		criarProdutosTeste();

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      GAMES DINIZ                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto.                   ");
			System.out.println("            2 - Listar produtos.                     ");
			System.out.println("            3 - Buscar Produto por ID.               ");
			System.out.println("            4 - Atualizar Produto.                   ");
			System.out.println("            5 - Apagar Produto.                      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 7");
				leia.nextLine();
			}

			if (opcao == 0) {
				System.out.println("\nGAMES DINIZ - O seu sonho começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar um novo Produto\n\n");
				cadastrarProduto();
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				listarProdutos();
				keyPress();
				break;
			case 3:
				System.out.println("Consultar Produtos por ID \n\n");
				procurarProdutoPorId();
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produtos por ID\n\n");
				atualizarProduto();
				keyPress();
				break;
			case 5:
				System.out.println("Apagar Produtos por ID \n\n");
				deletarProduto();
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Volte Sempre!  ");
		System.out.println("Projeto Desenvolvido por:  ");
		System.out.println("João Vitor Diniz Alves - joao.vitor.diniz@outlook.com");
		System.out.println("github.com/JohnnieDiniz");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		System.out.println("\n\nPressione Enter para continuar...");
		leia.nextLine();
	}

	private static void criarProdutosTeste() {
		produtoController.cadastrar(new Console(produtoController.gerarId(), "Xbox Serie X", 1, 2500.00f, "Console"));
		produtoController
				.cadastrar(new Periferico(produtoController.gerarId(), "Contorle - PS5", 2, 350.00f, "Periferico"));
	}

	private static void listarProdutos() {
		produtoController.listarTodas();
	}

	private static void cadastrarProduto() {

		System.out.print("Digite o nome do produto: ");
		String nome = leia.nextLine();

		System.out.print("Digite o tipo do produto (1 - Console | 2 - Periférico): ");
		int tipo = leia.nextInt();

		System.out.print("Digite o Preço do produto: ");
		float preco = leia.nextFloat();

		switch (tipo) {
		case 1 -> {
			System.out.print("Digite a marca do Produto: ");
			leia.skip("\\R");
			String Console = leia.nextLine();

			produtoController.cadastrar(new Console(produtoController.gerarId(), nome, tipo, preco, Console));
		}
		case 2 -> {
			System.out.print("Digite o tipo de Periférico: ");
			leia.skip("\\R");
			String Periferico = leia.nextLine();

			produtoController.cadastrar(new Periferico(produtoController.gerarId(), nome, tipo, preco, Periferico));
		}
		default -> System.out.println("tipo de produto inválido!");
		}

	}

	private static void procurarProdutoPorId() {

		System.out.print("Digite o Id do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		produtoController.procurarPorId(id);
	}

	private static void deletarProduto() {

		System.out.print("Digite o Id do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		Produto produto = produtoController.buscarNaCollection(id);

		if (produto != null) {

			System.out.print("\nTem certeza que deseja excluir o produto? (S/N): ");
			String confirmacao = leia.nextLine();

			if (confirmacao.equalsIgnoreCase("S")) {
				produtoController.deletar(id);
			} else {
				System.out.println("\nOperação cancelada!");
			}

		} else {
			System.out.printf("\nO produto Id %d não foi encontrado!", id);
		}
	}

	private static void atualizarProduto() {

		System.out.print("Digite o Id do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		Produto produto = produtoController.buscarNaCollection(id);

		if (produto != null) {

			String nome = produto.getNome();
			int tipo = produto.getTipo();
			float preco = produto.getPreco();

			System.out.printf(
					"Nome atual: %s\nDigite o novo nome do Produto (Pressione ENTER para manter o valor atual): ",
					nome);
			String entrada = leia.nextLine();
			nome = entrada.isEmpty() ? nome : entrada;

			System.out.printf("Preço atual: %.2f\nDigite o novo Preço (Pressione ENTER para manter o valor atual): ",
					preco);
			entrada = leia.nextLine();
			preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada.replace(",", "."));

			switch (tipo) {
			case 1 -> {
				String Console = ((Console) produto).getVideoGame();

				System.out.printf("Console atual é: %s\nDigite a marca: (Pressione ENTER para manter o valor atual): ",
						Console);
				entrada = leia.nextLine();
				Console = entrada.isEmpty() ? Console : entrada;
				produtoController.atualizar(new Console(id, nome, tipo, preco, Console));

			}

			case 2 -> {
				String Periferico = ((Periferico) produto).getPeriferico();

				System.out.printf(
						"Periférico atual é: %s\nDigite o novo Periférico (Pressione ENTER para manter o valor atual): ",
						Periferico);
				entrada = leia.nextLine();
				Periferico = entrada.isEmpty() ? Periferico : entrada;
				produtoController.atualizar(new Periferico(id, nome, tipo, preco, Periferico));
			}
			default -> System.out.println("tipo de produto inválido!");
			}

		} else {
			System.out.printf("\nA produto número %d não foi encontrado!", id);
		}
	}

}
