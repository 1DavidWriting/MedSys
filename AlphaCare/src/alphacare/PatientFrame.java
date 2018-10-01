/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import javax.swing.JFrame;

/**
 *
 * @author kken1
 */
public class PatientFrame extends JFrame{
    
    
    private PatientPanel panel;
    
    PatientFrame() {
        
        super ("");
        panel = new PatientPanel();
        
        add(panel);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public PatientPanel getPanel() {
        return panel;
    }

    public void setPanel(PatientPanel panel) {
        this.panel = panel;
    }

}

