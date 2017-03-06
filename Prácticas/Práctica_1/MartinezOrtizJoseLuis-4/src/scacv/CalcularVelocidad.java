package scacv;

public class CalcularVelocidad implements Filtro {
	
	private double revolAnt;

	@Override
	public double ejecutar(Object o) {
		double distancia= (double) o;
		double velocidad= distancia*3600/INTERVALO;
		//revolAnt=revoluciones;
		return velocidad;
	}

}
