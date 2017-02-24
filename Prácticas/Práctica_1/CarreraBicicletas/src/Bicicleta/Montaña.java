package Bicicleta;

/**
 * @author Jose-laptop
 *
 */
public class Montaña extends Bicicleta {

	public Montaña(String name,int participante ) {
		super(name);
		// TODO Auto-generated constructor stub
		this.participante = participante;
		tiempo_minimo = 12; // 20% de participantes se retirarán en los 60 segundos de la carrera
	}
	
	public void setCuadro(CuadroMontaña cuadro) {
		this.cuadro = cuadro;
	}

	public CuadroMontaña getCuadro() {
		return (CuadroMontaña) cuadro;
	}

	public void setManillar(ManillarMontaña manillar) {
		this.manillar = manillar;
	}

	public ManillarMontaña getManillar() {
		return (ManillarMontaña) manillar;
	}

	public void setRuedas(RuedaMontaña rueda) {
		this.ruedaDelantera = rueda;
		this.ruedaTrasera = rueda;

	}

	public RuedaMontaña getRuedaDelantera() {
		return (RuedaMontaña) ruedaDelantera;
	}

	public RuedaMontaña getRuedaTrasera() {
		return (RuedaMontaña) ruedaTrasera;
	}

}
