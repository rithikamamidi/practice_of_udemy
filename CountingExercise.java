/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingexercise;

import java.util.Random;

/**
 *
 * @author Rithika
 */
public class CountingExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generator=new Random();
        int die=generator.nextInt(6)+1;
        int count=0;
        while(die!=6)
        {
            count++;
            System.out.println(die+" value is rolled");
            die=generator.nextInt(6)+1;
        }
        System.out.println(count+" number of times the die had to be rolled to get 6");
        
        
   
    }
    
}
