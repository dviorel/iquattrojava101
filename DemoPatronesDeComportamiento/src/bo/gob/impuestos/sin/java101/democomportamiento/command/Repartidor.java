package bo.gob.impuestos.sin.java101.democomportamiento.command;

import java.util.ArrayList;
import java.util.List;

public class Repartidor {

    private List<Orden> ordenes = new ArrayList<>();

    public void tomarOrden(Orden orden){
        this.ordenes.add(orden);
    }

    public void ejecutarOrdenes(){
        for (Orden orden: ordenes){
            orden.ejecutar();
        }
        ordenes.clear();
    }


}
