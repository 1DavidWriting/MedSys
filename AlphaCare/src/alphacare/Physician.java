
package alphacare;


public class Physician implements java.io.Serializable{
    
    private int physicianID;
    private String physicianUsername;
    private String physicianPassword;
    private PatientList patientList;
    
    /**
     * This is the default constructor for the Physician class.
     */
    public Physician(String newUsername, String newPassword) {
        this.physicianUsername = newUsername;
        this.physicianPassword = newPassword;
        
        
    }

    /**
     * Returns the patient list for the physician.
     * @return the patientList
     */
    public PatientList getPatientList() {
        return patientList;
    }

    /**
     * Sets the patient list for the physician.
     * @param patientList the patientList to set
     */
    public void setPatientList(PatientList patientList) {
        this.patientList = patientList;
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

    /**
     * @return the physicianUsername
     */
    public String getPhysicianUsername() {
        return physicianUsername;
    }

    /**
     * @param physicianUsername the physicianUsername to set
     */
    public void setPhysicianUsername(String physicianUsername) {
        this.physicianUsername = physicianUsername;
    }

    /**
     * @return the physicianPassword
     */
    public String getPhysicianPassword() {
        return physicianPassword;
    }

    /**
     * @param physicianPassword the physicianPassword to set
     */
    public void setPhysicianPassword(String physicianPassword) {
        this.physicianPassword = physicianPassword;
    }
    
}
