
package fr.ensma.lisi.notebookwebservicefromwsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addPersonWithComplexTypeResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addPersonWithComplexTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addPersonWithComplexTypeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPersonWithComplexTypeResponse", propOrder = {
    "addPersonWithComplexTypeResult"
})
public class AddPersonWithComplexTypeResponse {

    protected boolean addPersonWithComplexTypeResult;

    /**
     * Obtient la valeur de la propri�t� addPersonWithComplexTypeResult.
     * 
     */
    public boolean isAddPersonWithComplexTypeResult() {
        return addPersonWithComplexTypeResult;
    }

    /**
     * D�finit la valeur de la propri�t� addPersonWithComplexTypeResult.
     * 
     */
    public void setAddPersonWithComplexTypeResult(boolean value) {
        this.addPersonWithComplexTypeResult = value;
    }

}
