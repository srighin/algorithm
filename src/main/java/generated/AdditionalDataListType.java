
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalDataListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItineraryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDataListType", propOrder = {
    "itineraryNumber"
})
public class AdditionalDataListType {

    @XmlElement(name = "ItineraryNumber", required = true)
    protected String itineraryNumber;

    /**
     * Gets the value of the itineraryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryNumber() {
        return itineraryNumber;
    }

    /**
     * Sets the value of the itineraryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryNumber(String value) {
        this.itineraryNumber = value;
    }

}
