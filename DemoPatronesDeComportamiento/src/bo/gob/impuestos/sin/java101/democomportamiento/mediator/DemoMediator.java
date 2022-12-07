package bo.gob.impuestos.sin.java101.democomportamiento.mediator;

public class DemoMediator {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi John!");
        john.sendMessage("Hola Robert!");
    }

}
