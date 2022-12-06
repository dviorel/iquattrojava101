package bo.gob.impuestos.java101.builder;

public abstract class Bebida implements Item {

    @Override
    public Empaque getEmpaque() {
        return new Botella();
    }
}
