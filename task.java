// 4. Simple Banking System

// Hint:

// Classes: Account, Customer

// Features: Create accounts, deposit money, withdraw money, view balance.

// Swing Elements: Use JTextField for account details, JButton for deposit/withdraw, JLabel for showing current balance.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Account {
    String accountNumber;
    String accountHolder;
    double balance;

     Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("" + balance);
        }
        System.out.println("" + balance);
    }
}

class task   {
 
    public static void main(String[] args) {
        double balance = 0.0;

        JFrame frame = new JFrame(" Simple Banking System");
        frame.setBounds(100, 120, 650, 750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Enter Ac/holder Name:");
        label.setBounds(40, 50, 150, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(170, 50, 190, 30);
        frame.add(textField);

        JLabel label1 = new JLabel("Enter AcountNumber:");
        label1.setBounds(40, 90, 160, 30);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(170, 90, 190, 30);
        frame.add(textField1);

        JLabel label2 = new JLabel("Enter Amount :");
        label2.setBounds(40, 140, 160, 30);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(170, 140, 190, 30);
        frame.add(textField2);

        JButton button = new JButton("Submit ");
        button.setBounds(60, 190, 120, 30);
        frame.add(button);
        JButton button1 = new JButton("Deposite ");
        button1.setBounds(180, 190, 120, 30);
        frame.add(button1);
        JButton button2 = new JButton("Withadrow ");
        button2.setBounds(300, 190, 120, 30);
        frame.add(button2);
        JButton button3 = new JButton("Show current Balance  ");
        button3.setBounds(420, 190, 120, 30);
        frame.add(button3);
        JTextArea display = new JTextArea();

        display.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(display);

        scrollPane.setBounds(40, 250, 500, 200);

        frame.add(scrollPane);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String name = textField.getText();

                String name1 = textField1.getText();
                String name2 = textField2.getText();

                display.append("Ac/holder Name: " + name + "\n");

                display.append(" Account no: " + name1 + "\n");
                display.append("Amount: " + name2 + "\n\n");

            }
        });
        JPanel balancePanel = new JPanel();
        JLabel label3 = new JLabel("Current Balance: $0");
        label3.setBounds(40, 600, 120, 60);
        double balance1 = 00;
        frame.add(label3);

        frame.setVisible(true);
Account obj = new Account("2345456", "Abhi ");
    }

}
