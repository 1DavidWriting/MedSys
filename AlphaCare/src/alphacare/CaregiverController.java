
package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaregiverController {
    private int caregiverID;
    private Caregiver caregiver;
    private CaregiverView caregiverView;
    private String resetText;
    String currentSelection;
    
    
    public CaregiverController(Caregiver newCaregiver){
        this.caregiver = newCaregiver;
        
        createCaregiverView();
    }
    
    public void createCaregiverView(){
        this.caregiverView = new CaregiverView(caregiver);
        addActionListenersforSelectionPanelButtons();
        addActionListenersForSaveCancelButtons();        
        
    }
    
    private void addActionListenersforSelectionPanelButtons(){
        
        caregiverView.getFrame().getPanel().getNameLabel().setText("Welcome, " + caregiver.getFullName());  
    
    }
    
    private void addActionListenersForSaveCancelButtons(){      
        
        //cancel button 
         caregiverView.getFrame().getPanel().getCancelButton().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    Object obj = ae.getSource();
                    if (obj == caregiverView.getFrame().getPanel().getCancelButton()){                        
                        caregiverView.getFrame().getPanel().getPatientInfoTextArea().setText(resetText);                        
                    }                    
                }            
            });
         //save button
         caregiverView.getFrame().getPanel().getSaveButton().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    Object obj = ae.getSource();
                    if (obj == caregiverView.getFrame().getPanel().getSaveButton()){
                        String textToSave = caregiverView.getFrame().getPanel().getPatientInfoTextArea().getText();
                        System.out.println("Saving " + currentSelection + " as " + textToSave);
                        switch(currentSelection){
                            case "exercise": caregiver.getHealthRecord().setExercise(textToSave);
                                break;
                            case "blood sugar": int bloodSugar = Integer.parseInt(textToSave);
                                caregiver.getHealthRecord().getVitals().setBloodSugar(bloodSugar);
                                break;
                            case "weight": int weight = Integer.parseInt(textToSave);
                                caregiver.getHealthRecord().getVitals().setWeight(weight);
                                break;
                            case "blood pressure": caregiver.getHealthRecord().getVitals().setBloodPressure(textToSave);
                                break;
                            default: System.out.println("Error: text not be saved");
                                break;
                        }
                        caregiver.saveCaregiver();                        
                    }                    
                }            
            });
         
         
    }
    
    public void grantAccess(){
        
    }
    
    public void addPatientToList(){
        
        
    }

    /**
     * @return the caregiverID
     */
    public int getCaregiverID() {
        return caregiverID;
    }

    /**
     * @param caregiverID the caregiverID to set
     */
    public void setCaregiverID(int caregiverID) {
        this.caregiverID = caregiverID;
    }
    
    
}
