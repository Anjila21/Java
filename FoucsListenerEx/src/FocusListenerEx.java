import javax.swing.*;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.Container;

public class FocusListenerEx implements FocusListener
{
    Container c;
    JTextField t1;
    JTextArea ta;
    FocusListenerEx()
    {
        JFrame f = new JFrame("Focus Listener Example");
        
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        c.setLayout(null);
        
        t1 = new JTextField();
        t1.setBounds(20,40,50,30);
        c.add(t1);
        
        ta = new JTextArea();
        ta.setBounds(20,100,100,100);
        c.add(ta);
        
        t1.addFocusListener(this);
        f.setVisible(true);
    }
    
    public void focusGained(FocusEvent e)
    {
        if(e.getSource() == t1){
        ta.setText("Focus Gained");
        }
    }
    public void focusLost(FocusEvent e)
    {
        if(e.getSource() ==t1){
         ta.setText("Focus Lost");
        }
    }
    
    public static void main(String[] args)
    {
      new  FocusListenerEx();
    }
}