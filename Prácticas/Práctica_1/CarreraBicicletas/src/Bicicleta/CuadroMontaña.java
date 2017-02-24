/**
 * 
 */
package Bicicleta;

/**
 * @author Jose-laptop
 *
 */
public class CuadroMontaņa extends Cuadro {
	
	private String forma;

	public CuadroMontaņa(String material, int peso, String forma) {
		super(material, peso);
		// TODO Auto-generated constructor stub
		this.forma = forma;
	}

	/**
	 * @return the forma
	 */
	public String getForma() {
		return forma;
	}

	/**
	 * @param forma the forma to set
	 */
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	

}
