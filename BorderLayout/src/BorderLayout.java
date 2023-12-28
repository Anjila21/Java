import java.awt.Container;
import javax.swing.*;
import java.awt.BorderLayout;
public class BorderLayout
{
   public static void main (String[] args)
   {
       JFrame f = new JFrame("Border Layout");
       f.setSize(500,500);
       f.setLocationRelativeTo(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       
      Container c = f.getContentPane();
       
      BorderLayout borderlayout = new BorderLayout(10,10);
      c.setLayout(borderlayout);
      
     JButton b1 = new JButton("Start");
     JButton b2=  new JButton("End");
     JButton b3 = new JButton("Line Start");
     JButton b4 = new JButton("Line End");
     JButton b5 = new JButton("Center");
     
     c.add(b1,BorderLayout.PAGE_START);
     c.add(b2,BorderLayout.PAGE_END);
     c.add(b3,BorderLayout.LINE_START);
     c.add(b4,BorderLayout.LINE_END);
     c.add(b5,BorderLayout.CENTER);
   }
}