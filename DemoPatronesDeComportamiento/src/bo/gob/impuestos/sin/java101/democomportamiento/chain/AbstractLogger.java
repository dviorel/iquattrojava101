package bo.gob.impuestos.sin.java101.democomportamiento.chain;

public abstract class AbstractLogger {

    public static int INFO=1, DEBUG=2, ERROR=3;
    protected int level;
    protected AbstractLogger nextLogger;
    public void setNextLogger(AbstractLogger abstractLogger){
        this.nextLogger = abstractLogger;
    }
    protected abstract void write(String message);
    public void logMessage(int level, String message){
//        if(this.level <= level){
            write(message);
//        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }


}
