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

/* HumanBuilderA builds Human_CharacterA - A Male Character */
/* Extends AbstrcatCharacters */
public class Human_CharacterA extends AbstractCharacters { //male

    protected HairType hairType;
    protected Cap cap;

    /*
    Constructor
    */
    public Human_CharacterA(Human_BuilderA builder) {
        this.name = builder.getName();
        this.hairColor = builder.getHairColor();
        this.armor = builder.getArmor();
        this.shoe = builder.getShoe();
        this.weapon = builder.getWeapon();
        this.hairType = builder.getHairType();
        this.cap = builder.getCap();
        money = 150;
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

     /* printCharacter() method prints all the attributes of the character created */
    @Override
    public void printCharacter() {
        System.out.println("Human Characer Name: " + name);
        System.out.println("Hair Color: " + hairColor.toString());
        System.out.println("Armor: " + armor.toString());
        System.out.println("Shoe: " + shoe.toString());
        System.out.println("Weapon: " + weapon.toString());
        System.out.println("HairType: " + hairType.toString());
        System.out.println("Cap: " + cap.toString());

    }

    @Override
    public String getWeakness() {
        return "None";
    }

}
