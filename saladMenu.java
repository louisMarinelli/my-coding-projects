import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class saladMenu extends JFrame implements ActionListener{
//sets the counter for each food
	static int seaweedcounter = 0;
static int misocounter = 0;
static int edimamecounter = 0;
static int eggrollcounter = 0;
//sets the total amount for each food
static double seaweedtotal ;
static double misototal ;
static double edimametotal;
static double eggrolltotal;
//sets all the plus and minus buttons as well as the JLabels
	JButton Continue;
	JButton menu;
	JLabel seaweed;
	static JLabel seaweedamount;
	JButton seaweedminus;
	JButton seaweedplus;
	public static double saladtotal;
	JLabel miso;
	JButton misoadd;
	JButton misominus;
	static JLabel misoamount;
	
	JLabel edimame;
	JButton edimameadd; 
	static JLabel edimameamount; 
	JButton edimameminus;
	
	JLabel eggroll;
	static JLabel eggrollamount; 
	JButton eggrolladd;
	JButton eggrollminus;
	//setting the frame
	public saladMenu(){
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("SOUPS SALAS AND MORE");
	
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setSize(600,200);
	frame.setLocation(400,350);
	//initializing all the plus and minus buttons and adding action listeners, and setting every JLabel
	frame.setLayout(new FlowLayout());
	seaweed = new JLabel("SEAWEED SALAD - 5.99 ");
	seaweedamount = new JLabel("0");
	 seaweedplus = new JButton("+");
	seaweedplus.addActionListener(this);
	seaweedminus = new JButton("-");
	seaweedminus.addActionListener(this);
	frame.add(seaweed);
	frame.add(seaweedplus);
	frame.add(seaweedamount);
	frame.add(seaweedminus);
	frame.setVisible(true);

		
    	
    	frame.setLayout(new FlowLayout());
    	misoadd = new JButton ("+");
    	misoadd.addActionListener(this);
    	misoamount = new JLabel("0");
    	miso = new JLabel("MISO SOUP- 4.49");
    	misominus = new JButton ("-");
    	misominus.addActionListener(this);
    	frame.add(miso);
    	frame.add(misoadd);
    	frame.add(misoamount);
    	frame.add(misominus);
    	frame.setVisible(true);
    		
    		
    		frame.setLayout(new FlowLayout());
        	edimameadd = new JButton ("+");
        	edimameadd.addActionListener(this);
        	edimameamount = new JLabel("0");
        	edimame = new JLabel("EDIMAME - 5.00 FOR 20 Pc");
        	edimameminus = new JButton ("-");
        	edimameminus.addActionListener(this);
        	frame.add(edimame);
        	frame.add(edimameadd);
        	frame.add(edimameamount);
        	frame.add(edimameminus);
        	frame.setVisible(true);
    		

    		
    		frame.setLayout(new FlowLayout());
        	eggrolladd = new JButton ("+");
        	eggrolladd.addActionListener(this);
        	eggrollamount = new JLabel("0");
        	eggroll = new JLabel("EGGROLL- 4.59 FOR 4 Pc");
        	eggrollminus = new JButton ("-");
        	eggrollminus.addActionListener(this);
        	frame.add(eggroll);
        	frame.add(eggrolladd);
        	frame.add(eggrollamount);
        	frame.add(eggrollminus);
        	frame.setVisible(true);
    		
        	Continue = new JButton ("CONTINUE TO CHECKOUT");
        	Continue.addActionListener(this);
        	frame.add(Continue);
        	
        	//description of the foods
        	
    		JLabel rollinfo;
    		frame.setLayout(new FlowLayout());
    		rollinfo = new JLabel("<html>the soups, salads and other side foods are consistent with very fresh ingredients. our miso soup is made with our very healthy tofu <Br> and made into a perfect soup. our eggrol consists of very fresh meats and vegetables. our delicous seasoned edimame are perfect as a side of greens.<Br> To check out press the button. </html>" , SwingConstants.CENTER);
    		frame.add(rollinfo);
    		}		
//the performed action is set to every button that is pressed when you hit the plus and minus to add one or minus one
public void actionPerformed(ActionEvent press) {
 if(press.getSource() == Continue){
	 //set to when you hit continue you go to reciept
	new reciept();
 }else if(press.getSource() == seaweedplus){
	seaweedcounter = seaweedcounter +1;
	seaweedamount.setText(Integer.toString(seaweedcounter));	
	seaweedtotal = seaweedcounter * 5.99;
	saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
	}else if(press.getSource() == seaweedminus){
		if(seaweedcounter >0){
			seaweedcounter = seaweedcounter -1;
			seaweedamount.setText(Integer.toString(seaweedcounter));
			seaweedtotal = seaweedcounter * 5.99;
		}
		if(seaweedcounter == 0){
			seaweedcounter = 0;
			seaweedamount.setText(Integer.toString(misocounter));
			seaweedtotal = seaweedcounter * 5.99;
			saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
		}
		}else if(press.getSource() == misoadd){
		misocounter = misocounter +1;
		misoamount.setText(Integer.toString(misocounter));	
		misototal = misocounter * 4.49;
		saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
		}else if(press.getSource() == misominus){
			if(misocounter >0){
				misocounter = misocounter -1;
				misoamount.setText(Integer.toString(misocounter));
				misototal = misocounter * 4.49;
			}
			if(misocounter == 0){
				misocounter = 0;
				misoamount.setText(Integer.toString(misocounter));
				misototal = misocounter * 4.49;
				saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
			}
			}else if(press.getSource() == edimameadd){
		edimamecounter = edimamecounter +1;
		edimameamount.setText(Integer.toString(edimamecounter));	
		edimametotal = edimamecounter*5.00;
		saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
		}else if(press.getSource() == edimameminus){
			if(edimamecounter >0){
				edimamecounter = edimamecounter -1;
				edimameamount.setText(Integer.toString(edimamecounter));
				edimametotal = edimamecounter*5.00;
			}
			if(edimamecounter == 0){
				edimamecounter = 0;
				edimameamount.setText(Integer.toString(edimamecounter));
				edimametotal = edimamecounter*5.00;
				saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
			}
			}else if(press.getSource() == eggrolladd){
	eggrollcounter = eggrollcounter +1;
	eggrollamount.setText(Integer.toString(eggrollcounter));	
	eggrolltotal = eggrollcounter *4.59;
	saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
	}else if(press.getSource() == eggrollminus){
		if(eggrollcounter >0){
			eggrollcounter = eggrollcounter -1;
			eggrollamount.setText(Integer.toString(eggrollcounter));
			eggrolltotal = eggrollcounter *4.59;
		}
		if(eggrollcounter == 0){
			eggrollcounter = 0;
			eggrollamount.setText(Integer.toString(eggrollcounter));
			eggrolltotal = eggrollcounter *4.59;
saladtotal = eggrolltotal+edimametotal+seaweedtotal+misototal;
			
		
}
}

}
}