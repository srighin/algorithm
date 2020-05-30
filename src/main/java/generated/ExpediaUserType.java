
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpediaUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpediaUserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SiteKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpUserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpediaUserType", propOrder = {
    "userID",
    "siteKey",
    "expUserID",
    "phoneCountryCode",
    "phoneAreaCode",
    "phoneNumber"
})
public class ExpediaUserType {

    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "SiteKey", required = true)
    protected String siteKey;
    @XmlElement(name = "ExpUserID", required = true)
    protected String expUserID;
    @XmlElement(name = "PhoneCountryCode", required = true)
    protected String phoneCountryCode;
    @XmlElement(name = "PhoneAreaCode", required = true)
    protected String phoneAreaCode;
    @XmlElement(name = "PhoneNumber", required = true)
    protected String phoneNumber;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the siteKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteKey() {
        return siteKey;
    }

    /**
     * Sets the value of the siteKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteKey(String value) {
        this.siteKey = value;
    }

    /**
     * Gets the value of the expUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpUserID() {
        return expUserID;
    }

    /**
     * Sets the value of the expUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpUserID(String value) {
        this.expUserID = value;
    }

    /**
     * Gets the value of the phoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * Sets the value of the phoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCountryCode(String value) {
        this.phoneCountryCode = value;
    }

    /**
     * Gets the value of the phoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAreaCode() {
        return phoneAreaCode;
    }

    /**
     * Sets the value of the phoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAreaCode(String value) {
        this.phoneAreaCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
