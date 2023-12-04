import javax.swing.*;
import java.awt.event.*;

public class EventExample1 implements ActionListener
{
    JButton b;
    EventExample1()
    {
        
        JFrame f = new JFrame("Sample Event");
        b = new JButton("Click me!!");
        f.setLayout(null);
        b.setBounds(20,20,300,80);
        f.add(b);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
        f.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        b.setText("Thank you Clicking!");
    }
    public static void main(String[] args)
    {
        new EventExample1();
    }
}