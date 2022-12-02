package bo.gob.impuestos.java101.xmlvalidation;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "class", namespace = "http://www.impuestos.gob.bo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Class {

    @XmlElement(name = "student", namespace = "http://www.impuestos.gob.bo")
    private List<Student> students = new ArrayList<>();

}
