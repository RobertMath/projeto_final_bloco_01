package carro;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import carro.controller.CarroController;
import carro.model.CarroEletrico;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao, numero, ano, autonomia;
		String modelo, cor;

		CarroController carros = new CarroController();

		CarroEletrico carroEletrico1 = new CarroEletrico(carros.gerarNumero(), 2077, "Supra Hybrid", "Vermelho", 500);
		carros.cadastrar(carroEletrico1);
		CarroEletrico carroeletrico2 = new CarroEletrico(carros.gerarNumero(), 2090, "Toyota Corrola Hybrid", "Preto",
				400);
		carros.cadastrar(carroeletrico2);
		CarroEletrico carroEletrico3 = new CarroEletrico(carros.gerarNumero(), 2002, "Toyota Hilux", "Branco", 20);
		carros.cadastrar(carroEletrico3);

		carros.listarTodos();

		while (true) {
			System.out.println("          Toyota          ");
			System.out.println("1- Lista dos Carros:");
			System.out.println("2- Cadastrar novo Carro");
			System.out.println("3- Atualizar Carro");
			System.out.println("4- Remover Carro");
			System.out.println("5- Buscar por Numero");
			System.out.println("6- Sair");
			System.out.println("Escolha uma entre as opções: ");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				break;
			}

			switch (opcao) {
			case 1:
				System.out.println("Lista completa dos Carros!");
				carros.listarTodos();
				KeyPress();
				break;
			case 2:
				System.out.println("Cadastro de um novo Carro");
				System.out.println("Digite o Ano: ");
				ano = scanner.nextInt();
				scanner.skip("\\R?");
				System.out.println("Digite o Modelo: ");
				modelo = scanner.nextLine();
				System.out.println("Digite a Cor: ");
				cor = scanner.nextLine();

				System.out.println("Como é elétrico, digite a autonomia: ");
				autonomia = scanner.nextInt();
				scanner.skip("\\R?");
				carros.cadastrar(new CarroEletrico(carros.gerarNumero(), ano, modelo, cor, autonomia));

				KeyPress();
				break;
			case 3:
				System.out.println("Atualizando um Carro");
				System.out.println("Digite o numero do Carro:");
				numero = scanner.nextInt();

				var buscaCarro = carros.buscarNaCollection(numero);

				if (buscaCarro != null) {
					System.out.println("Atualizar Cadastro de um Carro");
					System.out.println("Digite o Ano: ");
					ano = scanner.nextInt();
					scanner.skip("\\R?");
					System.out.println("Digite o Modelo: ");
					modelo = scanner.nextLine();
					System.out.println("Digite a Cor: ");
					cor = scanner.nextLine();

					System.out.println("Como é elétrico, digite a autonomia: ");
					autonomia = scanner.nextInt();
					scanner.skip("\\R?");
					carros.atualizar(new CarroEletrico(numero, ano, modelo, cor, autonomia));
				} else {
					System.out.println("O carro não foi encontrado!");
				}
				KeyPress();
				break;
			case 4:
				System.out.println("Removendo um Carro");
				System.out.println("Digite o numero do carro:");
				numero = scanner.nextInt();
				
				carros.deletar(numero);
				break;
			case 5:
				System.out.println("Buscando Carro por numero:");
				System.out.println("Digite o numero do carro:");
				numero = scanner.nextInt();
				carros.procurarPorNumero(numero);
				KeyPress();
				break;

			default:
				System.out.println("Escolha uma das opções válidas!");
				KeyPress();
				break;
			}

		}
	}

	public static void KeyPress() {
		try {
			System.out.println("\n\nPressione Enter para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
