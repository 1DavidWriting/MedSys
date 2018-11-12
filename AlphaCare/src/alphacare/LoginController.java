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
    private PatientList list;
    private Physician physician;
    private Caregiver caregiver;
    private PatientController patientController;
    private PhysicianController physicianController;
    private CaregiverController caregiverController;
    private boolean accessGranted = false;
    
    public LoginController(PatientList theList, Physician thePhysician, Caregiver theCaregiver){  
        this.list = theList;
        this.physician = thePhysician;
        this.caregiver = theCaregiver;        
        createLoginView();        
    }   
    
    
    public void createLoginView(){
        LoginView login = new LoginView();
        
        login.getLoginButton().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
                    
            String userName = login.getUserIDField().getText();
            String password = String.valueOf(login.getPasswordField().getPassword());
                    
            for (int i = 0; i < list.getPatientObjectList().size(); i++){
                if(userName.equals(list.getPatientObjectList().get(i).getUserName()) && password.equals(list.getPatientObjectList().get(i).getPassword())){
                patientController = new PatientController(list.getPatientObjectList().get(i));
                accessGranted = true;
                }
            }
            
            
            if (userName.equals(physician.getPhysicianUsername()) && password.equals(physician.getPhysicianPassword())){
                physicianController = new PhysicianController(physician);
                accessGranted = true;
            }
            
            if (userName.equals(caregiver.getCaregiverUsername()) && password.equals(caregiver.getCaregiverPassword())){
                caregiverController = new CaregiverController(caregiver);
                accessGranted = true;
            }
                    
            if (accessGranted){
                login.getFrame().setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(login, "Incorrect username/password");
                }
            }
        });
    }
    
    
}
