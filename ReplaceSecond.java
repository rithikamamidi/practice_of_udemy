/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacesecond;

/**
 *
 * @author Rithika
 */
public class ReplaceSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
      
        int first=7,second=19,third;
        System.out.println("Before swap");
        System.out.println("first value:"+first+" second value:"+second);
        third=first;
        first=second;
        second=third;
        System.out.println("After swap");
        System.out.println("first value:"+first+" second value:"+second);
        
        
    }
    
}
