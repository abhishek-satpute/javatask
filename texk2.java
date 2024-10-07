
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Room {
    int roomNumber;
    String roomType;
    boolean isAvailable;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        
    }
}

class Booking {
    int bookingId;
    int roomNumber;
    String customerName;
    String checkInDate;
   

    Booking(int bookingId, int roomNumber, String customerName) {
        this.bookingId = bookingId;
        this.roomNumber = roomNumber;
        this.customerName = customerName;
        
    }
}

class task1 {
    private String[] rooms = {"Room 1", "Room 2", "Room 3", "Room 4", "Room 5"};

    public static void main(String[] args) {
        double balance = 0.0;

        JFrame frame = new JFrame(" ");
        frame.setBounds(100, 120, 650, 750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Enter Full  Name:");
        label.setBounds(40, 50, 150, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(170, 50, 190, 30);
        frame.add(textField);

        JLabel label1 = new JLabel("Enter  Address :");
        label1.setBounds(40, 90, 160, 30);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(170, 90, 190, 30);
        frame.add(textField1);

        JLabel label2 = new JLabel(" ContactNO  :");
        label2.setBounds(40, 140, 160, 30);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(170, 140, 190, 30);
        frame.add(textField2);
        JLabel label3 = new JLabel(" Room Name And type  :");
        label3.setBounds(40, 190, 160, 30);
        frame.add(label3);

        JTextField textField3 = new JTextField();
        textField3.setBounds(170, 190, 190, 30);
        frame.add(textField3);

        JButton button = new JButton("Submit ");
        button.setBounds(60, 240, 120, 30);
        frame.add(button);

        JTextArea display = new JTextArea();

        display.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(display);

        scrollPane.setBounds(40, 290, 500, 200);

        frame.add(scrollPane);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String name = textField.getText();

                String name1 = textField1.getText();
                String name2 = textField2.getText();
                String name3 = textField3.getText();

                display.append("Full Name: " + name + "\n");

                display.append(" Addres : " + name1 + "\n");
                display.append("Contact " + name2 + "\n\n");
                display.append("Romm Type //sin..... " + name2 + "\n\n");

            }
        });
        JPanel balancePanel = new JPanel();

        frame.setVisible(true);

    }

}
