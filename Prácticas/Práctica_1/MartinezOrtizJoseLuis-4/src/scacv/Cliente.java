/**
 * 
 */
package scacv;

/**
 * @author Jose-laptop
 *
 */
public class Cliente {
	
	private GestorFiltros gestor;
	
	public Cliente(){
		gestor = null;
	}
	
	public void setGestorFiltros(GestorFiltros g){
		gestor = g;
		
	}
	
	public void getPeticion(double p){
		if(gestor != null)
			gestor.peticionFiltro(p);
		
	}

}
