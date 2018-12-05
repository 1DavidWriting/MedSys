package alphacare;

public class AlphaCare {

    public static void main(String[] args) {
        //Patient login info
        //username: js1
        //password: easy1
        
        //Physician login info
        //username: bcarson
        //password: hud1
        
        //Caregiver login info
        //username: dfire
        //password: rwilliams1
        
        //Administrator login info
        //username: mjordan
        //password: mj1
        
        DataCreation data = new DataCreation();        
        PatientList list1 = data.getPatientList1();
        Physician physician1 = data.getPhysician1();
        Caregiver caregiver1 = data.getCaregiver();
        Administrator admin1 = data.getAdmin1();
        LoginController loginController = new LoginController(list1, physician1, caregiver1, admin1);
    }   
     
    
}
