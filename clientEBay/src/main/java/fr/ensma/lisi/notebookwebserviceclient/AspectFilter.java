
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
 * 						Use aspect filters to refine the number of results returned in a response.
 * 						Populate the aspectFilter container with aspect values obtained from the
 * 						response of a query that returns an aspectHistogram.
 * 					
 * 
 * <p>Classe Java pour AspectFilter complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AspectFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aspectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aspectValueName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "AspectFilter", propOrder = {
    "aspectName",
    "aspectValueName",
    "delimiter",
    "any"
})
public class AspectFilter {

    @XmlElement(required = true)
    protected String aspectName;
    @XmlElement(required = true)
    protected List<String> aspectValueName;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Obtient la valeur de la propri�t� aspectName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectName() {
        return aspectName;
    }

    /**
     * D�finit la valeur de la propri�t� aspectName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectName(String value) {
        this.aspectName = value;
    }

    /**
     * Gets the value of the aspectValueName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aspectValueName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAspectValueName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAspectValueName() {
        if (aspectValueName == null) {
            aspectValueName = new ArrayList<String>();
        }
        return this.aspectValueName;
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
