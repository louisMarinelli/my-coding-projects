import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class meatMenu extends JFrame implements ActionListener{
	//counters for each type of meat are initialized here
	static int beefcounter = 0;
	static int salmoncounter = 0;
	static int eelcounter = 0;
	static int shrimpcounter = 0;
	//JButton to go to the reciept is made
	JButton done;
	//the total amount that will be charged for each meat is made
	static double beeftotal = 0;
	static double salmontotal = 0;
	static double eeltotal = 0;
	static double shrimptotal = 0;
	JButton Continue;
	//all the labels and buttons for each meat is made
	JLabel beef;
	static JLabel beefamount;
	JButton beefminus;
	JButton beefplus;
	
	JLabel eel;
	JButton eeladd;
	JButton eelminus;
	static JLabel eelamount;
	
	JLabel salmon;
	JButton salmonadd; 
	static JLabel salmonamount; 
	JButton salmonminus;
	
	JLabel shrimp;
	static JLabel shrimpamount; 
	JButton shrimpadd;
	JButton shrimpminus;
	public static double meattotal;
	public meatMenu(){
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("Meat menu");
	//here we set the size and location of the frame, it will dispose on close so when you close it it is disposed
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setSize(660,200);
	frame.setLocation(400,350);
	// here is where we initialize every plus minus buttons and add the action listener to it, JLabels are set as well
	frame.setLayout(new FlowLayout());
	beef = new JLabel("BEEF TERIYAKI - 8.99 FOR 8 Pc");
	beefamount = new JLabel("0");
	 beefplus = new JButton("+");
	beefplus.addActionListener(this);
	beefminus = new JButton("-");
	beefminus.addActionListener(this);
	frame.add(beef);
	frame.add(beefplus);
	frame.add(beefamount);
	frame.add(beefminus);
	frame.setVisible(true);

		
    	
    	frame.setLayout(new FlowLayout());
    	eeladd = new JButton ("+");
    	eeladd.addActionListener(this);
    	eelamount = new JLabel("0");
    	eel = new JLabel("BARBEQUE EEL- 7.49 FOR 8 Pc");
    	eelminus = new JButton ("-");
    	eelminus.addActionListener(this);
    	frame.add(eel);
    	frame.add(eeladd);
    	frame.add(eelamount);
    	frame.add(eelminus);
    	frame.setVisible(true);
    		
    		
    		frame.setLayout(new FlowLayout());
        	salmonadd = new JButton ("+");
        	salmonadd.addActionListener(this);
        	salmonamount = new JLabel("0");
        	salmon = new JLabel("SALMON TERIYAKI - 7.99 FOR 8 Pc");
        	salmonminus = new JButton ("-");
        	salmonminus.addActionListener(this);
        	frame.add(salmon);
        	frame.add(salmonadd);
        	frame.add(salmonamount);
        	frame.add(salmonminus);
        	frame.setVisible(true);
    		

    		
    		frame.setLayout(new FlowLayout());
        	shrimpadd = new JButton ("+");
        	shrimpadd.addActionListener(this);
        	shrimpamount = new JLabel("0");
        	shrimp = new JLabel("SHRIMP TEMPURA- 6.99 Ea FOR 6 Pc");
        	shrimpminus = new JButton ("-");
        	shrimpminus.addActionListener(this);
        	frame.add(shrimp);
        	frame.add(shrimpadd);
        	frame.add(shrimpamount);
        	frame.add(shrimpminus);
        	frame.setVisible(true);
    		
        	Continue = new JButton ("next menu");
        	Continue.addActionListener(this);
        	done = new JButton("to checkout");
        	done.addActionListener(this);
        	frame.add(Continue);
        	frame.add(done);
        	
    		JLabel rollinfo;
    		frame.setLayout(new FlowLayout());
    		rollinfo = new JLabel("<html>The meat menu consists of very many varieties of meats from beef to seafood. Our salmon and beef <Br>are cooked in our delicous teriyaki sauce. Our special is our famous 6 piece <Br>BBQ eel which is delicously grilled to perfection.<Br> To switch the manue to go the main menue page and choose menu. </html>" , SwingConstants.CENTER);
    		frame.add(rollinfo);
    		}		
//here is the action performed where the plus and minus buttons are pressed, the counter for each adds one everytime you press plus and the opposite for minus
public void actionPerformed(ActionEvent press) {
 if(press.getSource() == Continue){
	new saladMenu();
 }else if(press.getSource() == done){
		new reciept();
}else if(press.getSource() == beefplus){
	beefcounter = beefcounter +1;
	beefamount.setText(Integer.toString(beefcounter));	
	beeftotal = beefcounter * 8.99;
	meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
	}else if(press.getSource() == beefminus){
		if(beefcounter >0){
			beefcounter = beefcounter -1;
			beefamount.setText(Integer.toString(beefcounter));
			beeftotal = beefcounter * 8.99;
		}
		if(beefcounter == 0){
			beefcounter = 0;
			beefamount.setText(Integer.toString(beefcounter));
			beeftotal = beefcounter * 8.99;
			meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
		}
		}else if(press.getSource() == eeladd){
		eelcounter = eelcounter +1;

		eelamount.setText(Integer.toString(eelcounter));	
		eeltotal = eelcounter * 7.49;
		meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
		}else if(press.getSource() == eelminus){
			if(eelcounter >0){
				eelcounter = eelcounter -1;
				eelamount.setText(Integer.toString(eelcounter));
				eeltotal = eelcounter * 7.49;
			}
			if(eelcounter == 0){
				eelcounter = 0;
				eelamount.setText(Integer.toString(eelcounter));
				eeltotal = eelcounter * 7.49;
				meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
			}
			}else if(press.getSource() == salmonadd){
		salmoncounter = salmoncounter +1;
		salmonamount.setText(Integer.toString(salmoncounter));	
		salmontotal = salmoncounter * 7.99;
		meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
		}else if(press.getSource() == salmonminus){
			if(salmoncounter >0){
				salmoncounter = salmoncounter -1;
				salmonamount.setText(Integer.toString(salmoncounter));
				salmontotal = salmoncounter * 7.99;
			}
			if(salmoncounter == 0){
				salmoncounter = 0;
				salmonamount.setText(Integer.toString(salmoncounter));
				salmontotal = salmoncounter * 7.99;
				meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
			}
			}else if(press.getSource() == shrimpadd){
	shrimpcounter = shrimpcounter +1;
	shrimpamount.setText(Integer.toString(shrimpcounter));	
	shrimptotal = shrimpcounter * 7.99;
	meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
	}else if(press.getSource() == shrimpminus){
		if(shrimpcounter >0){
			shrimpcounter = shrimpcounter -1;
			shrimpamount.setText(Integer.toString(shrimpcounter));
			shrimptotal = shrimpcounter * 7.99;
	}
		if(shrimpcounter == 0){
			shrimpcounter = 0;
			shrimpamount.setText(Integer.toString(shrimpcounter));

			shrimptotal = shrimpcounter * 7.99;
meattotal = beeftotal + salmontotal + eeltotal + shrimptotal;
		}		
}
}
}
