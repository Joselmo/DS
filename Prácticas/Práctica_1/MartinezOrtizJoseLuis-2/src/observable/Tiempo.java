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
public class Tiempo extends MeteoSimulador implements Runnable {
	
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

	@Override
	public void run() {
		Random r = new Random();

		String tiempo_actual;

		while (true) {

			tiempo_actual = tiempo.get(r.nextInt(tiempo.size()));
			System.out.println("Tiempo-sensor: " + tiempo_actual);
			try {
				Thread.sleep(5000);
			} catch (java.lang.InterruptedException e) {
				e.printStackTrace();
			}

			notificarObservador(tiempo_actual);

		}

	}

}
