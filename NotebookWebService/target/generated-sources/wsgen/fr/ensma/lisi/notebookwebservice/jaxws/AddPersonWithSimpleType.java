
package fr.ensma.lisi.notebookwebservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addPersonWithSimpleType", namespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPersonWithSimpleType", namespace = "http://notebookwebservice.lisi.ensma.fr/", propOrder = {
    "name",
    "address",
    "birthyear"
})
public class AddPersonWithSimpleType {

    @XmlElement(name = "name", namespace = "")
    private String name;
    @XmlElement(name = "address", namespace = "")
    private String address;
    @XmlElement(name = "birthyear", namespace = "")
    private String birthyear;

    /**
     * 
     * @return
     *     returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 
     * @param address
     *     the value for the address property
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getBirthyear() {
        return this.birthyear;
    }

    /**
     * 
     * @param birthyear
     *     the value for the birthyear property
     */
    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

}
