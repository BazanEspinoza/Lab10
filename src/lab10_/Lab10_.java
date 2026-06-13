//BazanEspinoza 
package lab10_;

/**
 *
 * @author s
 */
public class Lab10_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColeccionPagos coleccion = new ColeccionPagos();
 
        coleccion.agregar(new Pago(001, "Ana Aredo",     1200.00, "05/05/2025", "completado", "Av. Larco 245"));
        coleccion.agregar(new Pago(002, "Maria Flores",     850.00, "01/05/2025", "pendiente",  "Jr. Union 124"));
        coleccion.agregar(new Pago(003, "Carlos Ruiz",    2000.00, "10/05/2025", "completado", "Av. España 789"));
        coleccion.agregar(new Pago(004, "Ana Garcia",     1500.00, "03/05/2025", "rechazado",  "Calle 33"));
        coleccion.agregar(new Pago(005, "Luis Mendoza",    950.00, "08/05/2025", "pendiente",  "Av. America 560"));
        coleccion.agregar(new Pago(006, "Rosa Vasquez",      3200.00, "12/05/2025", "completado", "Urb. El Golf 123"));
        coleccion.agregar(new Pago(007, "Pedro Rojas",  700.00, "15/05/2025", "rechazado",  "Jr. Bolivar 144"));
 
        IteradorEstado it = (IteradorEstado) coleccion.crearIterador();
        it.primero();
 
        System.out.println("===Pagos de Mayo 2025===\n");
 
        while (it.tieneSiguiente()) {
            System.out.println(it.siguiente());
            System.out.println();
        }
 
        System.out.println("Resumen");
        System.out.println("Completados: " + it.contarPorEstado("completado"));
        System.out.println("Pendientes : " + it.contarPorEstado("pendiente"));
        System.out.println("Rechazados : " + it.contarPorEstado("rechazado"));
    }
}
   