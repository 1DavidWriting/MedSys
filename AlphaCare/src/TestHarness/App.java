package TestHarness;
import alphacare.EHR;
import alphacare.PatientController;
import alphacare.PatientList;
import alphacare.PatientView;
import alphacare.Patient;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        //Stub for user typing text into patient ID field
        
        //Stub for button existing and being clickable
        
        //Stub for text being updated in PatientList
        System.out.println("Testing PatientList");
        PatientList patientList = new PatientList();
        patientList.getList();
        patientList.addPatient(23);
        System.out.println("");
        
        //Testing PatiientController
        System.out.println("Testing PatientController");
        PatientController patientController = new PatientController();
        
        //Testing PatientView
        PatientView pv = new PatientView();
        
        //Testing Patient
        System.out.println("Testing Patient");
        LocalDate happyBirthday = LocalDate.of(2016, 3, 12);
        EHR ehr1 = new EHR();
        /*     
      User: int ID, String name, String pass, String userType(automatic)
      Patient: all of above plus birthday
     */
        Patient patient1 = new Patient(1, "Joe Snow", "js1","easy1", happyBirthday, "Doctor DoMore", ehr1); 
        System.out.println("Patient1 is " + patient1.getCurrentAge() +" years old.");
    }
    
}
