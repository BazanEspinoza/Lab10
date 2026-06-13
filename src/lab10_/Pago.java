//BazanEspinoza
package lab10_;

/**
 *
 * @author s
 */
public class Pago {
    private int id;
    private String cliente;
    private double monto;
    private String fecha;
    private String estado;
    private String propiedad;

    public Pago(int id, String cliente, double monto, String fecha, String estado, String propiedad) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
        this.propiedad = propiedad;
    }
    
    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "ID : " + id + "\n"
                + "CLiente : " + cliente + "\n"
                + "Propiedad : " + propiedad + "\n"
                + "Monto : " + monto + "\n"
                + "Fecha  : " + fecha + "\n"
                + "Estado : " + estado;
    }
}
