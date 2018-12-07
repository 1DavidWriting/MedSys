package alphacare;

import javax.swing.JFrame;

/**
 *
 * @author kken1
 */
public class PatientView extends JFrame{
    
    private PatientFrame frame;

    public PatientView(Patient patient) {
        
        frame = new PatientFrame(patient);
        
    }
    
    public PatientFrame getFrame() {
        
        return frame;
        
    }

    public void setFrame(PatientFrame frame) {
        
        this.frame = frame;
        
    }

}
