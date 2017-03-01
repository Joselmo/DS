package observable;

import java.util.Random;

/**
 * Simulador de Temperatura que genera un valor de temperatura cada 60 segundos
 * 
 * @author Jose-laptop
 *
 */
public class Temperatura extends MeteoSimulador implements Runnable {

	private int temperatura_maxima, temperatura_minima;


	public Temperatura(int temp_max, int temp_min) {
		threadName = "temperatura";
		if (temp_max < temp_min)
			temp_max = temp_min;
		temperatura_maxima = temp_max;
		temperatura_minima = temp_min;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r = new Random();

		int temperatura;

		while (true) {

			temperatura = r.nextInt(temperatura_maxima - temperatura_minima) + temperatura_minima;
			System.out.println("Temp-sensor: " + temperatura);
			try {
				Thread.sleep(5000);
			} catch (java.lang.InterruptedException e) {
				e.printStackTrace();
			}

			notificarObservador(temperatura);

		}
	}


	public void setTemperaturaMax(int temp) {
		temperatura_maxima = temp;
	}

	public void setTemperaturaMin(int temp) {
		temperatura_minima = temp;
	}

}
