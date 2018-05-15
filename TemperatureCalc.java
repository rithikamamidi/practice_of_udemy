/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturecalc;

import java.util.Scanner;

/**
 *
 * @author Rithika
 */
public class TemperatureCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the celcius value:");
        Scanner s=new Scanner(System.in);
        double celciusValue=s.nextDouble();
        double fahrenheitValue=((9.0/5.0)*celciusValue)+32.0;
        double fahrenheit=((9/5)*celciusValue)+32;
        System.out.println("Fahrenheit value:"+fahrenheitValue);
        System.out.println("Fahrenheit value for inetegers:"+fahrenheit);
        
    }
    
}
