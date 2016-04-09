
package fr.ensma.lisi.notebookwebserviceclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 						Container for information about this listing's seller.
 * 					
 * 
 * <p>Classe Java pour SellerInfo complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SellerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sellerUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feedbackScore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="positiveFeedbackPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="feedbackRatingStar" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="topRatedSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "SellerInfo", propOrder = {
    "sellerUserName",
    "feedbackScore",
    "positiveFeedbackPercent",
    "feedbackRatingStar",
    "topRatedSeller",
    "delimiter",
    "any"
})
public class SellerInfo {

    protected String sellerUserName;
    protected Long feedbackScore;
    protected Double positiveFeedbackPercent;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String feedbackRatingStar;
    protected Boolean topRatedSeller;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Obtient la valeur de la propri�t� sellerUserName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerUserName() {
        return sellerUserName;
    }

    /**
     * D�finit la valeur de la propri�t� sellerUserName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerUserName(String value) {
        this.sellerUserName = value;
    }

    /**
     * Obtient la valeur de la propri�t� feedbackScore.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * D�finit la valeur de la propri�t� feedbackScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedbackScore(Long value) {
        this.feedbackScore = value;
    }

    /**
     * Obtient la valeur de la propri�t� positiveFeedbackPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPositiveFeedbackPercent() {
        return positiveFeedbackPercent;
    }

    /**
     * D�finit la valeur de la propri�t� positiveFeedbackPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPositiveFeedbackPercent(Double value) {
        this.positiveFeedbackPercent = value;
    }

    /**
     * Obtient la valeur de la propri�t� feedbackRatingStar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackRatingStar() {
        return feedbackRatingStar;
    }

    /**
     * D�finit la valeur de la propri�t� feedbackRatingStar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackRatingStar(String value) {
        this.feedbackRatingStar = value;
    }

    /**
     * Obtient la valeur de la propri�t� topRatedSeller.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopRatedSeller() {
        return topRatedSeller;
    }

    /**
     * D�finit la valeur de la propri�t� topRatedSeller.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopRatedSeller(Boolean value) {
        this.topRatedSeller = value;
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
