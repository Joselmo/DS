package Factoria;
import java.util.ArrayList;

import Bicicleta.Bicicleta;

/**
 * 
 */

/**
 * @author Jose-laptop
 *
 */
public interface FactoriaCarrera {

	
	public ArrayList<Bicicleta> crearCarrera(TC tipo);
	
	public TC getTipo();
	
	public String toString();

}
