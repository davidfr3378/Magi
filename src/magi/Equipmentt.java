package magi;

/*
 * @author: david.ez
 */

public class Equipmentt {
    private static String name, type, description;

    
    

    public Equipmentt(String name, String type, String description){
        this.name = name;
        this.type = type;
        this.description = description;
    }
    
    
    public static String getName(){
        return name;
    }
    
    public static String getType(){
        return type;
    }
    
    public static String getDescription(){
        return description;
    }
    
    public static String getEquipment() {
        return "Equipment: " + name + ", Type: " + type + ", Description: \n\t" + description;
    }
    
}
