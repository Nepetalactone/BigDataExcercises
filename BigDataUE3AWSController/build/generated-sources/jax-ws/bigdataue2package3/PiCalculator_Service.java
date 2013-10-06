
package bigdataue2package3;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PiCalculator", targetNamespace = "http://BigDataUE2Package/", wsdlLocation = "http://ec2-54-229-160-219.eu-west-1.compute.amazonaws.com/PiCalculator?wsdl")
public class PiCalculator_Service
    extends Service
{

    private final static URL PICALCULATOR_WSDL_LOCATION;
    private final static WebServiceException PICALCULATOR_EXCEPTION;
    private final static QName PICALCULATOR_QNAME = new QName("http://BigDataUE2Package/", "PiCalculator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ec2-54-229-160-219.eu-west-1.compute.amazonaws.com/PiCalculator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PICALCULATOR_WSDL_LOCATION = url;
        PICALCULATOR_EXCEPTION = e;
    }

    public PiCalculator_Service() {
        super(__getWsdlLocation(), PICALCULATOR_QNAME);
    }

    public PiCalculator_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PICALCULATOR_QNAME, features);
    }

    public PiCalculator_Service(URL wsdlLocation) {
        super(wsdlLocation, PICALCULATOR_QNAME);
    }

    public PiCalculator_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PICALCULATOR_QNAME, features);
    }

    public PiCalculator_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PiCalculator_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PiCalculator
     */
    @WebEndpoint(name = "PiCalculatorPort")
    public PiCalculator getPiCalculatorPort() {
        return super.getPort(new QName("http://BigDataUE2Package/", "PiCalculatorPort"), PiCalculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PiCalculator
     */
    @WebEndpoint(name = "PiCalculatorPort")
    public PiCalculator getPiCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://BigDataUE2Package/", "PiCalculatorPort"), PiCalculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PICALCULATOR_EXCEPTION!= null) {
            throw PICALCULATOR_EXCEPTION;
        }
        return PICALCULATOR_WSDL_LOCATION;
    }

}
