/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author kken1
 */
public class CaregiverFrame extends JFrame{
    
    
    private CaregiverPanel panel;
    
    CaregiverFrame() {
        
        super ("");
        panel = new CaregiverPanel();
        
        add(panel);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public CaregiverPanel getPanel() {
        return panel;
    }

    public void setPanel(CaregiverPanel panel) {
        this.panel = panel;
    }
    
}
