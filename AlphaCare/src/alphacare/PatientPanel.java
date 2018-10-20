/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author David
 */
public class PatientPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form PatientPanelNew
     */
    public PatientPanel() {
        initComponents();
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

        nameLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        nameLabel.setText("Patient's Name");

        startButton.setBackground(new java.awt.Color(255, 204, 153));
        startButton.setText("Click to Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton)
                .addContainerGap())
        );

        optionsLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        optionsLabel.setText("Choose one:");

        exerciseButton.setText("Exercise");
        buttonGroup1.add(exerciseButton);

        soapButton.setText("Medical Record");
        soapButton.setBorderPainted(false);
        buttonGroup1.add(soapButton);
        soapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soapButtonActionPerformed(evt);
            }
        });

        bloodSugarButton.setText("Blood Sugar");

        bloodPressureButton.setText("Blood Pressure");
        bloodPressureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodPressureButtonActionPerformed(evt);
            }
        });

        diagnosesButton.setText("Diagnoses");

        prescriptionsButton.setText("Prescriptions");

        weightButton.setText("Weight");

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bloodPressureButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(diagnosesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weightButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prescriptionsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloodSugarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soapButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(exerciseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addContainerGap(78, Short.MAX_VALUE))
        );

        patientInfoTextArea.setColumns(20);
        patientInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(patientInfoTextArea);
        patientInfoTextArea.setVisible(false);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        selectionPanel.setVisible(false);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bloodPressureButton;
    private javax.swing.JButton bloodSugarButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton diagnosesButton;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton exerciseButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JTextArea patientInfoTextArea;
    private javax.swing.JButton prescriptionsButton;
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
}
