/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boilingexercise;

import java.util.Scanner;

/**
 *
 * @author Rithika
 */
public class BoilingExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the temperature:");
        Scanner s=new Scanner(System.in);
        int temp=s.nextInt();
        if(temp>=100)
            System.out.println("The water is boiling");
        else
            System.out.println("The water is not boiling");
    }
    
}
