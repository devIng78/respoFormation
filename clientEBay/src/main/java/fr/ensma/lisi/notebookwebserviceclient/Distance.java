
package fr.ensma.lisi.notebookwebserviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Distance, used for local searches.
 * 			
 * 
 * <p>Classe Java pour Distance complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Distance">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distance", propOrder = {
    "value"
})
public class Distance {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� unit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * D�finit la valeur de la propri�t� unit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
