/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.Scanner;

/**
 *
 * @author josequirarte
 */

/* useItem is one of the strategies implementing ThiefStrategyIF for Thief's Story */
public class useItem implements ThiefStrategyIF{

    /*
    c is the charcater the user created
    m is the monster we, the programmers created
    
    */
    @Override
    public void battle(CharacterIF c, CharacterIF m) {
        c.printInventory();
        System.out.println("Enter the name of the item you would like to use: ");
        Scanner s = new Scanner(System.in);
        String ch = s.nextLine();
        ch = ch.toLowerCase();
        
        //We want to make sure the user inputs what they have in thier inventory
       while (false == c.searchInventory(ch)){
           System.out.println("Thats not in your inventory. Try again.");
           ch = s.nextLine();
           }
           if(!ch.equals(m.getWeakness().toLowerCase())){ //we use lower case so that way the user doesn't have to match exactly
               System.out.println("Item was ineffective");
               System.out.println("You took too much time and now the " + m.getName() +" lunges at you.");
               System.out.println("The attack pierces your heart.");
               System.out.println("YOU DIED");
           }
           //the following describes the scenarios for each monster
           else if("Werewolf".equals(m.getName())){
               System.out.println("You throw the silver throwing dagger right between the eyes of the werewolf.");
               System.out.println("The Werewolf howls in pain. It struggles until finally it slumps to floor.");
               System.out.println("You rush towards the treasure behind it.\nYou take what you can and make your escape.");
               System.out.println("You successfully took the treasure! \nYOU WIN!");    
           }
           else if("Hulk".equals(m.getName())){
               System.out.println("You pop the smoke bomb in front of the Hulk.\n He flails around because his vision was poor to start.");
               System.out.println("You carefully walk around the monstrosity until you reach the treasure. \nYou take what you can get and get out of there.");
               System.out.println("You get out of there, only hearing the smashin of walls behind you.");
               System.out.println("You successfully took the treasure! \nYOU WIN!");
           }
           else{
               System.out.println("You throw the vial of holy water at the Zombie. You see it wretch in pain as it is consumed in flames.");
               System.out.println("You watch as it liquefies into a puddle of black goop. \nYou worry for a second about breatheing in the smoke coming from what use to be a zombie.");
               System.out.println("You take a couple of seconds and realize your worries were unfounded.\nYou hop over the puddle and get to the treasure.");
               System.out.println("You everything possible and rush out of there.");
               System.out.println("You successfully took the treasure! \nYOU WIN!");     
           }
    }
    
}
