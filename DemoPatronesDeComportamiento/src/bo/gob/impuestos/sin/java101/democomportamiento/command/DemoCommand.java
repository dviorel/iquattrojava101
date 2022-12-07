package bo.gob.impuestos.sin.java101.democomportamiento.command;

public class DemoCommand {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Repartidor repartidor = new Repartidor();
        System.out.println("Agregara la orden de compra");
        repartidor.tomarOrden(new ComprarStock(stock));
        System.out.println("Agregara la orden de venta");
        repartidor.tomarOrden(new VenderStock(stock));

        System.out.println("Ejecutara las ordenes");
        repartidor.ejecutarOrdenes();
    }

}
