package bo.gob.impuestos.java101.builder;

public class HamburguesaVegetariana extends Hamburguesa {

    @Override
    public String getNombre() {
        return "Hamburguesa vegetariana";
    }

    @Override
    public float getPrecio() {
        return 12.63F;
    }
}
