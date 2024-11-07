import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Objects;
/*
 * Author: Christian Powlette
 * Due Date: April 12, 2024
 * Professor: Yuvaraj Sambandan
 * Course: COSC-1200-06 Object-Oriented Programming
 * Description of class: Represents a Program to obtain a Username and Password Input and Display messages accordingly
 */

public class PasswordFieldExample {
    public static void main(String[] args) {
        final String usernameCredentials = "Christian";
        final String passwordCredentials = "100919830";
        JFrame f=new JFrame("Password Field Example");
        final JLabel label = new JLabel();
        label.setBounds(20,150, 200,50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(140,75,100,30); //PASSWORD FIELD
        JLabel l1=new JLabel("Enter User name:");
        l1.setBounds(0,20, 130,30);
        JLabel l2=new JLabel("Enter Password:");
        l2.setBounds(0,75, 100,30);
        JButton b = new JButton("Click Here");
        b.setBounds(5,120, 100,30);
        final JTextField text = new JTextField();
        text.setBounds(130,20, 100,30);
        f.add(value);
        f.add(l1);
        f.add(label);
        f.add(l2);
        f.add(b);
        f.add(text);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Username = text.getText();
                if (Objects.equals(Username, usernameCredentials)) {
                    JOptionPane.showMessageDialog(f,"Username and Password are correct","Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
                String Password = Arrays.toString(value.getPassword());
                if (Objects.equals(Password, passwordCredentials)) {
                    JOptionPane.showMessageDialog(f,"Username and Password are correct","Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!Objects.equals(Username, usernameCredentials)) {
                    JOptionPane.showMessageDialog(f,"Username and Password are Incorrect","Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!Password.equals(passwordCredentials)) {
                    JOptionPane.showMessageDialog(f,"Username and Password are Incorrect","Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
/*               data += STR.", Password: \{new String(value.getPassword())}";
                label.setText(data);*/
            }
        });
    }
}
