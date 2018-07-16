package threads;

public class PonteSincronizada implements Ponte
{

	private int valor = -1;
	private boolean ocupada = false; //ponte não ocupada
	
	@Override
	public synchronized void set(int valor) throws InterruptedException 
	{
		while(ocupada)
		{
			System.out.println("Ponte cheia. Produtor deve aguardar.");
			System.out.println("vai fazer um wait no set");
			wait();//quando o metodo nao puder ser executado, chamo o wait da classe object para a thread aguardar
		}
		System.out.print("Produziu " + valor);
		this.valor = valor;	
		ocupada = true; //ponte ocupada novamente
		System.out.println("vai fazer um notifyall no set");
		notifyAll(); //indica para todas as threads que estao aguardando o status, estado mudou ou nao
	}

	@Override
	public synchronized int get() throws InterruptedException 
	{
		while(!ocupada) //ponte não estiver ocupada, só leu novas informações
		{
			System.out.println("Ponte vazia. Consumidor aguardando.");
			System.out.println("vai fazer um wait no get");
			wait();//aguadar ate que a ponte esteja ocupada para que ele possa executar a leitura da informacao
		}
		System.err.print("Consumiu " + valor);
		ocupada = false; //ponte não está ocupada, o valor acabou de ser lido
		System.out.println("vai fazer um notifyall no get");
		notifyAll(); //indicar que o produtor pode armazenar valores, pois consumidor acabou de ler
		return valor;
	}
	
}
