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

/* TrickB is one of the strategies implementing mageStrategyIF for Mage's Story */
/* Used to perform a mage's trick */
public class TrickB implements mageStrategyIF {
    public void magic(){
        System.out.println("You are performing Trick B");
        System.out.println();
        
        System.out.println("You are still performing the Trick B");
        System.out.println();
        
        /* Randomly choose from the set of options during run time */
        String [] t = {"Your trick worked, the monster got locked, you WON!", "Your trick did not work, the monster killed you, you LOST!", "Your trick worked, the monster got killed, you WON!"};
        System.out.println();
        Random ran = new Random();
        String t_ran = t[ran.nextInt(t.length)];
        System.out.println(t_ran);
        
     System.out.println("GAME OVER");

    }
}
