package Bicicleta;

import java.util.Random;

/**
 * 
 */

/**
 * @author Jose-laptop
 *
 */
public abstract class Bicicleta extends Thread{
	
	protected int tiempo_minimo;
	protected int participante;
	
	protected Rueda ruedaDelantera, ruedaTrasera;
	protected Manillar manillar;
	protected Cuadro cuadro;
	
	
	/**
	 * Constructor
	 * @param name nombre de la bicicleta (hebra)
	 */
	public Bicicleta(String name) {
		super(name);
	}
	
	@Override
	public void run(){
		Random r = new Random();
		int time = r.nextInt(60); // Obtiene un ramdon entre 0 y 60
		
		try {
			sleep(tiempo_minimo*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Consideramos que se ha retirado
		if(time < tiempo_minimo){
			System.out.println("El participante "+participante+" se ha retirado de la carrera.");
		}else{
			System.out.println("El participante "+participante+" ha completado de la carrera.");
		}
		
		
		
	}

	/**
	 * @return the participante
	 */
	public int getParticipante() {
		return participante;
	}

	/**
	 * @param participante the participante to set
	 */
	public void setParticipante(int participante) {
		this.participante = participante;
	}
	
	

}
