package threads;

import java.io.InterruptedIOException;

/**
 * 
 * @author MPC, uma <code> POnte </code> representa o elo de
 * liga��o entre objetos Produtores e Consumidores
 * de Informa��es. Os Produtores utilizam as 
 * Pontes para gravar informa��es e compartilhar
 * essas informa��es com o Consumidores que l�em
 * esses dados da Ponte para fazer o processamento.
 *
 */

public interface Ponte //Interface que representa a Ponte entre os objetos Produtores e Consumidores
{
	public void set (int valor) throws InterruptedException;//Definir a informa��o a ser compartilhada
	
	public int get() throws InterruptedException;//Recupera a informa��o
}
