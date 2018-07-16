package threads;

public class PonteNaoSincronizada implements Ponte
{

	private int valor = -1; //representa o valor armazenado na ponte
	
	@Override
	public void set(int valor) throws InterruptedException 
	{
		System.out.print("Produziu " + valor);
		this.valor = valor;	//adiciona na variavel valor, o valor que foi informado
	}

	@Override
	public int get() throws InterruptedException 
	{
		System.err.print("Consumiu " + valor);
		return valor; //retorna aquele valor
	}

}
