
import javax.swing.*;
import java.awt.event.*;

public class SelfTry implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2, b3, b4, b5;

    SelfTry() {
        // Making object of the class JFrame
        JFrame f = new JFrame("Calculator");

        //For writing static content we use label
        l1 = new JLabel("Enter First Number:");
        l1.setBounds(20, 20, 150, 40);
        f.add(l1);

        //For Filling up user's input
        t1 = new JTextField();
        t1.setBounds(140, 20, 100, 40);
        f.add(t1);

        l2 = new JLabel("Enter Second Number:");
        l2.setBounds(20, 60, 160, 40);
        f.add(l2);

        t2 = new JTextField();
        t2.setBounds(160, 60, 150, 40);
        f.add(t2);

        //Adding Buttons
        b1 = new JButton("+");
        b1.setBounds(150, 150, 50, 50);
        f.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("-");
        b2.setBounds(200, 150, 50, 50);
        f.add(b2);
        b2.addActionListener(this);

        b3 = new JButton("*");
        b3.setBounds(250, 150, 50, 50);
        f.add(b3);
        b3.addActionListener(this);

        b4 = new JButton("/");
        b4.setBounds(300, 150, 50, 50);
        f.add(b4);
        b4.addActionListener(this);

        l3 = new JLabel("=");

        l3.setBounds(250, 400, 400, 50);
        f.add(l3);

        b5 = new JButton("RESET");
        b5.setBounds(200, 250, 200, 50);
        f.add(b5);
        b5.addActionListener(this);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {

            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            if (e.getSource() == b1) {
                int c = a + b;
                l3.setText("Sum Value:" + c);
            }
            if (e.getSource() == b2) {
                int c = a - b;
                l3.setText("Subtracted Value:" + c);
            }
            if (e.getSource() == b3) {
                int c = a * b;
                l3.setText("Multiplied Value:" + c);
            }
            if (e.getSource() == b4) {
                int c = a / b;
                l3.setText("Divided Value:" + c);
            }
            if (e.getSource() == b5) {
                t1.setText("");
                t2.setText("");
            }
        } catch (NumberFormatException e1) {
            l3.setText("Input Integer Only");
        } catch (ArithmeticException e2) {
            l3.setText("Cannot Divide by Zero");
        }
    }

    public static void main(String[] args) {
        new SelfTry();
    }
}
