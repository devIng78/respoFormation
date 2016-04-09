
package fr.ensma.lisi.notebookwebservicefromwsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addPersonWithComplexType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addPersonWithComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newPerson" type="{http://notebookwebservice.lisi.ensma.fr/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPersonWithComplexType", propOrder = {
    "newPerson"
})
public class AddPersonWithComplexType {

    protected Person newPerson;

    /**
     * Obtient la valeur de la propri�t� newPerson.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getNewPerson() {
        return newPerson;
    }

    /**
     * D�finit la valeur de la propri�t� newPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setNewPerson(Person value) {
        this.newPerson = value;
    }

}
