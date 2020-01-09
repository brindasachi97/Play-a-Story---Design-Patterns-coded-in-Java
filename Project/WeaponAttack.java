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

/* WeaponAttack is one of the strategies implementing ThiefStrategyIF for Thief's Story */
public class WeaponAttack implements ThiefStrategyIF {

    /*
    c is the character created by the user
    m is the monster created by us the programmers
    
    */
    @Override
    public void battle(CharacterIF c, CharacterIF m) {
        int life = 2; //the chances the user has at choosing an attack
        boolean mlife = true; // this will tell us if the monster is alive or dead
        int ch;
        Scanner s = new Scanner(System.in);
        while (life > 0 && mlife == true) { //while the user has a chance to attack and the monster is alive
            System.out.println("\nWhere do you want to attack?");
            System.out.println("1.Body \n2.Head\n3.Legs");
            System.out.println("\nEnter a number from 1-3");
            ch = s.nextInt();

            if (ch == 2) {
                System.out.println("\nIt's a critical hit");
                mlife = false; //monster dies if it is attacked in the head
            } else {
                System.out.println("\nYou missed.");
                life--; //user's character gets hit
                System.out.println(m.getName() + " attacks. Some of your bones were crushed blocking the attack. You feel like you have one last chance.\n");
            }
        }

        if (mlife == true) {
            System.out.println("The monster gets the better of you. " + m.getName() + " goes for an attack and it pierces your throat.");
            System.out.println("YOU DIED!");
        } else {
            System.out.println("You learned a long time ago that aiming for the head is the right choice.");
            System.out.println("You go for the treasure and grab as much as possible.");
            System.out.println("You make your exit.");
            System.out.println("YOU WIN!");
        }
    }
}
