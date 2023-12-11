import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

class Form extends JFrame
{
    JLabel l1,l2,l3,l4,db;
    JTextField t1,t2;
    JRadioButton b1 ,b2,b3;
    JComboBox day,month,year;//cb;
    JTextArea ta;
    JCheckBox c1;
    Container c;
    public Form()
            
    {
       
     setSize(700,700);
     setTitle("Registration Form");
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     c = this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.lightGray);
     
     l1 = new JLabel("Name:");
        l1.setBounds(20,50,80,30);
        c.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(100,50, 80,30);
        c.add(t1);
        
        l2 = new JLabel("Phone Number:");
        l2.setBounds(20,90,100,30);
        c.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(130,90, 80,30);
        c.add(t2);
        
        l3 = new JLabel("Gender:");
        l3.setBounds(20,150,80,30);
        c.add(l3);

        
        b1 = new JRadioButton("Male");
        b1.setBounds(100,150,80,30);
        c.add(b1);
        
        b2 = new JRadioButton("Female");
        b2.setBounds(200,150,80,30);
        c.add(b2);
        
         b3 = new JRadioButton("Others");
        b3.setBounds(300,150,80,30);
        c.add(b3);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        
        db = new JLabel("DOB:");
        db.setBounds(20,200,80,30);
        c.add(db);
        
        String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        String months[]={"Jan","Feb","March","April","May","Jun","JUL","AUG","SEP","OCT","NOV","DEC"};
        String years[]={"1999","2000","2001","2002","2003"};
        
        day = new JComboBox(days);
        day.setBounds(100,200,50,30);
        c.add(day);
        
        
        month = new JComboBox(months);
        month.setBounds(150,200,50,30);
        c.add(month);

        
        year = new JComboBox(years);
        year.setBounds(200,200,80,30);
        c.add(year);
        
        l4 = new JLabel("Address:");
        l4.setBounds(20,250,80,30);
        c.add(l4);
        
        
        
        ta = new JTextArea();
        ta.setBounds(110, 250,80,30);
        c.add(ta);
        ta.setLineWrap(true);

        
         c1 = new JCheckBox("I accept all the terms and conditions");
         c1.setBounds(20,280,300,30);
         c.add(c1);
        
//        String Country[] = {"Nepal", "India", "Japan","Turkey"};
//       
//        cb = new JComboBox(Country);
//        cb.setBounds(20,200,150,30);
//        c.add(cb);
        
        
     setVisible(true);
    }
    
    public static void main(String[] args) {
        new Form();
    }
}
