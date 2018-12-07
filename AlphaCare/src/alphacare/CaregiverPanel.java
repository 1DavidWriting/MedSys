/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author kken1
 */
public class CaregiverPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * @return the addNewUserButton
     */
    public javax.swing.JButton getAddNewUserButton() {
        return addNewUserButton;
    }

    /**
     * @param addNewUserButton the addNewUserButton to set
     */
    public void setAddNewUserButton(javax.swing.JButton addNewUserButton) {
        this.addNewUserButton = addNewUserButton;
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return getSavePatientButton();
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.setSavePatientButton(jButton2);
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jTextField1
     */
    public javax.swing.JTextField getjTextField1() {
        return getFirstNameText();
    }

    /**
     * @param jTextField1 the jTextField1 to set
     */
    public void setjTextField1(javax.swing.JTextField jTextField1) {
        this.setFirstNameText(jTextField1);
    }

    /**
     * @return the jTextField2
     */
    public javax.swing.JTextField getjTextField2() {
        return getLastNameText();
    }

    /**
     * @param jTextField2 the jTextField2 to set
     */
    public void setjTextField2(javax.swing.JTextField jTextField2) {
        this.setLastNameText(jTextField2);
    }

    /**
     * @return the jTextField3
     */
    public javax.swing.JTextField getjTextField3() {
        return getUserNameText();
    }

    /**
     * @param jTextField3 the jTextField3 to set
     */
    public void setjTextField3(javax.swing.JTextField jTextField3) {
        this.setUserNameText(jTextField3);
    }

    /**
     * @return the jTextField4
     */
    public javax.swing.JTextField getjTextField4() {
        return getPassWordText();
    }

    /**
     * @param jTextField4 the jTextField4 to set
     */
    public void setjTextField4(javax.swing.JTextField jTextField4) {
        this.setPassWordText(jTextField4);
    }

    /**
     * @return the newUserPanel
     */
    public javax.swing.JPanel getNewUserPanel() {
        return newUserPanel;
    }

    /**
     * @param newUserPanel the newUserPanel to set
     */
    public void setNewUserPanel(javax.swing.JPanel newUserPanel) {
        this.newUserPanel = newUserPanel;
    }

    
    /**
     * @return the selectionMenu
     */
    public javax.swing.JComboBox<String> getSelectionMenu() {
        return getjComboBox1();
    }    
    
    private Caregiver caregiver;
    /**
     * Creates new form CaregiverPanel_
     */
    public CaregiverPanel(Caregiver theCaregiver) {
        
        initComponents();
        caregiver = theCaregiver;
        setNameText();
        setPatientsOnMenu();

    }

    private void setNameText(){
        
        this.getNameLabel().setText("Welcome, " + this.getCaregiver().getFullName());
        this.getPatientLabel().setText("Select a Patient");
        
    }

    
    private void setPatientsOnMenu(){
        
        this.getSelectionMenu().removeAllItems();
        this.getSelectionMenu().addItem("Select a Patient");
        
        for (int i = 0; i < this.getCaregiver().getPatientList().getPatientObjectList().size(); i++){
            
            this.getSelectionMenu().addItem(this.getCaregiver().getPatientList().getPatientObjectList().get(i).getFullName()); 
            
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientInfoTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        selectionPanel = new javax.swing.JPanel();
        exerciseButton = new javax.swing.JButton();
        soapButton = new javax.swing.JButton();
        bloodSugarButton = new javax.swing.JButton();
        prescriptionsButton = new javax.swing.JButton();
        weightButton = new javax.swing.JButton();
        diagnosesButton = new javax.swing.JButton();
        bloodPressureButton = new javax.swing.JButton();
        optionsLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        newUserPanel = new javax.swing.JPanel();
        savePatientButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        userNameText = new javax.swing.JTextField();
        passWordText = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        addNewUserButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 136, 122));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Caregiver's name");

        LogOutButton.setText("Logout");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        patientInfoTextArea.setColumns(20);
        patientInfoTextArea.setRows(5);
        patientInfoTextArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                patientInfoTextAreaMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(patientInfoTextArea);

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");

        selectionPanel.setBackground(new java.awt.Color(0, 136, 122));

        exerciseButton.setText("Exercise");
        exerciseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exerciseButtonActionPerformed(evt);
            }
        });

        soapButton.setText("Medical Record");

        bloodSugarButton.setText("Blood Sugar");

        prescriptionsButton.setText("Prescriptions");

        weightButton.setText("Weight");

        diagnosesButton.setText("Diagnoses");

        bloodPressureButton.setText("Blood Pressure");

        optionsLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        optionsLabel.setForeground(new java.awt.Color(255, 255, 255));
        optionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optionsLabel.setText("Choose one:");

        categoryLabel.setBackground(new java.awt.Color(255, 255, 255));
        categoryLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exerciseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloodSugarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prescriptionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diagnosesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addComponent(bloodPressureButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(optionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exerciseButton)
                .addGap(18, 18, 18)
                .addComponent(soapButton)
                .addGap(18, 18, 18)
                .addComponent(bloodSugarButton)
                .addGap(18, 18, 18)
                .addComponent(prescriptionsButton)
                .addGap(18, 18, 18)
                .addComponent(weightButton)
                .addGap(18, 18, 18)
                .addComponent(diagnosesButton)
                .addGap(18, 18, 18)
                .addComponent(bloodPressureButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        patientLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patientLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientLabel.setText("Patient Label");

        savePatientButton.setText("Save New Patient");

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("User Name:");

        jLabel4.setText("Password:");

        jTextField1.setText("Log out and log in to see new patient in dropdown.");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newUserPanelLayout = new javax.swing.GroupLayout(newUserPanel);
        newUserPanel.setLayout(newUserPanelLayout);
        newUserPanelLayout.setHorizontalGroup(
            newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(lastNameText)
                    .addComponent(userNameText)
                    .addComponent(passWordText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newUserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savePatientButton)
                .addGap(31, 31, 31))
            .addGroup(newUserPanelLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        newUserPanelLayout.setVerticalGroup(
            newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newUserPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passWordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(savePatientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        addNewUserButton.setText("Add New Patient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNewUserButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(478, 478, 478)
                        .addComponent(LogOutButton)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOutButton)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addNewUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selectionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exerciseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exerciseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exerciseButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void patientInfoTextAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientInfoTextAreaMouseMoved
        getCancelButton().setEnabled(true);
        getSaveButton().setEnabled(true);
        //System.out.println("Editing patienInfoTestArea now");        
    }//GEN-LAST:event_patientInfoTextAreaMouseMoved

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public Caregiver getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }

    public JButton getLogOutButton() {
        return LogOutButton;
    }

    public void setLogOutButton(JButton LogOutButton) {
        this.LogOutButton = LogOutButton;
    }

    public JButton getBloodPressureButton() {
        return bloodPressureButton;
    }

    public void setBloodPressureButton(JButton bloodPressureButton) {
        this.bloodPressureButton = bloodPressureButton;
    }

    public JButton getBloodSugarButton() {
        return bloodSugarButton;
    }

    public void setBloodSugarButton(JButton bloodSugarButton) {
        this.bloodSugarButton = bloodSugarButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    public JButton getDiagnosesButton() {
        return diagnosesButton;
    }

    public void setDiagnosesButton(JButton diagnosesButton) {
        this.diagnosesButton = diagnosesButton;
    }

    public JButton getExerciseButton() {
        return exerciseButton;
    }

    public void setExerciseButton(JButton exerciseButton) {
        this.exerciseButton = exerciseButton;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getOptionsLabel() {
        return optionsLabel;
    }

    public void setOptionsLabel(JLabel optionsLabel) {
        this.optionsLabel = optionsLabel;
    }

    public JTextArea getPatientInfoTextArea() {
        return patientInfoTextArea;
    }

    public void setPatientInfoTextArea(JTextArea patientInfoTextArea) {
        this.patientInfoTextArea = patientInfoTextArea;
    }

    public JLabel getPatientLabel() {
        return patientLabel;
    }

    public void setPatientLabel(JLabel patientLabel) {
        this.patientLabel = patientLabel;
    }

    public JButton getPrescriptionsButton() {
        return prescriptionsButton;
    }

    public void setPrescriptionsButton(JButton prescriptionsButton) {
        this.prescriptionsButton = prescriptionsButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    public JPanel getSelectionPanel() {
        return selectionPanel;
    }

    public void setSelectionPanel(JPanel selectionPanel) {
        this.selectionPanel = selectionPanel;
    }

    public JButton getSoapButton() {
        return soapButton;
    }

    public void setSoapButton(JButton soapButton) {
        this.soapButton = soapButton;
    }

    public JButton getWeightButton() {
        return weightButton;
    }

    public void setWeightButton(JButton weightButton) {
        this.weightButton = weightButton;
    }

    public JLabel getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(JLabel categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton addNewUserButton;
    private javax.swing.JButton bloodPressureButton;
    private javax.swing.JButton bloodSugarButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton diagnosesButton;
    private javax.swing.JButton exerciseButton;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel newUserPanel;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JTextField passWordText;
    private javax.swing.JTextArea patientInfoTextArea;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JButton prescriptionsButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton savePatientButton;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JButton soapButton;
    private javax.swing.JTextField userNameText;
    private javax.swing.JButton weightButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the firstNameText
     */
    public javax.swing.JTextField getFirstNameText() {
        return firstNameText;
    }

    /**
     * @param firstNameText the firstNameText to set
     */
    public void setFirstNameText(javax.swing.JTextField firstNameText) {
        this.firstNameText = firstNameText;
    }

    /**
     * @return the lastNameText
     */
    public javax.swing.JTextField getLastNameText() {
        return lastNameText;
    }

    /**
     * @param lastNameText the lastNameText to set
     */
    public void setLastNameText(javax.swing.JTextField lastNameText) {
        this.lastNameText = lastNameText;
    }

    /**
     * @return the passWordText
     */
    public javax.swing.JTextField getPassWordText() {
        return passWordText;
    }

    /**
     * @param passWordText the passWordText to set
     */
    public void setPassWordText(javax.swing.JTextField passWordText) {
        this.passWordText = passWordText;
    }

    /**
     * @return the savePatientButton
     */
    public javax.swing.JButton getSavePatientButton() {
        return savePatientButton;
    }

    /**
     * @param savePatientButton the savePatientButton to set
     */
    public void setSavePatientButton(javax.swing.JButton savePatientButton) {
        this.savePatientButton = savePatientButton;
    }

    /**
     * @return the userNameText
     */
    public javax.swing.JTextField getUserNameText() {
        return userNameText;
    }

    /**
     * @param userNameText the userNameText to set
     */
    public void setUserNameText(javax.swing.JTextField userNameText) {
        this.userNameText = userNameText;
    }
}
