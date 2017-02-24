package Bicicleta;

public class Cuadro {
	
	protected String material;
	protected int peso;
	
	
	public Cuadro(String material, int peso) {
		super();
		this.material = material;
		this.peso = peso;
	}


	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}


	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}


	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	

}
