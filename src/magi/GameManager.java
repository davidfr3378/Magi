package magi;

/*
 * @author: david.ez
 */

public class GameManager {
    
    UI ui = new UI(this); //Parameter passed in is the literal current class! Crazy!
    
    public static void main(String[] args){
        new GameManager();
    }
    
    public GameManager(){
    
    }
}
