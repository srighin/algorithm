
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderSiteInfo" type="{}OrderSiteInfoType"/>
 *         &lt;element name="OrderComponentsType" type="{}OrderComponentsTypeType"/>
 *         &lt;element name="AdditionalDataList" type="{}AdditionalDataListType"/>
 *         &lt;element name="ExpediaUser" type="{}ExpediaUserType"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderLines" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "eventId",
    "eventType",
    "clientId",
    "orderSiteInfo",
    "orderComponentsType",
    "additionalDataList",
    "expediaUser",
    "orderStatus",
    "orderLines"
})
public class EventType {

    @XmlElement(name = "EventId", required = true)
    protected String eventId;
    @XmlElement(name = "EventType", required = true)
    protected String eventType;
    @XmlElement(name = "ClientId", required = true, defaultValue = "TX-BRIDGE")
    protected String clientId;
    @XmlElement(name = "OrderSiteInfo", required = true)
    protected OrderSiteInfoType orderSiteInfo;
    @XmlElement(name = "OrderComponentsType", required = true)
    protected OrderComponentsTypeType orderComponentsType;
    @XmlElement(name = "AdditionalDataList", required = true)
    protected AdditionalDataListType additionalDataList;
    @XmlElement(name = "ExpediaUser", required = true)
    protected ExpediaUserType expediaUser;
    @XmlElement(name = "OrderStatus", required = true)
    protected String orderStatus;
    @XmlElement(name = "OrderLines", required = true)
    protected String orderLines;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the orderSiteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSiteInfoType }
     *     
     */
    public OrderSiteInfoType getOrderSiteInfo() {
        return orderSiteInfo;
    }

    /**
     * Sets the value of the orderSiteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSiteInfoType }
     *     
     */
    public void setOrderSiteInfo(OrderSiteInfoType value) {
        this.orderSiteInfo = value;
    }

    /**
     * Gets the value of the orderComponentsType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderComponentsTypeType }
     *     
     */
    public OrderComponentsTypeType getOrderComponentsType() {
        return orderComponentsType;
    }

    /**
     * Sets the value of the orderComponentsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderComponentsTypeType }
     *     
     */
    public void setOrderComponentsType(OrderComponentsTypeType value) {
        this.orderComponentsType = value;
    }

    /**
     * Gets the value of the additionalDataList property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDataListType }
     *     
     */
    public AdditionalDataListType getAdditionalDataList() {
        return additionalDataList;
    }

    /**
     * Sets the value of the additionalDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDataListType }
     *     
     */
    public void setAdditionalDataList(AdditionalDataListType value) {
        this.additionalDataList = value;
    }

    /**
     * Gets the value of the expediaUser property.
     * 
     * @return
     *     possible object is
     *     {@link ExpediaUserType }
     *     
     */
    public ExpediaUserType getExpediaUser() {
        return expediaUser;
    }

    /**
     * Sets the value of the expediaUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpediaUserType }
     *     
     */
    public void setExpediaUser(ExpediaUserType value) {
        this.expediaUser = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the orderLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLines() {
        return orderLines;
    }

    /**
     * Sets the value of the orderLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLines(String value) {
        this.orderLines = value;
    }

}
