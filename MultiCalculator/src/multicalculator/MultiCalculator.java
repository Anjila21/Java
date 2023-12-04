import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;

public class MultiCalculator implements ActionListener
{   
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4;
  
    MultiCalculator()
    {
       JFrame f = new JFrame("Calculator");
       
       
       t1 = new JTextField();
       t1.setBounds(20,40,100,50);
       f.add(t1);
       
       t2 =new JTextField();
       t2.setBounds(140, 40 ,100 ,50);
       f.add(t2);
       
       b1 = new JButton("+");
       f.add(b1);
       b1.setBounds(50,100,50,50);
       
        b2 = new JButton("-");
        f.add(b2);
         b2.setBounds(100,100,50,50);
         
         b3 = new JButton("*");
         f.add(b3);
          b3.setBounds(150,100,50,50);
          
          b4 = new JButton("/");
          f.add(b4);
           b4.setBounds(200,100,50,50);
           
           
          l1 =new JLabel();
          l2=new JLabel();
          l3=new JLabel();
          l4=new JLabel();
             
           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (b ="+")
        {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c= a+b;
        l1.setText("Sum="+c);
        }
        else if 
    }
    
    public static void main (String[] args)
    {
        new MultiCalculator();
    }
}