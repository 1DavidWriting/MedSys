
package alphacare;

import java.util.Date;


public class SOAP {
    
    private int patientID;
    private int physicianID;
    private Date date;
    private String subject;
    private String objective;
    private String assessment;
    
    /**
     * This is the default constructor for the SOAP class.
     */
    public SOAP() {
        
        
    }

    /**
     * Returns the patient id for the SOAP;
     * @return the patientID
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     * Sets the patient id for the SOAP;
     * @param patientID the patientID to set
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    /**
     * Returns the physician id for the SOAP;
     * @return the physicianID
     */
    public int getPhysicianID() {
        return physicianID;
    }

    /**
     * Sets the physician id for the SOAP;
     * @param physicianID the physicianID to set
     */
    public void setPhysicianID(int physicianID) {
        this.physicianID = physicianID;
    }

    /**
     * Returns the date for the SOAP;
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date for the SOAP;
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns the subject for the SOAP;
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject for the SOAP;
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Returns the objective for the SOAP;
     * @return the objective
     */
    public String getObjective() {
        return objective;
    }

    /**
     * Sets the objective for the SOAP;
     * @param objective the objective to set
     */
    public void setObjective(String objective) {
        this.objective = objective;
    }

    /**
     * Returns the assessment for the SOAP;
     * @return the assessment
     */
    public String getAssessment() {
        return assessment;
    }

    /**
     * Sets the assessment for the SOAP;
     * @param assessment the assessment to set
     */
    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }
    
}
