package Bicicleta;

public class ManillarMontaņa extends Manillar {
	
	private boolean gps;

	public ManillarMontaņa(String tipo, boolean gps) {
		super(tipo);
		// TODO Auto-generated constructor stub
		this.gps = gps;
	}

	/**
	 * @return the gps
	 */
	public boolean isGps() {
		return gps;
	}

	/**
	 * @param gps the gps to set
	 */
	public void setGps(boolean gps) {
		this.gps = gps;
	}

	
	
}
