/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class NewCareGiverPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * @return the selectionMenu
     */
    public javax.swing.JComboBox<String> getSelectionMenu() {
        return jComboBox1;
    }

    /**
     * Creates new form PatientPanelNew
     */
    private Caregiver caregiver;
    
    public NewCareGiverPanel(Caregiver theCaregiver) {
        initComponents();
        caregiver = theCaregiver;
        setNameText();
        setPatientsOnMenu();
        
    }
    private void setNameText(){
        this.getNameLabel().setText("Welcome, " + this.caregiver.getFullName());
        this.getPatientLabel().setText("Select a Patient");
    }
    private void setPatientsOnMenu(){
        this.getSelectionMenu().removeAllItems();
        this.getSelectionMenu().addItem("Select a Patient");
        for (int i = 0; i < this.caregiver.getPatientList().getPatientObjectList().size(); i++){
            this.getSelectionMenu().addItem(this.caregiver.getPatientList().getPatientObjectList().get(i).getFullName());            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        topPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        LogOutButton = new javax.swing.JButton();
        selectionPanel = new javax.swing.JPanel();
        optionsLabel = new javax.swing.JLabel();
        exerciseButton = new javax.swing.JButton();
        soapButton = new javax.swing.JButton();
        bloodSugarButton = new javax.swing.JButton();
        bloodPressureButton = new javax.swing.JButton();
        diagnosesButton = new javax.swing.JButton();
        prescriptionsButton = new javax.swing.JButton();
        weightButton = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientInfoTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        nameLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        nameLabel.setText("Caregiver's Name");

        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        patientLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        patientLabel.setText("Patient Label");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LogOutButton.setText("Log Out");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogOutButton))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutButton))
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        optionsLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        optionsLabel.setText("Choose one:");

        exerciseButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exerciseButton.setText("Exercise");
        buttonGroup1.add(exerciseButton);

        soapButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soapButton.setText("Medical Record");
        buttonGroup1.add(soapButton);
        soapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soapButtonActionPerformed(evt);
            }
        });

        bloodSugarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bloodSugarButton.setText("Blood Sugar");

        bloodPressureButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bloodPressureButton.setText("Blood Pressure");
        bloodPressureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodPressureButtonActionPerformed(evt);
            }
        });

        diagnosesButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diagnosesButton.setText("Diagnoses");

        prescriptionsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescriptionsButton.setText("Prescriptions");

        weightButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        weightButton.setText("Weight");

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(optionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exerciseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(soapButton, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addComponent(bloodSugarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prescriptionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diagnosesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloodPressureButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(optionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(exerciseButton)
                .addGap(18, 18, 18)
                .addComponent(soapButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bloodSugarButton)
                .addGap(18, 18, 18)
                .addComponent(prescriptionsButton)
                .addGap(18, 18, 18)
                .addComponent(weightButton)
                .addGap(18, 18, 18)
                .addComponent(diagnosesButton)
                .addGap(18, 18, 18)
                .addComponent(bloodPressureButton)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        displayPanel.setPreferredSize(new java.awt.Dimension(294, 589));

        patientInfoTextArea.setColumns(20);
        patientInfoTextArea.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        patientInfoTextArea.setRows(5);
        patientInfoTextArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                patientInfoTextAreaMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(patientInfoTextArea);
        //patientInfoTextArea.setVisible(false);
        patientInfoTextArea.setEditable(false);

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        saveButton.setText("Save");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        saveButton.setVisible(false);
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        cancelButton.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        //selectionPanel.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void soapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soapButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soapButtonActionPerformed

    private void bloodPressureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodPressureButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodPressureButtonActionPerformed
    

    private void patientInfoTextAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientInfoTextAreaMouseMoved
        cancelButton.setEnabled(true);
        saveButton.setEnabled(true);
        //System.out.println("Editing patienInfoTestArea now");
    }//GEN-LAST:event_patientInfoTextAreaMouseMoved

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

    }//GEN-LAST:event_cancelButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton bloodPressureButton;
    private javax.swing.JButton bloodSugarButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton diagnosesButton;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton exerciseButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JTextArea patientInfoTextArea;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JButton prescriptionsButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JButton soapButton;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton weightButton;
    // End of variables declaration//GEN-END:variables

    
    
    /**
     * @return the displayPanel
     */
    public javax.swing.JPanel getDisplayPanel() {
        return displayPanel;
    }

    /**
     * @param displayPanel the displayPanel to set
     */
    public void setDisplayPanel(javax.swing.JPanel displayPanel) {
        this.displayPanel = displayPanel;
    }

    /**
     * @return the jTextField1
     */
   

    /**
     * @return the nameLabel
     */
    public javax.swing.JLabel getNameLabel() {
        return nameLabel;
    }

    /**
     * @param nameLabel the nameLabel to set
     */
    public void setNameLabel(javax.swing.JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    /**
     * @return the selectionPanel
     */
    public javax.swing.JPanel getSelectionPanel() {
        return selectionPanel;
    }

    /**
     * @param selectionPanel the selectionPanel to set
     */
    public void setSelectionPanel(javax.swing.JPanel selectionPanel) {
        this.selectionPanel = selectionPanel;
    }

    /**
     * @return the topPanel
     */
    public javax.swing.JPanel getTopPanel() {
        return topPanel;
    }

    /**
     * @param topPanel the topPanel to set
     */
    public void setTopPanel(javax.swing.JPanel topPanel) {
        this.topPanel = topPanel;
    }

    

    

    /**
     * @return the bloodPressureButton
     */
    public javax.swing.JButton getBloodPressureButton() {
        return bloodPressureButton;
    }

    /**
     * @param bloodPressureButton the bloodPressureButton to set
     */
    public void setBloodPressureButton(javax.swing.JButton bloodPressureButton) {
        this.bloodPressureButton = bloodPressureButton;
    }

    /**
     * @return the bloodSugarButton
     */
    public javax.swing.JButton getBloodSugarButton() {
        return bloodSugarButton;
    }

    /**
     * @param bloodSugarButton the bloodSugarButton to set
     */
    public void setBloodSugarButton(javax.swing.JButton bloodSugarButton) {
        this.bloodSugarButton = bloodSugarButton;
    }

    /**
     * @return the buttonGroup1
     */
    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    /**
     * @param buttonGroup1 the buttonGroup1 to set
     */
    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    /**
     * @return the buttonGroup2
     */
    public javax.swing.ButtonGroup getButtonGroup2() {
        return buttonGroup2;
    }

    /**
     * @param buttonGroup2 the buttonGroup2 to set
     */
    public void setButtonGroup2(javax.swing.ButtonGroup buttonGroup2) {
        this.buttonGroup2 = buttonGroup2;
    }

    /**
     * @return the diagnosesButton
     */
    public javax.swing.JButton getDiagnosesButton() {
        return diagnosesButton;
    }

    /**
     * @param diagnosesButton the diagnosesButton to set
     */
    public void setDiagnosesButton(javax.swing.JButton diagnosesButton) {
        this.diagnosesButton = diagnosesButton;
    }

    /**
     * @return the exerciseButton
     */
    public javax.swing.JButton getExerciseButton() {
        return exerciseButton;
    }

    /**
     * @param exerciseButton the exerciseButton to set
     */
    public void setExerciseButton(javax.swing.JButton exerciseButton) {
        this.exerciseButton = exerciseButton;
    }

    /**
     * @return the optionsLabel
     */
    public javax.swing.JLabel getOptionsLabel() {
        return optionsLabel;
    }

    /**
     * @param optionsLabel the optionsLabel to set
     */
    public void setOptionsLabel(javax.swing.JLabel optionsLabel) {
        this.optionsLabel = optionsLabel;
    }

    /**
     * @return the prescriptionsButton
     */
    public javax.swing.JButton getPrescriptionsButton() {
        return prescriptionsButton;
    }

    /**
     * @param prescriptionsButton the prescriptionsButton to set
     */
    public void setPrescriptionsButton(javax.swing.JButton prescriptionsButton) {
        this.prescriptionsButton = prescriptionsButton;
    }

    /**
     * @return the soapButton
     */
    public javax.swing.JButton getSoapButton() {
        return soapButton;
    }

    /**
     * @param soapButton the soapButton to set
     */
    public void setSoapButton(javax.swing.JButton soapButton) {
        this.soapButton = soapButton;
    }

    /**
     * @param startButton the startButton to set
     */
    

    /**
     * @return the weightButton
     */
    public javax.swing.JButton getWeightButton() {
        return weightButton;
    }

    /**
     * @param weightButton the weightButton to set
     */
    public void setWeightButton(javax.swing.JButton weightButton) {
        this.weightButton = weightButton;
    }

    /**
     * @return the patientInfoTextArea
     */
    public javax.swing.JTextArea getPatientInfoTextArea() {
        return patientInfoTextArea;
    }

    /**
     * @param patientInfoTextArea the patientInfoTextArea to set
     */
    public void setPatientInfoTextArea(javax.swing.JTextArea patientInfoTextArea) {
        this.patientInfoTextArea = patientInfoTextArea;
    }

    /**
     * @return the patient
     */
    

    /**
     * @return the cancelButton
     */
    public javax.swing.JButton getCancelButton() {
        return cancelButton;
    }

    /**
     * @param cancelButton the cancelButton to set
     */
    public void setCancelButton(javax.swing.JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the saveButton
     */
    public javax.swing.JButton getSaveButton() {
        return saveButton;
    }

    /**
     * @param saveButton the saveButton to set
     */
    public void setSaveButton(javax.swing.JButton saveButton) {
        this.saveButton = saveButton;
    }

    public JLabel getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(JLabel categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the patientLabel
     */
    public javax.swing.JLabel getPatientLabel() {
        return patientLabel;
    }

    /**
     * @param patientLabel the patientLabel to set
     */
    public void setPatientLabel(javax.swing.JLabel patientLabel) {
        this.patientLabel = patientLabel;
    }

    /**
     * @return the LogOutButton
     */
    public javax.swing.JButton getLogOutButton() {
        return LogOutButton;
    }
    
}
