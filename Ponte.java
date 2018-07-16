package threads;

import java.io.InterruptedIOException;

/**
 * 
 * @author MPC, uma <code> POnte </code> representa o elo de
 * ligação entre objetos Produtores e Consumidores
 * de Informações. Os Produtores utilizam as 
 * Pontes para gravar informações e compartilhar
 * essas informações com o Consumidores que lêem
 * esses dados da Ponte para fazer o processamento.
 *
 */

public interface Ponte //Interface que representa a Ponte entre os objetos Produtores e Consumidores
{
	public void set (int valor) throws InterruptedException;//Definir a informação a ser compartilhada
	
	public int get() throws InterruptedException;//Recupera a informação
}
