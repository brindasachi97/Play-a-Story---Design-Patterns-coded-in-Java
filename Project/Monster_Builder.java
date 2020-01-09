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

/* Monster_Builder builds Monster_Character */
 /* Extends AbstractBuilder */
public class Monster_Builder extends AbstractBuilder {

    protected String appearance;
    protected String weakness;

    /*
    Constructor
    */
    public Monster_Builder(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name can not be null");
        }
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getWeakness() {
        return weakness;
    }

    public Monster_Builder withAppearance(String appearance) {
        this.appearance = appearance;
        return this;
    }

    public Monster_Builder withWeakness(String weakness) {
        this.weakness = weakness;
        return this;
    }

    @Override
    public Monster_Builder withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public Monster_Builder withShoe(Shoe shoe) {
        this.shoe = shoe;
        return this;

    }

    @Override
    public Monster_Builder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;

    }

    @Override
    public Monster_Builder withHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    /* Builds Monster_Character */
    public Monster_Character build() {
        return new Monster_Character(this);
    }

}
