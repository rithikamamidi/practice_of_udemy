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
public class Fighting02_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean runaway=false;
        String monsterName;
        Random generator=new Random();
        int num=generator.nextInt(3);
        switch(num)
        {
            case 0:monsterName="White Walker";
            break;
            case 1: monsterName="Death Eater";
            break;
            case 2:monsterName="Night King";
            break;
            default:monsterName="NA";
            break;
        }
        Scanner s=new Scanner(System.in);
        System.out.print("Attack points of "+monsterName+":");
        int monsterAttack=generator.nextInt(3)+3;
        System.out.println(monsterAttack);
        System.out.print("Defense points of "+monsterName+":");
        int monsterDefense=generator.nextInt(10)+5;
        System.out.println(monsterDefense);
        System.out.print("Damage points of "+monsterName+":");
        int monsterDamage=generator.nextInt(3)+7;
        System.out.println(monsterDamage);
        System.out.print("Life points of "+monsterName+":");
        int monsterLife=generator.nextInt(20)+15;
        System.out.println(monsterLife);
        
        System.out.print("Your attack points:");
        int yourAttack=generator.nextInt(3)+5;
        System.out.println(yourAttack);
        System.out.print("Your defense points:");
        int yourDefense=generator.nextInt(10)+7;
        System.out.println(yourDefense);
        System.out.print("Your damage points:");
        int yourDamage=generator.nextInt(3)+8;
        System.out.println(yourDamage);
        System.out.print("Your life points:");
        int yourLife=generator.nextInt(20)+25;
        System.out.println(yourLife);
        
        
        do{
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
                    System.out.println(monsterName+"'s remaining life:"+monsterLife);

                }
                else
                {
                    System.out.println("Attack failed!");
                }         

            }
            else
            {
                System.out.println(""+monsterName+" will attack");
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
            System.out.println("press Enter to continue or 'run' to run away:");
            String command=s.nextLine();
            switch(command)
            {
                case "run":
                    System.out.println("You ran away.you lose 4 life points.");
                    yourLife=yourLife-4;
                    runaway=true;
                    break;
                default:
                    
                    
            }
        }while(monsterLife>0 && yourLife>0 && !runaway );
        if(yourLife<=0)
            System.out.println(""+monsterName+" won");
        if(monsterLife<=0)
            System.out.println("You won");
        
            
        
        
        
        
        
        
    }
        
    
}
