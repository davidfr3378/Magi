package magi;

/*
 * @author: david.ez
 */

public class Offensive_spells extends Spell{
    
    private int damage;
    
    public Offensive_spells(String name, String trait, int damage){
        super(name, 7, 5,trait, "Shoots a basic fireball");
        this.damage = damage;
    }
    
    public int getDamage(){
        return damage;
    }
    
    @Override
    public String toString(){
        return "Spell: " + getName() + ", Trait: " + getTrait() + "Damage: " + damage;
    }
}
