/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class LoginController {
    private Patient patient;
    private PatientController patientController;
    
    public LoginController(Patient thePatient){  
        patient = thePatient;
        createLoginView();        
    }   
    
    
    public void createLoginView(){
        LoginView login = new LoginView();
        login.getLoginButton().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
                    
            String userName = login.getUserIDField().getText();
            String password = String.valueOf(login.getPasswordField().getPassword());
                    
            if(userName.equals(patient.getUserName()) && password.equals(patient.getPassword())){
                patientController = new PatientController(patient);
                login.getFrame().setVisible(false);
                }
                    
            else {
                JOptionPane.showMessageDialog(login, "Incorrect username/password");
                }
            } 
        });
    }
    
    
}
