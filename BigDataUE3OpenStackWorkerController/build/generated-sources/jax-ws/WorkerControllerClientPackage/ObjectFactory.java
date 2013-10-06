
package WorkerControllerClientPackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WorkerControllerClientPackage package. 
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

    private final static QName _CalculatePiResponse_QNAME = new QName("http://BigDataUE2Package/", "calculatePiResponse");
    private final static QName _CalculatePi_QNAME = new QName("http://BigDataUE2Package/", "calculatePi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WorkerControllerClientPackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculatePiResponse }
     * 
     */
    public CalculatePiResponse createCalculatePiResponse() {
        return new CalculatePiResponse();
    }

    /**
     * Create an instance of {@link CalculatePi }
     * 
     */
    public CalculatePi createCalculatePi() {
        return new CalculatePi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatePiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BigDataUE2Package/", name = "calculatePiResponse")
    public JAXBElement<CalculatePiResponse> createCalculatePiResponse(CalculatePiResponse value) {
        return new JAXBElement<CalculatePiResponse>(_CalculatePiResponse_QNAME, CalculatePiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatePi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BigDataUE2Package/", name = "calculatePi")
    public JAXBElement<CalculatePi> createCalculatePi(CalculatePi value) {
        return new JAXBElement<CalculatePi>(_CalculatePi_QNAME, CalculatePi.class, null, value);
    }

}
