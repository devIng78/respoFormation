
package fr.ensma.lisi.notebookwebserviceclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Container for the data of a single item that matches the search criteria. Finding API calls return an object of this type, filled with the item's data.
 * 			
 * 
 * <p>Classe Java pour SearchItem complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SearchItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="globalId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="subtitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryCategory" type="{http://www.ebay.com/marketplace/search/v1/services}Category" minOccurs="0"/>
 *         &lt;element name="secondaryCategory" type="{http://www.ebay.com/marketplace/search/v1/services}Category" minOccurs="0"/>
 *         &lt;element name="galleryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="galleryInfoContainer" type="{http://www.ebay.com/marketplace/search/v1/services}GalleryInfoContainer" minOccurs="0"/>
 *         &lt;element name="viewItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="charityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.ebay.com/marketplace/search/v1/services}ProductId" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="autoPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="storeInfo" type="{http://www.ebay.com/marketplace/search/v1/services}Storefront" minOccurs="0"/>
 *         &lt;element name="sellerInfo" type="{http://www.ebay.com/marketplace/search/v1/services}SellerInfo" minOccurs="0"/>
 *         &lt;element name="shippingInfo" type="{http://www.ebay.com/marketplace/search/v1/services}ShippingInfo" minOccurs="0"/>
 *         &lt;element name="sellingStatus" type="{http://www.ebay.com/marketplace/search/v1/services}SellingStatus" minOccurs="0"/>
 *         &lt;element name="listingInfo" type="{http://www.ebay.com/marketplace/search/v1/services}ListingInfo" minOccurs="0"/>
 *         &lt;element name="returnsAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="galleryPlusPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="compatibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.ebay.com/marketplace/search/v1/services}Distance" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.ebay.com/marketplace/search/v1/services}Condition" minOccurs="0"/>
 *         &lt;element name="isMultiVariationListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="discountPriceInfo" type="{http://www.ebay.com/marketplace/search/v1/services}DiscountPriceInfo" minOccurs="0"/>
 *         &lt;element name="pictureURLSuperSize" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="pictureURLLarge" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://www.ebay.com/marketplace/search/v1/services}UnitPriceInfo" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.ebay.com/marketplace/search/v1/services}ItemAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="topRatedListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="eekStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchItem", propOrder = {
    "itemId",
    "title",
    "globalId",
    "subtitle",
    "primaryCategory",
    "secondaryCategory",
    "galleryURL",
    "galleryInfoContainer",
    "viewItemURL",
    "charityId",
    "productId",
    "paymentMethod",
    "autoPay",
    "postalCode",
    "location",
    "country",
    "storeInfo",
    "sellerInfo",
    "shippingInfo",
    "sellingStatus",
    "listingInfo",
    "returnsAccepted",
    "galleryPlusPictureURL",
    "compatibility",
    "distance",
    "condition",
    "isMultiVariationListing",
    "discountPriceInfo",
    "pictureURLSuperSize",
    "pictureURLLarge",
    "unitPrice",
    "attribute",
    "topRatedListing",
    "delimiter",
    "any",
    "eekStatus"
})
public class SearchItem {

    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String title;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String globalId;
    protected String subtitle;
    protected Category primaryCategory;
    protected Category secondaryCategory;
    @XmlSchemaType(name = "anyURI")
    protected String galleryURL;
    protected GalleryInfoContainer galleryInfoContainer;
    @XmlSchemaType(name = "anyURI")
    protected String viewItemURL;
    protected String charityId;
    protected ProductId productId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paymentMethod;
    protected Boolean autoPay;
    protected String postalCode;
    protected String location;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String country;
    protected Storefront storeInfo;
    protected SellerInfo sellerInfo;
    protected ShippingInfo shippingInfo;
    protected SellingStatus sellingStatus;
    protected ListingInfo listingInfo;
    protected Boolean returnsAccepted;
    @XmlSchemaType(name = "anyURI")
    protected List<String> galleryPlusPictureURL;
    protected String compatibility;
    protected Distance distance;
    protected Condition condition;
    protected Boolean isMultiVariationListing;
    protected DiscountPriceInfo discountPriceInfo;
    @XmlSchemaType(name = "anyURI")
    protected String pictureURLSuperSize;
    @XmlSchemaType(name = "anyURI")
    protected String pictureURLLarge;
    protected UnitPriceInfo unitPrice;
    protected List<ItemAttribute> attribute;
    protected Boolean topRatedListing;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    protected List<String> eekStatus;

