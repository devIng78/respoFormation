
package fr.ensma.lisi.notebookwebservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPersonByName", namespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonByName", namespace = "http://notebookwebservice.lisi.ensma.fr/")
public class GetPersonByName {

    @XmlElement(name = "personName", namespace = "")
    private String personName;

    /**
     * 
     * @return
     *     returns String
     */
    public String getPersonName() {
        return this.personName;
    }

    /**
     * 
     * @param personName
     *     the value for the personName property
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

}
