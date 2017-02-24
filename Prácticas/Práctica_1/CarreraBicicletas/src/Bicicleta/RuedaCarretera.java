package Bicicleta;

public class RuedaCarretera extends Rueda {
	
	private int kilometrosSoportados;

	public RuedaCarretera(int tamanio, String material,int kilometros) {
		super(tamanio, material);
		this.kilometrosSoportados = kilometros;
	}

	/**
	 * @return the kilometrosSoportados
	 */
	public int getKilometrosSoportados() {
		return kilometrosSoportados;
	}

	/**
	 * @param kilometrosSoportados the kilometrosSoportados to set
	 */
	public void setKilometrosSoportados(int kilometrosSoportados) {
		this.kilometrosSoportados = kilometrosSoportados;
	}
	
	

}
