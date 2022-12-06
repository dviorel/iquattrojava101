package bo.gob.impuestos.java101.builder;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> items = new ArrayList<>();

    public void agregarItem(Item item){
        items.add(item);
    }

    public float obtenerCosto(){
        return (float)items.stream().mapToDouble(Item::getPrecio).sum();
    }

    public void mostrarOrden(){
        this.items.stream().map(Item::imprimir).forEach(System.out::println);
    }


}
