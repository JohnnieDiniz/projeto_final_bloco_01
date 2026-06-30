package games.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static final Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

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
			System.out.println("            7 - Sair                                 ");
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

				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");

				keyPress();
				break;
			case 3:
				System.out.println("Consultar Produtos por ID \n\n");
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produtos por ID\n\n");

				keyPress();
				break;
			case 5:
				System.out.println("Apagar Produtos por ID \n\n");

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
		System.out.println("Projeto Desenvolvido por:  ");
		System.out.println("João Vitor Diniz Alves - joao.vitor.diniz@outlook.com");
		System.out.println("github.com/JohnnieDiniz");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		System.out.println("\n\nPressione Enter para continuar...");
		leia.nextLine();
	}

}