    /**
     * Obtient la valeur de la propri�t� itemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * D�finit la valeur de la propri�t� itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Obtient la valeur de la propri�t� title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * D�finit la valeur de la propri�t� title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propri�t� globalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * D�finit la valeur de la propri�t� globalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalId(String value) {
        this.globalId = value;
    }

    /**
     * Obtient la valeur de la propri�t� subtitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * D�finit la valeur de la propri�t� subtitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }

    /**
     * Obtient la valeur de la propri�t� primaryCategory.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getPrimaryCategory() {
        return primaryCategory;
    }

    /**
     * D�finit la valeur de la propri�t� primaryCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setPrimaryCategory(Category value) {
        this.primaryCategory = value;
    }

    /**
     * Obtient la valeur de la propri�t� secondaryCategory.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getSecondaryCategory() {
        return secondaryCategory;
    }

    /**
     * D�finit la valeur de la propri�t� secondaryCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setSecondaryCategory(Category value) {
        this.secondaryCategory = value;
    }

    /**
     * Obtient la valeur de la propri�t� galleryURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryURL() {
        return galleryURL;
    }

    /**
     * D�finit la valeur de la propri�t� galleryURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryURL(String value) {
        this.galleryURL = value;
    }

    /**
     * Obtient la valeur de la propri�t� galleryInfoContainer.
     * 
     * @return
     *     possible object is
     *     {@link GalleryInfoContainer }
     *     
     */
    public GalleryInfoContainer getGalleryInfoContainer() {
        return galleryInfoContainer;
    }

    /**
     * D�finit la valeur de la propri�t� galleryInfoContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryInfoContainer }
     *     
     */
    public void setGalleryInfoContainer(GalleryInfoContainer value) {
        this.galleryInfoContainer = value;
    }

    /**
     * Obtient la valeur de la propri�t� viewItemURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewItemURL() {
        return viewItemURL;
    }

    /**
     * D�finit la valeur de la propri�t� viewItemURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewItemURL(String value) {
        this.viewItemURL = value;
    }

    /**
     * Obtient la valeur de la propri�t� charityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityId() {
        return charityId;
    }

    /**
     * D�finit la valeur de la propri�t� charityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityId(String value) {
        this.charityId = value;
    }

    /**
     * Obtient la valeur de la propri�t� productId.
     * 
     * @return
     *     possible object is
     *     {@link ProductId }
     *     
     */
    public ProductId getProductId() {
        return productId;
    }

