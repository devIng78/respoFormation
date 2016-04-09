
package fr.ensma.lisi.notebookwebserviceclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Container for URLs of thumbnail images for an item.
 * 			
 * 
 * <p>Classe Java pour GalleryInfoContainer complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GalleryInfoContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="galleryURL" type="{http://www.ebay.com/marketplace/search/v1/services}GalleryURL" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GalleryInfoContainer", propOrder = {
    "galleryURL"
})
public class GalleryInfoContainer {

    @XmlElement(required = true)
    protected List<GalleryURL> galleryURL;

    /**
     * Gets the value of the galleryURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the galleryURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGalleryURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GalleryURL }
     * 
     * 
     */
    public List<GalleryURL> getGalleryURL() {
        if (galleryURL == null) {
            galleryURL = new ArrayList<GalleryURL>();
        }
        return this.galleryURL;
    }

}
