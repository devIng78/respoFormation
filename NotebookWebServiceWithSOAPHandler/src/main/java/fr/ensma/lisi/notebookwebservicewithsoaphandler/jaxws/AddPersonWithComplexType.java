
package fr.ensma.lisi.notebookwebservicewithsoaphandler.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ensma.lisi.notebookwebservicewithsoaphandler.Person;

@XmlRootElement(name = "addPersonWithComplexType", namespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPersonWithComplexType", namespace = "http://notebookwebservice.lisi.ensma.fr/")
public class AddPersonWithComplexType {

    @XmlElement(name = "newPerson", namespace = "")
    private Person newPerson;

    /**
     * 
     * @return
     *     returns Person
     */
    public Person getNewPerson() {
        return this.newPerson;
    }

    /**
     * 
     * @param newPerson
     *     the value for the newPerson property
     */
    public void setNewPerson(Person newPerson) {
        this.newPerson = newPerson;
    }

}
