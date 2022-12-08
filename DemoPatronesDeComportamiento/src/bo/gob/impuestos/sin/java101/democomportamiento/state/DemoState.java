package bo.gob.impuestos.sin.java101.democomportamiento.state;

public class DemoState {

    public static void main(String[] args) {
        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());
        System.out.println("-------");
        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState());


    }

}
