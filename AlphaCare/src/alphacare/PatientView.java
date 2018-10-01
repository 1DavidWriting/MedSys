/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 *
 * @author kken1
 */
public class PatientView {
    
    private PatientFrame frame;

    public PatientView() {
        frame = new PatientFrame();
    }

    public PatientFrame getFrame() {
        return frame;
    }

    public void setFrame(PatientFrame frame) {
        this.frame = frame;
    }

}
