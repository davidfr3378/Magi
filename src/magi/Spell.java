package magi;

/*
 * @author ezimada844
 */

public class Spell {
    
    private static String name, trait, description;
    private static int    level, mana_cost;

    public Spell(String name, int level, int mana_cost, String trait, String description){
        this.name = name;
        this.level = level;
        this.mana_cost = mana_cost;
        this.trait = trait;
        this.description = description;
    }
    
    
    public static String getName(){
        return name;
    }
    
    public static String getTrait(){
        return trait;
    }
    
    public static int getLevel(){
        return level;
    }
    
    public static int getMana_cost(){
        return mana_cost;
    }
    
    public static String getDescription(){
        return description;
    }
    
    public static String getSpells(){
        return "Spell: " + name + ", Level: " + level + ", Mana cost: " + mana_cost + ", Trait: " + trait + ", Description: " + description;
    }
}
