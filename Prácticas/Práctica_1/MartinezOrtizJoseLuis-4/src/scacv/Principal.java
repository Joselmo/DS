package scacv;

import gui.GUI;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUI interfaz = GUI.getInstance();
		
		CalcularDistancia calcularDistancia;
		CalcularVelocidad calcularVelocidad;
		
		Filtro fVelocidad = new CalcularVelocidad();
		Filtro fDistancia = new CalcularDistancia();
		
		Cliente cliente = new Cliente();
		
		GestorFiltros gestor = new GestorFiltros(interfaz);
		
		cliente.setGestorFiltros(gestor);
		
		cliente.getPeticion(500);
		
		
		
		

	}

}
