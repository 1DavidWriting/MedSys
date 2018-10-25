
package alphacare;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AlphaCare {


    public static void main(String[] args) {
        //username: js1
        //password: easy1
        DataCreation data = new DataCreation();
        Patient patient1 = data.getPatient1();
        LoginController loginController = new LoginController(patient1);
        //testSerializable();
       
        
        

    }
    
     
    
}
