/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataue2openstackclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tobias
 */
public class BigDataUE2OpenStackClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Wie oft soll der Monte Carlo Algorithmus ausgeführt werden?");
       
       String numberOfThrows = null;
       
       BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            numberOfThrows = bufferRead.readLine();
        } catch (IOException ex) {
            Logger.getLogger(BigDataUE2OpenStackClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            int number = Integer.parseInt(numberOfThrows);
            double numberFromFirstService = calculatePi(number);
            double numberFromSecondService = calculatePi_1(number);
            double numberFromThirdService = calculatePi_2(number);
            System.out.print("Erster Service berechnete für Pi " + numberFromFirstService + "\n");
            System.out.print("Zweiter Service berechnete für Pi " + numberFromSecondService + "\n");
            System.out.print("Dritter Service berechnete für Pi " + numberFromThirdService + "\n");
            System.out.print("Pi: " + (numberFromFirstService + numberFromSecondService + numberFromThirdService)/3);
        }catch(NumberFormatException e)
        {
            System.out.print("Anzahl ist keine gültige Nummer");
        }
    }

    private static Double calculatePi(double numberOfThrows) {
        bigdataue2package.PiCalculator_Service service = new bigdataue2package.PiCalculator_Service();
        bigdataue2package.PiCalculator port = service.getPiCalculatorPort();
        return port.calculatePi(numberOfThrows);
    }

    private static Double calculatePi_1(double numberOfThrows) {
        bigdataue2package2.PiCalculator_Service service = new bigdataue2package2.PiCalculator_Service();
        bigdataue2package2.PiCalculator port = service.getPiCalculatorPort();
        return port.calculatePi(numberOfThrows);
    }
    
    private static Double calculatePi_2(double numberOfThrows) {
        bigdataue2package3.PiCalculator_Service service = new bigdataue2package3.PiCalculator_Service();
        bigdataue2package3.PiCalculator port = service.getPiCalculatorPort();
        return port.calculatePi(numberOfThrows);
    }    
        
    
}

    
