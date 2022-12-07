package bo.gob.impuestos.sin.java101.democomportamiento.command;

public class Stock {

    private String nombre = "ABC";
    private int cantidad = 10;

    public void comprar(){
        System.out.println("Stock [ Nombre: "+nombre+", Cantidad: " + cantidad +" ] comprado");
    }

    public void vender(){
        System.out.println("Stock [ Nombre: "+nombre+", Cantidad: " + cantidad +" ] vendido");
    }


}
