package Bicicleta;

/**
 * @author Jose-laptop
 *
 */
public class Monta�a extends Bicicleta {

	public Monta�a(String name,int participante ) {
		super(name);
		// TODO Auto-generated constructor stub
		this.participante = participante;
		tiempo_minimo = 12; // 20% de participantes se retirar�n en los 60 segundos de la carrera
	}
	
	public void setCuadro(CuadroMonta�a cuadro) {
		this.cuadro = cuadro;
	}

	public CuadroMonta�a getCuadro() {
		return (CuadroMonta�a) cuadro;
	}

	public void setManillar(ManillarMonta�a manillar) {
		this.manillar = manillar;
	}

	public ManillarMonta�a getManillar() {
		return (ManillarMonta�a) manillar;
	}

	public void setRuedas(RuedaMonta�a rueda) {
		this.ruedaDelantera = rueda;
		this.ruedaTrasera = rueda;

	}

	public RuedaMonta�a getRuedaDelantera() {
		return (RuedaMonta�a) ruedaDelantera;
	}

	public RuedaMonta�a getRuedaTrasera() {
		return (RuedaMonta�a) ruedaTrasera;
	}

}
