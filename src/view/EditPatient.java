
package view;

import control.DBAccess;
import java.util.ArrayList;
import model.Blood;
import model.Doctor;
import model.Patient;


public class EditPatient extends javax.swing.JFrame {

    /**
     * Creates new form EditProfessor
     */
    public EditPatient() {
        initComponents();
        fillCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboSSN = new javax.swing.JComboBox();
        butInfo = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputPhone = new javax.swing.JTextField();
        butDelete = new javax.swing.JButton();
        butUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboBlood = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Patient");

        jLabel2.setText("ID");

        comboSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSSNActionPerformed(evt);
            }
        });

        butInfo.setText("Get Info");
        butInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInfoActionPerformed(evt);
            }
        });

        label.setText("Name");

        inputName.setEnabled(false);
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone");

        inputPhone.setEnabled(false);
        inputPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPhoneActionPerformed(evt);
            }
        });

        butDelete.setText("Delete");
        butDelete.setEnabled(false);
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        butUpdate.setText("Update");
        butUpdate.setEnabled(false);
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("Blood Type");

        comboBlood.setEnabled(false);
        comboBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBloodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butInfo)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(label)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBlood, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                        .addComponent(butDelete))
                                    .addComponent(inputPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputName))
                                .addGap(15, 15, 15))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butUpdate)
                    .addComponent(butDelete))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSSNActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void butInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoActionPerformed

        // get the ssn from the combo box
        int id = Integer.parseInt(comboSSN.getSelectedItem().toString());
        Patient patient = new DBAccess().getPatientById(id);
        

        if (patient != null) {
            fillComboBlood();
            inputName.setText(patient.getName());
            inputPhone.setText(patient.getPhone() + "");
            comboBlood.setSelectedItem(patient.getBlood().getName());
            inputName.setEnabled(true);
            inputPhone.setEnabled(true);
            comboBlood.setEnabled(true);
            butUpdate.setEnabled(true);
            butDelete.setEnabled(true);
            
        }
    }//GEN-LAST:event_butInfoActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        int id = Integer.parseInt(comboSSN.getSelectedItem().toString());
        DBAccess dBAccess = new DBAccess();
        dBAccess.deletePatientById(id);
        inputName.setText("");
        inputPhone.setText("");
        fillCombo();
    }//GEN-LAST:event_butDeleteActionPerformed

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
        int id = Integer.parseInt(comboSSN.getSelectedItem().toString());
        Patient patient = new DBAccess().getPatientById(id);
        if (patient != null) {
            new DBAccess().updatePatient(new Patient(Integer.parseInt(comboSSN.getSelectedItem().toString()),inputName.getText(), inputPhone.getText(), new DBAccess().getBloodByName(comboBlood.getSelectedItem().toString())));
        }
        this.dispose();
    }//GEN-LAST:event_butUpdateActionPerformed

    private void inputPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPhoneActionPerformed

    private void comboBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBloodActionPerformed

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
            java.util.logging.Logger.getLogger(EditPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butInfo;
    private javax.swing.JButton butUpdate;
    private javax.swing.JComboBox<String> comboBlood;
    private javax.swing.JComboBox comboSSN;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables

    private void fillComboBlood() {

        comboBlood.removeAllItems();

        ArrayList<Blood> bloods = new DBAccess().getAllBlood();

        for (int i = 0; i < bloods.size(); i++) {
            comboBlood.addItem(bloods.get(i).getName());
        }
    }
    
    private void fillCombo() {

        comboSSN.removeAllItems();

        ArrayList<Integer> ids = new DBAccess().getAllPatientId();

        for (int i = 0; i < ids.size(); i++) {
            comboSSN.addItem(ids.get(i).toString());
        }
    }

}
