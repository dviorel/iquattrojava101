package bo.gob.impuestos.sin.java101.democomportamiento.interpreter;

public class ExpresionOr implements Expresion {

    Expresion expresion1;
    Expresion expresion2;

    public ExpresionOr(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    @Override
    public boolean interpretar(String contexto) {
        return this.expresion1.interpretar(contexto) || this.expresion2.interpretar(contexto);
    }
}
