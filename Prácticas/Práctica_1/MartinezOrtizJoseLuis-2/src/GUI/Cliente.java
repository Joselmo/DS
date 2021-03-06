package GUI;

import observable.Simulador;
import observable.Temperatura;
import observable.Tiempo;
import observador.GraficaTemperatura;
import observador.TiempoSateital;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI gui = GUI.getInstance();

		gui.setVisible(true);
		
		Temperatura temperatura = new Temperatura(10, 0);
		Tiempo tiempo = new Tiempo();
		
		GraficaTemperatura graficaTemp = new GraficaTemperatura();
		TiempoSateital prevision = new TiempoSateital();
		
		gui.setGraficaTemperatura(graficaTemp);
		gui.setTemperatura(temperatura);
		
		temperatura.incluirObservador(graficaTemp);
		tiempo.incluirObservador(prevision);
		Simulador simulador = new Simulador(tiempo, temperatura);
		
		simulador.run();

	}

}
