package scacv;

import java.util.ArrayList;
import gui.GUI;

public class CadenaFiltros {
	
	private ArrayList<Filtro> filtros;
	
	private GUI interfaz;

	
	public CadenaFiltros(){
		filtros = new ArrayList<Filtro>();
	}
	
	public void ejecutar(double p){
		
	}
	
	public void setObjetivo(GUI objetivo){
		interfaz = objetivo;
	}
	
	public void addFiltro(Filtro f){
		filtros.add(f);
	}
}
