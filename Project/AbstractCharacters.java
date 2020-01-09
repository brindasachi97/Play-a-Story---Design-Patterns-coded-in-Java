/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.ArrayList;

/**
 *
 * @author brinda
 */

/* AbstractCharacters is extended by Human_CharacterA, Human_CharacterB and Monster_Character and implements the interface CharacterIF */
/* CharacterIF along with AbstractCharacters (Interface + Abstract Class) is used for implementation of Characters  */
public abstract class AbstractCharacters implements CharacterIF {

    protected String name;
    private ArrayList<String> inventory = new ArrayList<>(); //where the user stores their items
    protected HairColor hairColor;
    protected Armor armor;
    protected Shoe shoe;
    protected Weapon weapon;
    protected int money;

    
    /* Getter Methods for all the attributes of Character */
    @Override
    public String getName() {
        return name;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    /* End of Getter Methods for all the attributes of Character */

    /* Methods for performing few functionalities for the Thief's Story */
    /*
     s is the item the user adds to the inventory
    this will add an item to the user's inventory
    */
    @Override
    public void addItem(String s) {
        inventory.add(s);
    }

    /*
    will show what the character has in thier inventory
    */
    @Override
    public void printInventory() {
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }
    }
    
    /*
    v is the value we are deducting from the character's total amount
    this will take away a certain amount from the characters total amount of money
    */
    @Override
    public void subMoney(int v) {
        money = money - v;
    }

    /**
     * @return the money the user's character has
     */
    @Override
    public int getMoney() {
        return money;
    }

    /**
     * @param s is the item the user chooses
     * searches the inventory for the item the user chooses. returns true if found, false if not.
     */
    @Override
    public boolean searchInventory(String s) {
        for (int i = 0; i < inventory.size(); i++) {
            if (s.equals(inventory.get(i).toLowerCase())) {
                return true;
            } 
        }
        return false;
    }
    /*
    Checks the inventory of the character. returns true if so, otherwise returns false
    */

    @Override
    public boolean InventoryIsEmpty() {
        if (inventory.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
     /* End of Methods for performing few functionalities for the Thief's Story */
    
    /* printCharacter() methods in the Character classes print all the attributes of the character created */
    @Override
    public abstract void printCharacter();
    /*
    name is the new name of the character
    This function would allow the user to change the name.
    */
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