    /**
     * D�finit la valeur de la propri�t� productId.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductId }
     *     
     */
    public void setProductId(ProductId value) {
        this.productId = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<String>();
        }
        return this.paymentMethod;
    }

    /**
     * Obtient la valeur de la propri�t� autoPay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPay() {
        return autoPay;
    }

    /**
     * D�finit la valeur de la propri�t� autoPay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPay(Boolean value) {
        this.autoPay = value;
    }

    /**
     * Obtient la valeur de la propri�t� postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * D�finit la valeur de la propri�t� postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * D�finit la valeur de la propri�t� location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtient la valeur de la propri�t� country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * D�finit la valeur de la propri�t� country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propri�t� storeInfo.
     * 
     * @return
     *     possible object is
     *     {@link Storefront }
     *     
     */
    public Storefront getStoreInfo() {
        return storeInfo;
    }

    /**
     * D�finit la valeur de la propri�t� storeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Storefront }
     *     
     */
    public void setStoreInfo(Storefront value) {
        this.storeInfo = value;
    }

    /**
     * Obtient la valeur de la propri�t� sellerInfo.
     * 
     * @return
     *     possible object is
     *     {@link SellerInfo }
     *     
     */
    public SellerInfo getSellerInfo() {
        return sellerInfo;
    }

    /**
     * D�finit la valeur de la propri�t� sellerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerInfo }
     *     
     */
    public void setSellerInfo(SellerInfo value) {
        this.sellerInfo = value;
    }

    /**
     * Obtient la valeur de la propri�t� shippingInfo.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInfo }
     *     
     */
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    /**
     * D�finit la valeur de la propri�t� shippingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInfo }
     *     
     */
    public void setShippingInfo(ShippingInfo value) {
        this.shippingInfo = value;
    }

    /**
     * Obtient la valeur de la propri�t� sellingStatus.
     * 
     * @return
     *     possible object is
     *     {@link SellingStatus }
     *     
     */
    public SellingStatus getSellingStatus() {
        return sellingStatus;
    }

    /**
     * D�finit la valeur de la propri�t� sellingStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingStatus }
     *     
     */
    public void setSellingStatus(SellingStatus value) {
        this.sellingStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� listingInfo.
     * 
     * @return
     *     possible object is
     *     {@link ListingInfo }
     *     
     */
    public ListingInfo getListingInfo() {
        return listingInfo;
    }

    /**
     * D�finit la valeur de la propri�t� listingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingInfo }
     *     
     */
    public void setListingInfo(ListingInfo value) {
        this.listingInfo = value;
    }

    /**
     * Obtient la valeur de la propri�t� returnsAccepted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnsAccepted() {
        return returnsAccepted;
    }

    /**
     * D�finit la valeur de la propri�t� returnsAccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnsAccepted(Boolean value) {
        this.returnsAccepted = value;
    }

    /**
     * Gets the value of the galleryPlusPictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the galleryPlusPictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGalleryPlusPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGalleryPlusPictureURL() {
        if (galleryPlusPictureURL == null) {
            galleryPlusPictureURL = new ArrayList<String>();
        }
        return this.galleryPlusPictureURL;
    }

    /**
     * Obtient la valeur de la propri�t� compatibility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibility() {
        return compatibility;
    }

    /**
     * D�finit la valeur de la propri�t� compatibility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibility(String value) {
        this.compatibility = value;
    }

    /**
     * Obtient la valeur de la propri�t� distance.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * D�finit la valeur de la propri�t� distance.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Obtient la valeur de la propri�t� condition.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * D�finit la valeur de la propri�t� condition.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

    /**
     * Obtient la valeur de la propri�t� isMultiVariationListing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiVariationListing() {
        return isMultiVariationListing;
    }

    /**
     * D�finit la valeur de la propri�t� isMultiVariationListing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiVariationListing(Boolean value) {
        this.isMultiVariationListing = value;
    }

    /**
     * Obtient la valeur de la propri�t� discountPriceInfo.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPriceInfo }
     *     
     */
    public DiscountPriceInfo getDiscountPriceInfo() {
        return discountPriceInfo;
    }

    /**
     * D�finit la valeur de la propri�t� discountPriceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPriceInfo }
     *     
     */
    public void setDiscountPriceInfo(DiscountPriceInfo value) {
        this.discountPriceInfo = value;
    }

    /**
     * Obtient la valeur de la propri�t� pictureURLSuperSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURLSuperSize() {
        return pictureURLSuperSize;
    }

    /**
     * D�finit la valeur de la propri�t� pictureURLSuperSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURLSuperSize(String value) {
        this.pictureURLSuperSize = value;
    }

    /**
     * Obtient la valeur de la propri�t� pictureURLLarge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURLLarge() {
        return pictureURLLarge;
    }

    /**
     * D�finit la valeur de la propri�t� pictureURLLarge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURLLarge(String value) {
        this.pictureURLLarge = value;
    }

    /**
     * Obtient la valeur de la propri�t� unitPrice.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceInfo }
     *     
     */
    public UnitPriceInfo getUnitPrice() {
        return unitPrice;
    }

    /**
     * D�finit la valeur de la propri�t� unitPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceInfo }
     *     
     */
    public void setUnitPrice(UnitPriceInfo value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemAttribute }
     * 
     * 
     */
    public List<ItemAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<ItemAttribute>();
        }
        return this.attribute;
    }

    /**
     * Obtient la valeur de la propri�t� topRatedListing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopRatedListing() {
        return topRatedListing;
    }

    /**
     * D�finit la valeur de la propri�t� topRatedListing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopRatedListing(Boolean value) {
        this.topRatedListing = value;
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

    /**
     * Gets the value of the eekStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eekStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEekStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEekStatus() {
        if (eekStatus == null) {
            eekStatus = new ArrayList<String>();
        }
        return this.eekStatus;
    }

}
