import javax.swing.*;
import java.awt.FlowLayout;

public class MyMenuExample
{
    public static void main(String [] args)
    {
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        FlowLayout flowlayout = new FlowLayout(FlowLayout.LEFT);
        f.setLayout(new FlowLayout());
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        menubar.add(file);
        
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        file.add(i1);
        file.add(i2);
        file.add(i3);
               
        
        JMenu edit = new JMenu("Edit");
        menubar.add(edit);
        
        
        JMenuItem i4 = new JMenuItem("Edit");
        JMenuItem i5 = new JMenuItem("Cut");
        JMenuItem i6 = new JMenuItem("Copy");
        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        
        
        f.setVisible(true);
        f.add(menubar);
        
    }
}