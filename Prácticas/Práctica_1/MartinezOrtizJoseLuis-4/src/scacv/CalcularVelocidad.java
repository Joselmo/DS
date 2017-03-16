package scacv;

public class CalcularVelocidad implements Filtro {
	
	private double velocidad;
	
	private double INTERVALO;
	
	 public CalcularVelocidad(float inter) {
		// TODO Auto-generated constructor stub
		INTERVALO  = inter;
	}

	 public void setIntervalo(float inter){
		 INTERVALO = inter;
	 }
	 
	 
	@Override
	public double ejecutar(Object o) {
		double distancia= (double) o;
		double angularSpeed = (2 * Math.PI * distancia) / 60;
		
		
		double velocidad= (angularSpeed*(60/100))*3600/INTERVALO;	// en m/s		
		
		return velocidad;
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return "Calculo de velocidad";
	}
	


}
