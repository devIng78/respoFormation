
package fr.ensma.lisi.notebookwebservicewithsoaphandler.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ensma.lisi.notebookwebservicewithsoaphandler.Person;

@XmlRootElement(name = "getPersonByNameResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonByNameResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
public class GetPersonByNameResponse {

    @XmlElement(name = "getPersonResult", namespace = "")
    private Person getPersonResult;

    /**
     * 
     * @return
     *     returns Person
     */
    public Person getGetPersonResult() {
        return this.getPersonResult;
    }

    /**
     * 
     * @param getPersonResult
     *     the value for the getPersonResult property
     */
    public void setGetPersonResult(Person getPersonResult) {
        this.getPersonResult = getPersonResult;
    }

}
