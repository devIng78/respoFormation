
package fr.ensma.lisi.notebookwebserviceclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Information that describes an item's condition.
 * 			
 * 
 * <p>Classe Java pour Condition complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Condition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conditionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "conditionId",
    "conditionDisplayName",
    "delimiter",
    "any"
})
public class Condition {

    protected Integer conditionId;
    @XmlElement(required = true)
    protected String conditionDisplayName;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Obtient la valeur de la propri�t� conditionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConditionId() {
        return conditionId;
    }

    /**
     * D�finit la valeur de la propri�t� conditionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConditionId(Integer value) {
        this.conditionId = value;
    }

    /**
     * Obtient la valeur de la propri�t� conditionDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDisplayName() {
        return conditionDisplayName;
    }

    /**
     * D�finit la valeur de la propri�t� conditionDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDisplayName(String value) {
        this.conditionDisplayName = value;
    }

    /**
     * Obtient la valeur de la propri�t� delimiter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * D�finit la valeur de la propri�t� delimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
