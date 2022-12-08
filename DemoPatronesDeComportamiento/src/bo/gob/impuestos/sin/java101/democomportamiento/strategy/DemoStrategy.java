package bo.gob.impuestos.sin.java101.democomportamiento.strategy;

public class DemoStrategy {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        Context context = new Context(new OperationAdd());
        System.out.println("Suma: " + context.executeStrategy(num1, num2));
        context = new Context(new OperationSubstract());
        System.out.println("Resta: " + context.executeStrategy(num1, num2));
        context = new Context(new OperationMultiply());
        System.out.println("Multiplicacion: " + context.executeStrategy(num1, num2));

        if("suma".equals("suma")){
            // 1
            // 2
            // 3
            // 4
            // 5
            // 6
            // 7
            // 8
        }
        else if("resta".equals("resta")){
            // Z
            // Y
            // X
        }
        else if("multiplicacion".equals("multiplicacion")){
            // A
            // B
            // C
        }
        Strategy strategy = null;
        if("suma".equals("suma")){
            strategy = new OperationAdd();
        }
        else if("resta".equals("resta")){
            strategy = new OperationSubstract();
        }
        else if("multiplicacion".equals("multiplicacion")){
            strategy = new OperationMultiply();
        }
    }

}
