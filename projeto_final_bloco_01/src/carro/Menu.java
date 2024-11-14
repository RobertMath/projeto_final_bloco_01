package carro;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao,numero;
		String nome;

		while (true) {
			System.out.println("          Toyota          ");
			System.out.println("1- Lista dos Carros:");
			System.out.println("2- Cadastrar novo Carro");
			System.out.println("3- Atualizar Carro");
			System.out.println("4- Remover Carro");
			System.out.println("5- Buscar carro por numero");
			System.out.println("6- Sair");
			System.out.println("Escolha uma entre as opções: ");
			opcao = scanner.nextInt();
			
			if(opcao == 6) {
				break;
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Lista completa dos Carros!");
				break;
			case 2:
				System.out.println("Cadastro de um novo Carro");
				break;
			case 3:
				System.out.println("Atualizando um Carro");
				break;
			case 4:
				System.out.println("Removendo um Carro");
				break;
			case 5:
				System.out.println("Buscando Carro por numero");
				break;
			default:
				System.out.println("Escolha uma das opções válidas!");
				break;
			}

		}

}

	
}
