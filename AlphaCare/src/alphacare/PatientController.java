
package alphacare;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;


public class PatientController implements ActionListener {
    private int patientID;
    private Boolean access = false;
    private PatientView view;
    Patient patient1;
    
    public PatientController(){
        createNewVitals();
        grantAccess();
        createPatient();
        createPatientView(); 
        
    }
    
    public void createPatient(){
        //Testing Patient
        System.out.println("Testing Patient");
        LocalDate happyBirthday = LocalDate.of(1995, 3, 12);
        EHR ehr1 = createEHR();
        /*     
      User: int ID, String name, String pass, String userType(automatic)
      Patient: all of above plus birthday
     */
        patient1 = new Patient(1, "Joe Snow", "js1", "easy1", happyBirthday, "Doctor DoMore", ehr1); 
        System.out.println("Patient1 is " + patient1.getCurrentAge() +" years old."); 
        patient1.setHealthRecord(ehr1);
        System.out.println(patient1.getHealthRecord().getPrescriptions());
    }
    
    public EHR createEHR(){
        EHR ehr1 = new EHR();
        ehr1.setPrescriptions("Prescriptions: \n\n *Albuterol \n\n *Depakote \n\n *Synthroid \n\n *Crestor");
        return ehr1;
    }
    
    public void createPatientView(){
        view = new PatientView(patient1);
        addActionListenersforSelectionPanelButtons();
        addActionListenersForEditSaveCancelButtons();
    }
        
        private void addActionListenersforSelectionPanelButtons(){
            //the start button is currently set to disabled and invisible.  We may not need it.
            view.getFrame().getPanel().getStartButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getStartButton()){
                         //System.out.println("Start button clicked");
                         view.getFrame().getPanel().getNameLabel().setText("Welcome, " + patient1.getFullName());
                         view.getFrame().getPanel().getSelectionPanel().setVisible(true);
                         view.getFrame().getPanel().getStartButton().setVisible(false);
                         view.getFrame().getPanel().getPatientInfoTextArea().setVisible(true);
                    }
                };
            });
            //exercise
            view.getFrame().getPanel().getExerciseButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getExerciseButton()){
                         view.getFrame().getPanel().getPatientInfoTextArea().setText("Exercise info:");
                         showEditSaveControlButtons();
                    }
                };
            });
            //medical record
            view.getFrame().getPanel().getSoapButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getSoapButton()){
                          view.getFrame().getPanel().getPatientInfoTextArea().setText("Subjective: \n\n Objective: \n\n  Assessment: \n\n  Plan: \n\n");
                          //Patients can't edit medical records                          
                    }
                };
            });
            //blood sugar
            view.getFrame().getPanel().getBloodSugarButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getBloodSugarButton()){
                        view.getFrame().getPanel().getPatientInfoTextArea().setText("Blood sugar:");
                        showEditSaveControlButtons();
                    }
                };
            });
            //prescriptions
            view.getFrame().getPanel().getPrescriptionsButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getPrescriptionsButton()){
                        String prescriptions = patient1.getHealthRecord().getPrescriptions();
                        view.getFrame().getPanel().getPatientInfoTextArea().setText(prescriptions);
                        //Patients can't edit prescriptions 
                    }
                };
            });
            //weight
            view.getFrame().getPanel().getWeightButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getWeightButton()){
                         view.getFrame().getPanel().getPatientInfoTextArea().setText("Weight:");
                         showEditSaveControlButtons();
                    }
                };
            });
            //diagnoses
            view.getFrame().getPanel().getDiagnosesButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getDiagnosesButton()){
                         view.getFrame().getPanel().getPatientInfoTextArea().setText("Diagnoses:");
                         //Patients can't edit diagnoses
                    }
                };
            });
            //blood pressure
            view.getFrame().getPanel().getBloodSugarButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getBloodSugarButton()){
                         view.getFrame().getPanel().getPatientInfoTextArea().setText("Blood Sugar:");
                         showEditSaveControlButtons();
                    }
                };
            });
        }
     private void addActionListenersForEditSaveCancelButtons(){
         view.getFrame().getPanel().getEditButton().addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 Object obj = ae.getSource();
                 if (obj == view.getFrame().getPanel().getEditButton()){
                     System.out.println("edit");
                     view.getFrame().getPanel().getPatientInfoTextArea().setEditable(true);
                 }
             }
         });
     }   
        
     private void showEditSaveControlButtons(){
         patient1.checkIsMinor();
         if (patient1.getPermissions().canUpdateData){
            view.getFrame().getPanel().getSaveButton().setVisible(true);
            view.getFrame().getPanel().getCancelButton().setVisible(true);
            view.getFrame().getPanel().getEditButton().setVisible(true);
            view.getFrame().getPanel().getEditButton().setEnabled(true);
         }
     }
        
    
    
    public void actionPerformed(ActionEvent event) 
    {
       	 Object obj = event.getSource();
     	 if (event.getSource() == view.getFrame().getPanel().getStartButton() )
         {
             
         }
    }
    
    public void grantAccess(){
        //Stub;
        System.out.println("Testing grantAccess...");
        this.access = true;
        
        Boolean expectedOutput = true;    
        System.out.println("Expected output: " + expectedOutput);
        
        System.out.println("Actual output: " + this.access);
        
        //Test
        if(expectedOutput.equals(this.access)){
            System.out.println("Test successful");
        }
        else{
            System.out.println("Test failed");
        }
        System.out.println("");
    }
    
    public void createNewVitals(){
        //Stub;
        System.out.println("Testing createNewVitals...");
        System.out.println("Created new Vitals object containing parameters: 1, 2, 3, 4, 5");
        Vitals vitalOne = new Vitals(1, 2, 3, 4, 5);
        
        String expectedOutput = "Vitals ID: 1, Patient ID: 2, Blood Pressure: 3, Weight: 4, Blood Sugar: 5";    
        System.out.println("Expected output: " + expectedOutput);
        
        System.out.println("Actual output: " + vitalOne.outputAllVitals());
        
        //Test
        if(expectedOutput.equals(vitalOne.outputAllVitals())){
            System.out.println("Test successful");
        }
        else{
            System.out.println("Test failed");
        }
        System.out.println("");
        
    }

    /**
     * @return the patientID
     */
    public int getPatientID() {
        return this.patientID; 
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    
    
}
