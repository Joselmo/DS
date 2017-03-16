package scacv;

public class CalcularDistancia implements Filtro {
	
	private double distancia;
	private double diametro;
	
	
	public CalcularDistancia() {
		distancia = 0;
		diametro = 60;
	}

	@Override
	public double ejecutar(Object o) {
		
		double v = (double) o;
		
		double velocidad_angular = (2 * Math.PI * v) / 60;
		
		distancia = velocidad_angular * 10;
		
		return distancia;
	}
	
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Calculo de distancia";
	}

}
