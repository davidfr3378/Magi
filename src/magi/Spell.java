package magi;

/*
 * @author ezimada844
 */

public class Spell {
    
    private String name, trait, description;
    private int    level, mana_cost;

    public Spell(String name, int level, int mana_cost, String trait, String description){
        this.name = name;
        this.level = level;
        this.mana_cost = mana_cost;
        this.trait = trait;
        this.description = description;
    }
    
    
    public String getName(){
        return name;
    }
    
    public String getTrait(){
        return trait;
    }
    
    public int getLevel(){
        return level;
    }
    
    public int getMana_cost(){
        return mana_cost;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getSpells(){
        return "Spell: " + name + ", Level: " + level + ", Mana cost: " + mana_cost + ", Trait: " + trait + ", Description: " + description;
    }
}
