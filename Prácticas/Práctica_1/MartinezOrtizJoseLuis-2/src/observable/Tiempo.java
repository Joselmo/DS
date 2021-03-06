/**
 * 
 */
package observable;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jose-laptop
 *
 */
public class Tiempo extends MeteoSimulador {
	
	private ArrayList<String> tiempo;	
	
	public Tiempo(){
		tiempo = new ArrayList<String>();
		
		tiempo.add("Despejado");
		tiempo.add("Nubloso");
		tiempo.add("Lluvia");
		tiempo.add("Tormenta");
		tiempo.add("Nieve");
		tiempo.add("Granizo");
		
		
	}

	public void setTiempo(int tiempo_actual){
		notificarObservador(tiempo.get(tiempo_actual));
	}
	
	public int getNumEventos(){
		return tiempo.size();
	}
	



}
