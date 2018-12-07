package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class LoginController {    
    private PatientList list;
    private Physician physician;
    private Caregiver caregiver;
    private Administrator admin;
    private PatientController patientController;
    private PhysicianController physicianController;
    private CaregiverController caregiverController;
    private AdminController adminController;
    private boolean accessGranted = false;
    private LoginView login;
    
    public LoginController(PatientList theList, Physician thePhysician, Caregiver theCaregiver, Administrator theAdmin){  
        this.list = theList;
        this.physician = thePhysician;
        this.caregiver = theCaregiver;
        this.admin = theAdmin;
        createLoginView();        
    }   
    
    
    public void createLoginView(){
        login = new LoginView();
        
        login.getLoginButton().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
                    
            String userName = login.getUserIDField().getText();
            String password = String.valueOf(login.getPasswordField().getPassword());
                    
            for (int i = 0; i < list.getPatientObjectList().size(); i++){
                if(userName.equals(list.getPatientObjectList().get(i).getUserName()) && password.equals(list.getPatientObjectList().get(i).getPassword())){
                patientController = new PatientController(list.getPatientObjectList().get(i), login);
                accessGranted = true;
                }
            }
            
            
            if (userName.equals(physician.getUserName()) && password.equals(physician.getPassword())){
                physicianController = new PhysicianController(physician, login);
                accessGranted = true;
            }
            
            if (userName.equals(caregiver.getUserName()) && password.equals(caregiver.getPassword())){
                caregiverController = new CaregiverController(caregiver, login);
                accessGranted = true;
            }
            
            if (userName.equals(admin.getUserName()) && password.equals(admin.getPassword())){
                adminController = new AdminController(admin, login);
                accessGranted = true;
                
            }
                    
            if (accessGranted){
                login.getFrame().setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(login, "Incorrect username/password");
                login.clearFields();
                }
            }
        });
    }
    
    
    
    
}
