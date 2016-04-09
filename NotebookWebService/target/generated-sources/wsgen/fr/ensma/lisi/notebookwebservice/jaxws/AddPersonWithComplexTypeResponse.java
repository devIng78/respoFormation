
package fr.ensma.lisi.notebookwebservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addPersonWithComplexTypeResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPersonWithComplexTypeResponse", namespace = "http://notebookwebservice.lisi.ensma.fr/")
public class AddPersonWithComplexTypeResponse {

    @XmlElement(name = "addPersonWithComplexTypeResult", namespace = "")
    private boolean addPersonWithComplexTypeResult;

    /**
     * 
     * @return
     *     returns boolean
     */
    public boolean isAddPersonWithComplexTypeResult() {
        return this.addPersonWithComplexTypeResult;
    }

    /**
     * 
     * @param addPersonWithComplexTypeResult
     *     the value for the addPersonWithComplexTypeResult property
     */
    public void setAddPersonWithComplexTypeResult(boolean addPersonWithComplexTypeResult) {
        this.addPersonWithComplexTypeResult = addPersonWithComplexTypeResult;
    }

}
