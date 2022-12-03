package bo.gob.impuestos.java101.encriptacion;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class DemoEncriptacionAsimetrica {

    public static void main(String[] args)
        throws NoSuchAlgorithmException, IOException, NoSuchPaddingException, IllegalBlockSizeException,
               BadPaddingException, InvalidKeyException, InvalidKeySpecException {
        String str = "Prueba";

        System.out.println("\nTexto a cifrar:");
        System.out.println(str);

        //Instanciamos la clase
        RSAUtil rsa = new RSAUtil();

        //Generamos un par de claves
        //Admite claves de 512, 1024, 2048 y 4096 bits
        rsa.genKeyPair(512);

        //Las guardamos asi podemos usarlas despues
        //a lo largo del tiempo
        rsa.saveToDiskPrivateKey("/tmp/rsa.pri");
        rsa.saveToDiskPublicKey("/tmp/rsa.pub");

        //Ciframos y e imprimimos, el texto cifrado
        //es devuelto en la variable secure
        String secure = rsa.Encrypt(str);

        System.out.println("\nCifrado:");
        System.out.println(secure);



        //A modo de ejemplo creamos otra clase rsa
        RSAUtil rsa2 = new RSAUtil();

        //A diferencia de la anterior aca no creamos
        //un nuevo par de claves, sino que cargamos
        //el juego de claves que habiamos guadado
        rsa2.openFromDiskPrivateKey("/tmp/rsa.pri");
        rsa2.openFromDiskPublicKey("/tmp/rsa.pub");

        //Le pasamos el texto cifrado (secure) y nos
        //es devuelto el texto ya descifrado (unsecure)
        String unsecure = rsa2.Decrypt(secure);

        //Imprimimos
        System.out.println("\nDescifrado:");
        System.out.println(unsecure);

    }

}
