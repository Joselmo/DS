/**
 * 
 */
package visitantes;

import elementos.Bus;
import elementos.Disco;
import elementos.Tarjeta;
import elementos.TipoClientes;

/**
 * @author Jose-laptop
 *
 */
public abstract class VisitanteEquipo {

	public abstract void VisitarDisco(Disco d);

	public abstract void VisitarTarjeta(Tarjeta t);

	public abstract void VisitarBus(Bus b);
	
	public abstract void VisitarDiscoDesc(Disco d, TipoClientes cliente);
	

}
