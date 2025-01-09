package magi;

import java.util.ArrayList;

/*
 * @author ezimada844
 */

public class Mage {
    
    private ArrayList<Spell> spells;
    private ArrayList<Equipment> equipments;
    
    public Mage(){
        spells    = new ArrayList<>();
        equipments = new ArrayList<>();
        
    }
    
    public void addSpell(Spell spell){
        spells.add(spell);
    }
    
    public void displaySpells(){
        for(Spell spell : spells){
            System.out.println("Spell: " + Spell.getName() + ", Trait: " + Spell.getTrait());
        }
    }
    
    public void addEquipment(Equipment equipment){
        equipments.add(equipment);
    }
    
    public void displayEquipment(){
        for(Equipment equipment : equipments){
            System.out.println("Equipment: " + Equipment.getName() + ", Type: " + Equipment.getType());
        }
    }
}
