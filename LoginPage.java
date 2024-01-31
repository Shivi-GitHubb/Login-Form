import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginBtn = new JButton("LOGIN");
    JButton resetBtn = new JButton("RESET");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userLabel = new JLabel("User Id");
    JLabel passwordLabel = new JLabel("Password");
    JLabel message = new JLabel();

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    LoginPage(HashMap<String, String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        userLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);

        message.setBounds(125,250,250,35);
        message.setFont(new Font(null, Font.ITALIC,25));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginBtn.setBounds(125,200,100,25);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(this);

        resetBtn.setBounds(225,200,100,25);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(this);


        frame.add(loginBtn);
        frame.add(resetBtn);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(message);
        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== resetBtn){
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource()== loginBtn){
            String userId = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(userId)){
                if(loginInfo.get(userId).equals(password)){
                    message.setForeground(Color.green);
                    message.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userId);
                } else {
                    message.setForeground(Color.red);
                    message.setText("Wrong Password");
                }
            } else {
                message.setForeground(Color.red);
                message.setText("User name not found");
            }
        }

    }
}
