
package alphacare;


public class Caregiver implements java.io.Serializable {

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
        //return caregiverID;
        //stub:        
        return 12;
    }

    /**
     * Sets the care giver id for the care giver;
     * @param caregiverID the caregiverID to set
     */
    public void setCaregiverID(int caregiverID) {
        this.caregiverID = caregiverID;
        //stub:
        System.out.println("Caregive id set to: " + caregiverID);
    }
    
    /**
     * Returns the patient list for the care giver.
     * @return the patientList
     */
    public PatientList getPatientList() {
        //return patientList;
        //stub: 
        PatientList stubPatientList = new PatientList();
        stubPatientList.addPatient(2);  
        stubPatientList.addPatient(3); 
        return stubPatientList;
    }

    /**
     * Sets the patient list for the care giver.
     * @param patientList the patientList to set
     */
    public void setPatientList(PatientList patientList) {
        this.patientList = patientList;
    }
    
}
