
package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;


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
                    Patient newPatient = new Patient(2, "new", "new", "new", happyBirthday);
                    admin.getPatientList().addPatient(newPatient);
                    admin.getPatientList().savePatientList();
                }
            }
        
        });
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
