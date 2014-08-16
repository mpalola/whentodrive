package com.gofore.sujuvuus.schemas;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-08-16T19:46:58.048+03:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebServiceClient(name = "TrafficFluencyService", 
                  wsdlLocation = "http://open.digitraffic.fi/services/trafficFluency?wsdl",
                  targetNamespace = "http://www.gofore.com/sujuvuus/schemas") 
public class TrafficFluencyService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.gofore.com/sujuvuus/schemas", "TrafficFluencyService");
    public final static QName TrafficFluencyPort = new QName("http://www.gofore.com/sujuvuus/schemas", "TrafficFluencyPort");
    static {
        URL url = null;
        try {
            url = new URL("http://open.digitraffic.fi/services/trafficFluency?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TrafficFluencyService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://open.digitraffic.fi/services/trafficFluency?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TrafficFluencyService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TrafficFluencyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrafficFluencyService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TrafficFluencyService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TrafficFluencyService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TrafficFluencyService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns TrafficFluencyPort
     */
    @WebEndpoint(name = "TrafficFluencyPort")
    public TrafficFluencyPort getTrafficFluencyPort() {
        return super.getPort(TrafficFluencyPort, TrafficFluencyPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrafficFluencyPort
     */
    @WebEndpoint(name = "TrafficFluencyPort")
    public TrafficFluencyPort getTrafficFluencyPort(WebServiceFeature... features) {
        return super.getPort(TrafficFluencyPort, TrafficFluencyPort.class, features);
    }

}
