import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;

public class GridLayout11
{
    public static void main(String[] args)
    {
        JFrame g = new JFrame("Grid Layout");
        g.setSize(500,500);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setLocationRelativeTo(null);
        
        Container c = g.getContentPane();
        
        GridLayout gridLayout =new GridLayout();
        c.setLayout(gridLayout);
        
        JButton b1 = new JButton("Button 1 ");
        JButton b2 = new JButton("Button 2 ");
         JButton b3 = new JButton("Button 3 ");
          JButton b4 = new JButton("Button 4 ");
           JButton b5 = new JButton("Button 5 ");
           
           c.add(b1);
            c.add(b2);
             c.add(b3);
              c.add(b4);
               c.add(b5);
               
            f.setVisible(true);
        
    }
}