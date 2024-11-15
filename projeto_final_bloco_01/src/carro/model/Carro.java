package carro.model;

public abstract class Carro {

	private int numero;
	private int ano;
	private String modelo;
	private String cor;

	public Carro(int numero, int ano, String modelo, String cor) {
		this.numero = numero;
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void visualizar() {
		
		System.out.println("Dados do Carro");
		System.out.println("Modelo : " + this.modelo);
		System.out.println("Cor : " + this.cor);
		System.out.println("Ano : " + this.ano);
	}

}
