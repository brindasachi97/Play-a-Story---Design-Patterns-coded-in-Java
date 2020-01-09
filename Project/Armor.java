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

/* Armor for the Character */
public enum Armor {

  CLOTHES("clothes"), LEATHER("leather"), FUR("fur"), SILK("silk"), NONE("none");

  private String title;

  Armor(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}