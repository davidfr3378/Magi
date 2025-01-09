package magi;

/*
 * @author: david.ez
 */

public class Procedure {
    
    public void game_intro(){
        Mage main_character = new Mage();
        
        Equipmentt starter_wand = new Equipmentt("Beginner Wand", "Elemental", "Most basic wand. \n\t Given to all beginner mages");
        
        Spell fireball = new Spell("Fire Ball", 1, 5, "Fire", "Shoots a basic fireball");
        Spell waterwall = new Spell("Water Wall", 1, 6, "Water", "Erects a water wall");
        Spell wind_aglility = new Spell("Agility of the wind", 1, 10, "Wind", "Grants the user 10% more agility");
        Spell earthspike = new Spell("Earth Spike", 1, 3, "Earth", "Summons an earth spike from the ground");
        
        
        main_character.addEquipment(starter_wand);
        
        main_character.addSpell(fireball);
        main_character.addSpell(waterwall);
        main_character.addSpell(wind_aglility);
        main_character.addSpell(earthspike);
        
        /*
        Loop through the arraylist and find out why only the latest object is being printed
        */

        System.out.println("--- Your room, No. 213 Dorm 2, Enlightment Magus Academy ---");
        System.out.println("You woke up in cold sweat. \"I had a bad dream....No, not a dream, a premonition!\"");
        System.out.println("There's not much time, your dorm is about to be attacked by powerful mages! You quickly get changed and equip your wand\n");
        
        System.out.println(starter_wand.toString());
        
        System.out.println("--- You know that no one will listen to you if you say there'll be an attack so you begin to run, aiming for the next town");
        System.out.println("--- 2 miles from the next tow ---");
        System.out.println("You're out of breath and decide to take a rest in a nearby cave. Soon, you heard footsteps...someone is running this way, probably an attacker. \nYou have to make the first move! Select a spell from your knowledge an attack!\n");
        
        main_character.displaySpells();
        
    }
    
}
