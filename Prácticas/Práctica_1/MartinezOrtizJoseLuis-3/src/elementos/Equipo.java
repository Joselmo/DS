/**
 * 
 */
package elementos;

import java.util.ArrayList;

import visitantes.VisitanteEquipo;

/**
 * @author Jose-laptop
 *
 */
public abstract class Equipo {
	
	private String nombre;
	protected double precio;
	protected ArrayList<String> spec;
	
	protected float NORMAL;
	protected float VIP;
	protected float MAYORISTA;

	  public Equipo(String nombre){
		spec = new ArrayList<String>();
	    this.nombre = nombre; 
	    
	    NORMAL = 0;
	    VIP = 0;
	    MAYORISTA = 0;
	  }

	  public String nombre(){

	    return nombre;

	  }

	  public abstract double potencia();

	  public abstract double precioNeto();
	  
	  public abstract ArrayList<String> espeficicaciones();

	  public double precioConDescuento(TipoClientes tipo){
		  double precio_final = precio;
			switch(tipo){
				case NORMAL: precio_final -= (precio*NORMAL);break;
				case VIP: precio_final -= (precio*VIP);break;
				case MAYORISTA: precio_final -= (precio*MAYORISTA);break;
				
			}
			return precio_final;
	  }

	  public abstract void aceptar(VisitanteEquipo ve);


}
