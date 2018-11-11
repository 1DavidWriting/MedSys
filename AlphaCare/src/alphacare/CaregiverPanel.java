/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;


import javax.swing.JPanel;


/**
 *
 * @author kken1
 */
public class CaregiverPanel extends JPanel{
    private Caregiver caregiver;
    
    public CaregiverPanel(Caregiver newCaregiver) {
        this.caregiver = newCaregiver;
        
    }

    /**
     * @return the caregiver
     */
    public Caregiver getCaregiver() {
        return caregiver;
    }

    /**
     * @param caregiver the caregiver to set
     */
    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }

}

