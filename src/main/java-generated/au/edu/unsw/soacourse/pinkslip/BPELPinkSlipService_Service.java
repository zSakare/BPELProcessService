package au.edu.unsw.soacourse.pinkslip;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-05-27T02:22:00.975+10:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "BPELPinkSlipService", 
                  wsdlLocation = "file:/D:/Luna%20Eclipse%20WS/BPELProcessService/src/main/resources/wsdl/BPELPinkSlipService.wsdl",
                  targetNamespace = "http://pinkslip.soacourse.unsw.edu.au") 
public class BPELPinkSlipService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://pinkslip.soacourse.unsw.edu.au", "BPELPinkSlipService");
    public final static QName BPELPinkSlipServiceSOAP = new QName("http://pinkslip.soacourse.unsw.edu.au", "BPELPinkSlipServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Luna%20Eclipse%20WS/BPELProcessService/src/main/resources/wsdl/BPELPinkSlipService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BPELPinkSlipService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Luna%20Eclipse%20WS/BPELProcessService/src/main/resources/wsdl/BPELPinkSlipService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BPELPinkSlipService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BPELPinkSlipService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BPELPinkSlipService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BPELPinkSlipService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BPELPinkSlipService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BPELPinkSlipService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns BPELPinkSlipService
     */
    @WebEndpoint(name = "BPELPinkSlipServiceSOAP")
    public BPELPinkSlipService getBPELPinkSlipServiceSOAP() {
        return super.getPort(BPELPinkSlipServiceSOAP, BPELPinkSlipService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELPinkSlipService
     */
    @WebEndpoint(name = "BPELPinkSlipServiceSOAP")
    public BPELPinkSlipService getBPELPinkSlipServiceSOAP(WebServiceFeature... features) {
        return super.getPort(BPELPinkSlipServiceSOAP, BPELPinkSlipService.class, features);
    }

}
