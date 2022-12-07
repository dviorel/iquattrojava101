package bo.gob.impuestos.sin.java101.democomportamiento.command;

public class ComprarStock implements Orden {

    Stock stock;

    public ComprarStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void ejecutar() {
        this.stock.comprar();
    }
}
