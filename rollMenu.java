import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
public class rollMenu extends JFrame implements ActionListener{
// here we initailize the total amount you have to pa for each roll
public static double rainbowamount;
public static double californiatotal;
public static double tunatotal;
public static double dynemitetotal;
public static double totalroll;
static double rainbowamount1;
static double californiatotal1;
static double tunatotal1;
static double dynemitetotal1;

static double rainbowamount2;
static double californiatotal2;
static double tunatotal2;
static double dynemitetotal2;
JButton Continue;	
JButton done;
//setting the counters for each roll so it will go up b one every time you add
static int rainbowcounter = 0;
static int californiacounter = 0;
static int tunacounter = 0;
static int dynemitecounter = 0;


	//here we set the Jbuttons and JLabels for each roll
	JLabel rainbowroll;
	static JLabel rainbowrollamount;
	JButton rainbowminus;
	JButton rainbowplus;
	
	JLabel californiaroll;
	JButton californiaadd;
	JButton californiaminus;
	static JLabel californiaamount;
	
	JLabel spicytunaroll;
	JButton tunaadd; 
	static JLabel tunaamount; 
	JButton tunaminus;
	
	JLabel dynemiteroll;
	static JLabel dynemiteamount; 
	JButton dynemiteadd;
	JButton dynemiteminus;
	
	public rollMenu(){
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("sushi roll menu");
	
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setSize(600,200);
	frame.setLocation(400,350);
	//we have different clusters for each roll where we initialize each variable and add it on the screen
	frame.setLayout(new FlowLayout());
	rainbowroll = new JLabel("RAINBOW ROLL- 8.49 Ea");
	rainbowrollamount = new JLabel("0");
	 rainbowplus = new JButton("+");
	rainbowplus.addActionListener(this);
	rainbowminus = new JButton("-");
	rainbowminus.addActionListener(this);
	frame.add(rainbowroll);
	frame.add(rainbowplus);
	frame.add(rainbowrollamount);
	frame.add(rainbowminus);
	frame.setVisible(true);

		
    	
    	frame.setLayout(new FlowLayout());
    	californiaadd = new JButton ("+");
    	californiaadd.addActionListener(this);
    	californiaamount = new JLabel("0");
    	californiaroll = new JLabel("CALIFORNIA ROLL- 6.99 Ea");
    	 californiaminus = new JButton ("-");
    	californiaminus.addActionListener(this);
    	frame.add(californiaroll);
    	frame.add(californiaadd);
    	frame.add(californiaamount);
    	frame.add(californiaminus);
    	frame.setVisible(true);
    		
    		
    		frame.setLayout(new FlowLayout());
        	tunaadd = new JButton ("+");
        	tunaadd.addActionListener(this);
        	tunaamount = new JLabel("0");
        	spicytunaroll = new JLabel("SPICY TUNA ROLL- 5.99 Ea");
        	tunaminus = new JButton ("-");
        	tunaminus.addActionListener(this);
        	frame.add(spicytunaroll);
        	frame.add(tunaadd);
        	frame.add(tunaamount);
        	frame.add(tunaminus);
        	frame.setVisible(true);
    		

    		
    		frame.setLayout(new FlowLayout());
        	dynemiteadd = new JButton ("+");
        	dynemiteadd.addActionListener(this);
        	dynemiteamount = new JLabel("0");
        	dynemiteroll = new JLabel("DYNEMITE ROLL- 6.99 Ea");
        	dynemiteminus = new JButton ("-");
        	dynemiteminus.addActionListener(this);
        	frame.add(dynemiteroll);
        	frame.add(dynemiteadd);
        	frame.add(dynemiteamount);
        	frame.add(dynemiteminus);
        	frame.setVisible(true);
    		
       
    		Continue = new JButton ("next menu");
    		Continue.addActionListener(this);
    		done = new JButton("to checkout");
        	done.addActionListener(this);
    		frame.add(Continue);
    		frame.add(done);
    		
    		JLabel rollinfo;
    		frame.setLayout(new FlowLayout());
    		rollinfo = new JLabel("<html>Sushi rolls consist of seafood or meat wrapped with our authentic seaweed roll and brought <br> to you with perfection.  To order enter how many of each roll you would like and press continue to go to  <br>the next menu.</html>" , SwingConstants.CENTER);
    		frame.add(rollinfo);
    		
    		
					
	
	//here when to action of pressing every button is performed, we put the roll's counter to plus 1 if it is hitting the plus button and minus one if it is hitting the minus button
    		//we put the value of the couters multiplied by how much the amount is to set the total amount for each roll
    		
    		}		
	
	public void actionPerformed(ActionEvent press) {
		if(press.getSource() == Continue){
			new meatMenu();
		}else if(press.getSource() == done){
			new reciept();
		}else if(press.getSource() == rainbowplus){
		rainbowcounter = rainbowcounter +1;
		
		rainbowrollamount.setText(Integer.toString(rainbowcounter));
		
		rainbowamount = rainbowcounter*8.49;
		totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
		}else if(press.getSource() == rainbowminus){
			if(rainbowcounter >0){
				rainbowcounter = rainbowcounter -1;
				;
				
				rainbowrollamount.setText(Integer.toString(rainbowcounter));
				
			
			rainbowamount = rainbowcounter*8.49;
			}
			
			
			if(rainbowcounter == 0){
				rainbowcounter = 0;
				
				
				rainbowrollamount.setText(Integer.toString(rainbowcounter));
				rainbowamount = rainbowcounter*8.49;
				totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
				}
		
			}else if(press.getSource() == californiaadd){
			californiacounter = californiacounter +1;
			
			californiaamount.setText(Integer.toString(californiacounter));
			californiatotal = californiacounter * 6.99;
			totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
			}else if(press.getSource() == californiaminus){
				if(californiacounter >0){
					californiacounter = californiacounter -1;
					
							
					californiaamount.setText(Integer.toString(californiacounter));
					californiatotal = californiacounter * 6.99;
				}
				if(californiacounter == 0){
					californiacounter = 0;
					
					
					californiaamount.setText(Integer.toString(californiacounter));
					californiatotal = californiacounter * 6.99;
					totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
				}
			}else if(press.getSource() == tunaadd){
			tunacounter = tunacounter +1;
			
			
			tunaamount.setText(Integer.toString(tunacounter));
			tunatotal = tunacounter * 5.99;
			totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
			}else if(press.getSource() == tunaminus){
				if(tunacounter >0){
					tunacounter = tunacounter -1;
					
					
					tunaamount.setText(Integer.toString(tunacounter));
					tunatotal = tunacounter * 5.99;
				}
				if(tunacounter == 0){
					tunacounter = 0;
					
					
					tunaamount.setText(Integer.toString(tunacounter));
					tunatotal = tunacounter * 5.99;
					totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
				}
			}else if(press.getSource() == dynemiteadd){
		dynemitecounter = dynemitecounter +1;
		
		dynemiteamount.setText(Integer.toString(dynemitecounter));	
		
		dynemitetotal = dynemitecounter * 6.99;
		totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
		}else if(press.getSource() == dynemiteminus){
			if(dynemitecounter >0){
				dynemitecounter = dynemitecounter -1;
				
				
				dynemiteamount.setText(Integer.toString(dynemitecounter));
				dynemitetotal = dynemitecounter * 6.99;
			}
			if(dynemitecounter == 0){
				dynemitecounter = 0;
				
				dynemiteamount.setText(Integer.toString(dynemitecounter));
				dynemitetotal = dynemitecounter * 6.99;
			
			totalroll = tunatotal + californiatotal + rainbowamount + dynemitetotal;
			}
			
		}
	}
}
