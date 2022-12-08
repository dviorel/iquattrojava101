package bo.gob.impuestos.sin.java101.democomportamiento.visitor;

public class Monitor implements ComputerPart {

    private String resolucion;

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
