package bo.gob.impuestos.java101.pf.inmutabilidad;

public class DemoMutabilidad {

    static void saludar(Persona p){
        System.out.println("Hola " + p.getNombre());
//        p.setNombre("Juan");
    }

    public static void main(String[] args) {
        final Persona persona = new Persona("1", "Danny");
        saludar(persona);
        saludar(persona);

//        persona = new Persona("1", "Pedro");
//        saludar(persona);
    }

}
