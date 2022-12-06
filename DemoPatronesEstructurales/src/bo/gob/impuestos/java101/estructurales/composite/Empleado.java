package bo.gob.impuestos.java101.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    private String nombre;
    private String departamento;
    private double salario;
    private List<Empleado> dependientes = new ArrayList<>();

    public List<Empleado> getDependientes() {
        return dependientes;
    }

    public void agregarEmpleado(Empleado empleado){
        this.dependientes.add(empleado);
    }

    public void removerEmpleado(Empleado empleado){
        this.dependientes.remove(empleado);
    }

    @Override
    public String toString() {
        return "Empleado{" +
               "nombre='" + nombre + '\'' +
               ", departamento='" + departamento + '\'' +
               ", salario=" + salario +
               ", dependientes=\n" + dependientes +
               '}';
    }
}
