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
public abstract class MeteoSimulador{
	
	protected ArrayList<Observador> observadoresConcretos;	

	
	
	public MeteoSimulador(){
		observadoresConcretos = new ArrayList<Observador>();
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
