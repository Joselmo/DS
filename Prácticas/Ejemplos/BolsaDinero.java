package mis_tests.junit.primero;
import java.util.Vector;
public class BolsaDinero implements IDinero {
    private Vector fDineros= new Vector();
    void appendMoney(Dinero m){
        fDineros.add(m);
    }
    BolsaDinero(Dinero d1, Dinero d2) {
        appendMoney(d1);
        appendMoney(d2);
    }
    BolsaDinero(Dinero bolsa[]) {
        for (int i= 0; i < bolsa.length; i++)
            appendMoney(bolsa[i]);
    }
	@Override
	public IDinero add(IDinero d) {
		// TODO Auto-generated method stub
		this.appendMoney((Dinero)d);
	    return this;
	}
   public boolean BolsaEquals(Object objeto){
        if (objeto instanceof Vector) {
        Vector vector= (Vector)objeto;
        return equals(vector);
    }
    return false;
    }
}
