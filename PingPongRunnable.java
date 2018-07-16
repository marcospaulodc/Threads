package threads;

public class PingPongRunnable implements Runnable
{

	String palavra;
	long tempo;
	public PingPongRunnable(String palavra, long tempo)
	{
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	@Override
	public void run() 
	{
		try 
		{
			for (int i = 0; i < 100; i++) 
			{
				System.out.println(palavra);
				Thread.sleep(tempo);
			}
		} 
		catch (InterruptedException e) 
		{
			return;
		}
		
	}
	
	public static void main(String[] args) 
	{
			Runnable ping = new PingPongRunnable("ping", 1500); //de 1 segundo e meio vou imprimir a palavra ping
			Runnable pong = new PingPongRunnable("PONG", 2000);
			
			new Thread(ping, "ping").start(); //recebe um  objeto do tipo Runnable
			new Thread(pong, "pong").start();
			
			System.out.println("Ver Threads");
	}

}
