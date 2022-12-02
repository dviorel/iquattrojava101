package bo.gob.impuestos.java101.xmlvalidation;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Hello world!
 *
 */
public class XMLDeserialization
{
    public static void main( String[] args ) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Class.class);
        Class clazz = (Class) context.createUnmarshaller().unmarshal(new File("XMLPrueba.xml"));
        System.out.println(clazz);
    }
}
