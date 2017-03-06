package scacv;

import gui.GUI;

public class GestorFiltros {
	
	private CadenaFiltros instancia;
	
	
	public GestorFiltros(GUI o){
		
		instancia = new CadenaFiltros();
		instancia.setObjetivo(o);
		
	}
	
	public void setFiltro(Filtro f){
		instancia.addFiltro(f);
	}
	
	public void peticionFiltro(double p){
		instancia.ejecutar(p);
	}

}
