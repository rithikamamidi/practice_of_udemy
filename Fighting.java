/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighting;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rithika
 */
public class Fighting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.print("Attack points of monster:");
        int monsterAttack=s.nextInt();
        System.out.print("Defense points of monster:");
        int monsterDefense=s.nextInt();
        System.out.print("Damage points of monster:");
        int monsterDamage=s.nextInt();
        System.out.print("Life points of monster:");
        int monsterLife=s.nextInt();
        
        System.out.print("Your attack points:");
        int yourAttack=s.nextInt();
        System.out.print("Your defense points:");
        int yourDefense=s.nextInt();
        System.out.print("Your damage points:");
        int yourDamage=s.nextInt();
        System.out.print("Your life points:");
        int yourLife=s.nextInt();
        
        Random generator=new Random();
        boolean attacker=generator.nextBoolean();
        if(attacker)
        {
            System.out.println("You will attack");
            int dice=generator.nextInt(6)+1+generator.nextInt(6)+1;
            int attackValue=yourAttack+dice;
            System.out.println("Dice values:"+dice);
            System.out.println("Attack value:"+attackValue);
            if(attackValue>monsterDefense)
            {
                System.out.println("Attack successful!");
                monsterLife=monsterLife-yourDamage;
                System.out.println("Remaining monster's life:"+monsterLife);
                
            }
            else
            {
                System.out.println("Attack failed!");
            }         
            
        }
        else
        {
            System.out.println("Monster will attack");
            int dice=generator.nextInt(6)+1+generator.nextInt(6)+1;
            int attackValue=yourAttack+dice;
            System.out.println("Dice values:"+dice);
            System.out.println("Attack value:"+attackValue);
            if(attackValue>yourDefense)
            {
                System.out.println("Attack successful!");
                yourLife=yourLife-monsterDamage;
                System.out.println("Your remaining life:"+yourLife);
                
            }
            else
            {
                System.out.println("Attack failed!");
            }         
        }
        
            
        
        
        
        
        
        
    }
    
}
