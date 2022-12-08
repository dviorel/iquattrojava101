package bo.gob.impuestos.sin.java101.democomportamiento.visitor;

public class DemoVisitor {

    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }

}
