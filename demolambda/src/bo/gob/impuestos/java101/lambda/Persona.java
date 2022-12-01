package bo.gob.impuestos.java101.lambda;

public class Persona implements Comparable<Persona> {

    String nombre;
    String ci;

    public Persona(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", ci='" + ci + '\'' +
               '}';
    }

    @Override
    public int compareTo(Persona other) {
        return this.nombre.compareTo(other.nombre);
    }
}
