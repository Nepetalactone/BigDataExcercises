
package bigdataue3openstacklocalclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bigdataue3openstacklocalclient package. 
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

    private final static QName _StartCalculation_QNAME = new QName("http://WorkerControllerPackage/", "startCalculation");
    private final static QName _StartCalculationResponse_QNAME = new QName("http://WorkerControllerPackage/", "startCalculationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bigdataue3openstacklocalclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartCalculation }
     * 
     */
    public StartCalculation createStartCalculation() {
        return new StartCalculation();
    }

    /**
     * Create an instance of {@link StartCalculationResponse }
     * 
     */
    public StartCalculationResponse createStartCalculationResponse() {
        return new StartCalculationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartCalculation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WorkerControllerPackage/", name = "startCalculation")
    public JAXBElement<StartCalculation> createStartCalculation(StartCalculation value) {
        return new JAXBElement<StartCalculation>(_StartCalculation_QNAME, StartCalculation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartCalculationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WorkerControllerPackage/", name = "startCalculationResponse")
    public JAXBElement<StartCalculationResponse> createStartCalculationResponse(StartCalculationResponse value) {
        return new JAXBElement<StartCalculationResponse>(_StartCalculationResponse_QNAME, StartCalculationResponse.class, null, value);
    }

}
