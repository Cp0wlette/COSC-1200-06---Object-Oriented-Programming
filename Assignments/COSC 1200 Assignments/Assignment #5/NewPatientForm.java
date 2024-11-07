import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.util.regex.*;

public class NewPatientForm extends JFrame {
    private JTextField patientNameField, ownerNameField, emailField;
    private JRadioButton vet1Button, vet2Button;
    private JButton registerButton, clearButton, exitButton;
    private JLabel statusLabel;

    public NewPatientForm() {
        setTitle("New Patient Registry");
        setIconImage(new ImageIcon("custom_icon.png").getImage()); // Replace custom_icon.png with your icon file path
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Create components
        JLabel patientLabel = new JLabel("Patient Name:");
        patientNameField = new JTextField(20);
        JLabel ownerLabel = new JLabel("Owner Name:");
        ownerNameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email Address:");
        emailField = new JTextField(20);
        JLabel vetLabel = new JLabel("Assign Vet:");
        vet1Button = new JRadioButton("John Doe", true);
        vet2Button = new JRadioButton("Jane Smith");
        ButtonGroup vetGroup = new ButtonGroup();
        vetGroup.add(vet1Button);
        vetGroup.add(vet2Button);

        registerButton = new JButton("Register");
        registerButton.setToolTipText("Click to register new patient (Alt+R)");
        registerButton.addActionListener(e -> registerPatient());

        clearButton = new JButton("Clear");
        clearButton.setToolTipText("Clear the form (Alt+C)");
        clearButton.addActionListener(e -> clearForm());

        exitButton = new JButton("Exit");
        exitButton.setToolTipText("Exit the form (Alt+E)");
        exitButton.addActionListener(e -> System.exit(0));

        statusLabel = new JLabel(" ");
        statusLabel.setForeground(Color.RED); // Error messages in red

        // Set layout
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(patientLabel)
                .addComponent(patientNameField)
                .addComponent(ownerLabel)
                .addComponent(ownerNameField)
                .addComponent(emailLabel)
                .addComponent(emailField)
                .addComponent(vetLabel)
                .addComponent(vet1Button)
                .addComponent(vet2Button)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(registerButton)
                        .addComponent(clearButton)
                        .addComponent(exitButton))
                .addComponent(statusLabel));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(patientLabel)
                .addComponent(patientNameField)
                .addComponent(ownerLabel)
                .addComponent(ownerNameField)
                .addComponent(emailLabel)
                .addComponent(emailField)
                .addComponent(vetLabel)
                .addComponent(vet1Button)
                .addComponent(vet2Button)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(registerButton)
                        .addComponent(clearButton)
                        .addComponent(exitButton))
                .addComponent(statusLabel));

        add(panel);
        pack();
        setLocationRelativeTo(null); // Center the form on the screen
    }

    private void registerPatient() {
        String patientName = patientNameField.getText().trim();
        String ownerName = ownerNameField.getText().trim();
        String email = emailField.getText().trim();
        String vetName = vet1Button.isSelected() ? "John Doe" : "Jane Smith";

        if (patientName.isEmpty() || ownerName.isEmpty() || email.isEmpty() || !isValidEmail(email)) {
            statusLabel.setText("Error: Please fill in all fields correctly.");
            return;
        }

        try {
            Date currentDate = new Date(); // Current date
            // Writing to file logic goes here
            statusLabel.setText("Patient registered successfully.");
        } catch (Exception e) {
            statusLabel.setText("Error writing to file.");
        }
    }

    private boolean isValidEmail(String email) {
        String regexPattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*" +
                "@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void clearForm() {
        patientNameField.setText("");
        ownerNameField.setText("");
        emailField.setText("");
        vet1Button.setSelected(true);
        statusLabel.setText(" ");
        patientNameField.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NewPatientForm().setVisible(true);
        });
    }
}
