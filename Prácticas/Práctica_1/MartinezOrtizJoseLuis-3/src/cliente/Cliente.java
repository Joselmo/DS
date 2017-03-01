package cliente;

import elementos.Tarjeta;
import elementos.Bus;
import elementos.Disco;
import elementos.Equipo;
import visitantes.VisitantePrecio;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VisitantePrecio vep= new VisitantePrecio();
		Equipo t= new Tarjeta("X1",4,"RAM",50); //elementos concretos...
		Equipo b= new Bus("BUS16",16,23);
		Equipo d= new Disco("OCZ VECTOR",128,480,"SSD",140);
		Equipo d2= new Disco("EVO ",250,550,"SSD",200);

		t.aceptar(vep);//visita al objeto tarjeta
		System.out.println("Coste de tarjeta: "+vep.getTotal()+"�");
		vep.resetPrecio();
		b.aceptar(vep);//visita al objeto bus
		System.out.println("Coste de BUS: "+vep.getTotal()+"�");
		vep.resetPrecio();
		d.aceptar(vep);//visita al objeto disco
		System.out.println("Coste de Disco: "+vep.getTotal()+"�");
		vep.resetPrecio();
		
	


	}

}
