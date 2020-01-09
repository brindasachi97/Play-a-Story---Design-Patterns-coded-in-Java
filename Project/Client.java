/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.BufferedReader;

/**
 *
 * @author brinda
 */

/* The Main Driver Class Client */
 /* Calls the method begin() to enable single instance that coordinates actions across the entire system */

 /* Flow of the Application 

Build/create Characters - can create characters specific to a gender
Once characters built, tell 3 stories - thief, mage and warrior
Each story is like a separate game which the character plays
Monsters are created in every story that interfere with the Characters
The Characters play the game in every story and finally win/lose based on how they fare in every step
Finally, the game is over

 */

public class Client {

    private static Game use;

    public static void main(String[] args) {

        use = Game.getInstance("Steve");
        use.begin();

    }
}
