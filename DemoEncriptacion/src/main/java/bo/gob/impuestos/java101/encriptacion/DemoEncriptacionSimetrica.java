package bo.gob.impuestos.java101.encriptacion;

/**
 * Hello world!
 *
 */
public class DemoEncriptacionSimetrica
{
    public static void main( String[] args )
    {
        EncriptacionSimetrica encriptacionSimetrica = new EncriptacionSimetrica();
        encriptacionSimetrica.addKey("claveclaveclaveclaveclaveclaveclaveclave...");

        String textoPlano = "Algo en texto plano";

        String textoEncriptado = encriptacionSimetrica.encriptar(textoPlano);
        System.out.println("El texto encriptado es:\n" + textoEncriptado);
        // ThSuQf7rZDTgZUt+HzqX8LUKnxU6kpGhGEMyqI6YZ0s=
        // SmQ9ItBoqwXnnfQR/i4ghs8/YVXxx2H65wEldm7+0/4=
        // ThSuQf7rZDTgZUt+HzqX8LUKnxU6kpGhGEMyqI6YZ0s=
        // IHda+FoZUCp6TbYyfPvKdsEuEjyaaYicA+1w37WKqcg=
        String textoDesncriptado = encriptacionSimetrica.desencriptar(textoEncriptado);
        System.out.println("El texto desencriptado es:\n" + textoDesncriptado);


    }
}
