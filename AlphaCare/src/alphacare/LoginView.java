/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Swaggy Daggy Gaming
 */
public class LoginView extends JFrame {
    private JButton loginButton;
    private JTextField userIDField;
    private JPasswordField passwordField;
    private JFrame frame;
    
    public LoginView(){
        frame = new JFrame("AlphaCare");
            
        JLabel pageTitle = new JLabel("Patient Login");
        pageTitle.setBounds(150, 10, 200, 30);
            
        JLabel userIDTitle = new JLabel("UserID");
        userIDTitle.setBounds(50, 50, 200, 30);
            
        JLabel passwordTitle = new JLabel("Password");
        passwordTitle.setBounds(50, 80, 200, 30);
            
        userIDField = new JTextField();
        userIDField.setBounds(120, 50, 200, 30);
            
        passwordField = new JPasswordField();
        passwordField.setBounds(120, 80, 200, 30);
            
        loginButton = new JButton("login");
        loginButton.setBounds(150, 160, 100, 30);
            
        frame.add(pageTitle);
        frame.add(userIDTitle);
        frame.add(passwordTitle);
        frame.add(userIDField);
        frame.add(passwordField);
        frame.add(loginButton);
              
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
            
        }

    /**
     * @return the loginButton
     */
    public JButton getLoginButton() {
        return loginButton;
    }

    /**
     * @param loginButton the loginButton to set
     */
    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    /**
     * @return the userIDField
     */
    public JTextField getUserIDField() {
        return userIDField;
    }

    /**
     * @param userIDField the userIDField to set
     */
    public void setUserIDField(JTextField userIDField) {
        this.userIDField = userIDField;
    }

    /**
     * @return the passwordField
     */
    public JPasswordField getPasswordField() {
        return passwordField;
    }

    /**
     * @param passwordField the passwordField to set
     */
    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    /**
     * @return the frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    
}
