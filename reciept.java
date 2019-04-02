import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;
public class reciept extends JFrame implements ActionListener {
//setting all the doubles buttons and labels necessary for adding all the totals together
	double total1;
	double total2;
JLabel dollar;	
JButton print;
JLabel totalamount;
JLabel thanks;
DecimalFormat df = new DecimalFormat("0.00");

public reciept(){
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("CHECKOUT");
	
	//setting size and location of frame
	frame.setSize(400,200);
	frame.setLocation(400,350);
	//initializing rhe JButton and JLabel so it come out as pressing the button for the total
	frame.setLayout(new FlowLayout());
	thanks = new JLabel("thankyou please come again and have a very nice day!");
	add(thanks);
	totalamount = new JLabel("00.00");
	dollar = new JLabel("$");
	add(totalamount);
	print = new JButton("press here for total");
	print.addActionListener(this);
	frame.add(print);
	frame.add(dollar);
	frame.add(totalamount);
	frame.add(thanks);
	frame.setVisible(true);
}
//when the action of pressing the button is one it will a up all the totals and display it as the price total
public void actionPerformed(ActionEvent press) {
	if(press.getSource() == print){
		String rollValue = Double.toString(rollMenu.totalroll);
		
		double rainbow1 = Double.parseDouble(rollValue);
		
String meatValue = Double.toString(meatMenu.meattotal);
		
		double meat1 = Double.parseDouble(meatValue);
		
String saladValue = Double.toString(saladMenu.saladtotal);
		
		double salad1 = Double.parseDouble(saladValue);
		total1 = rainbow1 + meat1+salad1;
			
			
			totalamount.setText(df.format(total1));
			
	}
	
}
}