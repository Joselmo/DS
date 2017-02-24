/**
 * 
 */
package Bicicleta;

/**
 * @author Jose-laptop
 *
 */
public class CuadroCarretera extends Cuadro {
	
	private int bidones;

	public CuadroCarretera(String material, int peso, int bidones) {
		super(material, peso);
		// TODO Auto-generated constructor stub
		this.bidones = bidones;
	}

	/**
	 * @return the bidones
	 */
	public int getBidones() {
		return bidones;
	}

	/**
	 * @param bidones the bidones to set
	 */
	public void setBidones(int bidones) {
		this.bidones = bidones;
	}

	
	
}
