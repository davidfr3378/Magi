package magi;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*
 * @author: david.ez
 */

public class Procedure {
    static Mage main_character;
    
    static Equipmentt starter_wand;
    static Equipmentt starter_robe;
    
    static Spell fireball;
    static Spell waterwall;
    static Spell earthspike;
    static Spell wind_aglility;
    
    static int coins;
    static Scanner sc = new Scanner(System.in);
    
    
    static int mode;
    public void game_intro(){
        //Character initialization and equipment
        main_character = new Mage();
        
        starter_wand = new Equipmentt("Beginner Wand", "Elemental", "Most basic wand. \n\t Given to all beginner mages");
        starter_robe = new Equipmentt("Beginner Robe", "Elemental", "Most basic robe. \n\t Given to all beginner mages");
        
        fireball = new Spell("Fire Ball", 1, 5, "Fire", "Shoots a basic fireball");
        waterwall = new Spell("Water Wall", 1, 6, "Water", "Erects a water wall");
        earthspike = new Spell("Earth Spike", 1, 3, "Earth", "Summons an earth spike from the ground");
        wind_aglility = new Spell("Agility of the wind", 1, 10, "Wind", "Grants the user 10% more agility");
        
        
        
        main_character.addEquipment(starter_wand);
        main_character.addEquipment(starter_robe);
        
        main_character.addSpell(fireball);
        main_character.addSpell(waterwall);
        main_character.addSpell(earthspike);
        main_character.addSpell(wind_aglility);

        
        //Mode selection - Text Block
        System.out.println("---! Welcom to Magi !--- ");
        System.out.println("""
                           --- Select a mode: 
                           1.Story Mode
                           2. P v P
                           3. P v Computer 
                           Mode: """);
        mode = sc.nextInt(); //Getting Mode
        switch(mode){//Mode switch
            case 1 -> story_mode();
            
            case 2 -> PvP_mode();
                
            case 3 -> PvComputer_mode();
        }
        //Mode switch
        
    }

    public void story_mode() {
        intro_arc();
    }
    
    public void PvP_mode() {
        System.out.println("Calling PvP mode");
    }
    
    public void PvComputer_mode() {
        System.out.println("Calling PvComputer mode");
    }

    public void intro_arc() {
        System.out.println("--- Your room, No. 213 Dorm 2, Enlightment Magus Academy ---\n");
        System.out.println("You woke up in cold sweat. \"I had a bad dream....No, not a dream, a premonition!\"");
        System.out.println("There's not much time, your dorm is about to be attacked by powerful mages! You quickly get changed and equip your wand\n");
        
        System.out.println(starter_wand.getEquipment()); //Printing starter_wand
        
        System.out.println("--- You know that no one will listen to you if you say there'll be an attack so you begin to run, aiming for the next town");
        System.out.println("--- 2 miles from the next tow ---");
        System.out.println("You're out of breath and decide to take a rest in a nearby cave. Soon, you heard footsteps...someone is running this way, probably an attacker. \nYou have to make the first move! Select a spell from your knowledge an attack!\n");
        
        main_character.displaySpells(); //Display spells
        main_character.displayEquipment(); //Display Equipment
    }
    
    /**
     *
     * @param data
     * @param unit
     * @param delay
     * @throws InterruptedException
     * @description: delays each character of inputted data
     */
    public static void textDelay(String data, TimeUnit unit, long delay) throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }
    
}
