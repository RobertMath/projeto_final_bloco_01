package carro.model;



public interface CarroRepository {
	
	public void procurarPorNumero(int numero);

	public void cadastrar(Carro carro );

	public void atualizar(Carro carro );

	public void deletar(int numero);
	
	public void listarTodos();

	
}
