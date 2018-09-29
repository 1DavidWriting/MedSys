
package alphacare;

import java.util.ArrayList;


public class PatientList {
    
    private int listID;
    ArrayList<Integer> idList = new ArrayList<>();
    
    /**
     * This is the default constructor for the PatientList class.
     */
    public PatientList() {
        
        
    }
    
    /**
     * It allows to get lists.
     * @return 
     */
    public ArrayList getList() {
        return this.idList;        
    }
    
    /**
     * It allows to add a patient.
     * @param newID
     */
    public void addPatient(int newID) {
        this.idList.add(newID);        
    }
    
}
