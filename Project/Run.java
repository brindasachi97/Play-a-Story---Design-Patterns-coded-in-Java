/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author brinda
 */

/* Run is one of the strategies implementing warriorStrategyIF for Warrior's Story */
/* Used to perform run opeartion while encountering a monster */
public class Run implements warriorStrategyIF {
    public void fight(){
        System.out.println("You chose to Run");
        System.out.println();
        
        System.out.println("You Ran, You LOST!");
        System.out.println();
        
        System.out.println("Better luck next time!");
        System.out.println("GAME OVER!");
    }
} 
