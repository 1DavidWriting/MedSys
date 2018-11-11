
package alphacare;

public class PhysicianController {
    private Physician physician;
    private int physicianID;
    private PhysicianView physicianView;
    
    public PhysicianController(Physician newPhysician){
        this.physician = newPhysician;
        
        createPhysicianView();
    }
    
    public void createPhysicianView(){
        this.physicianView = new PhysicianView();
    }

    /**
     * @return the physicianID
     */
    public int getPhysicianID() {
        return physicianID;
    }

    /**
     * @param physicianID the physicianID to set
     */
    public void setPhysicianID(int physicianID) {
        this.physicianID = physicianID;
    }
    
    
    public void grantAccess(){
        
    }
    
    public void addPatientToList(){
        
        
    }

    /**
     * @return the physician
     */
    public Physician getPhysician() {
        return physician;
    }

    /**
     * @param physician the physician to set
     */
    public void setPhysician(Physician physician) {
        this.physician = physician;
    }
}
