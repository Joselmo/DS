/**
 * 
 */
package observador;

import GUI.GUI;

/**
 * @author Jose-laptop
 *
 */
public class PrevisionTiempo implements Observador {

	/* 
	 * @see observador.Observador#manejarEvento(java.lang.Object)
	 */
	@Override
	public void manejarEvento(Object valor) {
		// TODO Auto-generated method stub
		String tiempo = (String) valor;
		
		GUI.getInstance().actualizarTiempo(tiempo);

	}

}
