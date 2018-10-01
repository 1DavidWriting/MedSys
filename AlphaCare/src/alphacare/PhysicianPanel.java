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
public class PhysicianPanel extends JPanel{
    
    private JLabel bLabel;
    private JLabel mLabel;
    private JTextField bText;
    private JTextField mText;
    private JButton btnNext;
    private JButton btnPrevious;
    private JButton btnStore;
    private JButton btnNew;
    private JButton btnDelete;
    private JButton btnEdit;

    private int index;

    public PhysicianPanel() {

        setLayout(null);
        setBackground(Color.blue);
        
        bLabel = new JLabel("Building: ");
        bLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mLabel = new JLabel("Major: ");
        mLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        bText = new JTextField(50);
        mText = new JTextField(50);
        btnNext = new JButton("Next");
        btnPrevious = new JButton("Previous");   
        btnStore = new JButton("Store");
        btnNew = new JButton("New");
        btnDelete = new JButton("Delete");
        btnEdit = new JButton("Edit");

        add(bLabel);
        add(mLabel);
        add(bText);
        add(mText);
        add(btnNext);
        add(btnPrevious);
        add(btnStore);
        add(btnNew);
        add(btnDelete);
        add(btnEdit);
        
        bLabel.setBounds(new Rectangle(25, 0, 100, 50));
        mLabel.setBounds(new Rectangle(25, 50, 100, 50));
        bText.setBounds(new Rectangle(100, 0, 300, 50));
        mText.setBounds(new Rectangle(100, 50, 300, 50));
        btnNext.setBounds(new Rectangle(200, 100, 100, 100));
        btnPrevious.setBounds(new Rectangle(100, 100, 100, 100));
        btnStore.setBounds(new Rectangle(300, 200, 100, 100));
        btnNew.setBounds(new Rectangle(300, 100, 100, 100));
        btnDelete.setBounds(new Rectangle(100, 200, 100, 100));
        btnEdit.setBounds(new Rectangle(200, 200, 100, 100));

    }

    public JButton getBtnNext() {
        return btnNext;
    }

    public void setBtnNext(JButton btnNext) {
        this.btnNext = btnNext;
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public void setBtnNew(JButton btnNew) {
        this.btnNew = btnNew;
    }

    public JButton getBtnPrevious() {
        return btnPrevious;
    }

    public void setBtnPrevious(JButton btnPrevious) {
        this.btnPrevious = btnPrevious;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JButton getBtnStore() {
        return btnStore;
    }

    public void setBtnStore(JButton btnStore) {
        this.btnStore = btnStore;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(JButton btnEdit) {
        this.btnEdit = btnEdit;
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

