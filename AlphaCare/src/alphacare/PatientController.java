
package alphacare;

public class PatientController {
    private int patientID;
    private PatientView view;
    
    
    public PatientController(){
        createNewVitals();
        
        view = new PatientView();
        
        view.getFrame().getPanel().getBtnOkay().addActionListener(event -> System.exit(0));
        view.getFrame().getPanel().getBtnCancel().addActionListener(event -> System.exit(0));
        view.getFrame().getPanel().getBtnEHR().addActionListener(event -> System.exit(0));
        
    }
    
    public void grantAccess(){
        
    }
    
    public void createNewVitals(){
        //Stub;
        System.out.println("Testing createNewVitals...");
        System.out.println("Created new Vitals object containing parameters: 1, 2, 3, 4, 5");
        Vitals vitalOne = new Vitals(1, 2, 3, 4, 5);
        
        String expectedOutput = "Vitals ID: 1, Patient ID: 2, Blood Pressure: 3, Weight: 4, Blood Sugar: 5";    
        System.out.println("Expected output: " + expectedOutput);
        
        System.out.println("Actual output: " + vitalOne.outputAllVitals());
        
        //Test
        if(expectedOutput.equals(vitalOne.outputAllVitals())){
            System.out.println("Test successful");
        }
        else{
            System.out.println("Test failed");
        }
        System.out.println("");
        
    }

    /**
     * @return the patientID
     */
    public int getPatientID() {
        
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    
    
}
