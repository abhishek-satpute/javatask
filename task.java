// 4. Simple Banking System

// Hint:

// Classes: Account, Customer

// Features: Create accounts, deposit money, withdraw money, view balance.

// Swing Elements: Use JTextField for account details, JButton for deposit/withdraw, JLabel for showing current balance.
// Classes: Account, Customer

// Features: Create accounts, deposit money, withdraw money, view balance.

// Swing Elements: Use JTextField for account details, JButton for deposit/withdraw, JLabel for showing current balance.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree.DynamicUtilTreeNode;

class bancksyste {
    static double balance = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame(" New task");
        frame.setSize(550, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // label
        JLabel l1 = new JLabel("AccountHolder Name :");
        l1.setBounds(20, 20, 160, 30);
        frame.add(l1);
        JTextField textField = new JTextField(10);
        textField.setBounds(150, 20, 160, 30);
        frame.add(textField);
        // account number :
        JLabel l2 = new JLabel("Account Number :");
        l2.setBounds(20, 60, 160, 30);
        frame.add(l2);
        JTextField textField2 = new JTextField(10);
        textField2.setBounds(130, 60, 160, 30);
        frame.add(textField2);
        JButton button = new JButton("Create Ac:");
        button.setBounds(300, 60, 120, 30);
        frame.add(button);
        JLabel label1 = new JLabel("");
        label1.setBounds(60, 220, 350, 30);
        frame.add(label1);

        // withdeow
        JLabel l3 = new JLabel(" Transction Amount :");
        l3.setBounds(20, 100, 160, 30);
        frame.add(l3);
        JTextField textField3 = new JTextField(10);
        textField3.setBounds(130, 100, 160, 30);
        frame.add(textField3);
        JButton button1 = new JButton(" Deposite:");
        button1.setBounds(300, 100, 120, 30);
        frame.add(button1);

        JButton button4 = new JButton("Withdraw:");
        button4.setBounds(130, 140, 120, 30);
        frame.add(button4);
        JLabel label4 = new JLabel("");
        label4.setBounds(300, 140, 150, 40);
        frame.add(label4);

        // JTextArea display = new JTextArea();
        // display.setEditable(false);
        // JScrollPane scrollPane = new JScrollPane(display);
        // scrollPane.setBounds(80, 150, 260, 60);
        // frame.add(scrollPane);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name1 = textField.getText();
                String name2 = textField2.getText();
                label1.setText("Ac/holder Name  :" + name1 + "Ac Number :" + name2);

            }
        });
        // butten deposite
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(textField3.getText());
                balance += amount;
                label4.setText("Balance $:" + balance);      
                textField3.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(textField3.getText());
                if (amount > balance) {
                    JOptionPane.showMessageDialog(frame, "Insufficient funds");
                } else {
                    balance -= amount;
                    label4.setText("Balance: $" + balance);
                    textField3.setText("");
                }
            }
        });
        frame.setVisible(true);

    }
}


