/**
 * 
 */
package elementos;

import java.util.ArrayList;

import visitantes.VisitanteEquipo;
import visitantes.VisitantePrecio;

/**
 * @author Jose-laptop
 *
 */
public class Disco extends Equipo {
	

	private int tamanio;
	private int velocidad;
	private String tipo;	

	public Disco(String nombre,int tamanio, int velocidad, String tipo, double precio) {
		super(nombre);
		this.tamanio = tamanio;
		this.velocidad = velocidad;
		this.tipo = tipo;
		this.precio = precio;
		
		// DESCUENTOS
		normal = 0.05f;
		vip = 0.1f;
		mayorista = 0.15f;
		
		spec.add("Nombre :"+nombre);
		spec.add("Tipo :"+tipo);
		spec.add("Tamanio :"+tamanio);
		spec.add("Velocidad media :"+velocidad);
	}

	/**
	 * Devuelve la m�dia de la velocidad de escritura y lectura del disco 
	 */
	@Override
	public double potencia() {
		return velocidad;
	}

	/**
	 * Devuelve el precio base del producto
	 */
	@Override
	public double precioNeto() {
		// TODO Auto-generated method stub
		return precio;
	}


	/**
	 * 
	 */
	@Override
	public void aceptar(VisitanteEquipo ve) {
		// TODO Auto-generated method stub
		ve.VisitarDisco(this);
	}
	
	
	public void aceptar(VisitanteEquipo ve, TipoClientes tipo){
		ve.VisitarEquipoDesc(this,tipo);
	}

	@Override
	public ArrayList<String> espeficicaciones() {
		return spec;
	}

}
