import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;

public class MultiCalculator implements ActionListener
{   
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b6;
    JLabel l1,l2,l3;
  
    MultiCalculator()
    {
       JFrame f = new JFrame("Calculator");
       
       l1 =new JLabel("First Number:");
       l1.setBounds(20,50,100,30);
       f.add(l1);
       
       t1 = new JTextField();
       t1.setBounds(150,50,80,30);
       f.add(t1);
       
       
       l2=new JLabel("Second Number:");
  
       l2.setBounds(20,90,100,30);
       f.add(l2);
     
       t2 =new JTextField();
       t2.setBounds(150, 90 ,80 ,30);
       f.add(t2);
      
       b1 = new JButton("+");
       
       b1.setBounds(50,200,50,50);
       f.add(b1);
       
        b2 = new JButton("-");
        
         b2.setBounds(100,200,50,50);
         f.add(b2);
         
         b3 = new JButton("*");
         
          b3.setBounds(150,200,50,50);
          f.add(b3);
          
          b4 = new JButton("/");
          
           b4.setBounds(200,200,50,50);
           f.add(b4);
           
           l3 = new JLabel("=");
         
           l3.setBounds(250,400,400,50);
            f.add(l3);
           
           b6 = new JButton("RESET");
          
           b6.setBounds(300,180,200,50);
           f.add(b6);
   
           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
           b6.addActionListener(this);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {        try{
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        

        if (e.getSource() == b1)
        {
        int c= a+b;
        l3.setText("="+c);
        }
        if (e.getSource() == b2)
        {
        int c= a-b;
        l3.setText("Subtracted Value="+c);
        }
        if (e.getSource() == b3)
        {
        int c= a*b;
        l3.setText("Multiplied Value="+c);
        }
        if (e.getSource() == b4)
        {
        int c= a/b;
        l3.setText("Divided Value="+c);
        }
        if (e.getSource() == b6)
        {
        t1.setText("");
        t2.setText("");
        }
}
     catch(NumberFormatException e1)
        {
            l3.setText("Input Integer Only");
        }
    catch (ArithmeticException e2)
    {
        l3.setText("Cannot Divide by Zero");
    }
        
               
    }
    
    public static void main (String[] args)
    {
        new MultiCalculator();
    }
}