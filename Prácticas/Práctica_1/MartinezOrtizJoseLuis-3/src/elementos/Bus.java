package elementos;

import java.util.ArrayList;

import visitantes.VisitanteEquipo;

public class Bus extends Equipo {
	
	private int tamanio;	

	public Bus(String nombre,int tamanio, double precio) {
		super(nombre);
		
		this.precio = precio;
		
		// DESCUENTOS
		normal = 0.05f;
		vip = 0.1f;
		mayorista = 0.15f;
		
		spec.add("Nombre :"+nombre);
		spec.add("Tamanio :"+tamanio+"bits");
	}

	@Override
	public double potencia() {
		// TODO Auto-generated method stub
		return tamanio;
	}

	@Override
	public double precioNeto() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public ArrayList<String> espeficicaciones() {
		// TODO Auto-generated method stub
		return spec;
	}


	@Override
	public void aceptar(VisitanteEquipo ve) {
		ve.VisitarBus(this);
	}

}
