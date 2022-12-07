package bo.gob.impuestos.sin.java101.democomportamiento.interpreter;

public class DemoInterpreter {

    public static Expresion getMaleExpression(){
        Expresion roberto = new ExpresionTerminal("Roberto");
        Expresion john = new ExpresionTerminal("John");
        return new ExpresionOr(roberto, john);
    }
    public static Expresion getMujerCasadaExpresion(){
        Expresion julie = new ExpresionTerminal("Julia");
        Expresion casada = new ExpresionTerminal("Casada");
        return new ExpresionAnd(julie, casada);
    }
    public static void main(String[] args) {
        Expresion esHombre = getMaleExpression();
        Expresion esMujerCasada = getMujerCasadaExpresion();
        System.out.println("John es hombre? " +
                           esHombre.interpretar("Robert Jon"));
        System.out.println("Julia es una mujer casada? " +
                           esMujerCasada.interpretar("Julia Casada"));
    }

}
