/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import javax.swing.JFrame;

/**
 *
 * @author its._royal_ankit
 */
public class UserVerifyFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserVerifyFrame
     */
    private JFrame displayFrame;

    public UserVerifyFrame() {
        initComponents();
        setLocationRelativeTo(null);
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
        myPanel = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jbnQuit = new javax.swing.JButton();
        myPanelForDetails = new javax.swing.JPanel();
        jrbSeller = new javax.swing.JRadioButton();
        jrbDeliveryStaff = new javax.swing.JRadioButton();
        jrbCustomer = new javax.swing.JRadioButton();
        jbnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setBackground(new java.awt.Color(0, 204, 204));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user selection.png"))); // NOI18N
        lblImage.setLabelFor(lblImage);
        lblImage.setOpaque(true);
        myPanel.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 592));

        jbnQuit.setBackground(new java.awt.Color(255, 0, 0));
        jbnQuit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbnQuit.setForeground(new java.awt.Color(255, 255, 255));
        jbnQuit.setText("Quit");
        jbnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnQuitActionPerformed(evt);
            }
        });
        myPanel.add(jbnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 501, 144, -1));

        myPanelForDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true), "Select an Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 204, 255))); // NOI18N
        myPanelForDetails.setToolTipText("");
        myPanelForDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myPanelForDetails.setName(""); // NOI18N

        buttonGroup1.add(jrbSeller);
        jrbSeller.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrbSeller.setForeground(new java.awt.Color(0, 204, 255));
        jrbSeller.setText("Seller");
        jrbSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSellerActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbDeliveryStaff);
        jrbDeliveryStaff.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrbDeliveryStaff.setForeground(new java.awt.Color(0, 204, 255));
        jrbDeliveryStaff.setText("Delivery Staff");
        jrbDeliveryStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDeliveryStaffActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbCustomer);
        jrbCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrbCustomer.setForeground(new java.awt.Color(0, 204, 255));
        jrbCustomer.setText("Customer");
        jrbCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCustomerActionPerformed(evt);
            }
        });

        jbnNext.setBackground(new java.awt.Color(0, 204, 255));
        jbnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbnNext.setForeground(new java.awt.Color(255, 255, 255));
        jbnNext.setText("Next");
        jbnNext.setOpaque(false);
        jbnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanelForDetailsLayout = new javax.swing.GroupLayout(myPanelForDetails);
        myPanelForDetails.setLayout(myPanelForDetailsLayout);
        myPanelForDetailsLayout.setHorizontalGroup(
            myPanelForDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelForDetailsLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(myPanelForDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbCustomer)
                    .addComponent(jrbDeliveryStaff)
                    .addComponent(jrbSeller))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelForDetailsLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jbnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        myPanelForDetailsLayout.setVerticalGroup(
            myPanelForDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelForDetailsLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jrbSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jrbDeliveryStaff)
                .addGap(55, 55, 55)
                .addComponent(jrbCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jbnNext)
                .addGap(34, 34, 34))
        );

        myPanel.add(myPanelForDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 26, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSellerActionPerformed
        displayFrame = new SellerLoginFrame();
    }//GEN-LAST:event_jrbSellerActionPerformed

    private void jbnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnNextActionPerformed
        displayFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnNextActionPerformed

    private void jrbDeliveryStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDeliveryStaffActionPerformed
        displayFrame = new DeliveryStaffLoginFrame();
    }//GEN-LAST:event_jrbDeliveryStaffActionPerformed

    private void jrbCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCustomerActionPerformed
        displayFrame = new CustomerLoginFrame();
    }//GEN-LAST:event_jrbCustomerActionPerformed

    private void jbnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserVerifyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jbnNext;
    private javax.swing.JButton jbnQuit;
    private javax.swing.JRadioButton jrbCustomer;
    private javax.swing.JRadioButton jrbDeliveryStaff;
    private javax.swing.JRadioButton jrbSeller;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel myPanel;
    private javax.swing.JPanel myPanelForDetails;
    // End of variables declaration//GEN-END:variables
}
