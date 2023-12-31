import javax.swing.*;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class KeyListenerEx implements KeyListener
{
    Container c;
    JTextField t1;
    JTextArea ta;
    KeyListenerEx()
    {
        JFrame f = new JFrame("Key Listener Example");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        t1 = new JTextField();
        t1.setBounds(20,40,50,30);
        c.add(t1);
        
        ta = new JTextArea();
        ta.setBounds(70,100,200,100);
        c.add(ta);
        
        t1.addKeyListener(this);
        
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    public void keyPressed(KeyEvent e)
    {
        char keyPressed = e.getKeyChar();
        ta.setText(ta.getText()+"Key Pressed \t:"+keyPressed+"\n");
    }
    public void keyReleased(KeyEvent e)
    {
        char keyReleased = e.getKeyChar();
        ta.setText(ta.getText()+"Key Released \t:"+keyReleased+"\n");
        
    }
    public void keyTyped(KeyEvent e)
    {
        char keyTyped = e.getKeyChar();
        ta.setText(ta.getText()+"Key Typed \t:"+keyTyped+"\n");
        
    }
    
    public static void main(String[ ] args)
    {
        new KeyListenerEx();
    }
    
}