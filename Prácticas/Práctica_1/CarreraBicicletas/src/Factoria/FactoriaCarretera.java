package Factoria;
import java.util.ArrayList;

import Bicicleta.Bicicleta;
import Bicicleta.Carretera;
import Bicicleta.CuadroCarretera;
import Bicicleta.ManillarCarretera;
import Bicicleta.RuedaCarretera;

/**
 * 
 */

/**
 * @author Jose-laptop
 *
 */
public class FactoriaCarretera implements FactoriaCarrera {
	
	private final TC tipo;
	private ArrayList<String> materiales;
	
	public FactoriaCarretera(){
		tipo = TC.CARRETERA;
		materiales = new ArrayList<>();
		materiales.add("aluminio");
		materiales.add("acero");
		materiales.add("fibra_carbono");
		materiales.add("fibra_vidrio");
		materiales.add("policarbonato");
		materiales.add("otros");
		
	}
	
	/**
	 * Crea un listado de las bicicletas de carretera que participan en la carrera
	 * Obtenemos los datos de cada bicicleta de forma pseudoaleatoria con unos listados
	 * de materiales y los obtenemos 
	 */
	public ArrayList<Bicicleta> crearCarrera(TC tipo) {
		ArrayList<Bicicleta> listado_bicicletas = new ArrayList<Bicicleta>();	
		
		String nombre = "";
		Carretera bici_carretera;
			
		for(int participante = 0; participante < 10; participante++){
			bici_carretera = new Carretera(nombre,participante);
			bici_carretera.setCuadro(new CuadroCarretera(materiales.get( (int) participante % materiales.size() ), 2, 1));
			bici_carretera.setManillar(new ManillarCarretera("recto", true));
			bici_carretera.setRuedas(new RuedaCarretera(22, "acero", 0));
			
			listado_bicicletas.add(bici_carretera);
		}
			
		
		return listado_bicicletas;		
	}

	@Override
	public TC getTipo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	
	@Override
	public String toString(){
		return "bicicleta -"+tipo;
	}
	

}
