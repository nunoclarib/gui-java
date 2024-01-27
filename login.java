import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label;
    private static JTextField userLabel;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        new LOGIN();
    }

    public LOGIN() {

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Username");
        label.setBounds(10, 20, 80, 25);

        panel.add(label);

        userLabel = new JTextField(20);
        userLabel.setBounds(100, 20, 165, 25);
        panel.add(userLabel);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);

        success = new JLabel();
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        // Set the ActionListener to the current instance
        button.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implement the desired behavior when the button is clicked

        String user = userLabel.getText();
        String password = passwordText.getText();

        // success.setText("Login successful");
        
        System.out.println("Username: " + user);
        System.out.println("Password: " + password);

        if (user.equals("nunoclarib") && password.equals("claribnc")) {
            success.setText("Login successful");
        } else {
            success.setText("Login failed");
        }

        // You can add more actions here if needed
    }
}
