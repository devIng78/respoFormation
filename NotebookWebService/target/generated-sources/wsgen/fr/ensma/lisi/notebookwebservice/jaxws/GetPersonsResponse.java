
package fr.ensma.lisi.notebookwebservice.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ensma.lisi.notebookwebservice.Person;

@XmlRootElement(name = "getPersonsResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonsResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
public class GetPersonsResponse {

    @XmlElement(name = "getPersonsResult", namespace = "")
    private List<Person> getPersonsResult;

    /**
     * 
     * @return
     *     returns List<Person>
     */
    public List<Person> getGetPersonsResult() {
        return this.getPersonsResult;
    }

    /**
     * 
     * @param getPersonsResult
     *     the value for the getPersonsResult property
     */
    public void setGetPersonsResult(List<Person> getPersonsResult) {
        this.getPersonsResult = getPersonsResult;
    }

}
