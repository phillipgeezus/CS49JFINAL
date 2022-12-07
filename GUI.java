package final_group_project;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class GUI extends Bank{

public GUI(double total, double USDollar, double australianDollar, double canadianDollar, double yen,
		double euro, double peso, double poundSterling, double dong, double interestRate) {
	super(total, USDollar, australianDollar, canadianDollar, yen, euro, peso, poundSterling, dong, interestRate);
	// TODO Auto-generated constructor stub
}



public static void converter() {
	try{
		double min = 999.99;
		double max = 99999.99;
		double rand = (int) ((Math.random() * (max - min)) + min);
		//System.out.println("Account Balance is: " +  String.format( "$" + "%.2f", rand) );
        // Creating a new frame using JFrame
        JFrame f = new JFrame("Currency Converter");
  
        // Creating two labels
        JLabel l0, l1, l2, l3, l4, l5, l6, l7 ,l8, l9;
  

        JTextField t1, t2, t3, t4, t5, t6, t7 ,t8;
  
        // Creating three buttons
        JButton b1, b2, b3, b4;
  
        // Naming the labels and setting
        // the bounds for the labels
        l0 = new JLabel("Account Amount: " + String.format( "$" + "%.2f", rand) );
        l0.setBounds(900,100,200,20);
        l1 = new JLabel("USD:");
        l1.setBounds(100,100,200,20);
        l2 = new JLabel("AUD");
        l2.setBounds(100,200,200,20);
        l3 = new JLabel("CAD:");
        l3.setBounds(100,300,200,20);
        l4 = new JLabel("Yen");
        l4.setBounds(100,400,200,20);
        l5 = new JLabel("Euro:");
        l5.setBounds(400,100,200,20);
        l6 = new JLabel("Peso");
        l6.setBounds(400,200,200,20);
        l7 = new JLabel("Pound:");
        l7.setBounds(400,300,200,20);
        l8 = new JLabel("Dong");
        l8.setBounds(400,400,200,20);


  
        // Initializing the text fields with
        // 0 by default and setting the
        // bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(200,100,100,30);
        t2 = new JTextField("0");
        t2.setBounds(200,200,100,30);
        t3 = new JTextField("0");
        t3.setBounds(200,300,100,30);
        t4 = new JTextField("0");
        t4.setBounds(200,400,100,30);
        t5 = new JTextField("0");
        t5.setBounds(500,100,100,30);
        t6 = new JTextField("0"); 
        t6.setBounds(500,200,100,30);
        t7 = new JTextField("0");
        t7.setBounds(500,300,100,30);
        t8 = new JTextField("0");
        t8.setBounds(500,400,100,30);
  
        // Creating a button for INR,
        // one button for the dollar
        // and one button to close
        // and setting the bounds
        b1 = new JButton("Convert USD to Foreign");
        b1.setBounds(250,500,200,30);
        b2 = new JButton("Deposit");
        b2.setBounds(900,200,200,30);
        b3 = new JButton("Withdraw");
        b3.setBounds(900,250,200,30);
        b4 = new JButton("EXIT");
        b4.setBounds(500,600,100,30);
  
        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DecimalFormat df = new DecimalFormat("0.00");
                // Converting to double
                float USDollar = Float.parseFloat(t1.getText()); 


                float australianDollar = (float) (USDollar*1.49);
                float canadianDollar =(float) (USDollar*1.36);
                float yen = (float)(USDollar*137.00);
                float euro = (float)(USDollar/1.20);
                float peso = (float)(USDollar*19.76); 
                float pound = (float)(USDollar/1.21);
                float dong = (float)(USDollar*24000.00);
  
                // Getting the string value of the
                // calculated value
                df.format(australianDollar);
                df.format(canadianDollar);
                df.format(yen);
                df.format(euro);
                df.format(peso);
                df.format(pound);
                df.format(dong);
                
                
                //String str1 = String.format( "%.2f", australianDollar) );
	        
                String str1 = String.format("%.2f", australianDollar);
                String str2 = String.format("%.2f",canadianDollar);
                String str3 = String.format("%.2f",yen);
                String str4 = String.format("%.2f",euro);
                String str5 = String.format("%.2f",peso);
                String str6 = String.format("%.2f",pound);
                String str7 = String.format("%.2f",dong);

                
  
                // Placing it in the text box
                t2.setText(str1);
                t3.setText(str2);
                t4.setText(str3);
                t5.setText(str4);
                t6.setText(str5);
                t7.setText(str6);
                t8.setText(str7);

            }
        });

        // Adding action listener 
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	String userResponse = null;
            	
            	try{
            		userResponse = JOptionPane.showInputDialog("Enter how much you want to deposit. "); 
                	Double money = Double.parseDouble(userResponse);
                    double balance = money + rand;
                    JOptionPane.showMessageDialog(null, "You have added $" + userResponse + " to your account. Your balance is now $" + balance);
                    l0.setText("Account Amount: " + String.format( "$" + "%.2f", balance) );
            	}
            	catch(NumberFormatException g){
            		JOptionPane.showMessageDialog(null,"Enter a valid integer");
            	}
        		catch(IllegalArgumentException g) {
        			JOptionPane.showMessageDialog(null,"Enter a valid integer");
        		}
                
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	String userResponse = null;
            	userResponse = JOptionPane.showInputDialog("Enter how much you want to withdraw. ");       
                // Converting to double           	
            	Double money = Double.parseDouble(userResponse);
                double balance = rand - money;
                JOptionPane.showMessageDialog(null, "You have withdrawn $" + userResponse + " to your account. Your balance is now $" + balance);
                l0.setText("Account Amount: " + String.format( "$" + "%.2f", balance) );
            }
        });
        // Action listener to close the form
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        // Adding the created objects
        // to the form
        f.add(l0);
        f.add(l1);
        f.add(t1);     
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l3);
        f.add(t3);     
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);     
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);     
        f.add(l5);
        f.add(t5);
        f.add(l6);
        f.add(t6);     
        f.add(l6);
        f.add(t6);
        f.add(l7);
        f.add(t7);     
        f.add(l7);
        f.add(t7);
        f.add(l8);
        f.add(t8);     
        f.add(l8);
        f.add(t8);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);		        
	}
	catch(NumberFormatException e) {
		System.out.println("Enter an integer please. ");
		
	}
}
	
	 // Driver code
    public static void main(String args[]) {
        converter();
    }

	@Override
	public void calculateInterest(int year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTotal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transitFromOtherBank(double money, double balance, int bank) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transitToOtherBank(double money, int bank, Bank bank2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Bank bank2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
