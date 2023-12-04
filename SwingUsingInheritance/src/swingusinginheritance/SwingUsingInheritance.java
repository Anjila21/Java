//Basic Structrue of Swing using inheritance

//import javax.swing.*;
//public class SwingUsingInheritance extends JFrame
//{
//    SwingUsingInheritance()
//    {
//        setTitle("Swing Using Inheritace");
//        setSize(500,500);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    public static void main (String[] args)
//    {
//        new SwingUsingInheritance();
//    }
//   
//}

import javax.swing.*;
public class SwingUsingInheritance
{
    SwingUsingInheritance()
    {
        JFrame f = new JFrame("Frame"); //Object creation 
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[] args)
    {
        new SwingUsingInheritance();
    }
   
}