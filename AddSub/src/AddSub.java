//To find sum and difference of two numbers.
//Use Textfield for input and labelfor outuput
//Display sum if user press mouse and difference if use release mouse.

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;

public class AddSub extends JFrame implements MouseListener {

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;
    Container c;

    AddSub() {
        setTitle("Mini Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        c = this.getContentPane();

        l1 = new JLabel("Enter 1st Number:");
        l1.setBounds(20, 20, 120, 30);
        c.add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 20, 80, 30);
        c.add(t1);

        l2 = new JLabel("Enter 2nd Number");
        l2.setBounds(20, 40, 120, 30);
        c.add(l2);

        t2 = new JTextField();
        t2.setBounds(150, 40, 80, 30);
        c.add(t2);

        l3 = new JLabel();
        l3.setBounds(60, 100, 100, 30);
        c.add(l1);

        b1 = new JButton("Submit");
        b1.setBounds(20, 80, 100, 30);
        c.add(b1);
       

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        b1.addMouseListener(this);
        
        setVisible(true);

    }

    public void mousePressed(MouseEvent e1) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        l3.setText("Added Value =" + c);

    }

    public void mouseRelesed(MouseEvent e2) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a - b;
        l3.setText("Subtrated Value =" + c);
    }

    public static void main(String[] args) {
        new AddSub();
    }
}
