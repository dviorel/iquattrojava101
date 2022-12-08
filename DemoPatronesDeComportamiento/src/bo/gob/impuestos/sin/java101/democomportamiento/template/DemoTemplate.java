package bo.gob.impuestos.sin.java101.democomportamiento.template;

public class DemoTemplate {

    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.jugar();
        System.out.println("-----------");
        Game football = new Football();
        football.jugar();
    }

}
