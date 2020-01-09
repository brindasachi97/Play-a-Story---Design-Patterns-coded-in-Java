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

/* Abstract Builder extended by Human_BuilderA, Human_BuilderB and Monster_Builder */
public abstract class AbstractBuilder {

    protected String name;
    protected HairColor hairColor;
    protected Armor armor;
    protected Shoe shoe;
    protected Weapon weapon;

    public abstract AbstractBuilder withHairColor(HairColor hairColor);
    public abstract AbstractBuilder withArmor(Armor armor);
    public abstract AbstractBuilder withShoe(Shoe shoe);
    public abstract AbstractBuilder withWeapon(Weapon weapon);

     /* Getter Methods for all the attributes of Character */
    public String getName() {
        return name;
    }
    
    public HairColor getHairColor() {
        return hairColor;
    }

    /**
     * @return the armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * @return the shoe
     */
    public Shoe getShoe() {
        return shoe;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
