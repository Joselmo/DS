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
		double resultado=0;
		interfaz.ejecutar(p);
		for(Filtro item: filtros){
			resultado = item.ejecutar(p);
			System.out.println("Filtro"+item.getTipo()+" actualizado "+resultado);
		}
	}
	
	public void setObjetivo(GUI objetivo){
		interfaz = objetivo;
	}
	
	public void addFiltro(Filtro f){
		filtros.add(f);
	}
}
