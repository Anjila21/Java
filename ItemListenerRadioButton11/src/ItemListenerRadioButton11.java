import javax.swing.*;
import java.awt.Container;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ItemListenerRadioButton11 implements ItemListener
{
    Container c;
    JRadioButton r1,r2,r3;
    JTextField t1;
    ItemListenerRadioButton11()
    {   
        
        JFrame f = new JFrame("ItemListener RadioButton Ex");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        c.setLayout(null);
        
        t1 = new JTextField();
        t1.setBounds(90,100,250,30);
        c.add(t1);
        
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r3 = new JRadioButton("Other");
       
        r1.setBounds(20,30,80,30);
        r2.setBounds(100,30,80,30);
        r3.setBounds(180,30,80,30);
      
        c.add(r1);
        c.add(r2);
        c.add(r3);
       
        r1.addItemListener(this);
         r2.addItemListener(this);
          r3.addItemListener(this);
          
       
        f.setVisible(true);  
    }
    
    public void itemStateChanged(ItemEvent e)
    {
       if(e.getSource() == r1)
       {
           t1.setText("Male is selected");
       }
       if(e.getSource() == r2)
       {
           t1.setText("Female is selected");
       }
       if(e.getSource() == r3)
       {
           t1.setText("Others is selected");
       }
    }
    
    public static void main(String[] args)
    {
        new ItemListenerRadioButton11();
    }

}