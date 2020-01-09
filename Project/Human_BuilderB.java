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
/* Extends AbstractBuilder */
public class Human_BuilderB extends AbstractBuilder { //female

    private HairStyle hairStyle;
    private HairBand hairBand;

    /*
    Constructor
    */
    public Human_BuilderB(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name can not be null");
        }
        this.name = name;
    }

     /* Methods for all the attributes of Character */
    @Override
    public Human_BuilderB withHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    @Override
    public Human_BuilderB withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public Human_BuilderB withShoe(Shoe shoe) {
        this.shoe = shoe;
        return this;
    }

    @Override
    public Human_BuilderB withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Human_BuilderB withHairStyle(HairStyle hairStyle) {
        this.hairStyle = hairStyle;
        return this;
    }

    public Human_BuilderB withHairBand(HairBand hairBand) {
        this.hairBand = hairBand;
        return this;
    }

    /* Builds Human_CharacterB - A Female Character */
    public Human_CharacterB build() {
        return new Human_CharacterB(this);
    }

    
    public HairStyle getHairStyle() {
        return hairStyle;
    }

    public HairBand getHairBand() {
        return hairBand;
    }

}
