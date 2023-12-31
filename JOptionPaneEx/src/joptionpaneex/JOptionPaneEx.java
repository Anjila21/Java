// JOption can be implemented in there way
//1.InputDialog
//2.MessageDialog
////3.ConformDialog

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JOptionPaneEx implements ActionListener
{
    JButton b;
    JOptionPaneEx()
    {
        JFrame f = new JFrame("Input Dialog");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.getContentPane();
        f.setLayout( new FlowLayout());
        
        b = new JButton("Button");
        b.setBounds(20,30,50,60);
        f.add(b);
        
        b.addActionListener(this);
        
     
        f.setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String s = JOptionPane.showInputDialog("Enter your name");
        System.out.println("Name:"+s);
    }
    
    public static void main(String[] args)
    {
        new JOptionPaneEx();
    }
}