
package fr.ensma.lisi.notebookwebserviceclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Returns items based on keyword and/or category and allows searching
 * 							within item descriptions.
 * 					
 * 
 * <p>Classe Java pour FindItemsAdvancedRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FindItemsAdvancedRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseFindingServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemFilter" type="{http://www.ebay.com/marketplace/search/v1/services}ItemFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aspectFilter" type="{http://www.ebay.com/marketplace/search/v1/services}AspectFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputSelector" type="{http://www.ebay.com/marketplace/search/v1/services}OutputSelectorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descriptionSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="domainFilter" type="{http://www.ebay.com/marketplace/search/v1/services}DomainFilter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemsAdvancedRequest", propOrder = {
    "keywords",
    "categoryId",
    "itemFilter",
    "aspectFilter",
    "outputSelector",
    "descriptionSearch",
    "domainFilter"
})
public class FindItemsAdvancedRequest
    extends BaseFindingServiceRequest
{

    protected String keywords;
    protected List<String> categoryId;
    protected List<ItemFilter> itemFilter;
    protected List<AspectFilter> aspectFilter;
    protected List<OutputSelectorType> outputSelector;
    protected Boolean descriptionSearch;
    protected List<DomainFilter> domainFilter;

    /**
     * Obtient la valeur de la propri�t� keywords.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * D�finit la valeur de la propri�t� keywords.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategoryId() {
        if (categoryId == null) {
            categoryId = new ArrayList<String>();
        }
        return this.categoryId;
    }

    /**
     * Gets the value of the itemFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemFilter }
     * 
     * 
     */
    public List<ItemFilter> getItemFilter() {
        if (itemFilter == null) {
            itemFilter = new ArrayList<ItemFilter>();
        }
        return this.itemFilter;
    }

    /**
     * Gets the value of the aspectFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aspectFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAspectFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AspectFilter }
     * 
     * 
     */
    public List<AspectFilter> getAspectFilter() {
        if (aspectFilter == null) {
            aspectFilter = new ArrayList<AspectFilter>();
        }
        return this.aspectFilter;
    }

    /**
     * Gets the value of the outputSelector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSelector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSelector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputSelectorType }
     * 
     * 
     */
    public List<OutputSelectorType> getOutputSelector() {
        if (outputSelector == null) {
            outputSelector = new ArrayList<OutputSelectorType>();
        }
        return this.outputSelector;
    }

    /**
     * Obtient la valeur de la propri�t� descriptionSearch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescriptionSearch() {
        return descriptionSearch;
    }

    /**
     * D�finit la valeur de la propri�t� descriptionSearch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescriptionSearch(Boolean value) {
        this.descriptionSearch = value;
    }

    /**
     * Gets the value of the domainFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainFilter }
     * 
     * 
     */
    public List<DomainFilter> getDomainFilter() {
        if (domainFilter == null) {
            domainFilter = new ArrayList<DomainFilter>();
        }
        return this.domainFilter;
    }

}