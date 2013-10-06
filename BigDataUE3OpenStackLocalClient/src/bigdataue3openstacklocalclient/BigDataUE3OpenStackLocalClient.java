/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataue3openstacklocalclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tobias
 */
public class BigDataUE3OpenStackLocalClient {

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
            Logger.getLogger(BigDataUE3OpenStackLocalClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            int number = Integer.parseInt(numberOfThrows);
            System.out.print("Pi ist ca. " + startCalculation(number));
        }catch(NumberFormatException e)
        {
            System.out.print("Anzahl ist keine gültige Nummer");
        }
    }

    private static Double startCalculation(double numberOfThrows) {
        bigdataue3openstacklocalclient.WorkerController_Service service = new bigdataue3openstacklocalclient.WorkerController_Service();
        bigdataue3openstacklocalclient.WorkerController port = service.getWorkerControllerPort();
        return port.startCalculation(numberOfThrows);
    }
}
