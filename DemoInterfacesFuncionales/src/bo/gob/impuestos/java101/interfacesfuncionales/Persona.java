package bo.gob.impuestos.java101.interfacesfuncionales;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String ci;
    private LocalDate fechaNacimiento;

    public Integer getEdad() {
//        if (this.fechaNacimiento == null){
//            return -1;
//        }
//        // Duration diferencia = Duration.between(this.fechaNacimiento, LocalDate.now());
//        Period diferencia = Period.between(this.fechaNacimiento, LocalDate.now());
//        return diferencia.getYears();
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String ci, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.ci = ci;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", ci='" + ci + '\'' +
               ", fechaNacimiento=" + fechaNacimiento +
               ", edad=" + getEdad() +
               '}';
    }
}
