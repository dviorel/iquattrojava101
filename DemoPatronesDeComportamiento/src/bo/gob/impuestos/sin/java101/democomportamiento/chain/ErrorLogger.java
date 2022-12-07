package bo.gob.impuestos.sin.java101.democomportamiento.chain;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Imprimiendo log Error:" +message);
    }
}
