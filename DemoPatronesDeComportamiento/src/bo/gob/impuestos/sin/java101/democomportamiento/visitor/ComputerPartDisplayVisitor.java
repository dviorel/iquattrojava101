package bo.gob.impuestos.sin.java101.democomportamiento.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Desplegando computer");
    }

    @Override
    public void visit(Monitor monitor) {
        monitor.getResolucion();
        System.out.println("Desplegando monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Desplegando mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Desplegando keyboard");
    }
}
