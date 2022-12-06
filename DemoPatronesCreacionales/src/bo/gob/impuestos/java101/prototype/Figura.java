package bo.gob.impuestos.java101.prototype;

public abstract class Figura implements Cloneable {

    private String id;
    protected String tipo;

    abstract void dibujar();

    @Override
    protected Figura clone() {
        try {
            return (Figura) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
