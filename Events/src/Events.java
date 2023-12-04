import javax.swing.*;
import java.awt.event.*;

public class Events implements ActionListener
{
     JButton b;
    Events()
    {
      JFrame f = new JFrame("Event Handler Example");
       b = new JButton("Click Me");
      f.setSize(500,500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      b.setBounds(20,30,100,50);
      f.add(b);
      f.setLayout(null);
      b.addActionListener(this);
      f.setVisible(true);
    }
  public void actionPerformed(ActionEvent e)
  {
   b.setText("Clicked!!!"); 
  }
  
  public static void main(String[] args)
  {
      new Events();
  }
}