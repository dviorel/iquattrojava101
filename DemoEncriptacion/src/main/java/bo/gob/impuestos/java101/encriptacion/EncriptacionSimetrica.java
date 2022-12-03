package bo.gob.impuestos.java101.encriptacion;

import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class EncriptacionSimetrica {

    private SecretKey key;
    private Cipher cipher;
    private String algoritmo = "AES";
    private int keysize = 32;

    public void addKey( String value ){
        byte[] valuebytes = value.getBytes();
        key = new SecretKeySpec(Arrays.copyOf(valuebytes, keysize ) , algoritmo );
    }

    public String encriptar( String texto ){
        String value="";
        try {
            cipher = Cipher.getInstance( algoritmo );
            cipher.init( Cipher.ENCRYPT_MODE, key );
            byte[] textobytes = texto.getBytes();
            byte[] cipherbytes = cipher.doFinal( textobytes );
             value = Base64.getEncoder().encodeToString(cipherbytes);
//            value = new String(cipherbytes);
        } catch (Exception ex) {
            System.err.println( ex.getMessage() );
        }
        return value;
    }

    public String desencriptar( String texto ){
        String str="";
        try {
            byte[] value = Base64.getDecoder().decode(texto);
//            byte[] value = texto.getBytes();
            cipher = Cipher.getInstance( algoritmo );
            cipher.init( Cipher.DECRYPT_MODE, key );
            byte[] cipherbytes = cipher.doFinal( value );
            str = new String( cipherbytes );
        } catch (Exception ex) {
            System.err.println( ex.getMessage() );
        }
        return str;
    }




}
