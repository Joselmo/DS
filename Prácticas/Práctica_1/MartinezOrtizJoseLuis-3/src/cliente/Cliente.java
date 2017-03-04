package cliente;

import elementos.Tarjeta;
import elementos.TipoClientes;

import java.util.ArrayList;
import java.util.Random;

import elementos.Bus;
import elementos.Disco;
import elementos.Equipo;
import visitantes.VisitanteEquipo;
import visitantes.VisitanteEspecificaciones;
import visitantes.VisitantePrecio;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VisitantePrecio vep= new VisitantePrecio();
		VisitanteEspecificaciones vee = new VisitanteEspecificaciones();
		
		Equipo t= new Tarjeta("X1",4,"RAM",50); //elementos concretos...
		Equipo b= new Bus("BUS16",16,23);
		Equipo d= new Disco("OCZ VECTOR",128,480,"SSD",140);
		Equipo d2= new Disco("EVO ",250,550,"SSD",200);
		
		ArrayList<Equipo> tarjetas = new ArrayList<Equipo>();
		ArrayList<Equipo> discos = new ArrayList<Equipo>();
		ArrayList<Equipo> bus = new ArrayList<Equipo>();
		
		Random r = new Random();

		VisitanteEquipo visitante_espec = new VisitanteEspecificaciones();
		VisitanteEquipo visitante_precio = new VisitantePrecio();
		
		// Añadidas las tarjetas
		for(int i=0; i < 50; i++){
			t= new Tarjeta("X"+i,4,"RAM",55+(i*5));
			tarjetas.add(t);
		}
		
		// Añadidos los discos
		for(int i=0; i < 50; i++){
			
			d= new Disco("disk_name"+i,128,r.nextInt(450)+50,"SSD",r.nextDouble()*200+50);
			discos.add(d);
		}
		
		// Añadidos los buses
		for(int i=0; i < 50; i++){
			
			b= new Bus("BUS"+i%32,i%32,r.nextDouble()*50);
			bus.add(b);
		}
		
		ArrayList<TipoClientes> clientes = new ArrayList<TipoClientes>();
		
		for(int i=0 ; i < 10; i++){
			switch (r.nextInt(3)) {
			case 0: clientes.add(TipoClientes.REGULAR);break;
			case 1: clientes.add(TipoClientes.VIP);break;
			case 2: clientes.add(TipoClientes.MAYORISTA);break;
			}
			
		}
		
		// Mostar tarjetas
/*		visitante = new VisitanteEspecificaciones();
		for(int i=0; i < 50; i++){
			tarjetas.get(i).aceptar(visitante);//visita al objeto tarjeta
			
		}

		System.out.println("Especificaciones: ");
		for(String item:((VisitanteEspecificaciones) visitante).getEspec()){
			System.out.println(item);
		}
		
		((VisitanteEspecificaciones) visitante).resetEspec();
		// Mostar Discos
		for(int i=0; i < 50; i++){
			discos.get(i).aceptar(visitante);//visita al objeto tarjeta
			
		}

		System.out.println("Especificaciones: ");
		for(String item:((VisitanteEspecificaciones) visitante).getEspec()){
			System.out.println(item);
		}
		((VisitanteEspecificaciones) visitante).resetEspec();
		// Mostar Buses
		for(int i=0; i < 50; i++){
			bus.get(i).aceptar(visitante);//visita al objeto tarjeta
			
		}

		System.out.println("Especificaciones: ");
		for(String item:((VisitanteEspecificaciones) visitante).getEspec()){
			System.out.println(item);
		}
*/

		for(int i=0; i < 10; i++){
			tarjetas.get(i).aceptar(visitante_espec);//visita al objeto tarjeta
			discos.get(i).aceptar(visitante_espec);//visita al objeto disco
			bus.get(i).aceptar(visitante_espec);//visita al objeto bus
			
			
			tarjetas.get(i).aceptar(visitante_precio,clientes.get(i));//visita al objeto tarjeta
			discos.get(i).aceptar(visitante_precio,clientes.get(i));//visita al objeto disco
			bus.get(i).aceptar(visitante_precio,clientes.get(i));//visita al objeto bus
			
			System.out.println("Configuración "+i+" - Cliente :"+clientes.get(i));
			for(String item:((VisitanteEspecificaciones) visitante_espec).getEspec()){
				System.out.println(item);
			}
			
			System.out.println("Precio total: "+((VisitantePrecio) visitante_precio).getTotal());
			
			((VisitantePrecio) visitante_precio).resetPrecio();
			((VisitanteEspecificaciones) visitante_espec).resetEspec();
			System.out.println("#####################################");
			
			
		}
		

	}

}
