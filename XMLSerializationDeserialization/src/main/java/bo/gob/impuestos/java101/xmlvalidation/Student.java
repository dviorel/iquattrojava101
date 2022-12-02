package bo.gob.impuestos.java101.xmlvalidation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@XmlRootElement(name = "student", namespace = "http://www.impuestos.gob.bo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlElement(name = "id", namespace = "http://www.impuestos.gob.bo")
    Integer id;
    @XmlElement(name = "name", namespace = "http://www.impuestos.gob.bo")
    // @Setter(AccessLevel.PRIVATE)
    String name;



}
