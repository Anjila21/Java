import java.awt.Container;
import javax.swing.*;
import java.awt.CardLayout;

public class CardLay_1
{
   public static void main (String[] args)
    {
       JFrame j = new JFrame("Card Layout");
       j.setSize(500,500);
       j.setLocationRelativeTo(null);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container c = j.getContentPane();
       
       CardLayout cardLayout= new CardLayout();
       c.setLayout(cardLayout);
       
       JButton b1 = new JButton("Button 1 ");
        JButton b2 = new JButton("Button 2 ");
         JButton b3 = new JButton("Button 3 ");
          JButton b4 = new JButton("Button 4 ");
           JButton b5 = new JButton("Button 5 ");
           
           c.add(b1,0);
            c.add(b2,1);
             c.add(b3,2);
              c.add(b4,3);
               c.add(b5,4);
           
           
          
       
       
       j.setVisible(true);
       
       
    }
    
}