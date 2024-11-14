package carro.model;

public class CarroEletrico extends Carro{
	
	private int autonomia;
	
	public CarroEletrico(String modelo, String cor, int ano,int autonomia) {
		super(modelo, cor, ano);
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
