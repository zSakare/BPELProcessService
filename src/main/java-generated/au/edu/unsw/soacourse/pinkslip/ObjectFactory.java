
package au.edu.unsw.soacourse.pinkslip;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.edu.unsw.soacourse.pinkslip package. 
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

    private final static QName _PSCheckFault_QNAME = new QName("http://pinkslip.soacourse.unsw.edu.au", "PSCheckFault");
    private final static QName _VehicleAgeFault_QNAME = new QName("http://pinkslip.soacourse.unsw.edu.au", "VehicleAgeFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.edu.unsw.soacourse.pinkslip
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PSCheckRequest }
     * 
     */
    public PSCheckRequest createPSCheckRequest() {
        return new PSCheckRequest();
    }

    /**
     * Create an instance of {@link PSCheckResponse }
     * 
     */
    public PSCheckResponse createPSCheckResponse() {
        return new PSCheckResponse();
    }

    /**
     * Create an instance of {@link ServiceFaultType }
     * 
     */
    public ServiceFaultType createServiceFaultType() {
        return new ServiceFaultType();
    }

    /**
     * Create an instance of {@link VehicleAgeRequest }
     * 
     */
    public VehicleAgeRequest createVehicleAgeRequest() {
        return new VehicleAgeRequest();
    }

    /**
     * Create an instance of {@link VehicleAgeResponse }
     * 
     */
    public VehicleAgeResponse createVehicleAgeResponse() {
        return new VehicleAgeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pinkslip.soacourse.unsw.edu.au", name = "PSCheckFault")
    public JAXBElement<ServiceFaultType> createPSCheckFault(ServiceFaultType value) {
        return new JAXBElement<ServiceFaultType>(_PSCheckFault_QNAME, ServiceFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pinkslip.soacourse.unsw.edu.au", name = "VehicleAgeFault")
    public JAXBElement<ServiceFaultType> createVehicleAgeFault(ServiceFaultType value) {
        return new JAXBElement<ServiceFaultType>(_VehicleAgeFault_QNAME, ServiceFaultType.class, null, value);
    }

}
