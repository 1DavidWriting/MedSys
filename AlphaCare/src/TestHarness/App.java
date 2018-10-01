/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestHarness;

import alphacare.PatientController;
import alphacare.PatientList;
import alphacare.PatientView;

/**
 *
 * @author Ryan Feng
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testing PatientView
        
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
        
    }
    
}
