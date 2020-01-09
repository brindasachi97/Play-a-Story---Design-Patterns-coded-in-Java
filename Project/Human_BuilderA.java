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
/* Extends AbstractBuilder */
public class Human_BuilderA extends AbstractBuilder { //male

    private HairType hairType;
    private Cap cap;

    /*
     Constructor
     */
    public Human_BuilderA(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name can not be null");
        }
        this.name = name;
    }

     /* Methods for all the attributes of Character */
    @Override
    public Human_BuilderA withHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    @Override
    public Human_BuilderA withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public Human_BuilderA withShoe(Shoe shoe) {
        this.shoe = shoe;
        return this;
    }

    @Override
    public Human_BuilderA withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Human_BuilderA withHairType(HairType hairType) {
        this.hairType = hairType;
        return this;
    }

    public Human_BuilderA withCap(Cap cap) {
        this.cap = cap;
        return this;
    }


    /* Builds Human_CharacterA - A Male character */
    public Human_CharacterA build() {
        return new Human_CharacterA(this);
    }

   
    public HairType getHairType() {
        return hairType;
    }

    public Cap getCap() {
        return cap;
    }

}
