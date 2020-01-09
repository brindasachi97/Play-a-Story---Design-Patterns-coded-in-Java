/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brinda
 */

/* The class which makes use of Singleton pattern to have only one object instance that coordinates actions across the entire system */  
public class Game {

    public String n;
    private static Game managerInstance = null;

    private Game(String s) {
        n = s;
    }

    public static Game getInstance(String s) {
        if (managerInstance == null) {
            managerInstance = new Game(s);
        }
        return managerInstance;
    }

    /* The main method which enables single instance to be used, all methods happen in this method */
    public void begin(){

        /* Choose Name, Gender and other attributes for the character */
        System.out.println("Choose a Name:");

        Scanner g = new Scanner(System.in);
        String choice = g.nextLine();
        System.out.println();

        System.out.println("Choose a gender: Male or Female");

        String ch = g.nextLine();
        ch = ch.toLowerCase();
        
        while(!"male".equals(ch) && !"female".equals(ch)){ //will make sure the enters the correct input
            System.out.println("Try again. Enter male or female.");
            ch = g.nextLine();
        }
        System.out.println();

        CharacterIF c1; //the character object before it's built

        System.out.println("Choose your hair color choice: ");
        System.out.println("White");
        System.out.println("Blonde");
        System.out.println("Red");
        System.out.println("Brown");
        System.out.println("Black");
        System.out.println("None");
        System.out.println();
        

        String hairColorChoice = g.nextLine();
        hairColorChoice = hairColorChoice.toUpperCase();
        
        //the following will make sure the user enters a correct input
        while (!"WHITE".equals(hairColorChoice) && !"BLONDE".equals(hairColorChoice) && !"RED".equals(hairColorChoice) &&!"BROWN".equals(hairColorChoice) && !"BLACK".equals(hairColorChoice) && !"NONE".equals(hairColorChoice)) {
            System.out.println("Invalid input. Pick one from the list above.");
            hairColorChoice = g.nextLine();
            hairColorChoice = hairColorChoice.toUpperCase();
        }
        
        System.out.println("Choose a armor choice: ");
        System.out.println("Clothes");
        System.out.println("Leather");
        System.out.println("Fur");
        System.out.println("Silk");
        System.out.println("None");
        System.out.println();

        String armorChoice = g.nextLine();
        armorChoice = armorChoice.toUpperCase();
        
        //the following will make sure the user enters a correct input
         while (!"CLOTHES".equals(armorChoice) && !"LEATHER".equals(armorChoice) && !"FUR".equals(armorChoice) && !"SILK".equals(armorChoice) && !"NONE".equals(armorChoice)) {
            System.out.println("Invalid input. Pick one from the list above.");
            armorChoice = g.nextLine();
            armorChoice = armorChoice.toUpperCase();
        }

        System.out.println("Choose a shoe color: ");
        System.out.println("White");
        System.out.println("Yellow");
        System.out.println("Red");
        System.out.println("Brown");
        System.out.println("Black");
        System.out.println("None");
        System.out.println();

        String shoeChoice = g.nextLine();
        shoeChoice = shoeChoice.toUpperCase();
        
        //makes sure the character enters the correct input
         while (!"WHITE".equals(shoeChoice) && !"YELLOW".equals(shoeChoice) && !"RED".equals(shoeChoice) && !"BROWN".equals(shoeChoice) && !"BLACK".equals(shoeChoice) && !"NONE".equals(shoeChoice)) {
            System.out.println("Invalid input. Pick one from the list above.");
            shoeChoice = g.nextLine();
            shoeChoice = shoeChoice.toUpperCase();
        }

        System.out.println("Choose a Weapon: ");
        System.out.println("Hammer");
        System.out.println("Axe");
        System.out.println("Chain_Saw");
        System.out.println("Gun");
        System.out.println("Sword");
        System.out.println("Blade");
        System.out.println("Revolver");
        System.out.println("None");

        System.out.println();

        String weaponChoice = g.nextLine();
        weaponChoice = weaponChoice.toUpperCase();
        
        //the following makes suret he user enters the correct choice
         while (!"HAMMER".equals(weaponChoice) && !"AXE".equals(weaponChoice) && !"CHAIN_SAW".equals(weaponChoice) && !"GUN".equals(weaponChoice) && !"SWORD".equals(weaponChoice) && !"BLADE".equals(weaponChoice) && !"REVOLVER".equals(weaponChoice) && !"NONE".equals(weaponChoice)) {
            System.out.println("Invalid input. Pick one from the list above.");
            weaponChoice = g.nextLine();
            weaponChoice = weaponChoice.toUpperCase();
        }
        
        /* If it is a female charcater, choose specific attributes Hair Style and Hair Band */
        if (ch.equals("female")) {
            System.out.println("Choose a Hair Style: ");
            System.out.println("Curly");
            System.out.println("Straight");
            System.out.println("Wavy");
            System.out.println("None");
            System.out.println();

            String hairStyleChoice = g.nextLine();
            hairStyleChoice = hairStyleChoice.toUpperCase();
            
            //the following makes sure the user enters the correct choice
            while (!"CURLY".equals(hairStyleChoice) && !"STRAIGHT".equals(hairStyleChoice) && !"WAVY".equals(hairStyleChoice) && !"NONE".equals(hairStyleChoice)) {
                System.out.println("Invalid input. Pick one from the list above.");
                hairStyleChoice = g.nextLine();
                hairStyleChoice = hairStyleChoice.toUpperCase();
            }

            System.out.println("Choose a Hair Band: ");
            System.out.println("White");
            System.out.println("Yellow");
            System.out.println("Red");
            System.out.println("Brown");
            System.out.println("Black");
            System.out.println("None");
            System.out.println();

            String hairBandChoice = g.nextLine();
            hairBandChoice = hairBandChoice.toUpperCase();
            
            //the following makes sure the user enters the correct choice
            while (!"WHITE".equals(hairBandChoice) && !"YELLOW".equals(hairBandChoice) && !"RED".equals(hairBandChoice) && !"BROWN".equals(hairBandChoice) && !"BROWN".equals(hairBandChoice) && !"Black".equals(hairBandChoice) && !"NONE".equals(hairBandChoice)) {
                System.out.println("Invalid input. Pick one from the list above.");
                hairBandChoice = g.nextLine();
                hairBandChoice = hairBandChoice.toUpperCase();
            }

            c1 = new Human_BuilderB(choice).withHairColor(HairColor.valueOf(hairColorChoice)).withShoe(Shoe.valueOf(shoeChoice)).withArmor(Armor.valueOf(armorChoice)).withHairStyle(HairStyle.valueOf(hairStyleChoice)).withHairBand(HairBand.valueOf(hairBandChoice)).withWeapon(Weapon.valueOf(weaponChoice)).build();
            c1.printCharacter();
        }
        
         /* If it is a male character, choose specific attributes Hair Type and Cap */
        else {

            System.out.println("Choose a Hair Type: ");
            System.out.println("Spiked");
            System.out.println("Gel");
            System.out.println("None");
            System.out.println();

            String hairTypeChoice = g.nextLine();
            hairTypeChoice = hairTypeChoice.toUpperCase();
            
            //the following makes sure the user enters the correct input
             while (!"SPIKED".equals(hairTypeChoice) && !"GEL".equals(hairTypeChoice)  && !"NONE".equals(hairTypeChoice)) {
                System.out.println("Invalid input. Pick one from the list above.");
                hairTypeChoice = g.nextLine();
                hairTypeChoice = hairTypeChoice.toUpperCase();
            }

            System.out.println("Choose a Cap: ");
            System.out.println("Blue");
            System.out.println("Yellow");
            System.out.println("Red");
            System.out.println("Brown");
            System.out.println("Black");
            System.out.println("None");
            System.out.println();

            String capChoice = g.nextLine();
            capChoice = capChoice.toUpperCase();
            
            //the following makes sure the user enters the correct choice
            while (!"BLUE".equals(capChoice) && !"YELLOW".equals(capChoice) && !"RED".equals(capChoice) && !"BROWN".equals(capChoice) && !"BROWN".equals(capChoice) && !"Black".equals(capChoice) && !"NONE".equals(capChoice)) {
                System.out.println("Invalid input. Pick one from the list above.");
                capChoice = g.nextLine();
                capChoice = capChoice.toUpperCase();
            }

            //since the user entered male character we use Human_BuilderA to make a male character object
            c1 = new Human_BuilderA(choice).withHairColor(HairColor.valueOf(hairColorChoice)).withShoe(Shoe.valueOf(shoeChoice)).withArmor(Armor.valueOf(armorChoice)).withCap(Cap.valueOf(capChoice)).withHairType(HairType.valueOf(hairTypeChoice)).withWeapon(Weapon.valueOf(weaponChoice)).build();

            System.out.println();
            c1.printCharacter();
        } 
        
        System.out.println();
        
        /* Once the characters are built, letting the user choose a story of interest */
        System.out.println("Choose your Story: (Enter a number)");
        System.out.println("1. Thief");
        System.out.println("2. Mage");
        System.out.println("3. Warrior");
        System.out.println();

        int storyChoice = g.nextInt();
        while(storyChoice <= 0 || storyChoice >=4){
            System.out.println("Invalid input. Enter 1, 2, or 3.");
            storyChoice = g.nextInt();
        }
        
        switch (storyChoice) {
            case 1:
                thief(c1);
                break;
            case 2:
                mage(c1);
                break;
            default:
                warrior(c1);
        }
    }
    
