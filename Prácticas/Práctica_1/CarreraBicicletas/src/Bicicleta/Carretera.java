package Bicicleta;
/**
 * 
 */

/**
 * @author Jose-laptop
 *
 */
public class Carretera extends Bicicleta {

	public Carretera(String name, int participante) {
		super(name);
		// TODO Auto-generated constructor stub
		this.participante = participante;
		tiempo_minimo = 6; // el 10% de los participantes se retirará de la
							// carrera

	}

	public void setCuadro(CuadroCarretera cuadro) {
		this.cuadro = cuadro;
	}

	public CuadroCarretera getCuadro() {
		return (CuadroCarretera) cuadro;
	}

	public void setManillar(ManillarCarretera manillar) {
		this.manillar = manillar;
	}

	public ManillarCarretera getManillar() {
		return (ManillarCarretera) manillar;
	}

	public void setRuedas(RuedaCarretera rueda) {
		this.ruedaDelantera = rueda;
		this.ruedaTrasera = rueda;

	}

	public RuedaCarretera getRuedaDelantera() {
		return (RuedaCarretera) ruedaDelantera;
	}

	public RuedaCarretera getRuedaTrasera() {
		return (RuedaCarretera) ruedaTrasera;
	}
}
