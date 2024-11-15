package carro.controller;

import java.util.ArrayList;

import carro.model.Carro;
import carro.model.CarroRepository;

public class CarroController implements CarroRepository {

	private ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var carro = buscarNaCollection(numero);

		if (carro != null)
			carro.visualizar();
		else
			System.out.println("O Carro número " + carro + "não foi encontrado!");

	}

	@Override
	public void listarTodos() {
		for (var carro : listaCarros) {
			carro.visualizar();
		}

	}

	@Override
	public void cadastrar(Carro carro) {
		listaCarros.add(carro);
		System.out.println("\nO Carro número: " + carro.getNumero() + " foi criado com sucesso!");
	}

	@Override
	public void atualizar(Carro carro) {
		var buscaCarro = buscarNaCollection(carro.getNumero());

		if (buscaCarro != null) {
			listaCarros.set(listaCarros.indexOf(buscaCarro), carro);
			System.out.println("\nO Carro número: " + carro.getNumero() + "foi atualizado com sucesso!");
		} else {
			System.out.println("\nO Carro número: " + carro.getNumero() + " não foi encontrado!");
		}

	}

	@Override
	public void deletar(int numero) {
		var carro = buscarNaCollection(numero);

		if (carro != null) {
			if (listaCarros.remove(carro) == true)
				System.out.println("\nO Carro numero: " + numero + " foi deletada com sucesso!");
		} else
			System.out.println("\nO Carro numero: " + numero + " não foi encontrada!");

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Carro buscarNaCollection(int numero) {
		for (var carro : listaCarros) {
			if (carro.getNumero() == numero) {
				return carro;
			}
		}
		return null;
	}

}
