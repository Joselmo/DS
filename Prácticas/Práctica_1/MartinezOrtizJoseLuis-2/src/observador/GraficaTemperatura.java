/**
 * 
 */
package observador;

import java.util.ArrayList;


import GUI.GUI;

/**
 * @author Jose-laptop
 *
 */
public class GraficaTemperatura implements Observador {
	
	private float temperatura_c;
	private float temperatura_f;
	private boolean celsius;
	private ArrayList<Float> historial_celsius;
	
	

	public GraficaTemperatura(){
		temperatura_c = 0;
		celsius = true;
		historial_celsius = new ArrayList<>();
	}

	/**
	 * Recibe una nueva temperatura en Celsius.
	 */
	@Override
	public void manejarEvento(Object valor) {
		temperatura_c = (Integer) valor;
		temperatura_f = 32 + ( temperatura_c * 9 / 5);
		historial_celsius.add(temperatura_c);
		refrescarPantalla();
		//System.out.println("Temperatura actual= "+temperatura+ "�");
		
		//toFahrenheit();
		//System.out.println("Temperatura actual= "+temperatura+ "F�");

	}
	
	public void refrescarPantalla(){
		if(celsius)
			GUI.getInstance().actualizarTemperatura(temperatura_c+" �C");
		else
			GUI.getInstance().actualizarTemperatura(temperatura_f+" �F");
	}
	
	
	public void setUnit(int i){
		switch (i) {
		case 0: celsius = true; break;
		case 1: celsius = false; break;
		}
		
		refrescarPantalla();
	}
	
	public ArrayList<Float> getHistorialCelsius(){
		return historial_celsius;
	}
	


	

}
