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
public class FactoriaMontaña implements FactoriaCarrera {
	
	private TC tipo;

	@Override
	public ArrayList<Bicicleta> crearCarrera(TC tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TC getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTipo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString(){
		return "bicicleta -"+tipo;
	}
}