    /* Story 1 - Thief */
    public void thief(CharacterIF c){
        System.out.print("\nYou are " + c.getName() + " a ");
        /* Making use of Marker Interface Female */
        if (c instanceof Female) {
            System.out.print("female ");
        } else {
            System.out.print("male ");
        }
      
        System.out.println("thief tasked to rob the local baron's mansion.");
        System.out.println("You've heard this baron is very paranoid and has heavily guarded their fortune.");
        System.out.println("There are even rumors of how vicious this baron can be to theives who get caught.");
        System.out.println("Will you still try to steal their treasure? \nType out your response:");
        System.out.println("\nYes");
        System.out.println("No");
        
        Scanner g = new Scanner(System.in);
        String input = g.nextLine();
        input = input.toLowerCase();
        
        //makes sure the user enters only the options listed
        while (!"yes".equals(input) && !"no".equals(input)) {
            input = g.nextLine();
            input = input.toLowerCase();
        }
        if(input.equals("no")){
            System.out.println("You decided to not steal from the baron.\n You were kicked out of the thief's guild and marked a coward. \n THE END.");
            return;
        }
        
        System.out.println("You tell yourself you stole from far worse people and have survived death plenty of times.");
        System.out.println("Nothing can stop you as long as you prepare properly.");
        System.out.println("\n\nThinking of preparation, you decide to go to the local theif's guild.");
        System.out.println("There, you stock up on supplies. As typical of thieves, they expect compensation...even for stolen items.");
        System.out.println("You see a few things of interest. In particular, a vial of holy water, a silver throwing dagger, and a smoke bomb catch your attention.");
        System.out.println("The cranky shopkeeper tells you everything you see is worth 50 gold pieces.");
        System.out.println("You only have " + c.getMoney() +" gold pieces and even though you know you these items aren't worth that much, regular shops will not sell to thieves as mandated by the baron.");
        System.out.println("What do you want? (Enter a number from 1 to 5)");
        
        System.out.println("\n1: the holy water \n2: the silver throwing dagger \n3: the smoke bomb \n4: all three items \n5: nothing");
        
       
        int choice = g.nextInt();
        System.out.print("So you buy");
        while(choice <= 0 && choice >= 6){
            System.out.println("Choose from 1 - 5");
            choice = g.nextInt();
        }
            
        switch(choice){
            case 1: c.addItem("Holy Water");
                    c.subMoney(50);
                    System.out.println(" some holy water. The dead will fear you.");
                    break;
            case 2: c.addItem("Silver Throwing Dagger");
                    c.subMoney(50);
                    System.out.println(" the silver throwing dagger. One good throw to the head of any beast will make quick work of them.");
                    break;
            case 3: c.addItem("Smoke Bomb");
                    c.subMoney(50);
                    System.out.println(" a smoke bomb. These can be quite handy for blinding foes.");
                    break;
            case 4: c.addItem("Holy Water");
                    c.addItem("Silver Throwing Dagger");
                    c.addItem("Smoke Bomb");
                    c.subMoney(150);
                    System.out.println(" everything. You can never be too cautious. ");
                    break;
            default:System.out.println(" nothing. You are pretty confident, you wont need these items."); 
        }    
        System.out.println("\nYou head to the baron's mansion. \nOnce you get there, you hide in a nearby bush. You take your time to observe the entrance. ");
        System.out.println("You see that the entrance is guarded by only one guard. He seems rather bored and yawns periodcally during your observation.\nNo other guards seem to be patrolling at this time. ");
        System.out.println("\nWhat do you do? (Choose a number)");
        
        
        System.out.println("1: Wait for him to fall asleep and take his keys.");
        System.out.println("2: Distract him and sneak by");
        
        if(c instanceof Female)
            System.out.println("3:Flirt and knock him out.");
        
        int sneak_choice = g.nextInt();
        
        boolean truth = false; //will allow us to make sure the user enters a correct response and take into account two scenarios presented
        while (!truth){
                if(sneak_choice == 3 && c instanceof Female){
                    System.out.println("\nYou whistle to get the guard's attention and seductively gesture towards him.");
                    System.out.println("The guard slowly approaches you with a grin. You wait for him to get within 5 feet.");
                    System.out.println("Using your lightning quick reflexes, you get behind him and hit him in the back of the head with your weapon.");
                    System.out.println("You take his keys and get inside.");
                    truth = true;
                }
                else if(sneak_choice == 2){
                    System.out.println("\nYou decide that subterfuge would be the best way to handle the situation.");
                    System.out.println("You sneak to the side of the gates and set a bush on fire.");
                    System.out.println("You rush back to the bush you were hiding in and wait for the guard to notice.");
                    System.out.println("The guard in a half-woken state hears the crackling of the growing fire and runs away.");
                    System.out.println("You stand there a bit bewildered at what just happened. \nOnce you regain your composure, you take this chance to pick the lock and get inside.");
                    truth = true;
                }
                
                else if(sneak_choice == 1){
                    System.out.println("\nYou wait. \nAnd wait. \nAnd wait. \nFinally, the guard falls asleep.");
                    System.out.println("You take this opportunity to go for his keys.\nAs soon as you find them, you hear someone yell \" Hey, YOU! What are you doing?!?! \"");
                    System.out.println("You look back to see a guard rushing towards you. \nYou start getting up but thats when you feel the guard you were trying to pickpocket grab your wrist.");
                    System.out.println("He growls \"You're not going anywhere you little weasel. \" \nYou try to get free, but as soon as you try the other guard tackles you to the ground.");
                    System.out.println("The guards start cackling. The sleepy one says, \"The baron would like a word with you.\"");
                    System.out.println("You were caught and failed your task.");
                    System.out.println("THE END");
                }
                else{
                    System.out.println("Choose a number provided in the list above");
                    sneak_choice = g.nextInt();
                }
            }
        
        System.out.println("Once inside, you start looking for the treasure.\nYou figure a paranoid person like the baron, keeps it underground.");
        System.out.println("You get into the basement and find a secret passage behind a cupboard.");
        System.out.println("You head down the dark tunnel until you reach a room.");
        
         Random r = new Random();
         int rn = r.nextInt(3) + 1; // this will randomly help randomly decide which monster to create/ generates a number from 1-3
         CharacterIF m1; //this is the monster before it's built
         
        switch (rn) {
            case 1:
                m1 = new Monster_Builder("Werewolf").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Fur").withWeakness("Silver Throwing Dagger").withWeapon(Weapon.NONE).build();
                System.out.println("You hear a snarl. You've encountered a " + m1.getName());
                break;
            case 2:
                m1 = new Monster_Builder("Hulk").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Incredibly built human with green skin").withWeakness("Smoke Bomb").withWeapon(Weapon.NONE).build(); 
                System.out.println("You hear the sounds of smashing. You've encountered a " + m1.getName());
                break;
            default:
                m1 = new Monster_Builder("Zombie").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Dead human with rotten flesh").withWeakness("Holy Water").withWeapon(Weapon.NONE).build();
                System.out.println("You hear the sounds of feet dragging. You've encountered a " + m1.getName());
                break;
        }
        
        ThiefStrategyIF strategy;
        
        System.out.println("What do you do?");
        System.out.println("\n1:Attack");
        System.out.println("2:Use an item");
        System.out.print("\nEnter a number: ");
        choice = g.nextInt();
        
        while(choice < 0 || choice > 3){
            System.out.println("Try again. Enter 1 or 2.");
            choice = g.nextInt();
        }
                
        /* Strategy Pattern comes in here. Two Strategy classes WeaponAttack and useItem implement the interface ThiefStrategyIF*/
        if (c.InventoryIsEmpty() || choice == 1){
            if(c.InventoryIsEmpty()){
                System.out.println("You have no items, you attack!");
            }
            strategy = new WeaponAttack();
            strategy.battle(c, m1);
        }
        else{
            strategy = new useItem();
            strategy.battle(c, m1);
        }

    }
        
    
    /* Story 2 - Mage */
    public void mage(CharacterIF c) {
        System.out.print("You are " + c.getName() + " a ");
        /* Making use of Marker Interface Female */
        if (c instanceof Female) { 
            System.out.print("female ");
        } else {
            System.out.print("male ");
        }
          
        TrickA a = new TrickA(); 
        TrickB b = new TrickB();
        System.out.println("mage ");
        System.out.println("You love performing magic tricks with your wand");
        System.out.println("You enter an abandoned old mansion hoping to find something interesting so that you could perform your best magic spells!");
        System.out.println("You get in and find 3 boxes");
        System.out.println("Those boxes can be opened up only through your spells");
        System.out.println("On unlocking each box, you would let out a monster");
        System.out.println("Each spell unlocks a different monster");
      
        System.out.println("Choose the spell you would like to perform:");

        System.out.println("X");
        System.out.println("Y");
        System.out.println("Z");
        System.out.println();
        
        CharacterIF monster1 = new Monster_Builder("Werewolf").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Fur").withWeakness("Sword").withWeapon(Weapon.NONE).build();
        CharacterIF monster2 = new Monster_Builder("Hulk").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Incredibly built human with green skin").withWeakness("Axe").withWeapon(Weapon.NONE).build();
        CharacterIF monster3 = new Monster_Builder("Zombie").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Dead human with rotten flesh").withWeakness("Chain saw").withWeapon(Weapon.NONE).build();
        
        Scanner g = new Scanner(System.in);
        String tr = g.nextLine();
        tr = tr.toUpperCase();

        switch (tr) {
            case "X":
                System.out.println("Oops!! Your Spell X unlocked the Monster " + monster1.getName());
                System.out.println();
                monster1.printCharacter();
                System.out.println();
                System.out.println("Now you would want to use your magic wand to perform tricks on the "+ monster1.getName());
                System.out.println("Choose your trick to fight this monster: A or B");

                String x = g.nextLine();
                x = x.toUpperCase();
                
                 /* Strategy Pattern comes in here. Two Strategy classes TrickA and Trick B implement mageStrategyIF */
                switch (x) {

                    case "A":
                        a.magic();
                        break;

                    case "B":
                        b.magic();
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case "Y":
                System.out.println("Oops!! Your Spell Y unlocked the Monster " + monster2.getName());
                System.out.println();
                monster2.printCharacter();
                System.out.println();
                System.out.println("Now you would want to use your magic wand to perform tricks on the "+ monster2.getName());
                System.out.println("Choose your trick to fight this monster: A or B");

                String y = g.nextLine();
                y = y.toUpperCase();
            
                 /* Strategy Pattern comes in here. Two Strategy classes TrickA and Trick B implement mageStrategyIF */
                switch (y) {

                    case "A":
                        a.magic();
                        break;

                    case "B":
                        b.magic();
                        break;

                    default:
                        System.out.println("Invalid Input"); //error handling

                }
                break;
            case "Z":
                System.out.println("Oops!! Your Spell Z unlocked Monster " + monster3.getName());
                System.out.println();
                monster3.printCharacter();
                System.out.println();
                System.out.println("Now you would want to use your magic wand to perform tricks on the "+ monster3.getName());
                System.out.println("Choose your trick to fight this monster: A or B");
                
                
                String z = g.nextLine();
                z = z.toUpperCase();
                
                 /* Strategy Pattern comes in here. Two Strategy classes TrickA and Trick B implement mageStrategyIF */
                switch (z) {

                    case "A":
                        a.magic();
                        break;

                    case "B":
                        b.magic();
                        break;

                    default:
                        System.out.println("Invalid Input"); //error handling

                }
            default:
                System.out.println("Invalid Input"); //error handling
        }
    }

    /* Story 3 - Warrior */
    public void warrior(CharacterIF c) {
        System.out.print("You are " + c.getName() + " a ");
        /* Making use of Marker Interface */
        if (c instanceof Female) {
            System.out.print("female ");
        } else {
            System.out.print("male ");
        }
        Run r = new Run();
        Attack a = new Attack();
        System.out.println("warrior ");
        System.out.println("You love to fight");
        System.out.println("Since you are a good warrior, they made you the leader of your army");
        System.out.println("The army of the dead is approaching your army at the battlefield");
        System.out.println("All the lives of your fellow warriors rest on you, captain warrior!");
        System.out.println("Buckle up, get your weapons ready");
        System.out.println("Signal your army of warriors to get ready");
        System.out.println("The monsters have started closing in, they are almost here");
        
        System.out.println();
        System.out.println("Hope you are all set to fight the monsters now, they have arrived!");
        System.out.println("These are the Monsters that come in your way!");
        System.out.println();
        
        CharacterIF monster1 = new Monster_Builder("Werewolf").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Fur").withWeakness("Sword").withWeapon(Weapon.NONE).build();
        CharacterIF monster2 = new Monster_Builder("Hulk").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Incredibly built human with green skin").withWeakness("Axe").withWeapon(Weapon.NONE).build();
        CharacterIF monster3 = new Monster_Builder("Zombie").withHairColor(HairColor.NONE).withShoe(Shoe.NONE).withArmor(Armor.NONE).withAppearance("Dead human with rotten flesh").withWeakness("Chain saw").withWeapon(Weapon.NONE).build();

        System.out.println("1." +monster1.getName());
        System.out.println("2." +monster2.getName());
        System.out.println("3." +monster3.getName());
            
        System.out.println();
        System.out.println("Choose the monster you would want to fight: Choose 1, 2 or 3");
        
        System.out.println();

        Scanner g = new Scanner(System.in);
        String m = g.nextLine();
        m = m.toUpperCase();

        switch (m) {
            case "1":
                System.out.println("You chose to fight the " + monster1.getName());
                System.out.println();
                System.out.println("Know what you're dealing with!");
                System.out.println();
                monster1.printCharacter();
                System.out.println();
            
                System.out.println("Good luck!");
                System.out.println("Choose the strategy that wanna use to face the " + monster1.getName());

                System.out.println("1. Run");
                System.out.println("2. Attack");

                String one = g.nextLine();
                one = one.toUpperCase();
                
                /* Strategy Pattern comes in here. Two Strategy classes Run and Attack implement warriorStrategyIF */
                switch (one) {

                    case "1":
                        r.fight();
                        break;

                    case "2":
                        a.fight();
                        break;
                }

                break;

            case "2":
                System.out.println("You chose to fight the " + monster2.getName());
                System.out.println();
                System.out.println("Know what you're dealing with!");
                monster2.printCharacter();
                System.out.println();
            
                System.out.println("Good luck!");
                System.out.println("Choose the strategy that you wanna use to face the " + monster2.getName());

                System.out.println("1. Run");
                System.out.println("2. Attack");

                String two = g.nextLine();
                two = two.toUpperCase();
                
                 /* Strategy Pattern comes in here. Two Strategy classes Run and Attack implement warriorStrategyIF */
                switch (two) {

                    case "1":

                        r.fight();

                        break;

                    case "2":

                        a.fight();

                        break;
                }

                break;

            case "3":
                System.out.println("You chose to fight the " + monster3.getName());
                System.out.println();
                System.out.println("Know what you're dealing with!");
                monster3.printCharacter();
                System.out.println();
            
                System.out.println("Good luck!");
                System.out.println("Choose the strategy that you wanna use to face the " + monster3.getName());

                System.out.println("1. Run");
                System.out.println("2. Attack");

                String three = g.nextLine();
                three = three.toUpperCase();
                
                 /* Strategy Pattern comes in here. Two Strategy classes Run and Attack implement warriorStrategyIF */
                switch (three) {

                    case "1":

                        r.fight();

                        break;

                    case "2":

                        a.fight();

                        break;
                }

                break;

            default:
                System.out.println("Invalid Input"); //error handling
        }
    }

}
