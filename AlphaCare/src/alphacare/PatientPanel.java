/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kken1
 */
public class PatientPanel extends JPanel{
    
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aText;
    private JTextField bText;
    private JTextField cText;
    private JButton btnOkay;
    private JButton btnCancel;
    private JButton btnEHR;

    private int index;

    public PatientPanel() {

        setLayout(null);
        setBackground(Color.white);
        
        aLabel = new JLabel("Patient ID: ");
        aLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        bLabel = new JLabel("Date of Birth: ");
        bLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        cLabel = new JLabel("Primary Care Doctor: ");
        cLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        aText = new JTextField(50);
        bText = new JTextField(50);
        cText = new JTextField(50);
        
        btnOkay = new JButton("Okay");
        btnCancel = new JButton("Cancel");   
        btnEHR = new JButton("EHR");


        add(aLabel);
        add(bLabel);
        add(cLabel);
        add(aText);
        add(bText);
        add(cText);
        add(btnOkay);
        add(btnCancel);
        add(btnEHR);
        
        aLabel.setBounds(new Rectangle(5, 0 , 150, 50));
        bLabel.setBounds(new Rectangle(5, 50, 150, 50));
        cLabel.setBounds(new Rectangle(5, 100, 150, 50));
        aText.setBounds(new Rectangle(150, 0, 300, 50));
        bText.setBounds(new Rectangle(150, 50, 300, 50));
        cText.setBounds(new Rectangle(150, 100, 300, 50));
        btnOkay.setBounds(new Rectangle(150, 150, 100, 100));
        btnCancel.setBounds(new Rectangle(250, 150, 100, 100));
        btnEHR.setBounds(new Rectangle(350, 150, 100, 100));

    }

    public JButton getBtnOkay() {
        return btnOkay;
    }

    public void setBtnOkay(JButton btnOkay) {
        this.btnOkay = btnOkay;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnEHR() {
        return btnEHR;
    }

    public void setBtnEHR(JButton btnEHR) {
        this.btnEHR = btnEHR;
    }
    
    public JLabel getbLabel() {
        return bLabel;
    }

    public void setbLabel(JLabel bLabel) {
        this.bLabel = bLabel;
    }

    public JLabel getaLabel() {
        return aLabel;
    }

    public void setaLabel(JLabel aLabel) {
        this.aLabel = aLabel;
    }

    public JLabel getcLabel() {
        return cLabel;
    }

    public void setcLabel(JLabel cLabel) {
        this.cLabel = cLabel;
    }

    public JTextField getaText() {
        return aText;
    }

    public void setaText(JTextField aText) {
        this.aText = aText;
    }

    public JTextField getbText() {
        return bText;
    }

    public void setbText(JTextField bText) {
        this.bText = bText;
    }

    public JTextField getcText() {
        return cText;
    }

    public void setcText(JTextField cText) {
        this.cText = cText;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}

