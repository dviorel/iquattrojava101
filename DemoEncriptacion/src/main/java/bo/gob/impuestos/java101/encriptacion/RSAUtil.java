package bo.gob.impuestos.java101.encriptacion;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;


public class RSAUtil {


    public java.security.PrivateKey privateKey = null;
    public java.security.PublicKey publicKey = null;

    public RSAUtil() {

    }

    public void setPrivateKeyString(String key) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] encodedPrivateKey = stringToBytes(key);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);
        this.privateKey = privateKey;
    }

    public void setPublicKeyString(String key) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] encodedPublicKey = stringToBytes(key);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(encodedPublicKey);
        PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
        this.publicKey = publicKey;
    }

    public String getPrivateKeyString() {
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(this.privateKey.getEncoded());
        return bytesToString(pkcs8EncodedKeySpec.getEncoded());
    }

    public String getPublicKeyString() {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(this.publicKey.getEncoded());
        return bytesToString(x509EncodedKeySpec.getEncoded());
    }


    public void genKeyPair(int size) throws NoSuchAlgorithmException {

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(size);
        KeyPair kp = kpg.genKeyPair();

        PublicKey publicKey = kp.getPublic();
        PrivateKey privateKey = kp.getPrivate();

        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public String Encrypt(String plain)
        throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
               BadPaddingException {
        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.ENCRYPT_MODE, this.publicKey);
        cipher.init(Cipher.ENCRYPT_MODE, this.privateKey);
        byte[] encryptedBytes = cipher.doFinal(plain.getBytes());
        return bytesToString(encryptedBytes);

    }

    public String Decrypt(String result)
        throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
               BadPaddingException {
        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.DECRYPT_MODE, this.privateKey);
        cipher.init(Cipher.DECRYPT_MODE, this.publicKey);
        byte[] decryptedBytes = cipher.doFinal(stringToBytes(result));
        return new String(decryptedBytes);
    }

    public String bytesToString(byte[] b) {
        //        byte[] b2 = new byte[b.length + 1];
        //        b2[0] = 1;
        //        System.arraycopy(b, 0, b2, 1, b.length);
        //        return new BigInteger(b2).toString(36);
        return Base64.getEncoder().encodeToString(b);
    }

    public byte[] stringToBytes(String s) {
        //        byte[] b2 = new BigInteger(s, 36).toByteArray();
        //        return Arrays.copyOfRange(b2, 1, b2.length);
        return Base64.getDecoder().decode(s);
    }


    public void saveToDiskPrivateKey(String path) throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
        out.write(this.getPrivateKeyString());
        out.close();

    }

    public void saveToDiskPublicKey(String path) throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
        out.write(this.getPublicKeyString());
        out.close();

    }

    public void openFromDiskPublicKey(String path)
        throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String content = this.readFileAsString(path);
        this.setPublicKeyString(content);
    }

    public void openFromDiskPrivateKey(String path)
        throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String content = this.readFileAsString(path);
        this.setPrivateKeyString(content);
    }


    private String readFileAsString(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(
            new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }
}
