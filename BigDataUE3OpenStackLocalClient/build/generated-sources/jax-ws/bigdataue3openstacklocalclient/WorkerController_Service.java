
package bigdataue3openstacklocalclient;

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
@WebServiceClient(name = "WorkerController", targetNamespace = "http://WorkerControllerPackage/", wsdlLocation = "http://193.170.32.212:8080/BigDataUE3OpenStackWorkerController/WorkerController?wsdl")
public class WorkerController_Service
    extends Service
{

    private final static URL WORKERCONTROLLER_WSDL_LOCATION;
    private final static WebServiceException WORKERCONTROLLER_EXCEPTION;
    private final static QName WORKERCONTROLLER_QNAME = new QName("http://WorkerControllerPackage/", "WorkerController");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://193.170.32.212:8080/BigDataUE3OpenStackWorkerController/WorkerController?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKERCONTROLLER_WSDL_LOCATION = url;
        WORKERCONTROLLER_EXCEPTION = e;
    }

    public WorkerController_Service() {
        super(__getWsdlLocation(), WORKERCONTROLLER_QNAME);
    }

    public WorkerController_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORKERCONTROLLER_QNAME, features);
    }

    public WorkerController_Service(URL wsdlLocation) {
        super(wsdlLocation, WORKERCONTROLLER_QNAME);
    }

    public WorkerController_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORKERCONTROLLER_QNAME, features);
    }

    public WorkerController_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorkerController_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorkerController
     */
    @WebEndpoint(name = "WorkerControllerPort")
    public WorkerController getWorkerControllerPort() {
        return super.getPort(new QName("http://WorkerControllerPackage/", "WorkerControllerPort"), WorkerController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkerController
     */
    @WebEndpoint(name = "WorkerControllerPort")
    public WorkerController getWorkerControllerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WorkerControllerPackage/", "WorkerControllerPort"), WorkerController.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKERCONTROLLER_EXCEPTION!= null) {
            throw WORKERCONTROLLER_EXCEPTION;
        }
        return WORKERCONTROLLER_WSDL_LOCATION;
    }

}
