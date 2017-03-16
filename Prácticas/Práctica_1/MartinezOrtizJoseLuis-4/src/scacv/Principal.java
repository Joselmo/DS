package scacv;

import gui.GUI;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUI interfaz = GUI.getInstance();
		
		CalcularDistancia calcularDistancia;
		CalcularVelocidad calcularVelocidad;
		
		Filtro fVelocidad = new CalcularVelocidad(30);
		Filtro fDistancia = new CalcularDistancia();
		
		((CalcularVelocidad)fVelocidad).setIntervalo(1000);
		
		Cliente cliente = new Cliente();
		
		GestorFiltros gestor = new GestorFiltros(interfaz);
		
		gestor.setFiltro(fDistancia);
		gestor.setFiltro(fVelocidad);
		
		cliente.setGestorFiltros(gestor);
		
		cliente.getPeticion(500);
		
		
		
		

	}

}
