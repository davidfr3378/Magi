package magi;

/*
 * @author: david.ez
 */


public class Procedure {
    
    public void game_intro(){
        System.out.println("--- Your room, No. 213 Dorm 2, Enlightment Magus Academy ---");
        System.out.println("You woke up in cold sweat. \"I had a bad dream....No, not a dream, a premonition!\"");
        System.out.println("There's not much time, your dorm is about to be attacked by powerful mages! You quickly get changed and equip your wand");
        
        Mage main_character = new Mage();
        
        Equipment starter_wand = new Equipment("Beginer Wand", "Thorium");
        
        main_character.addEquipment(starter_wand);
        starter_wand.toString();
    }
    
}
