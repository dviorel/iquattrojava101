package bo.gob.impuestos.sin.java101.democomportamiento.visitor;

public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);

}
