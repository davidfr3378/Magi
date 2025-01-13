package magi;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * @author: david.ez
 */

public class UI {
    
    GameManager gm;
    
    JFrame window;
    public JTextArea messageText;

    /*
     * Creates an array of panels for the background.
     */
    public JPanel bgPanel[] = new JPanel[10]; 
    public JLabel bgLabel[] = new JLabel[10]; 
    
    public UI(GameManager gm){
        this.gm = gm;
        createMainField();
        createBackground();
        createObject();
        
        window.setVisible(true);
    }
    
    public void createMainField(){
        
        /*
         *Creates main window
         */
        
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        
        /*
         *Adds Text Area/Box. 
         * To visualze dimensions, contrast the background color of the text area with that of the main background
         */
        messageText = new JTextArea("This is a sample Test");
        messageText.setBounds(50,410,700,150); // x = 50, y = 400, width = 700, height = 150
        messageText.setBackground(Color.black);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true); //wraping and breaking //not imp
        messageText.setFont(new Font("Book Antiqua" ,Font.PLAIN, 26));//font, effect, size
        window.add(messageText);
    }
    
    public void createBackground(){
        
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(50,50,700,350); // x = 50, y = 50, width = 700, height = 350
        bgPanel[1].setBackground(Color.blue);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);
        
        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0,0,700,350);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("res\\spacebg.png"));
        bgLabel[1].setIcon(bgIcon);
        
    }
    public void createObject(){
        
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(400,150,200,200);
        
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource("res\\Culminating-assetsWhite-Screen(a-placeholder-in-the-code).png"));
        objectLabel.setIcon(objectIcon);
        
        bgPanel[1].add(objectLabel);
        bgPanel[1].add(bgLabel[1]);
    }
}