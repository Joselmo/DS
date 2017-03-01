package visitantes;

import elementos.Disco;
import elementos.Bus;
import elementos.Tarjeta;
import elementos.TipoClientes;

public class VisitantePrecio extends VisitanteEquipo {
	
	private double total;
	
	public VisitantePrecio(){
		total = 0;
	}

	@Override
	public void VisitarDisco(Disco d) {
		total += d.precioNeto();

	}

	@Override
	public void VisitarTarjeta(Tarjeta t) {
		total += t.precioNeto();
		
	}

	@Override
	public void VisitarBus(Bus b) {
		total += b.precioNeto();
		
	}
	
	public void VisitarDiscoDesc(Disco d, TipoClientes cliente){
		total += d.precioConDescuento(cliente);
	}
	
	public double getTotal(){
		return total;
	}
	
	public void resetPrecio(){
		total = 0;
	}
	
	

}
