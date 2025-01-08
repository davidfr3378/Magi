package magi;

/*
 * @author ezimada844
 */

public class spells {
    
    private int offence, defence;
    private String name;
    private spell_subclass aSpell_subclass;
    
    private enum spell_subclass {
    ELEMENTAL,
    ENERGY,
    SOUL,
    SUMMONER,
    SECRET
  }
    
    enum elemental {

    }
    
    
    
    
    public spells(String name, int offence, spell_subclass aSpell_subclass){
        
    }
    public spells(String name, int defence, spell_subclass aSpell_subclass, int pass){
    
    }
    public spells(){
    
    }
}
