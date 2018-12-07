package alphacare;

import javax.swing.JFrame;

/**
 *
 * @author kken1
 */
public class PatientFrame extends JFrame{
    
    private PatientPanel panel;
    
    PatientFrame(Patient patient) {
        
        super ("");
        panel = new PatientPanel(patient);
        
        setSize(1400,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //To set frame maximized by default:
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //To open the frame a bit further down and to the left of where it would normally open:  
        this.setLocation(300, 100);
        add(panel);
    }

    public PatientPanel getPanel() {
        
        return panel;
        
    }

    public void setPanel(PatientPanel panel) {
        
        this.panel = panel;
        
    }

}

