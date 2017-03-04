package visitantes;

import elementos.Disco;
import elementos.Equipo;

import java.text.DecimalFormat;

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
	
	public void VisitarEquipoDesc(Equipo e, TipoClientes cliente){
		total += e.precioConDescuento(cliente);
	}
	
	public double getTotal(){
		return Math.ceil(total);
	}
	
	public void resetPrecio(){
		total = 0;
	}
	
	

}
