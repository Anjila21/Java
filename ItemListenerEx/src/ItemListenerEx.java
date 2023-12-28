import javax.swing.*;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerEx implements ItemListener
{
    Container c;
    JComboBox cb;
    JTextField t1;
    
    ItemListenerEx()
    {
        JFrame j = new JFrame("Item Listener Example");
        j.setSize(500,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setLayout(null);
        c=j.getContentPane();
        
        
        String Country[] = {"Nepal","India","China","Hongkong"};
        cb = new JComboBox(Country);
        cb.setBounds(50,50,80,30);
        c.add(cb);
        
        t1 = new JTextField();
        t1.setBounds(70,100,200,200);
        c.add(t1);
        
        
        cb.addItemListener(this);
        c.setVisible(true);
        
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        String str = cb.getSelectedItem().toString();
        t1.setText(str);
    }
    
    public static void main(String[] args)
    {
        new ItemListenerEx();
    }
}