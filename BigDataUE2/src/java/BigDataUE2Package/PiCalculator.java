/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BigDataUE2Package;

import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tobias
 */
@WebService(serviceName = "PiCalculator")
public class PiCalculator {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calculatePi")
    public Double calculatePi(@WebParam(name = "numberOfThrows") double numberOfThrows) {
        
        double hits = 0;
        Random randNumGenerator = new Random();
        double x;
        double y;
        
        for (int i = 0; i < numberOfThrows; i++){
            x = randNumGenerator.nextDouble();
            y = randNumGenerator.nextDouble();
            
            if (isInCircle(x, y) == true){
                hits++;
            }
        }
        return ((4*hits)/numberOfThrows);
    }
    
    private boolean isInCircle(double x, double y){
        
        if ((x*x) + (y*y) <= 1){
            return true;
        }else{
            return false;
        }
    }
}
