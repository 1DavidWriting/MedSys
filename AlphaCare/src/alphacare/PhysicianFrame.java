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
public class PhysicianFrame extends JFrame{
    
    
    private PhysicianPanel panel;
    
    PhysicianFrame() {
        
        super ("");
        panel = new PhysicianPanel();
        
        add(panel);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public PhysicianPanel getPanel() {
        return panel;
    }

    public void setPanel(PhysicianPanel panel) {
        this.panel = panel;
    }

}

