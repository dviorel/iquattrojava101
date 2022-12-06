package bo.gob.impuestos.java101.builder;

public class Caja implements Empaque {

    @Override
    public void empacar() {
        System.out.println("Empacando en caja");
    }
}
