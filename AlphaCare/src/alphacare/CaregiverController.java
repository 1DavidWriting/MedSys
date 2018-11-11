
package alphacare;

public class CaregiverController {
    private int caregiverID;
    private Caregiver caregiver;
    private CaregiverView caregiverView;
    
    public CaregiverController(Caregiver newCaregiver){
        this.caregiver = newCaregiver;
        
        createCaregiverView();
    }
    
    public void createCaregiverView(){
        this.caregiverView = new CaregiverView(caregiver);
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
