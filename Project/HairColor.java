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

/* HairColor for the Character   */
public enum HairColor {

  WHITE, BLONDE, RED, BROWN, BLACK, NONE;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
