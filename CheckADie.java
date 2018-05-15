/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkadie;

import java.util.Scanner;

/**
 *
 * @author Rithika
 */
public class CheckADie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int die;
        do{
            System.out.print("enter the value of the die:");
            die=s.nextInt();
            if(die<1 || die>6)
                System.out.println("1-6 are the accepted values");
            
        }while(die<1 || die>6);
        
        
    }
    
}
