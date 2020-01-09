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

/* CharacterIF along with AbstractCharacters (Interface + Abstract Class) is used for implementation of Characters  */
public interface CharacterIF {
    public void printCharacter();   
    public void setName(String name);
    public String getName();
    public void addItem(String s);
    public void printInventory();
    public int getMoney();
    public void subMoney(int v);
    /**
     * @param s
     * @return the inventory
     */
    public boolean searchInventory(String s);
    public String getWeakness();
    public boolean InventoryIsEmpty();
}