
package alphacare;


public class Physician implements java.io.Serializable{
    
    private int physicianID;
    private PatientList patientList;
    
    /**
     * This is the default constructor for the Physician class.
     */
    public Physician() {
        
        
        
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
    
}
