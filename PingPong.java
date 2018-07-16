package threads;

public class PingPong extends Thread
{

	String palavra; //atributos da minha classe
	long tempo;
	public PingPong(String palavra, long tempo)
	{
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run() //quando o m�tod run termina, minha thread � encerrada
	{
		
			try 
			{
				for (int i = 0; i < 5; i++) 
				{
					System.out.println(palavra);
					Thread.sleep(tempo); //m�todo est�tico da classe thread
				}
			} 
			catch (InterruptedException e) 
			{
				return; //informa para o m�todo run() que a execu��o foi finalizada
			}
		}
	
	public static void main(String[] args) 
	{
			new PingPong("ping", 1500).start(); //de 1 segundo e meio vou imprimir a palavra ping
			new PingPong("PONG", 2000).start();
			System.out.println();
	}

}
