package bo.gob.impuestos.java101.builder;

public class PedidoBuilder {

    public static Pedido prepararComidaVegetariana(){
        Pedido pedido = new Pedido();
        pedido.agregarItem(new HamburguesaVegetariana());
        pedido.agregarItem(new JugoNatural());
        return pedido;
    }

    public static Pedido prepararComidaNoVegetariana(){
        Pedido pedido = new Pedido();
        pedido.agregarItem(new HamburguesaPollo());
        pedido.agregarItem(new CocaCola());
        return pedido;
    }

}
