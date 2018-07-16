package threads;

import java.util.Iterator;
import java.util.Random;

public class Produtor implements Runnable
{
	private Random random = new Random();
	private Ponte ponte;//recebo a minha ponte
	public Produtor(Ponte ponte)
	{
		this.ponte = ponte;//iniciando a ponte no meu construtor
	}
	
	@Override
	public void run() //gera informações para adicionar na ponte
	{
		int total = 0;//variavel local para somatorio de todos os numeros
		for (int i = 0; i < 5; i++) //execucao do metodo run()
		{
			try //sleep e set lançam um interruped exception
			{
				Thread.sleep(random.nextInt(3000)); //periodo de 0 a 3 segundos adiciona valores gerados dentro do meu for na ponte compartilhada
				total += i;//incremento da varivavel total
				ponte.set(i);//armazendo dentro da ponte o valor gerado dentro do for
				System.out.println("\t" + total);
			} 
			catch (InterruptedException e) 
			{
				
			}
			
		}	
	}

}
