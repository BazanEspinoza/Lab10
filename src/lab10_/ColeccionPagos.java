//BazanEspinoza
package lab10_;

/**
 *
 * @author s
 */
import java.util.ArrayList;
import java.util.List;

public class ColeccionPagos implements ColeccionInterface {
    private List<Pago> pagos = new ArrayList<>();

    @Override
    public void agregar(Pago pago) {
        pagos.add(pago);
    }

    public int cantidad() {
        return pagos.size();
    }
    @Override
    public Iterador crearIterador() {
        return new IteradorEstado(pagos);
    }
}
