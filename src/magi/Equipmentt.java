package magi;

/*
 * @author: david.ez
 */

public class Equipmentt {
    private static String name, type;
    

    public Equipmentt(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    
    public static String getName(){
        return name;
    }
    
    public static String getType(){
        return type;
    }
    
    @Override
    public String toString(){
        return "Spell: " + name + ", Type: " + type;
    }
}
