package bo.gob.impuestos.sin.java101.democomportamiento.chain;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Imprimiendo log Consola:" +message);
    }
}
