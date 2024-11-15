package carro.model;

public class CarroEletrico extends Carro {

	private int autonomia;

	public CarroEletrico(int numero, int ano, String modelo, String cor, int autonomia) {
		super(numero, ano, modelo, cor);
		this.autonomia = autonomia;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Autonomia na Bateria de : " + autonomia + "km!");
	}
}
