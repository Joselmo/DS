/**
 * 
 */
package Factoria;

import java.util.ArrayList;

import Bicicleta.Bicicleta;

/**
 * @author Jose-laptop
 *
 */
public class Carretera implements FactoriaCarrera {

	/* (non-Javadoc)
	 * @see Factoria.FactoriaCarrera#crearCarrera(Factoria.TC)
	 */
	@Override
	public ArrayList<Bicicleta> crearCarrera(TC tipo) {
		ArrayList<Bicicleta> bicis = new ArrayList<Bicicleta>();
		FactoriaCarretera facCarretera = new FactoriaCarretera();
		
		switch (tipo) {
		case CARRETERA : bicis = facCarretera.crearCarrera();
				
			break;
		}
		
		
		return bicis;
	}

	/* (non-Javadoc)
	 * @see Factoria.FactoriaCarrera#getTipo()
	 */
	@Override
	public TC getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

}
