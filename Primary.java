import javax.swing.*;//the imports nececary for the program
import java.awt.event.*;
import java.text.*;
import java.awt.*;
public class Primary extends JFrame implements ActionListener{
	//here is where i set each and every button frame
	JLabel Continue;
	JButton sushimenu;
	JButton meatmenu;
	JButton soupsaladmenu;
	


//setting up the menu screen
	public Primary(){
		super("Welcome to Louis' Sushi bar!!!!"); 
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
		
		
//this is initailizing all the JLabels and buttons and adding an action listener to the buttons, here is here  create the buttons for the different menus
		Continue = new JLabel("LOUIS' SHUSHI BAR, PRESS which menu you you would like to go to ");
		sushimenu = new JButton("SUSHI MENU");
		sushimenu.addActionListener(this);
		meatmenu = new JButton("MEAT MENU");
		meatmenu.addActionListener(this);
		soupsaladmenu = new JButton("SOUP MENU");
		soupsaladmenu.addActionListener(this);
		add (Continue);
		add (sushimenu);
		add (meatmenu);
		add(soupsaladmenu);
	
	}
	//here is where the action listener is when the action is presformed, the action preformed is pressing one of the buttons and here is where if u press a button it will take you to a new menu
	public void actionPerformed (ActionEvent press){
			if(press.getSource() == sushimenu){
		
			new rollMenu();
		}else if(press.getSource() == meatmenu){
			
			new meatMenu();
		}else if(press.getSource() == soupsaladmenu){
			
			new saladMenu();
		}
		
		
			
	}
	}