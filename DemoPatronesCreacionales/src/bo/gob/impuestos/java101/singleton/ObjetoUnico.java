package bo.gob.impuestos.java101.singleton;

public class ObjetoUnico {

    private static ObjetoUnico instancia;

    private ObjetoUnico(){

    }

    public static ObjetoUnico getInstance(){
        if (instancia == null){
            instancia = new ObjetoUnico();
        }
        return instancia;
    }

    public void saludar(){
        System.out.println("Hola");
    }

}
