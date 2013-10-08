/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataue2openstackclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
    
    int number;
    
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
            final int number = Integer.parseInt(numberOfThrows);
            
            final Double[] piValues = {0.0, 0.0, 0.0 };
        
            Thread t1 = new Thread(){
                @Override
                public void run(){
                    piValues[0] = new Double(calculatePi(number));
                }
            };
            
            Thread t2 = new Thread(){
                @Override
                public void run(){
                    piValues[1] = new Double(calculatePi_1(number));
                }
            };
            
            Thread t3 = new Thread(){
                @Override
                public void run(){
                    piValues[2] = new Double(calculatePi_2(number));
                }
            };
        
            t1.start();
            t2.start();
            t3.start();
        
            float i = 0;
            
            while((piValues[0] == 0) || (piValues[1] == 0) || (piValues[2] == 0) ){
                if (i == 10000000){
                    System.out.println("waiting"); //Springt aus unbekannten Gründen nicht aus der Schleife wenn nicht etwas in der Schleife getan wurde
                    i = 0;
                } else {
                    i++;
                }
            }
            
            System.out.println("Ergebnisse der einzelnen Services:\nErster Service: " + piValues[0] 
                    + "\nZweiterService: " + piValues[1] 
                    + "\nDritterService: " + piValues[2] + "\n");
            System.out.println("Pi beträgt: " + (piValues[0] + piValues[0] + piValues[0]) / 3);
            
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

    
