package bo.gob.impuestos.sin.java101.democomportamiento.command;

public class VenderStock implements Orden {

    Stock stock;

    public VenderStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void ejecutar() {
        this.stock.vender();
    }
}
