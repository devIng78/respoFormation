
package fr.ensma.lisi.notebookwebserviceasyncclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getPersonByNameResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPersonByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPersonResult" type="{http://notebookwebservice.lisi.ensma.fr/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonByNameResponse", propOrder = {
    "getPersonResult"
})
public class GetPersonByNameResponse {

    protected Person getPersonResult;

    /**
     * Obtient la valeur de la propriété getPersonResult.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getGetPersonResult() {
        return getPersonResult;
    }

    /**
     * Définit la valeur de la propriété getPersonResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setGetPersonResult(Person value) {
        this.getPersonResult = value;
    }

}
