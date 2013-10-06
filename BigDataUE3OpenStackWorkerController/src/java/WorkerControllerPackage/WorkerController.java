/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkerControllerPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tobias
 */
@WebService(serviceName = "WorkerController")
public class WorkerController {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "startCalculation")
    public Double startCalculation(@WebParam(name = "numberOfThrows") double numberOfThrows) {
        
        //return 400.00;
        
        return calculatePi(numberOfThrows);
    }

    private static Double calculatePi(double numberOfThrows) {
        WorkerControllerClientPackage.PiCalculator_Service service = new WorkerControllerClientPackage.PiCalculator_Service();
        WorkerControllerClientPackage.PiCalculator port = service.getPiCalculatorPort();
        return port.calculatePi(numberOfThrows);
    }
}
