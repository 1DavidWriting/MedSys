/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 *
 * @author kken1
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
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

        Portals = new javax.swing.JPanel();
        Portal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PatientPortal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        CaregiverPortal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        PhysicianPortal = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        AdminPortal = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Portals.setLayout(new java.awt.CardLayout());

        Portal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setLabel("PatientPortal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Portal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, 60));

        jButton2.setLabel("CaregiverPortal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Portal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 60));

        jButton3.setLabel("PhysicianPortal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Portal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 153, 110, 50));

        jButton4.setLabel("AdminPortal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Portal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 110, 50));

        Portals.add(Portal, "card2");

        PatientPortal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        PatientPortal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField1.setText("jTextField1");
        PatientPortal.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, -1));

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PatientPortal.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel2.setText("jLabel2");
        PatientPortal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTextField2.setText("jTextField2");
        PatientPortal.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, -1));

        jButton6.setText("jButton6");
        PatientPortal.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        Portals.add(PatientPortal, "card3");

        CaregiverPortal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel3");
        CaregiverPortal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextField3.setText("jTextField3");
        CaregiverPortal.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, -1));

        jButton7.setText("jButton7");
        CaregiverPortal.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel4.setText("jLabel4");
        CaregiverPortal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField4.setText("jTextField4");
        CaregiverPortal.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, -1));

        jButton8.setText("jButton8");
        CaregiverPortal.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jTextField5.setText("jTextField5");
        CaregiverPortal.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, -1));

        jTextField6.setText("jTextField6");
        CaregiverPortal.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, -1));

        jLabel5.setText("jLabel5");
        CaregiverPortal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel6.setText("jLabel6");
        CaregiverPortal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jButton9.setText("jButton9");
        CaregiverPortal.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jButton10.setText("jButton10");
        CaregiverPortal.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        Portals.add(CaregiverPortal, "card4");

        PhysicianPortal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("jLabel7");
        PhysicianPortal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField7.setText("jTextField7");
        PhysicianPortal.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, -1));

        jButton11.setText("jButton11");
        PhysicianPortal.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jButton12.setText("jButton12");
        PhysicianPortal.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jButton13.setText("jButton13");
        PhysicianPortal.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PhysicianPortal.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 40));

        jLabel8.setText("jLabel8");
        PhysicianPortal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Portals.add(PhysicianPortal, "card5");

        AdminPortal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("jLabel9");
        AdminPortal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField8.setText("jTextField8");
        AdminPortal.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton14.setText("jButton14");
        AdminPortal.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AdminPortal.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 340, -1));

        jLabel10.setText("jLabel10");
        AdminPortal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel11.setText("jLabel11");
        AdminPortal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AdminPortal.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 340, -1));

        jButton15.setText("jButton15");
        AdminPortal.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jButton16.setText("jButton16");
        AdminPortal.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        Portals.add(AdminPortal, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Portals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Portals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PatientPortal.setVisible(true);
        Portals.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CaregiverPortal.setVisible(true);
        Portals.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PhysicianPortal.setVisible(true);
        Portals.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AdminPortal.setVisible(true);
        Portals.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPortal;
    private javax.swing.JPanel CaregiverPortal;
    private javax.swing.JPanel PatientPortal;
    private javax.swing.JPanel PhysicianPortal;
    private javax.swing.JPanel Portal;
    private javax.swing.JPanel Portals;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
