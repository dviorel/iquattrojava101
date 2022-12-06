package bo.gob.impuestos.java101.estructurales.composite;

public class DemoComposite {

    public static void main(String[] args) {
        Empleado ceo = new Empleado("nombre CEO", "CEO", 100);
        Empleado cto = new Empleado("nombre CTO", "CTO", 80);
        Empleado caf = new Empleado("nombre CAF", "CAF", 80);
        Empleado tecnico1 = new Empleado("nombre tecnico 1", "CTO", 60);
        Empleado tecnico2 = new Empleado("nombre tecnico 2", "CTO", 60);
        Empleado ayudante1 = new Empleado("nombre ayudante 1", "CAF", 60);
        Empleado ayudante2 = new Empleado("nombre ayudante 2", "CAF", 60);
        cto.agregarEmpleado(tecnico1);
        cto.agregarEmpleado(tecnico2);
        caf.agregarEmpleado(ayudante1);
        caf.agregarEmpleado(ayudante2);
        ceo.agregarEmpleado(cto);
        ceo.agregarEmpleado(caf);
        System.out.println(ceo);
    }

}
