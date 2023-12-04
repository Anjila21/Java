// Button Creation

import javax.swing.*;
public class ButtonCreation 
{
    ButtonCreation()
    {
        JFrame f = new JFrame("Frame");
        JButton b = new JButton("Click Me");
//        setTitle("Sample");
        f.setSize(500,500);
        f.add(b);
        b.setBounds(20,20,100,50);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
                
    }
    public static void main(String[] args)
    {
        new ButtonCreation();
    }
}