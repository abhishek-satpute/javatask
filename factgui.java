
/**
 * factgui
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class factgui {

    public static void main(String[] args) {
        JFrame frame = new JFrame("  Claculate Factorial ;");
        frame.setSize(550, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(" Enter the number :");
        label.setBounds(10, 40, 130, 30);
        frame.add(label);
        JTextField textField = new JTextField(10);
        textField.setBounds(120, 40, 120, 30);
        frame.add(textField);
        JButton button = new JButton(" Claculate ");
        button.setBounds(250, 40, 120, 30);
        frame.add(button);
        JLabel label2 = new JLabel("");
        label2.setBounds(50, 140, 180, 30);
        frame.add(label2);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int n, i, fact = 1;
                double amount = Double.parseDouble(textField.getText());
                for (i = 1; i <= amount; i++) {
                    fact = fact * i;

                }

                label2.setText(" Factorial No " + fact);
                textField.setText("");
            }
        });

        frame.setVisible(true);
    }
}