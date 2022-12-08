package bo.gob.impuestos.sin.java101.democomportamiento.state;

public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
