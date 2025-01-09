package magi;

/*
 * @author: david.ez
 */

public class Equipmentt {
    private String name, type, description;

    
    

    public Equipmentt(String name, String type, String description){
        this.name = name;
        this.type = type;
        this.description = description;
    }
    
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getEquipment() {
        return "Equipment: " + name + ", Type: " + type + ", Description: \n\t" + description;
    }
    
}
