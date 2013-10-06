/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataue2client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tobias
 */
public class BigDataUE2Client {

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
            Logger.getLogger(BigDataUE2Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            int number = Integer.parseInt(numberOfThrows);
            System.out.print("Pi ist ca. " + calculatePi(number));
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
    
}
