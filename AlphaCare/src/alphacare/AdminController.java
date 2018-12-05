
package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;


public class AdminController implements ActionListener {
    
    private int adminID;
    private Boolean access = false;
    private AdminView view;
    private Administrator admin;
    private LoginView loginView;
    
    
    public AdminController(Administrator theAdmin, LoginView theLoginView){
        
        admin = theAdmin;
        loginView = theLoginView;
        createAdminView();
        
    }
    
    public void createAdminView() {
        
        view = new AdminView(admin);
        addActionListenerForLogOutButton();
        AddActionListenerForAddUserButton();
        
    }
    
    private void AddActionListenerForAddUserButton(){
        view.getFrame().getPanel().getAddNewUserButton().addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                Object obj = ae.getSource();
                if (obj == view.getFrame().getPanel().getAddNewUserButton()){
                    System.out.println("Adding a new patient");
                    LocalDate happyBirthday = LocalDate.of(1996, 4, 13);
                    Patient addPatient = createPatientBlankRecord(happyBirthday, "Mr. New", "mn1", "mn1");
                    admin.getPatientList().addPatient(addPatient);
                    admin.getPatientList().savePatientList();
                }
            }
        
        });
    }
    
    public Patient createPatientBlankRecord(LocalDate DOB, String name, String userName, String passWord){        
        LocalDate happyBirthday = DOB;
        EHR ehrBlank = new EHR();
        ehrBlank.setPrescriptions("No Prescriptions Entered.");
        ehrBlank.setDiagnoses("No Diagnoses Entered.");
        SOAP soapBlank = new SOAP();
        soapBlank.setDate(new Date());
        soapBlank.setPhysicianName("Doctor Info Not Yet Entered");
        soapBlank.setSubject("None");
        soapBlank.setObjective("None");
        soapBlank.setPlan("None");
        soapBlank.setAssessment("None");
        ehrBlank.setSoaps(soapBlank); 
        int vitID = 5;
        int PatientID = 55;
        String BP = "No BP Entered";
        int weight = 0;
        int sugar = 0;
        Vitals vitalsBlank = new Vitals(vitID, PatientID, BP, weight, sugar); 
        ehrBlank.setVitals(vitalsBlank);
        Patient newPatient = new Patient(6, name, userName, passWord, happyBirthday, "Doctor Doctor", ehrBlank);
        return newPatient;
    }
    
    private void addActionListenerForLogOutButton(){
        
        view.getFrame().getPanel().getLogOutButton().addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae){
                
                Object obj = ae.getSource();
                
                if (obj == view.getFrame().getPanel().getLogOutButton()){
                    
                    System.out.println("Logging out...");
                    view.getFrame().setVisible(false);
                    loginView.clearFields();
                    loginView.getFrame().setVisible(true);
                    
                }
                
            }
            
        });
        
    }
    //action performed necessary for implementing action listener interface
    @Override
    public void actionPerformed(ActionEvent event) 
    {       	
    }
    
}
