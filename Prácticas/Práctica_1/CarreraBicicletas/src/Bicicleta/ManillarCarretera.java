/**
 * 
 */
package Bicicleta;

/**
 * @author Jose-laptop
 *
 */
public class ManillarCarretera extends Manillar {
	
	private boolean velocimetro;
	
	public ManillarCarretera(String tipo, boolean velocimetro){
		super(tipo);
		this.velocimetro = velocimetro;
	}

	/**
	 * @return the velocimetro
	 */
	public boolean isVelocimetro() {
		return velocimetro;
	}

	/**
	 * @param velocimetro the velocimetro to set
	 */
	public void setVelocimetro(boolean velocimetro) {
		this.velocimetro = velocimetro;
	}
	
	

}
