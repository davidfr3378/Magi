package magi;

/*
 * @author ezimada844
 */

public class Spell {
    
    private static String name, trait;
    

    public Spell(String name, String trait){
        this.name = name;
        this.trait = trait;
    }
    
    
    public static String getName(){
        return name;
    }
    
    public static String getTrait(){
        return trait;
    }
    
    @Override
    public String toString(){
        return "Spell: " + name + ", Trait: " + trait;
    }
}
