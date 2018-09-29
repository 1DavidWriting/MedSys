
package alphacare;


public class Caregiver {

    private int caregiverID;
    private PatientList patientList;
    
    
    /**
     * This is the default constructor for the Caregiver class.
     */
    public Caregiver() {
        
        
    }

    /**
     * Returns the care giver id for the care giver;
     * @return the caregiverID
     */
    public int getCaregiverID() {
        return caregiverID;
    }

    /**
     * Sets the care giver id for the care giver;
     * @param caregiverID the caregiverID to set
     */
    public void setCaregiverID(int caregiverID) {
        this.caregiverID = caregiverID;
    }
    
    /**
     * Returns the patient list for the care giver.
     * @return the patientList
     */
    public PatientList getPatientList() {
        return patientList;
    }

    /**
     * Sets the patient list for the care giver.
     * @param patientList the patientList to set
     */
    public void setPatientList(PatientList patientList) {
        this.patientList = patientList;
    }
    
}
