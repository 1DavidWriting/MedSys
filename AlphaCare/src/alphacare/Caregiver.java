
package alphacare;


public class Caregiver implements java.io.Serializable {

    private int caregiverID;
    private PatientList patientList;
    private String fname;
    private String lname;
    private String caregiverUsername;
    private String caregiverPassword;
    
    
    /**
     * This is the default constructor for the Caregiver class.
     */
    public Caregiver(int newID, String newFname, String newLname, String newUsername, String newPassword) {
        this.caregiverID = newID;
        this.fname = newFname;
        this.lname = newLname;
        this.caregiverUsername = newUsername;
        this.caregiverPassword = newPassword;
        
    }

    /**
     * Returns the care giver id for the care giver;
     * @return the caregiverID
     */
    public int getCaregiverID() {
        return this.caregiverID;
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

    /**
     * @return the caregiverUsername
     */
    public String getCaregiverUsername() {
        return caregiverUsername;
    }

    /**
     * @param caregiverUsername the caregiverUsername to set
     */
    public void setCaregiverUsername(String caregiverUsername) {
        this.caregiverUsername = caregiverUsername;
    }

    /**
     * @return the caregiverPassword
     */
    public String getCaregiverPassword() {
        return caregiverPassword;
    }

    /**
     * @param caregiverPassword the caregiverPassword to set
     */
    public void setCaregiverPassword(String caregiverPassword) {
        this.caregiverPassword = caregiverPassword;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    
}
