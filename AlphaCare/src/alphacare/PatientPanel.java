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
public class PatientPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form PatientPanelNew
     */
    private Patient patient;
    
    public PatientPanel(Patient thePatient) {
        initComponents();
        patient = thePatient;
        setNameText();
        
    }
    private void setNameText(){        
        this.getNameLabel().setText("Welcome, " + getPatient().getFullName());
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
        topPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        categoryLabel = new javax.swing.JLabel();
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
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        nameLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        nameLabel.setText("Patient's Name");

        startButton.setBackground(new java.awt.Color(255, 204, 153));
        startButton.setText("Click to Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        startButton.setVisible(false);
        startButton.setEnabled(false);

        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382)
                        .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(954, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        optionsLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        optionsLabel.setText("Choose one:");

        exerciseButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exerciseButton.setText("Exercise");
        buttonGroup1.add(exerciseButton);

        soapButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soapButton.setText("Medical Record");
        soapButton.setBorderPainted(false);
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
                .addContainerGap()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(optionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exerciseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(soapButton, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addComponent(bloodSugarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prescriptionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diagnosesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloodPressureButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 77, Short.MAX_VALUE))
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
                .addContainerGap(152, Short.MAX_VALUE))
        );

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

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displayPanelLayout.createSequentialGroup()
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelButton)
                                .addGap(55, 55, 55)))
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(584, Short.MAX_VALUE))
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        editButton.setEnabled(false);
        editButton.setVisible(false);
        saveButton.setVisible(false);
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        cancelButton.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //selectionPanel.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        getStartButton().addActionListener(this);
    }//GEN-LAST:event_startButtonActionPerformed

    private void soapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soapButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soapButtonActionPerformed

    private void bloodPressureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodPressureButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodPressureButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed


    private void patientInfoTextAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientInfoTextAreaMouseMoved
        cancelButton.setEnabled(true);
        saveButton.setEnabled(true);
        //System.out.println("Editing patienInfoTestArea now");
    }//GEN-LAST:event_patientInfoTextAreaMouseMoved

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

    }//GEN-LAST:event_cancelButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bloodPressureButton;
    private javax.swing.JButton bloodSugarButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton diagnosesButton;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exerciseButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JTextArea patientInfoTextArea;
    private javax.swing.JButton prescriptionsButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JButton soapButton;
    private javax.swing.JButton startButton;
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
     * @return the startButton
     */
    public javax.swing.JButton getStartButton() {
        return startButton;
    }

    @Override
    public void actionPerformed(ActionEvent event) 
    {
       	 Object obj = event.getSource();
     	 if (event.getSource() == getStartButton() )
         {
             //System.out.println("Button clicked");
             //view.getFrame().getPanel().getNameLabel().setText("Welcome, Patient X");
         }
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
    public void setStartButton(javax.swing.JButton startButton) {
        this.startButton = startButton;
    }

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
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

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
     * @return the editButton
     */
    public javax.swing.JButton getEditButton() {
        return editButton;
    }

    /**
     * @param editButton the editButton to set
     */
    public void setEditButton(javax.swing.JButton editButton) {
        this.editButton = editButton;
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
    
}
