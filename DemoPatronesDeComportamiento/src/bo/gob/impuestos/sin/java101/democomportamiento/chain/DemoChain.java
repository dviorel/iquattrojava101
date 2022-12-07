package bo.gob.impuestos.sin.java101.democomportamiento.chain;

public class DemoChain {

    public static void main(String[] args) {
        AbstractLogger logger = obtenerLogger();
        logger.logMessage(AbstractLogger.INFO, "Esto es un info");
        logger.logMessage(AbstractLogger.DEBUG, "Esto es un debug");
        logger.logMessage(AbstractLogger.ERROR, "Esto es un error");
    }

    private static AbstractLogger obtenerLogger(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ErrorLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

}
