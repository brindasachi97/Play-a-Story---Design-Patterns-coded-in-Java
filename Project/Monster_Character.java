/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.Scanner;

/**
 *
 * @author brinda
 */

/* Monster_Builder builds Monster_Character */
 /* Extends AbstractCharacters */
public class Monster_Character extends AbstractCharacters {

    protected String appearance;
    protected String weakness;

    /*
    Constructor
    */
    public Monster_Character(Monster_Builder builder) {

        this.name = builder.getName();
        this.hairColor = builder.getHairColor();

        this.armor = builder.getArmor();
        this.shoe = builder.getShoe();
        this.weapon = builder.getWeapon();
        this.weakness = builder.getWeakness();
        this.appearance = builder.getAppearance();
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

     /* printCharacter() methods in the Character classes print all the attributes of the character created */
    @Override
    public void printCharacter() {
        System.out.println("Monster Name: " + name);
        System.out.println("Hair Color: " + hairColor.toString());
        System.out.println("Armor: " + armor.toString());
        System.out.println("Shoe: " + shoe.toString());
        System.out.println("Weapon: " + weapon.toString());
        System.out.println("Appearance: " + appearance);
        System.out.println("Weakness: " + weakness);
    }

   /*
    returns the weakness of the monster
    */ 
    @Override
    public String getWeakness() {
        return weakness;
    }

}
