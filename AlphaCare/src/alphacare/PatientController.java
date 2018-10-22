
package alphacare;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;


public class PatientController implements ActionListener {
    private int patientID;
    private Boolean access = false;
    private PatientView view;
    Patient patient1;

    
    public PatientController(){
        //createNewVitals();
        //grantAccess();
        createPatient();
        createPatientView();
        
    }
    
    public void createPatient(){
        LocalDate happyBirthday = LocalDate.of(1995, 3, 12);
        EHR ehr1 = createEHR();
        patient1 = new Patient(1, "Joe Snow", "js1", "easy1", happyBirthday, "Doctor DoMore", ehr1);
        patient1.setHealthRecord(ehr1);
    }
    
    public SOAP createSoap(){
        SOAP soap1 = new SOAP();
        soap1.setDate(new Date());
        soap1.setPhysicianName("Dr. Burnside");
        soap1.setSubject("Patient looks ok but lungs sound awful.");
        soap1.setObjective("Heatrate is elevated.  Lung capcity is diminished.  Respiration is fast and noisy.");
        soap1.setPlan("Use inhaler as needed.");
        soap1.setAssessment("Patient has asthma.");
        return soap1;
    }
    
    public EHR createEHR(){
        EHR ehr1 = new EHR();
        ehr1.setPrescriptions("Prescriptions: \n\n *Albuterol \n\n *Depakote \n\n *Synthroid \n\n *Crestor");
        ehr1.setDiagnoses("Diagnoses: \n \n Asthma \n \n Diabetes \n \n Restless Leg Syndrome \n \n Hypertension");
        SOAP soap1 = createSoap();
        ehr1.setSoaps(soap1);
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
            //medical record SOAP
            view.getFrame().getPanel().getSoapButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getSoapButton()){
                          view.getFrame().getPanel().getPatientInfoTextArea().setText("Subjective: \n\n Objective: \n\n  Assessment: \n\n  Plan: \n\n");
                          view.getFrame().getPanel().getPatientInfoTextArea().setText(patient1.getHealthRecord().getSoaps().getSOAPtext());
                          //Patients can't edit medical records
                          hideEditSaveControlButtons();
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
                        hideEditSaveControlButtons();
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
                         hideEditSaveControlButtons();
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
            
            view.getFrame().getPanel().getCancelButton().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getCancelButton()){
                        
                        view.getFrame().getPanel().getPatientInfoTextArea().setText(" ");
                        
                    }
                    
                }
            
            });
            
        }
     
     private void addActionListenerForPatientTextArea(){
         view.getFrame().getPanel().getPatientInfoTextArea().addPropertyChangeListener(new PropertyChangeListener(){
             @Override
             public void propertyChange(PropertyChangeEvent pce) {
                 Object change = pce.getSource();
                 if (change ==  view.getFrame().getPanel().getPatientInfoTextArea()){
                     System.out.println("Editing PatientInfoTextArea");
                     view.getFrame().getPanel().getCancelButton().setEnabled(true);
                     view.getFrame().getPanel().getSaveButton().setEnabled(true);
                 }
             }
         });
     }
     //disabled   
     private void addActionListenersForEditSaveCancelButtons(){
         view.getFrame().getPanel().getEditButton().addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 Object obj = ae.getSource();
                 if (obj == view.getFrame().getPanel().getEditButton()){
                     System.out.println("edit");
                     //view.getFrame().getPanel().getPatientInfoTextArea().setEditable(true);
                 }
             }
         });
     }   
        
     private void showEditSaveControlButtons(){
         patient1.checkIsMinor();
         if (patient1.getPermissions().canUpdateData){
            view.getFrame().getPanel().getSaveButton().setVisible(true);
            view.getFrame().getPanel().getCancelButton().setVisible(true);
<<<<<<< HEAD
=======
            //view.getFrame().getPanel().getEditButton().setVisible(true);

>>>>>>> 18069c43f6289c9ab0f36debd0385be5dfcb23b8
            view.getFrame().getPanel().getEditButton().setVisible(false);
            view.getFrame().getPanel().getPatientInfoTextArea().setEditable(true);
            view.getFrame().getPanel().getSaveButton().setEnabled(false);
            view.getFrame().getPanel().getCancelButton().setEnabled(false);
            view.getFrame().getPanel().getEditButton().setVisible(true);
            view.getFrame().getPanel().getEditButton().setEnabled(true);
            view.getFrame().getPanel().getSaveButton().setEnabled(true);
            view.getFrame().getPanel().getCancelButton().setEnabled(true);
            view.getFrame().getPanel().getPatientInfoTextArea().setEditable(false);
         }
     }
     
     private void hideEditSaveControlButtons(){
         patient1.checkIsMinor();
         if (patient1.getPermissions().canUpdateData){
            view.getFrame().getPanel().getSaveButton().setVisible(false);
            view.getFrame().getPanel().getCancelButton().setVisible(false);
            view.getFrame().getPanel().getEditButton().setVisible(false);
            view.getFrame().getPanel().getEditButton().setEnabled(false);
            view.getFrame().getPanel().getPatientInfoTextArea().setEditable(false);
            view.getFrame().getPanel().getSaveButton().setEnabled(false);
            view.getFrame().getPanel().getCancelButton().setEnabled(false);
         }
     }
        
    //start button is now hidden
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
        //System.out.println("Expected output: " + expectedOutput);
        
        System.out.println("Actual output: " + vitalOne.outputAllVitals());
        
        //Test
        if(expectedOutput.equals(vitalOne.outputAllVitals())){
            System.out.println("Vitals Test successful");
        }
        else{
            //System.out.println("Vitals Test failed");
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
