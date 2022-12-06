package bo.gob.impuestos.java101.builder;

public class DemoBuilder {

    public static void main(String[] args) {
        Pedido pedidoVegetariano = PedidoBuilder.prepararComidaVegetariana();
        pedidoVegetariano.mostrarOrden();
        System.out.println(pedidoVegetariano.obtenerCosto());
        Pedido pedidoNoVegetariano = PedidoBuilder.prepararComidaNoVegetariana();
        pedidoNoVegetariano.mostrarOrden();
        System.out.println(pedidoNoVegetariano.obtenerCosto());
    }


}
