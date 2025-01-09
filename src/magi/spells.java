package magi;

/*
 * @author ezimada844
 */

public class spells {
    
    private String name, trait;
    

    public spells(String name, String trait){
        this.name = name;
        this.trait = trait;
    }
    
    
    public String getName(){
        return name;
    }
    
    public String getTrait(){
        return trait;
    }
    
    @Override
    public String toString(){
        return "Spell: " + name + ", Trait: " + trait;
    }
}
