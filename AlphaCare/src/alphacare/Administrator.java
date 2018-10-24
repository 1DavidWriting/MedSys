
package alphacare;


public class Administrator implements java.io.Serializable {
    
    private int adminID;
    
    /**
     * This is the default constructor for the Administrator class.
     */
    public Administrator() {
        
        
    }

    /**
     * Returns the admin id for the administrator;
     * @return the adminID
     */
    public int getAdminID() {
        //return adminID;
        //stub:        
        System.out.println("AdminID = 11");
        return 11;
    }

    /**
     * Sets the admin id for the administrator;
     * @param adminID the adminID to set
     */
    public void setAdminID(int adminID) {
        //this.adminID = adminID;
        //stub:
        System.out.println("Admin ID set to: " + adminID);        
    }
    
}
