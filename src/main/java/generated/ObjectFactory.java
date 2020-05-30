
package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EventsRequest_QNAME = new QName("", "EventsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventsRequestType }
     * 
     */
    public EventsRequestType createEventsRequestType() {
        return new EventsRequestType();
    }

    /**
     * Create an instance of {@link AdditionalDataListType }
     * 
     */
    public AdditionalDataListType createAdditionalDataListType() {
        return new AdditionalDataListType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link ExpediaUserType }
     * 
     */
    public ExpediaUserType createExpediaUserType() {
        return new ExpediaUserType();
    }

    /**
     * Create an instance of {@link EventListType }
     * 
     */
    public EventListType createEventListType() {
        return new EventListType();
    }

    /**
     * Create an instance of {@link MessageInfoType }
     * 
     */
    public MessageInfoType createMessageInfoType() {
        return new MessageInfoType();
    }

    /**
     * Create an instance of {@link OrderComponentsTypeType }
     * 
     */
    public OrderComponentsTypeType createOrderComponentsTypeType() {
        return new OrderComponentsTypeType();
    }

    /**
     * Create an instance of {@link OrderSiteInfoType }
     * 
     */
    public OrderSiteInfoType createOrderSiteInfoType() {
        return new OrderSiteInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EventsRequest")
    public JAXBElement<EventsRequestType> createEventsRequest(EventsRequestType value) {
        return new JAXBElement<EventsRequestType>(_EventsRequest_QNAME, EventsRequestType.class, null, value);
    }

}
