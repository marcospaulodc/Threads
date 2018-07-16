package threads;

public class PonteTest 
{

	public static void main(String[] args) 
	{
		/*Ponte Não Sincronizada
		Ponte ponte = new PonteNaoSincronizada(); //Precisa-se de uma classe concreta que é a PonteNaoSincronizada
		 */
		
		/*Ponte Sincronizada*/
		Ponte ponte = new PonteSincronizada();
		
		new Thread(new Produtor(ponte)).start();//produtores recebe a ponte para compartilhar informacoes
		new Thread(new Consumidor(ponte)).start();//consumidor mesma ideia
	}

}
