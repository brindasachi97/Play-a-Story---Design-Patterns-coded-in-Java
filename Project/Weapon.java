/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.util.HashMap; 
import java.util.Map; 
/**
 *
 * @author brinda
 */

/* Weapon for the Character   */
public enum Weapon {

  HAMMER, AXE, GUN, SWORD, BLADE, REVOLVER, CHAIN_SAW, NONE;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}