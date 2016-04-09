
package fr.ensma.lisi.helloworldwebservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "makeHelloWorldResponse", namespace = "http://helloworldwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeHelloWorldResponse", namespace = "http://helloworldwebservice.lisi.ensma.fr/")
public class MakeHelloWorldResponse {

    @XmlElement(name = "helloWorldResult", namespace = "")
    private String helloWorldResult;

    /**
     * 
     * @return
     *     returns String
     */
    public String getHelloWorldResult() {
        return this.helloWorldResult;
    }

    /**
     * 
     * @param helloWorldResult
     *     the value for the helloWorldResult property
     */
    public void setHelloWorldResult(String helloWorldResult) {
        this.helloWorldResult = helloWorldResult;
    }

}
