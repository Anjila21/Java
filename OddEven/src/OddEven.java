import javax.swing.*;

public class OddEven {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition and Odd/Even Checker");
        JPanel panel = new JPanel();

        JTextField numField1 = new JTextField(10);
        JTextField numField2 = new JTextField(10);
        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel();

        panel.add(new JLabel("Enter number 1: "));
        panel.add(numField1);
        panel.add(new JLabel("Enter number 2: "));
        panel.add(numField2);
        panel.add(addButton);
        panel.add(resultLabel);

        addButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());

                int sum = num1 + num2;
                resultLabel.setText("Sum: " + sum + " - " + (sum % 2 == 0 ? "Even" : "Odd"));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid integers");
            }
        });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
