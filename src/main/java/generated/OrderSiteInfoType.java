
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderSiteInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderSiteInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EAPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LanguageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryAlpha2Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PointOfSaleOrderReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderSiteInfoType", propOrder = {
    "tpid",
    "eapid",
    "languageId",
    "languageCode",
    "countryAlpha2Code",
    "pointOfSaleOrderReferenceNumber"
})
public class OrderSiteInfoType {

    @XmlElement(name = "TPID", required = true)
    protected String tpid;
    @XmlElement(name = "EAPID", required = true)
    protected String eapid;
    @XmlElement(name = "LanguageId", required = true)
    protected String languageId;
    @XmlElement(name = "LanguageCode", required = true)
    protected String languageCode;
    @XmlElement(name = "CountryAlpha2Code", required = true)
    protected String countryAlpha2Code;
    @XmlElement(name = "PointOfSaleOrderReferenceNumber", required = true)
    protected String pointOfSaleOrderReferenceNumber;

    /**
     * Gets the value of the tpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPID() {
        return tpid;
    }

    /**
     * Sets the value of the tpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPID(String value) {
        this.tpid = value;
    }

    /**
     * Gets the value of the eapid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAPID() {
        return eapid;
    }

    /**
     * Sets the value of the eapid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAPID(String value) {
        this.eapid = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageId(String value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the countryAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAlpha2Code() {
        return countryAlpha2Code;
    }

    /**
     * Sets the value of the countryAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAlpha2Code(String value) {
        this.countryAlpha2Code = value;
    }

    /**
     * Gets the value of the pointOfSaleOrderReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleOrderReferenceNumber() {
        return pointOfSaleOrderReferenceNumber;
    }

    /**
     * Sets the value of the pointOfSaleOrderReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleOrderReferenceNumber(String value) {
        this.pointOfSaleOrderReferenceNumber = value;
    }

}
