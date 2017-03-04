package visitantes;

import elementos.Bus;
import elementos.Disco;
import elementos.Equipo;
import elementos.Tarjeta;
import elementos.TipoClientes;
import java.util.ArrayList;

public class VisitanteEspecificaciones extends VisitanteEquipo {
	
	private ArrayList<String> especificiaciones;
	
	public VisitanteEspecificaciones() {
		especificiaciones = new ArrayList<String>();
	}

	@Override
	public void VisitarDisco(Disco d) {
		// TODO Auto-generated method stub
		especificiaciones.add("\n Disco");
		especificiaciones.addAll(d.espeficicaciones());
	}

	@Override
	public void VisitarTarjeta(Tarjeta t) {
		// TODO Auto-generated method stub
		especificiaciones.add("\n Tarjeta");
		especificiaciones.addAll(t.espeficicaciones());
	}

	@Override
	public void VisitarBus(Bus b) {
		// TODO Auto-generated method stub
		especificiaciones.add("\n Bus");
		especificiaciones.addAll(b.espeficicaciones());
	}


	
	public void resetEspec(){
		especificiaciones.clear();
	}
	
	public ArrayList<String> getEspec(){
		return especificiaciones;
	}

	@Override
	public void VisitarEquipoDesc(Equipo e, TipoClientes cliente) {
		// Nada
		
	}

}
