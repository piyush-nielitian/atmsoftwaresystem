
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Help extends JFrame implements ActionListener
{
 
	JFrame jf;
    Font f,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l51,l61;
	JButton cancel;
	ImageIcon img;
 
    Timer t;

		Help()
		{
	     	jf=new JFrame();
	     	f = new Font("Times New Roman",Font.BOLD,20);//button
	   		f1 = new Font("Times New Roman",Font.BOLD+Font.ITALIC,25);//label
			jf.setLayout(null);
			jf.getContentPane().setBackground( Color.yellow);

		 

			l2=new JLabel("Help");
		    l2.setFont(new Font("Times New ROman",Font.BOLD,30));
		    l2.setForeground(Color.BLUE);
			l2.setBounds(320,100,200,30);
			jf.add(l2);

			l3=new JLabel("Cash withdrawal options used to getting money from the ATM.");
			l3.setFont(f);
			l3.setForeground(Color.red);
			l3.setBounds(40,150,670,25);
			jf.add(l3);

			l4=new JLabel("Balance enquiry used to display and print your balance.");
			l4.setFont(f);
			l4.setForeground(Color.red);
			l4.setBounds(40,200,670,25);
	    	jf.add(l4);

	    	l5=new JLabel("Mini statement used to print your balance.");
		    l5.setFont(f);
			l5.setForeground(Color.red);
			l5.setBounds(40,250,650,25);
			jf.add(l5);

			l51=new JLabel("Electricty bill used pay electricty bill.");
			l51.setFont(f);
			l51.setForeground(Color.red);
			l51.setBounds(40,270,650,25);
			jf.add(l51);

			l61=new JLabel("cash deposit used deposit money into your account.");
			l61.setFont(f);
			l61.setForeground(Color.black);
			l61.setBounds(40,300,650,25);
			jf.add(l61);

			l6=new JLabel("PIN change option used to change PIN no of ATM card.");
			l6.setFont(f);
			l6.setForeground(Color.black);
			l6.setBounds(40,350,670,25);
			jf.add(l6);


			l7=new JLabel("Loan information option used to give various loan rate.");
			l7.setFont(f);
			l7.setForeground(Color.black);
			l7.setBounds(40,380,650,25);
			jf.add(l7);


			l8=new JLabel("For more information Visit our your nearest branch of our Bank.");
			l8.setFont(f);
			l8.setForeground(Color.black);
			l8.setBounds(40,400,700,25);
			jf.add(l8);

			l9=new JLabel("This ATM software developed by,");
			l9.setFont(f);
			l9.setForeground(Color.RED);
			l9.setBounds(40,430,300,25);
			jf.add(l9);

			l10=new JLabel("Mr. Piyush Srivastava");
			l10.setFont(f1);
			l10.setForeground(Color.RED);
			l10.setBounds(310,450,250,30);
			jf.add(l10);

			l11=new JLabel("Under the guidence of ");
			l11.setFont(f);
			l11.setForeground(Color.RED);
			l11.setBounds(40,500,200,20);
			jf.add(l11);

			l12=new JLabel("Miss. komal Srivastava");
			l12.setFont(f1);
			l12.setForeground(Color.RED);
			l12.setBounds(250,500,250,30);
			jf.add(l12);

			cancel=new JButton("Cancel",new ImageIcon("cancel.png"));
			cancel.setFont(f);
			cancel.setBounds(280,530,130,40);
			cancel.addActionListener(this);
			jf.add(cancel);

			img=new ImageIcon("bank.jpg");
	    	l1=new JLabel(img);
	    	l1.setBounds(1,1,600,700);
	    	jf.add(l1);

		 	jf.setTitle("Help");
	        jf.setSize(800,700);
			jf.setLocation(220,20);
		 	jf.setResizable(false);
	   		jf.setVisible(true);

	   	    t =new Timer(30000,this);// 30 minisecond
            t.start();

	}
	public void actionPerformed(ActionEvent ae)
	 {
         if(ae.getSource()==t)
     	{
     			t.stop();
 int reply=JOptionPane.showConfirmDialog(null,"Do you want continue?","ATM Time Warning",JOptionPane.YES_NO_OPTION);

	             if (reply == JOptionPane.YES_OPTION)
	   			{
	   				 
	   				t.start();
	   		    }
	   		  else if (reply == JOptionPane.NO_OPTION)
	   		    {
	   		    	 
	   		    	t.stop();
                   new Welcome();
         	       jf.setVisible(false);
		        }
     	}
		else if(ae.getSource()==cancel)
		{
		 
           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
	       
	        t.stop();
           	new Welcome();
           	jf.setVisible(false);
		}
	}
	/* public static void main(String args[])
	  {
	    	new Help();
	  }*/
}
