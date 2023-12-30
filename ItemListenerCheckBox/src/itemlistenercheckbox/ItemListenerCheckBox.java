import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.Container;

public class ItemListenerCheckBox implements ItemListener
{
    Container c;
    JCheckBox c1;
    ItemListenerCheckBox()
    {
        JFrame f = new JFrame();
        c1 = new JCheckBox();
        
        
        
    }
    
    public void ItemStateChanged(ItemEvent e)
    {
        
    }
    
    public static void main(String[] args)
    {
        new ItemListenerCheckBox();
    }
    
}