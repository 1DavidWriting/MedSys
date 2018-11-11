/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author David
 */
public class DataCreation {
    private Patient patient1;
    private Physician physician1;
    private Caregiver caregiver1;
    
    public DataCreation(){
        patient1 = getPatientFromFile("js1");
        
        if (patient1 == null){            
            System.out.println("No patient file found.  Creating patient now...");
            createPatient();
        }        
        
        createPhysician();
        createCaregiver();
        
    }
    
    public void createPhysician(){
        this.physician1 = new Physician("benCarson", "hud1");
    }
    
    public void createCaregiver(){
        this.caregiver1 = new Caregiver(1, "dfire", "rwilliams1");
    }
     
    public void createPatient(){
        LocalDate happyBirthday = LocalDate.of(1995, 3, 12);
        EHR ehr1 = createEHR();
        setPatient1(new Patient(1, "Joe Snow", "js1", "easy1", happyBirthday, "Doctor DoMore", ehr1));
        getPatient1().setHealthRecord(ehr1);
    }    
    public SOAP createSoap(){
        SOAP soap1 = new SOAP();
        soap1.setDate(new Date());
        soap1.setPhysicianName("Dr. Burnside");
        soap1.setSubject("Patient looks ok but lungs sound awful.");
        soap1.setObjective("Heatrate is elevated.  Lung capcity is diminished.  Respiration is fast and noisy.");
        soap1.setPlan("Use inhaler as needed.");
        soap1.setAssessment("Patient has asthma.");
        return soap1;
    }    
    public Vitals createVitals(){
        int vitID = 5;
        int PatientID = 55;
        String BP = "130 / 85";
        int weight = 150;
        int sugar = 95;
        Vitals vitals = new Vitals(vitID, PatientID, BP, weight, sugar);
        return vitals;
    }
    
    public EHR createEHR(){
        EHR ehr1 = new EHR();
        ehr1.setPrescriptions("Prescriptions: \n\n *Albuterol \n\n *Depakote \n\n *Synthroid \n\n *Crestor");
        ehr1.setDiagnoses("Diagnoses: \n \n Asthma \n \n Diabetes \n \n Restless Leg Syndrome \n \n Hypertension");
        SOAP soap1 = createSoap();
        ehr1.setSoaps(soap1);
        //ehr1.setExercise("10 minutes of running today.");
        Vitals vitals1 = createVitals();
        ehr1.setVitals(vitals1);
        return ehr1;
    }

    /**
     * @return the patient1
     */
    public Patient getPatient1() {
        return patient1;
    }

    /**
     * @param patient1 the patient1 to set
     */
    public void setPatient1(Patient patient1) {
        this.patient1 = patient1;
    }
    
    private Patient getPatientFromFile(String userName){ 
                String filename = (userName + ".ser");
		Patient patientFromFile = null;
		// Deserialization 
		try
		{ 
			// Reading the object from a file 
			FileInputStream file = new FileInputStream(filename); 
			ObjectInputStream in = new ObjectInputStream(file); 
			
			// Method for deserialization of object 
			patientFromFile = (Patient)in.readObject(); 
			
			in.close(); 
			file.close(); 
			
			System.out.println("Object has been deserialized ");
                        setPatient1(patientFromFile);
			System.out.println("name = " + patientFromFile.getFullName()); 
			System.out.println("password = " + patientFromFile.getPassword()); 
		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
		
		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		}
                return patientFromFile;
        }

    /**
     * @return the physician1
     */
    public Physician getPhysician1() {
        return physician1;
    }

    /**
     * @param physician1 the physician1 to set
     */
    public void setPhysician1(Physician physician1) {
        this.physician1 = physician1;
    }

    /**
     * @return the caregiver1
     */
    public Caregiver getCaregiver() {
        return caregiver1;
    }

    /**
     * @param caregiver the caregiver1 to set
     */
    public void setCaregiver(Caregiver caregiver) {
        this.caregiver1 = caregiver;
    }
    
}
