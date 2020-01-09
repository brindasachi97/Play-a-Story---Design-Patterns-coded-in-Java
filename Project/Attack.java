/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.util.Random;
/**
 *
 * @author brinda
 */

/* Attack is one of the strategies implementing warriorStrategyIF for Warrior's Story */
/* Used to perform attack opeartion while encountering a monster */
public class Attack implements warriorStrategyIF {
    public void fight(){
        
        System.out.println("You chose to Attack");
        System.out.println();
        
        System.out.println("You attacked, You are fighting the monster");
        System.out.println();
        
        /* Randomly choose from the set of options during run time */
        String [] s = {"You killed the Monster, Well Done, You WON!", "You got killed by the monster, You LOST!", "You are a strong warrior, your attack scared away the monster, Well Done, You WON!"};
        System.out.println();
        
        Random ran = new Random();
        String s_ran = s[ran.nextInt(s.length)];
        System.out.println(s_ran);
        
        System.out.println("GAME OVER!");
    }
}  