package threads;

import java.util.Iterator;
import java.util.Random;

public class Consumidor implements Runnable
{
	private Random random = new Random();
	private Ponte ponte;
	public Consumidor(Ponte ponte)
	{
		this.ponte = ponte;
	}
	
	@Override
	public void run() //gera informações para adicionar na ponte
	{
		int total = 0;
		for (int i = 0; i < 5; i++) 
		{
			try 
			{
				Thread.sleep(random.nextInt(3000)); //periodo de 0 a 3 segundos adiciona valores gerados dentro do meu for na ponte compartilhada
				total += ponte.get();//le informações na ponte e adiciona na variavel total
				System.err.println("\t" + total);
			} 
			catch (InterruptedException e) 
			{
				
			}
			
		}	
	}

}
