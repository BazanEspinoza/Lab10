//BazanEspinoza
package lab10_;

/**
 *
 * @author s
 */
import java.util.ArrayList;
import java.util.List;
public class IteradorEstado implements Iterador {
    private List<Pago> pagos;
    private int indice;

    public IteradorEstado(List<Pago> lista) {
        pagos = new ArrayList<>();
 
        for (Pago p : lista) {
            if (p.getEstado().equals("completado")) pagos.add(p);
        }
        for (Pago p : lista) {
            if (p.getEstado().equals("pendiente")) pagos.add(p);
        }
        for (Pago p : lista) {
            if (p.getEstado().equals("rechazado")) pagos.add(p);
        }
 
        indice = 0;
    }

    @Override
    public void primero() {
        indice = 0;
    }

    @Override
    public boolean tieneSiguiente() {
        return indice < pagos.size();
    }

    @Override
    public Pago siguiente() {
        return pagos.get(indice++);
    }
    
    public int contarPorEstado(String estado) {
        int total = 0;
        for (Pago p : pagos) {
            if (p.getEstado().equals(estado)) total++;
        }
        return total;
    }
}
