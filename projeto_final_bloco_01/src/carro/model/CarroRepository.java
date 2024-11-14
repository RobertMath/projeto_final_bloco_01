package carro.model;



public interface CarroRepository {
	
	public void procurarPorNumero(int numero);

	public void cadastrar( );

	public void atualizar( );

	public void deletar(int numero);
}
