/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class PatientListTest {
    
    public PatientListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getList method, of class PatientList.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        PatientList instance = new PatientList();
        instance.addPatient(1);
        instance.addPatient(2);
        ArrayList <Integer> result = instance.getList();
        System.out.println(result);
        ArrayList <Integer> expResult = new ArrayList <>();
        expResult.add(1);
        expResult.add(2);
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addPatient method, of class PatientList.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        PatientList instance = new PatientList();
        instance.addPatient(1);
        instance.addPatient(2);
        instance.addPatient(3);
        instance.addPatient(4);
        ArrayList <Integer> result = instance.getList();
        System.out.println(result);
        ArrayList <Integer> expResult = new ArrayList<>();
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        expResult.add(4);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
