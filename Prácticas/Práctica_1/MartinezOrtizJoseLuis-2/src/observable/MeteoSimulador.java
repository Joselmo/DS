/**
 * 
 */
package observable;

import java.util.ArrayList;

import observador.Observador;

/**
 * @author Jose-laptop
 *
 */
public abstract class MeteoSimulador implements Runnable{
	
	protected ArrayList<Observador> observadoresConcretos;	
	private Thread t;
	protected String threadName;
	
	
	public MeteoSimulador(){
		observadoresConcretos = new ArrayList<Observador>();
	}
	
	/**
	 *  Lanza el thread del observable en segundo plano.
	 */
	public void start() {
		System.out.println("Lanzado observable " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	/**
	 * Incluye un nuevo observador a un simulador
	 * @param observador
	 */
	public void incluirObservador(Observador observador){
		observadoresConcretos.add(observador);
	}
	
	/**
	 * Elimina a un observador de la lista de observadores del simulador
	 * @param observador a eliminar del listado de observadores.
	 */
	public void eliminarObservador(Observador observador){
		observadoresConcretos.remove(observador);
	}
	
	/**
	 * Notifica a los observadores que actualicen sus valores
	 */
	public void notificarObservador(Object valor){
		
		for(Observador ob: observadoresConcretos){
			ob.manejarEvento(valor);
		}
		
	}
	

}
