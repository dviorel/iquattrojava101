package bo.gob.impuestos.java101.pf.inmutabilidad;

public class Persona {

    private String ci;
    private String nombre;

    public Persona(String ci, String nombre) {
        this.ci = ci;
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

//    public void setCi(String ci) {
//        this.ci = ci;
//    }

    public String getNombre() {
        return nombre;
    }

    public int sumar(int a, int b){
        return a + b;
    }

//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
}
