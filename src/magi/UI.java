package magi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/*
 * @authors: david.ez, nelson.ez
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
        generateScreen();
        
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
    
    public void createBackground(int bgNum, String bgFilename){
        
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,50,700,350); // x = 50, y = 50, width = 700, height = 350
        bgPanel[bgNum].setBackground(Color.blue);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);
        
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700,350);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("res\\"+bgFilename));
        bgLabel[bgNum].setIcon(bgIcon);
        
        // bgPanel[1].add(bgLabel[1]); Supposed to be here but was moved due to layers
        
    }
    
    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFileName,
    String choice1Name, String choice2Name, String choice3Name){
        //Create popup menu
        JPopupMenu popMenu = new JPopupMenu();
        
        //Create popup menu items
        JMenuItem menuItem[] = new JMenuItem[4]; //I don't want to use ) so [1], [2], [3]
        menuItem[1] = new JMenuItem(choice1Name);
        popMenu.add(menuItem[1]);
        
        menuItem[2] = new JMenuItem(choice2Name);
        popMenu.add(menuItem[2]);
        
        menuItem[3] = new JMenuItem(choice3Name);
        popMenu.add(menuItem[3]);
        
        //create objects 
        JLabel objectLabel = new JLabel();
        //objectLabel.setBounds(-40,-40,800,600); //Mage settings
        objectLabel.setBounds(objx,objy,objWidth,objHeight);
        
        
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource("res\\"+ objFileName));
        objectLabel.setIcon(objectIcon);
        
        objectLabel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}

            
            public void mousePressed(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e)){
                    popMenu.show(objectLabel,e.getX(),e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {}


            public void mouseEntered(MouseEvent e) {}


            public void mouseExited(MouseEvent e) {}
        });
        
        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]); //moved here from createBackground()
    }
    
    public void generateScreen(){
        
        //SCREEN 1
        createBackground(1,"sunny.png");
        createObject(1,440,140,200,200,"hut(200x200).png","Inspect","Enter","rest");
        createObject(1,-40,150,400,225,"Mage(400x225).png","Inspect","Give Up","Attack");//Mage Creation
         //dungeon
        
    }
}