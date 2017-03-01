package observable;

import java.util.ArrayList;
import java.util.Random;

public class Simulador implements Runnable{
	
	private Tiempo tiempo;
	private Temperatura temperatura;
	
	public Simulador(Tiempo tiempo, Temperatura temperatura) {
		this.tiempo = tiempo;
		this.temperatura = temperatura;
	}

	@Override
	public void run() {
		Random r = new Random();
		

		int tiempo_actual;
		int temp;

		while (true) {
			
			tiempo_actual = r.nextInt(tiempo.getNumEventos());
			System.out.println("Tiempo-sensor: " + tiempo_actual);
			try {
				Thread.sleep(2500);
			} catch (java.lang.InterruptedException e) {
				e.printStackTrace();
			}
			tiempo.setTiempo(tiempo_actual);
			
			temp = r.nextInt(temperatura.getTemperaturaMax()-temperatura.getTemperaturaMin()) + 
					temperatura.getTemperaturaMin();
			
			System.out.println("Temp-sensor: " + temp);
			try {
				Thread.sleep(2500);
			} catch (java.lang.InterruptedException e) {
				e.printStackTrace();
			}
			
			temperatura.actualizarTemperatura(temp);

		}		
	}
	
	
	
	

}
