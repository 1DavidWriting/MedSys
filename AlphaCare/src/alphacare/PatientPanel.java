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
    
    private JLabel bLabel;
    private JLabel mLabel;
    private JTextField bText;
    private JTextField mText;
    private JButton btnOkay;
    private JButton btnCancel;
    private JButton btnEHR;

    private int index;

    public PatientPanel() {

        setLayout(null);
        setBackground(Color.white);
        
        bLabel = new JLabel("Date of Birth:");
        bLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mLabel = new JLabel("Primary Care Doctor: ");
        mLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        bText = new JTextField(50);
        mText = new JTextField(50);
        btnOkay = new JButton("Okay");
        btnCancel = new JButton("Cancel");   
        btnEHR = new JButton("EHR");


        add(bLabel);
        add(mLabel);
        add(bText);
        add(mText);
        add(btnOkay);
        add(btnCancel);
        add(btnEHR);
        
        bLabel.setBounds(new Rectangle(5, 0, 150, 50));
        mLabel.setBounds(new Rectangle(5, 50, 150, 50));
        bText.setBounds(new Rectangle(150, 0, 300, 50));
        mText.setBounds(new Rectangle(150, 50, 300, 50));
        btnOkay.setBounds(new Rectangle(150, 100, 100, 100));
        btnCancel.setBounds(new Rectangle(250, 100, 100, 100));
        btnEHR.setBounds(new Rectangle(350, 100, 100, 100));

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

    public JLabel getmLabel() {
        return mLabel;
    }

    public void setmLabel(JLabel mLabel) {
        this.mLabel = mLabel;
    }

    public JTextField getbText() {
        return bText;
    }

    public void setbText(JTextField bText) {
        this.bText = bText;
    }

    public JTextField getmText() {
        return mText;
    }

    public void setmText(JTextField mText) {
        this.mText = mText;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}

