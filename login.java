import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField userLabel;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton button;

    public static void main(String[] args) {
        new login();
    }

    public login() {

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Username");
        label.setBounds(10,20,80,25);
        
        panel.add(label);

        userLabel = new JTextField(20);
        userLabel.setBounds(100,20,165,25);
        panel.add(userLabel);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login in");
        button.setBounds(10,80,80,25);
        panel.add(button);

        // button
        // button.addActionListener(this);

        frame.setVisible(true);

    }
}
