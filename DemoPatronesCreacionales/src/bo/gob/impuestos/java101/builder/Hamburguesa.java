package bo.gob.impuestos.java101.builder;

public abstract class Hamburguesa implements Item {

    @Override
    public Empaque getEmpaque() {
        return new Caja();
    }
}
