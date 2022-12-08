package bo.gob.impuestos.sin.java101.democomportamiento.template;

public abstract class Game {

    abstract void inicializar();
    abstract void iniciarJuego();
    abstract void terminarJuego();

    public void jugar(){
        inicializar();
        verificarEstadoCampoJuego();
        iniciarJuego();
        terminarJuego();
        limpiarCampoJuego();
    }

    private void verificarEstadoCampoJuego(){
        System.out.println("Campo de juego verificado!");
    }

    private void limpiarCampoJuego(){
        System.out.println("Campo de juego limpiado!");
    }

}
