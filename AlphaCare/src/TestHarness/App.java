/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestHarness;

import alphacare.PatientController;
import alphacare.PatientList;

/**
 *
 * @author Ryan Feng
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        patientList.getList();
        patientList.addPatient(23);
        
        PatientController patientController = new PatientController();
        
    }
    
}
