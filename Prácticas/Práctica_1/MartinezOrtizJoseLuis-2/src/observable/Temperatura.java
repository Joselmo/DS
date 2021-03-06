package observable;


/**
 * Simulador de Temperatura que genera un valor de temperatura cada 60 segundos
 * 
 * @author Jose-laptop
 *
 */
public class Temperatura extends MeteoSimulador{

	private int temperatura_maxima, temperatura_minima;
	private int temperatura;


	public Temperatura(int temp_max, int temp_min) {
		if (temp_max < temp_min)
			temp_max = temp_min;
		temperatura_maxima = temp_max;
		temperatura_minima = temp_min;

	}


	public void setTemperaturaMax(int temp) {
		temperatura_maxima = temp;
	}

	public void setTemperaturaMin(int temp) {
		temperatura_minima = temp;
	}
	
	public int getTemperaturaMax(){
		return temperatura_maxima;
	}

	public int getTemperaturaMin(){
		return temperatura_minima;
	}

	public void actualizarTemperatura(int temp){
		temperatura = temp;
		
		
		notificarObservador(temperatura);
	}
	

}
