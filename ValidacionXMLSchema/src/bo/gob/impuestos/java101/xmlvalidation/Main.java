package bo.gob.impuestos.java101.xmlvalidation;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class Main {

    public static void main(String[] args) {
        boolean esValido = validateXMLSchema("SchemaPrueba.xsd", "XMLPrueba.xml");
        System.out.println("Es valido: " + esValido);
    }

    static boolean validateXMLSchema(String xsdPath, String xmlPath){
        try {
            SchemaFactory factory =
                SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


}