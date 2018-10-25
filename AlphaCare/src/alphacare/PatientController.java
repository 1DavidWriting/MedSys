
package alphacare;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;


public class PatientController implements ActionListener {
    private int patientID;
    private Boolean access = false;
    private PatientView view;
    Patient patient;
    private String resetText;
    String currentSelection;

    
    public PatientController(Patient thePatient){
        //createNewVitals();
        //grantAccess();
        patient = thePatient;
        //createPatient();
        createPatientView();
        //testSerializable();
    }
   
    
    public void createPatientView(){
        view = new PatientView(patient);
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
                         view.getFrame().getPanel().getNameLabel().setText("Welcome, " + patient.getFullName());
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
                        view.getFrame().getPanel().getCategoryLabel().setText("Exercise Info: ");
                         view.getFrame().getPanel().getPatientInfoTextArea().setText(patient.getHealthRecord().getExercise());
                         resetText = view.getFrame().getPanel().getPatientInfoTextArea().getText();
                         currentSelection = "exercise";
                         showEditSaveControlButtons();
                    }
                };
            });
            //medical record SOAP
            view.getFrame().getPanel().getSoapButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getSoapButton()){
                        view.getFrame().getPanel().getCategoryLabel().setText("Medical Record: ");                          
                          view.getFrame().getPanel().getPatientInfoTextArea().setText(patient.getHealthRecord().getSoaps().getSOAPtext());
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
                        view.getFrame().getPanel().getCategoryLabel().setText("Blood Sugar: ");
                        view.getFrame().getPanel().getPatientInfoTextArea().setText(Integer.toString(patient.getHealthRecord().getVitals().getBloodSugar()));
                        resetText = view.getFrame().getPanel().getPatientInfoTextArea().getText();
                        currentSelection = "blood sugar";
                        showEditSaveControlButtons();
                    }
                };
            });
            //prescriptions
            view.getFrame().getPanel().getPrescriptionsButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getPrescriptionsButton()){
                        view.getFrame().getPanel().getCategoryLabel().setText("Prescriptions: ");
                        String prescriptions = patient.getHealthRecord().getPrescriptions();
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
                        view.getFrame().getPanel().getCategoryLabel().setText("Weight: ");
                         view.getFrame().getPanel().getPatientInfoTextArea().setText(Integer.toString(patient.getHealthRecord().getVitals().getWeight()));
                         resetText = view.getFrame().getPanel().getPatientInfoTextArea().getText();
                         currentSelection = "weight";
                         showEditSaveControlButtons();
                    }
                };
            });
            //diagnoses
            view.getFrame().getPanel().getDiagnosesButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getDiagnosesButton()){
                        view.getFrame().getPanel().getCategoryLabel().setText("Diagnoses: ");
                         view.getFrame().getPanel().getPatientInfoTextArea().setText(patient.getHealthRecord().getDiagnoses());
                         //Patients can't edit diagnoses
                         hideEditSaveControlButtons();
                    }
                };
            });
            //blood pressure
            view.getFrame().getPanel().getBloodPressureButton().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getBloodPressureButton()){
                        view.getFrame().getPanel().getCategoryLabel().setText("Blood Pressure: ");
                         view.getFrame().getPanel().getPatientInfoTextArea().setText(patient.getHealthRecord().getVitals().getBloodPressure());
                         resetText = view.getFrame().getPanel().getPatientInfoTextArea().getText();
                         currentSelection = "blood pressure";
                         showEditSaveControlButtons();
                    }
                };
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
         
         view.getFrame().getPanel().getCancelButton().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getCancelButton()){                        
                        view.getFrame().getPanel().getPatientInfoTextArea().setText(resetText);                        
                    }                    
                }            
            });
         
         view.getFrame().getPanel().getSaveButton().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    Object obj = ae.getSource();
                    if (obj == view.getFrame().getPanel().getSaveButton()){
                        String textToSave = view.getFrame().getPanel().getPatientInfoTextArea().getText();
                        System.out.println("Saving " + currentSelection + " as " + textToSave);
                        switch(currentSelection){
                            case "exercise": patient.getHealthRecord().setExercise(textToSave);
                                break;
                            case "blood sugar": int bloodSugar = Integer.parseInt(textToSave);
                                patient.getHealthRecord().getVitals().setBloodSugar(bloodSugar);
                                break;
                            case "weight": int weight = Integer.parseInt(textToSave);
                                patient.getHealthRecord().getVitals().setWeight(weight);
                                break;
                            case "blood pressure": patient.getHealthRecord().getVitals().setBloodPressure(textToSave);
                                break;
                            default: System.out.println("Error: text not be saved");
                                break;
                        }
                        patient.savePatient();                        
                    }                    
                }            
            });
         
         
     }   
        
     private void showEditSaveControlButtons(){
         patient.checkIsMinor();
         if (patient.getPermissions().canUpdateData){
            view.getFrame().getPanel().getSaveButton().setVisible(true);
            view.getFrame().getPanel().getCancelButton().setVisible(true);


            //view.getFrame().getPanel().getEditButton().setVisible(true);


            view.getFrame().getPanel().getEditButton().setVisible(false);
            view.getFrame().getPanel().getPatientInfoTextArea().setEditable(true);
            view.getFrame().getPanel().getSaveButton().setEnabled(false);
            view.getFrame().getPanel().getCancelButton().setEnabled(false);
            view.getFrame().getPanel().getEditButton().setVisible(false);
            view.getFrame().getPanel().getEditButton().setEnabled(false);
           
            
         }
     }
     
     private void hideEditSaveControlButtons(){
         patient.checkIsMinor();
         if (patient.getPermissions().canUpdateData){
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
        Vitals vitalOne = new Vitals(1, 2, "3/4", 4, 5);
        
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
