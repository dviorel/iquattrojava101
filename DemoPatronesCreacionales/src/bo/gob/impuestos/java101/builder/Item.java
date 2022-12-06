package bo.gob.impuestos.java101.builder;

public interface Item {

    String getNombre();

    Empaque getEmpaque();

    float getPrecio();

    default String imprimir(){
        return "Item: " + getNombre() + ", precio: " + getPrecio();
    }

}
