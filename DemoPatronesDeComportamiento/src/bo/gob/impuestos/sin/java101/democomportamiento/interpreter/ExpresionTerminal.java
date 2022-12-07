package bo.gob.impuestos.sin.java101.democomportamiento.interpreter;

public class ExpresionTerminal implements Expresion {

    private String dato;

    public ExpresionTerminal(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean interpretar(String contexto) {
//        if (contexto.contains(dato)){
//            return true;
//        }
//        return false;
        return contexto.contains(dato);
    }
}
