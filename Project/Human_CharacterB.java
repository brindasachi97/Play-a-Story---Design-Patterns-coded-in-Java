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

/* HumanBuilderB builds Human_CharacterB - A Female Character */
/* Extends AbstrcatCharacters */
public class Human_CharacterB extends AbstractCharacters implements Female { //female

    protected HairStyle hairStyle;
    protected HairBand hairBand;

    /*
    Constructor
    */
    public Human_CharacterB(Human_BuilderB builder) {

        this.name = builder.getName();
        this.hairColor = builder.getHairColor();
        this.armor = builder.getArmor();
        this.shoe = builder.getShoe();
        this.weapon = builder.getWeapon();
        this.hairStyle = builder.getHairStyle();
        this.hairBand = builder.getHairBand();
        money = 150;
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     /* printCharacter() methods in the Character classes print all the attributes of the character created */
    @Override
    public void printCharacter() {
        System.out.println("Human Name: " + name);
        System.out.println("Hair Color: " + hairColor.toString());
        System.out.println("Armor: " + armor.toString());
        System.out.println("Shoe: " + shoe.toString());
        System.out.println("HairStyle: " + hairStyle.toString());
        System.out.println("HairBand: " + hairBand.toString());
        System.out.println("Weapon: " + weapon.toString());

    }

    @Override
    public String getWeakness() {
        return "None";
    }

}
