/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ApplyKarachiMVC.UI;

import com.project.ApplyKarachiMVC.BO.Admin;
import com.project.ApplyKarachiMVC.constants.Constants;
import com.project.ApplyKarachiMVC.controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class login extends javax.swing.JFrame {

    login loginform = null;
    signup signupform = null;
    MainForm mainForm = null;
    UniversitySignup Universitysignup = null;
    UniversityForm Universityform = null;
    counselorOpen copen =null;
    /**
     *
     */
    public login() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginnametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginpwdtxt = new javax.swing.JPasswordField();
        login1btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        accountbtn = new javax.swing.JButton();
        loginitem = new javax.swing.JComboBox();
        errormsg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        signgupunibtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Apply Karachi");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("username");

        loginnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginnametxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        loginpwdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpwdtxtActionPerformed(evt);
            }
        });

        login1btn.setText("Login");
        login1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("OR");

        accountbtn.setText("create new account");
        accountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountbtnActionPerformed(evt);
            }
        });

        loginitem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Student", "Counselor", "University" }));
        loginitem.setToolTipText("");
        loginitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginitemActionPerformed(evt);
            }
        });

        errormsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errormsg.setForeground(new java.awt.Color(255, 0, 51));
        errormsg.setText("Incorrect ID or Password");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("OR");

        signgupunibtn.setText("Sign up for University");
        signgupunibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signgupunibtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errormsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginnametxt)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginpwdtxt)
                            .addComponent(login1btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(loginitem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signgupunibtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(errormsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginpwdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(loginitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signgupunibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Object [] parameters = new Object [2];
        Object [] returnObj = null;
        parameters [0] = loginnametxt.getText();
        String s = new String (loginpwdtxt.getPassword());
        parameters [1] = s;

        Controller controller = new Controller();
        returnObj = controller.processRequest(Constants.loginActionAdmin, parameters);
        returnObj = controller.processRequest(Constants.loginActionStudent, parameters);
        returnObj = controller.processRequest(Constants.loginActionCounselor, parameters);
        returnObj = controller.processRequest(Constants.loginActionUniversity, parameters);

        if(returnObj == null) {
            errormsg.setVisible(true);
        }

        else {

            errormsg.setVisible(false);
            this.setVisible(false);
            signupform = new signup();
            signupform.setVisible(true);

        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginnametxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_loginnametxtActionPerformed

    private void loginpwdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpwdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginpwdtxtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        errormsg.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void accountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountbtnActionPerformed
        signup signUpForm = new signup();
        this.setVisible(false);
        signUpForm.setVisible(true);
    }//GEN-LAST:event_accountbtnActionPerformed

    private void login1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1btnActionPerformed

        Object[] parameters = new Object[3];
        Object[] returnObj = null;
        parameters[0] = loginnametxt.getText();
        String s = new String(loginpwdtxt.getPassword());
        parameters[1] = s;
        parameters[2] = loginitem.getSelectedItem();
        Controller controller = new Controller();

        String account = (String) parameters[2];

        if (account.equals("Admin")) {

            returnObj = controller.processRequest(Constants.loginActionAdmin, parameters);
          //  int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);
        } 
        else if (account.equals("Student")) {

            returnObj = controller.processRequest(Constants.loginActionStudent, parameters);
           //int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);
        } 
        else if (account.equals("Counselor")) {

            returnObj = controller.processRequest(Constants.loginActionCounselor, parameters);
         //int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);
        } 
        else if (account.equals("University")) {

            returnObj = controller.processRequest(Constants.loginActionUniversity, parameters);
      // int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);
        }

        if (returnObj == null) {
            errormsg.setVisible(true);
        } 
        else {
        
        if(account.equals("Counselor")){
         // Counselor open
         copen=new counselorOpen();
         this.setVisible(false);
         copen.setVisible(true);
        int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);

}       // Admin, student, university open...
        else if(account.equals("University")){            
            Universityform = new UniversityForm();
            this.setVisible(false);
            Universityform.setVisible(true);
            int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);
        }
        
        //  For admin
           else if(account.equals("Admin")){            
            mainForm = new MainForm();
            this.setVisible(false);
            mainForm.setVisible(true);
            int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);
        }
        // For student
           else if(account.equals("Student")){            
            mainForm = new MainForm();
            this.setVisible(false);
            mainForm.setVisible(true);
            int result = JOptionPane.showConfirmDialog(this, "Sign in Successfully !!!", "Request Confirmation", JOptionPane.PLAIN_MESSAGE);
        }
        
        
        
        
        
        
        
        
        
        }
        /* else {
           
         errormsg.setVisible(false);
         this.setVisible(false);
         signupform = new signup();
         signupform.setVisible(true);
           
         }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_login1btnActionPerformed

    private void loginitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginitemActionPerformed

    private void signgupunibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signgupunibtnActionPerformed
        // TODO add your handling code here:
        UniversitySignup Universitysignup = new UniversitySignup();
        this.setVisible(false);
        Universitysignup.setVisible(true);
    }//GEN-LAST:event_signgupunibtnActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountbtn;
    private javax.swing.JLabel errormsg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login1btn;
    private javax.swing.JComboBox loginitem;
    private javax.swing.JTextField loginnametxt;
    private javax.swing.JPasswordField loginpwdtxt;
    private javax.swing.JButton signgupunibtn;
    // End of variables declaration//GEN-END:variables
}
