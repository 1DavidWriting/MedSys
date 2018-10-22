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
    private Patient patient1;
    private PatientController patientController;
    
    public LoginController(){
        createPatient();
        createLoginView();
        
    }
    
    public void createPatient(){
        LocalDate happyBirthday = LocalDate.of(1995, 3, 12);
        EHR ehr1 = createEHR();
        patient1 = new Patient(1, "Joe Snow", "js1", "easy1", happyBirthday, "Doctor DoMore", ehr1);
        patient1.setHealthRecord(ehr1);
    }
    
    public EHR createEHR(){
        EHR ehr1 = new EHR();
        ehr1.setPrescriptions("Prescriptions: \n\n *Albuterol \n\n *Depakote \n\n *Synthroid \n\n *Crestor");
        return ehr1;
    }
    
    public void createLoginView(){
        LoginView login = new LoginView();
        login.getLoginButton().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
                    
            String userName = login.getUserIDField().getText();
            String password = String.valueOf(login.getPasswordField().getPassword());
                    
            if(userName.equals(patient1.getUserName()) && password.equals(patient1.getPassword())){
                patientController = new PatientController();
                login.getFrame().setVisible(false);
                }
                    
            else {
                JOptionPane.showMessageDialog(login, "Incorrect username/password");
                }
            } 
        });
    }
    
    
}
