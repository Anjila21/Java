import javax.swing.*;
import java.awt.Container;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ItemListenerCheckBox11 implements ItemListener
{
    Container c;
    JCheckBox c1,c2,c3,c4;
    JTextField t1;
    ItemListenerCheckBox11()
    {   
        
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        
        t1 = new JTextField();
        f.setBounds(210,30,50,60);
        c.add(t1);
        
        c1 = new JCheckBox("Advanced Java");
        c2 = new JCheckBox("SPM");
        c3 = new JCheckBox("POM");
        c4 = new JCheckBox("Data WareHouse");
        
        
        c1.setBounds(20,30,50,30);
        c2.setBounds(80,30,50,30);
        c3.setBounds(140,30,50,30);
        c4.setBounds(190,30,50,30);
        
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);        
        
        c1.addItemListener(this);
         c2.addItemListener(this);
          c3.addItemListener(this);
           c4.addItemListener(this);
        
           f.setLayout(null);
        f.setVisible(true);
        
        
        
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        if(c1.isSelected())
        {
            t1.setText(c1.getText());
        }
        if(c2.isSelected())
        {
            t1.setText(c2.getText());
        }
        if(c3.isSelected())
        {
            t1.setText(c3.getText());
        }
        if(c4.isSelected())
        {
            t1.setText(c4.getText());
        }
    }
    
    public static void main(String[] args)
    {
        new ItemListenerCheckBox11();
    }

}