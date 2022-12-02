package bo.gob.impuestos.java101.xmlvalidation;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class XMLSerialization
{
    public static void main( String[] args ) throws JAXBException {
        Class clazz = new Class();
        clazz.getStudents().add(new Student(2, "Juan"));
        clazz.getStudents().add(new Student(4, "Gabriel"));

        JAXBContext context = JAXBContext.newInstance(Class.class);
        Marshaller jaxbMarshaller = context.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(clazz, new File("serializado.xml"));
    }
}
