package bo.gob.impuestos.sin.java101.democomportamiento.state;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Estado inicial");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
