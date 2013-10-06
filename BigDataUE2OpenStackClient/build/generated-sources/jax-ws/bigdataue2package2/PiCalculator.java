
package bigdataue2package2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PiCalculator", targetNamespace = "http://BigDataUE2Package/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PiCalculator {


    /**
     * 
     * @param numberOfThrows
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calculatePi", targetNamespace = "http://BigDataUE2Package/", className = "bigdataue2package2.CalculatePi")
    @ResponseWrapper(localName = "calculatePiResponse", targetNamespace = "http://BigDataUE2Package/", className = "bigdataue2package2.CalculatePiResponse")
    @Action(input = "http://BigDataUE2Package/PiCalculator/calculatePiRequest", output = "http://BigDataUE2Package/PiCalculator/calculatePiResponse")
    public Double calculatePi(
        @WebParam(name = "numberOfThrows", targetNamespace = "")
        double numberOfThrows);

}
