
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderComponentsTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderComponentsTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hotel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Air" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Car" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationServices" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Train" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Insurance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cruise" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderComponentsTypeType", propOrder = {
    "hotel",
    "air",
    "car",
    "destinationServices",
    "bus",
    "train",
    "insurance",
    "cruise"
})
public class OrderComponentsTypeType {

    @XmlElement(name = "Hotel", required = true)
    protected String hotel;
    @XmlElement(name = "Air", required = true)
    protected String air;
    @XmlElement(name = "Car", required = true)
    protected String car;
    @XmlElement(name = "DestinationServices", required = true)
    protected String destinationServices;
    @XmlElement(name = "Bus", required = true)
    protected String bus;
    @XmlElement(name = "Train", required = true)
    protected String train;
    @XmlElement(name = "Insurance", required = true)
    protected String insurance;
    @XmlElement(name = "Cruise", required = true)
    protected String cruise;

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotel(String value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the air property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAir() {
        return air;
    }

    /**
     * Sets the value of the air property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAir(String value) {
        this.air = value;
    }

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCar(String value) {
        this.car = value;
    }

    /**
     * Gets the value of the destinationServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationServices() {
        return destinationServices;
    }

    /**
     * Sets the value of the destinationServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationServices(String value) {
        this.destinationServices = value;
    }

    /**
     * Gets the value of the bus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBus() {
        return bus;
    }

    /**
     * Sets the value of the bus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBus(String value) {
        this.bus = value;
    }

    /**
     * Gets the value of the train property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrain() {
        return train;
    }

    /**
     * Sets the value of the train property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrain(String value) {
        this.train = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurance(String value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the cruise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCruise() {
        return cruise;
    }

    /**
     * Sets the value of the cruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCruise(String value) {
        this.cruise = value;
    }

}
