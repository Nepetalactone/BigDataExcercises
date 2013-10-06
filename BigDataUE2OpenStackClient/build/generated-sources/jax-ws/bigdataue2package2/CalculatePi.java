
package bigdataue2package2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für calculatePi complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="calculatePi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfThrows" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculatePi", propOrder = {
    "numberOfThrows"
})
public class CalculatePi {

    protected double numberOfThrows;

    /**
     * Ruft den Wert der numberOfThrows-Eigenschaft ab.
     * 
     */
    public double getNumberOfThrows() {
        return numberOfThrows;
    }

    /**
     * Legt den Wert der numberOfThrows-Eigenschaft fest.
     * 
     */
    public void setNumberOfThrows(double value) {
        this.numberOfThrows = value;
    }

}
