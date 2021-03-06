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
	
	protected float normal;
	protected float vip;
	protected float mayorista;

	  public Equipo(String nombre){
		spec = new ArrayList<String>();
	    this.nombre = nombre; 
	    
	    normal = 0;
	    vip = 0;
	    mayorista = 0;
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
				case NORMAL: precio_final -= (precio*normal);break;
				case VIP: precio_final -= (precio*vip);break;
				case MAYORISTA: precio_final -= (precio*mayorista);break;
				
			}
			// Ajusta el redondeo
			if( (precio_final - (int)precio_final) > 0.99)
				precio_final = (int) precio_final +1;
			
			return precio_final;
	  }

	  public abstract void aceptar(VisitanteEquipo ve);
	  
	  public abstract void aceptar(VisitanteEquipo ve, TipoClientes tipo);


}
