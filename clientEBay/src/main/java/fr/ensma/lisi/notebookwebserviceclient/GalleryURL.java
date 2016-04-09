
package fr.ensma.lisi.notebookwebserviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Defines the image URL returned in galleryInfoContainer.
 * 			
 * 
 * <p>Classe Java pour GalleryURL complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GalleryURL">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *       &lt;attribute name="gallerySize" use="required" type="{http://www.ebay.com/marketplace/search/v1/services}GallerySizeEnum" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GalleryURL", propOrder = {
    "value"
})
public class GalleryURL {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "gallerySize", required = true)
    protected GallerySizeEnum gallerySize;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� gallerySize.
     * 
     * @return
     *     possible object is
     *     {@link GallerySizeEnum }
     *     
     */
    public GallerySizeEnum getGallerySize() {
        return gallerySize;
    }

    /**
     * D�finit la valeur de la propri�t� gallerySize.
     * 
     * @param value
     *     allowed object is
     *     {@link GallerySizeEnum }
     *     
     */
    public void setGallerySize(GallerySizeEnum value) {
        this.gallerySize = value;
    }

}
