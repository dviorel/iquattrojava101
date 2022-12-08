package bo.gob.impuestos.sin.java101.democomportamiento.template;

public class Football extends Game {

    @Override
    void inicializar() {
        System.out.println("Inicializando Football");
    }

    @Override
    void iniciarJuego() {
        System.out.println("Iniciando Football");
    }

    @Override
    void terminarJuego() {
        System.out.println("Terminando Football");
    }
}
