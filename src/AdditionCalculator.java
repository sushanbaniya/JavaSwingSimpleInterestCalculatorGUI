import javax.swing.*;
import java.awt.*;

public class AdditionCalculator extends JFrame {
    JTextField p = new JTextField();
    JTextField t = new JTextField();
    JTextField r = new JTextField();
    JTextField i = new JTextField();

    AdditionCalculator() {
        setTitle("Simple Interest CALCULATOR");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Principal:")); add(p);
        add(new JLabel("Time:")); add(t);
        add(new JLabel("Rate: ")); add(r);
        add(new JLabel("Interest: ")); add(i);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(e ->
                i.setText(String.format("%.2f", (Double.parseDouble(p.getText()) * Double.parseDouble(t.getText()) * Double.parseDouble(r.getText())) / 100) )
                );

        add(calculateButton);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdditionCalculator::new);
    }


}
