package threads;

public class ComprasEmFamilia implements Runnable
{
	ContaConjunta conta = new ContaConjunta(); //Unica conta compartilhada
	
	public static void main(String[] args)
	{
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia(); //Objeto do tipo Runnable
		
		new Thread(irAsCompras, "Pai").start(); //Thread do Pai
		new Thread(irAsCompras, "Mãe").start();
		new Thread(irAsCompras, "Filha").start();
		new Thread(irAsCompras, "Filho").start();
	}

	@Override
	public void run() //levar as pessoas as compras
	{
		String cliente = Thread.currentThread().getName();//recupera o nome da Thread corrente
		for(int i=0; i <1; i++) //5 compras cada 1, é claro quem comprar primeiro
		{
			conta.sacar(20, cliente); //cada pessoa irá fazer uma compra de 20,00

			if(conta.getSaldo() < 0)
			{
				System.out.println("Estourou");
			}
		}
	}
}
