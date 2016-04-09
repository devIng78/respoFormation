
package fr.ensma.lisi.helloworldwebservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "makeHelloWorld", namespace = "http://helloworldwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeHelloWorld", namespace = "http://helloworldwebservice.lisi.ensma.fr/")
public class MakeHelloWorld {

    @XmlElement(name = "value", namespace = "")
    private String value;

    /**
     * 
     * @return
     *     returns String
     */
    public String getValue() {
        return this.value;
    }

    /**
     * 
     * @param value
     *     the value for the value property
     */
    public void setValue(String value) {
        this.value = value;
    }

}
