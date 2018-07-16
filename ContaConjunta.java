package threads;

public class ContaConjunta 
{
	private int saldo = 100;
	
	public int getSaldo() //recuperar valor do saldo
	{
		return saldo;
	}
	
	public synchronized void sacar(int valor, String cliente) //realizar saque, parametros: valor do saque e nome do cliente
	{
		if(saldo >= valor)
		{
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try 
			{
				System.out.println(cliente + " esperando");
				Thread.sleep(1000); //aguardando 1 segundo o processamento
			} 
			catch (InterruptedException e) 
			{
				
			}
				saldo -= valor;
				String msg = cliente + " SACOU " + valor 
						+ " [Saldo Original=" + saldoOriginal 
						+", Saldo Final=" + saldo + "]";
				System.out.println(msg);
		}
		else
		{
			System.out.println("Saldo insuficiente para " + cliente);
		}
		
	}
}
