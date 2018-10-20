
package alphacare;


public class User {
    
    private int userID;
    private String userName;
    private String password;
    private Permissions permissions;
    private String role;

    User(int ID, String name, String pass, String userType){
        userID = ID;
        userName = name;
        password = pass;
        role = userType;
    }
    
    /**
     * Returns the user id for the user.
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the user id for the user.
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Returns the user name for the user.
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the user name for the user;
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the password for the user.
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password for the user.
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the permission for the user.
     * @return the permissions
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the permissions for the user.
     * @param permissions the permissions to set
     */
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }
    
    /**
     * Returns the role for the user.
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role for the user.
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    
}
