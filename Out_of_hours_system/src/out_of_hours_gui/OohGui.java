/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package out_of_hours_gui;

import java.util.Arrays;
import out_of_hours_core.*;

/**
 *
 * @author Skenn
 */
public class OohGui extends javax.swing.JFrame {

    //attributes
    
    /**
     * the coordinating object
     */
    private OohCoord coord;
    private User localUser;
    
    /**
     * Creates new form OohGui
     */
    public OohGui() {
        // Get a reference to the coordinating object
        OohCoord.getOohCoord();
        
        // Initialise the graphical components
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTextField1 = new javax.swing.JTextField();
        createUserPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordLoginPasswordField = new javax.swing.JPasswordField();
        ssoLoginTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        clearLoginButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        createUserNameTextField = new javax.swing.JTextPane();
        phoneNumberTextPane = new javax.swing.JScrollPane();
        createUserPhoneNumberTextField = new javax.swing.JTextPane();
        emailLabel = new javax.swing.JLabel();
        createUserEmailTextPane = new javax.swing.JScrollPane();
        createUserEmailTextField = new javax.swing.JTextPane();
        ssoLabel = new javax.swing.JLabel();
        emailTextField1 = new javax.swing.JScrollPane();
        createUserSsoCreateTextField = new javax.swing.JTextPane();
        createUserEscalationCheckBox = new javax.swing.JCheckBox();
        createUserFirstLineCheckBox = new javax.swing.JCheckBox();
        createUserManagerCheckBox = new javax.swing.JCheckBox();
        createUserButton = new javax.swing.JButton();
        clearCreateUserButton = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SSO");

        jLabel2.setText("Password");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        clearLoginButton.setText("Clear");
        clearLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLoginButtonActionPerformed(evt);
            }
        });

        infoTextArea.setEditable(false);
        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        infoTextArea.setEnabled(false);
        jScrollPane2.setViewportView(infoTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 226, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordLoginPasswordField)
                                    .addComponent(ssoLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(loginButton)
                                .addGap(18, 18, 18)
                                .addComponent(clearLoginButton)))
                        .addGap(194, 194, 194)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(ssoLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(passwordLoginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(clearLoginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        createUserPane.addTab("Login", jPanel2);

        nameLabel.setText("Name:");

        phoneNumberLabel.setText("Phone Number:");

        createUserNameTextField.setEditable(false);
        jScrollPane1.setViewportView(createUserNameTextField);

        createUserPhoneNumberTextField.setEditable(false);
        phoneNumberTextPane.setViewportView(createUserPhoneNumberTextField);

        emailLabel.setText("Email");

        createUserEmailTextField.setEditable(false);
        createUserEmailTextPane.setViewportView(createUserEmailTextField);

        ssoLabel.setText("SSO");

        createUserSsoCreateTextField.setEditable(false);
        emailTextField1.setViewportView(createUserSsoCreateTextField);

        createUserEscalationCheckBox.setText("Escalation");
        createUserEscalationCheckBox.setEnabled(false);

        createUserFirstLineCheckBox.setText("First Line");
        createUserFirstLineCheckBox.setEnabled(false);

        createUserManagerCheckBox.setText("Manager");
        createUserManagerCheckBox.setEnabled(false);

        createUserButton.setText("Create User");
        createUserButton.setEnabled(false);

        clearCreateUserButton.setText("Clear");
        clearCreateUserButton.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createUserManagerCheckBox)
                    .addComponent(createUserFirstLineCheckBox)
                    .addComponent(createUserEscalationCheckBox)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberLabel)
                            .addComponent(emailLabel)
                            .addComponent(ssoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createUserEmailTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createUserButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearCreateUserButton)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(createUserEmailTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssoLabel)
                    .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createUserEscalationCheckBox)
                .addGap(18, 18, 18)
                .addComponent(createUserFirstLineCheckBox)
                .addGap(18, 18, 18)
                .addComponent(createUserManagerCheckBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserButton)
                    .addComponent(clearCreateUserButton))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        createUserPane.addTab("Create User", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(624, 624, 624)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(createUserPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createUserPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        try
        {
            // Collect the data from the login fields and attempt to log the user in.
            int rawSSO = Integer.parseInt(this.ssoLoginTextField.getText());
            String password = new String(this.passwordLoginPasswordField.getPassword());
            
            // Convert the raw SSO to an SSO.
            SingleSignOn aSSO = new SingleSignOn(rawSSO);
            
            // Attempt to log the user in.
            coord = OohCoord.getOohCoord();                        
            User localUser = coord.login(aSSO, password);
            this.infoTextArea.setText("Login successful.");
            this.setupTabs(localUser);
        }
        catch (Exception anException)
        {
            String errorString = "ERROR: " + anException + "\nMessage: " + anException.getMessage();
            System.out.println(errorString);
            this.infoTextArea.setText(errorString + "\nLogin Failed.");
            this.disableAllTabs();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void clearLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLoginButtonActionPerformed
        // Clear the fields in the login pane
        this.ssoLoginTextField.setText("");
        this.passwordLoginPasswordField.setText("");
        this.infoTextArea.setText("");
    }//GEN-LAST:event_clearLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OohGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OohGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OohGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OohGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OohGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearCreateUserButton;
    private javax.swing.JButton clearLoginButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JTextPane createUserEmailTextField;
    private javax.swing.JScrollPane createUserEmailTextPane;
    private javax.swing.JCheckBox createUserEscalationCheckBox;
    private javax.swing.JCheckBox createUserFirstLineCheckBox;
    private javax.swing.JCheckBox createUserManagerCheckBox;
    private javax.swing.JTextPane createUserNameTextField;
    private javax.swing.JTabbedPane createUserPane;
    private javax.swing.JTextPane createUserPhoneNumberTextField;
    private javax.swing.JTextPane createUserSsoCreateTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JScrollPane emailTextField1;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordLoginPasswordField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JScrollPane phoneNumberTextPane;
    private javax.swing.JLabel ssoLabel;
    private javax.swing.JTextField ssoLoginTextField;
    // End of variables declaration//GEN-END:variables

    /**
     * Checks the users privileges and enables fields as required.
     * 
     * @param localUser 
     */
    private void setupTabs(User aUser) 
    {
        this.setupCreateUser(aUser);
    }

    /**
     * Enables or Disables the fields in the create user tab as required.
     * 
     * @param aUser 
     */
    private void setupCreateUser(User aUser) 
    {
        // Assume the user is not a maanger
        boolean isManager = false;
        
        // If the user has a manager object then set the isManager to true .
        if (aUser.getManager() != null)
        {
            isManager = true;
        }
        
        this.setupCreateUser(isManager);
    }
    
    /**
     * enables or disables the fields in the create users tab.
     * 
     * @param enable 
     */
    private void setupCreateUser(boolean enable) {

        // Enable the text fields
        this.createUserNameTextField.setEditable(enable);
        this.createUserEmailTextField.setEditable(enable);
        this.createUserPhoneNumberTextField.setEditable(enable);
        this.createUserSsoCreateTextField.setEditable(enable);
           
        // Enable the check boxes
        this.createUserEscalationCheckBox.setEnabled(enable);
        this.createUserFirstLineCheckBox.setEnabled(enable);
        this.createUserManagerCheckBox.setEnabled(enable);
          
        // Enable the buttons.
        this.clearCreateUserButton.setEnabled(enable);
        this.createUserButton.setEnabled(enable);
    }

    private void disableAllTabs() 
    {
        this.setupCreateUser(false);
    }
}
