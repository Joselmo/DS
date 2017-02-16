package mis_tests.junit.primero;

public class Dinero implements IDinero {
    private int fCantidad;
    private String fMoneda;
    public Dinero(int cantidad, String moneda) {
        fCantidad= cantidad;
        fMoneda= moneda;
    }
    public int cantidad() {
        return fCantidad;
    }
    public String moneda() {
        return fMoneda;
    }

	@Override
	public IDinero add(IDinero d) {
		// TODO Auto-generated method stub
		if (((Dinero)d).moneda().equals(moneda()))
            return new Dinero(cantidad()+(((Dinero)d).cantidad()),moneda());
         return new BolsaDinero(this,(Dinero)d);
	}
	public boolean equals(Object objeto) {
        if (objeto instanceof Dinero) {
            Dinero dinero= (Dinero)objeto;
            return dinero.moneda().equals(moneda())
                && cantidad() == dinero.cantidad();
        }
        return false;
    }
}
