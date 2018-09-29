
package alphacare;

import java.util.Date;

public class Patient {
    
    private int patientID;
    private Date birthDate;
    private String primCareDoc;
    private EHR healthRecord;
    
    
    /**
     * This is the default constructor for the Patient class.
     */
    public Patient() {
        
        
    }

    /**
     * Returns the patient id for the patient.
     * @return the patientID
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     * Sets the patient id for the patient.
     * @param patientID the patientID to set
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    /**
     * Returns the birth date for the patient.
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the birth date for the patient.
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Returns the primary care doctor for the patient.
     * @return the primCareDoc
     */
    public String getPrimCareDoc() {
        return primCareDoc;
    }

    /**
     * Sets the primary care doctor for the patient.
     * @param primCareDoc the primCareDoc to set
     */
    public void setPrimCareDoc(String primCareDoc) {
        this.primCareDoc = primCareDoc;
    }

    /**
     * Returns the electronic health record for the patient.
     * @return the healthRecord
     */
    public EHR getHealthRecord() {
        return healthRecord;
    }

    /**
     * Sets the electronic health record for the patient.
     * @param healthRecord the healthRecord to set
     */
    public void setHealthRecord(EHR healthRecord) {
        this.healthRecord = healthRecord;
    }

}
