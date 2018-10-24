
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
        
        LoginController loginController = new LoginController();
        testSerializable();
       
        
        

    }
    
     private static void testSerializable(){
            User user1 = new User(2, "Mr Anderson", "ma2", "2easy", "Administrator");
        
         
		String filename = "file.ser"; 
		
		// Serialization 
//		try
//		{ 
//			//Saving of object in a file 
//			FileOutputStream file = new FileOutputStream(filename);
//                        
//			ObjectOutputStream out = new ObjectOutputStream(file); 
//			
//                        
//			// Method for serialization of object 
//			System.out.println("Trying serialization of " + user1.getFullName());
//                        out.writeObject(user1); 
//			System.out.println("cereal ok");
//			
//                        out.close();
//			file.close(); 
//                        System.out.println("closed ok");
//			System.out.println("Object has been serialized"); 
//
//		} 
//		
//		catch(IOException ex) 
//		{ 
//			System.out.println("IOException is caught"); 
//		} 


		User user2 = null; 

		// Deserialization 
		try
		{ 
			// Reading the object from a file 
			FileInputStream file = new FileInputStream(filename); 
			ObjectInputStream in = new ObjectInputStream(file); 
			
			// Method for deserialization of object 
			user2 = (User)in.readObject(); 
			
			in.close(); 
			file.close(); 
			
			System.out.println("Object has been deserialized "); 
			System.out.println("name = " + user2.getFullName()); 
			System.out.println("password = " + user2.getPassword()); 
		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
		
		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		} 
        }
    
}
