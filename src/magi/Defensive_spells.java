package magi;

/*
 * @author: david.ez
 */

public class Defensive_spells extends Spell{
    private int defence;
    
    public Defensive_spells(String name, String trait, int defence){
        super(name, 7, 5,trait, "Shoots a basic fireball");
        this.defence = defence;
    }
    
    public int getDefence(){
        return defence;
    }
    
    @Override
    public String toString(){
        return "Spell: " + getName() + ", Trait: " + getTrait() + "Defence: " + defence;
    }
}
