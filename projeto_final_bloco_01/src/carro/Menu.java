package carro;

import java.util.Scanner;

import carro.model.CarroEletrico;



public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao,ano,autonomia;
		String modelo,cor;
		
		CarroEletrico carroEletrico1 = new CarroEletrico("Toyota Supra Hybrido", "Vermelho", 2077, 500);
		CarroEletrico carroeletrico2 = new CarroEletrico("Toyota Corrola Hybrid", "Preto", 2090, 400);
		CarroEletrico carroEletrico3 = new CarroEletrico("Toyota Hilux", "Branco", 2002, 20);
		
		
		while (true) {
			System.out.println("          Toyota          ");
			System.out.println("1- Lista dos Carros:");
			System.out.println("2- Cadastrar novo Carro");
			System.out.println("3- Atualizar Carro");
			System.out.println("4- Remover Carro");
			System.out.println("5- Buscar por Numero");
			System.out.println("6- Sair");
			System.out.println("Escolha uma entre as opções: ");
			opcao = scanner.nextInt();
			
			if(opcao == 5) {
				break;
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Lista completa dos Carros!");
				
				break;
			case 2:
				System.out.println("Cadastro de um novo Carro");
				System.out.println("Digite o Modelo do Carro: ");
				modelo = scanner.nextLine();
				System.out.println("Digite a cor: ");
				cor = scanner.nextLine();
				System.out.println("Digite o Ano: ");
				ano = scanner.nextInt();
				System.out.println("Como é elétrico, digite a autonomia: ");
				autonomia = scanner.nextInt();
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
