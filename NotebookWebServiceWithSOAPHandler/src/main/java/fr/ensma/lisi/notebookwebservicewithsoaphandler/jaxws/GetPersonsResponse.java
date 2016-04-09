
package fr.ensma.lisi.notebookwebservicewithsoaphandler.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ensma.lisi.notebookwebservicewithsoaphandler.Person;

@XmlRootElement(name = "getPersonsResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonsResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
public class GetPersonsResponse {

    @XmlElement(name = "getPersonsResult", namespace = "", nillable = true)
    private Person[] getPersonsResult;

    /**
     * 
     * @return
     *     returns Person[]
     */
    public Person[] getGetPersonsResult() {
        return this.getPersonsResult;
    }

    /**
     * 
     * @param getPersonsResult
     *     the value for the getPersonsResult property
     */
    public void setGetPersonsResult(Person[] getPersonsResult) {
        this.getPersonsResult = getPersonsResult;
    }

}
