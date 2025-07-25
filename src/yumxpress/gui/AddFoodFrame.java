package yumxpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.ProductPojo;
import yumxpress.utility.OwnerProfile;
import yumxpress.utility.SpoonacularAPI;

/**
 *
 * @author its._royal_ankit
 */
public class AddFoodFrame extends javax.swing.JFrame {

    private JFrame displayFrame;

    private List<ProductPojo> foodList;
    private int foodIndex = 0;
    private ProductPojo product;

    public AddFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblOwnerProfile.setText("Hello " + OwnerProfile.getOwnerName());
        clearAll();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchFood = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblFoodImage = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFoodPrice = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnSearchFood = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblOwnerProfile = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAddStaff = new javax.swing.JButton();
        btnViewFood = new javax.swing.JButton();
        btnViewStaff = new javax.swing.JButton();
        btnOrderList = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Food Frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(254, 255, 254));

        jLabel1.setBackground(new java.awt.Color(254, 255, 254));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(129, 120, 177));
        jLabel1.setText("Search Food");

        txtSearchFood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(254, 255, 254));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(129, 120, 177));
        jLabel2.setText("Food Name ");

        txtFoodName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(254, 255, 254));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 120, 177));
        jLabel3.setText("Food Image");

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/icons8-left-arrow-64.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/icons8-right-arrow-64.png"))); // NOI18N
        lblNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(254, 255, 254));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 120, 177));
        jLabel4.setText("Enter Price ");

        txtFoodPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnAddItem.setBackground(new java.awt.Color(193, 224, 127));
        btnAddItem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnSearchFood.setBackground(new java.awt.Color(193, 224, 127));
        btnSearchFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSearchFood.setText("Search");
        btnSearchFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchFood)
                            .addComponent(lblFoodImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNext)
                    .addComponent(btnSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblBack))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblNext)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 93, -1, 460));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 120, 177));
        jLabel6.setText("Add Food Item");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 0, 820, -1));

        jPanel3.setBackground(new java.awt.Color(129, 120, 177));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOwnerProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOwnerProfile.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(lblOwnerProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 34));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 280, 10));

        btnAddStaff.setBackground(new java.awt.Color(193, 224, 127));
        btnAddStaff.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddStaff.setText("Add Staff");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 165, 40));

        btnViewFood.setBackground(new java.awt.Color(193, 224, 127));
        btnViewFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnViewFood.setText("View Food");
        btnViewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFoodActionPerformed(evt);
            }
        });
        jPanel3.add(btnViewFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 165, 40));

        btnViewStaff.setBackground(new java.awt.Color(193, 224, 127));
        btnViewStaff.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnViewStaff.setText("View Staff");
        btnViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStaffActionPerformed(evt);
            }
        });
        jPanel3.add(btnViewStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 165, 40));

        btnOrderList.setBackground(new java.awt.Color(193, 224, 127));
        btnOrderList.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderList.setText("Order List");
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });
        jPanel3.add(btnOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 165, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 100, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 280, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
        displayFrame = new AddDeliveryStaffFrame();
        displayFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void btnViewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFoodActionPerformed

        displayFrame = new ViewFood();
        displayFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewFoodActionPerformed

    private void btnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStaffActionPerformed
        displayFrame = new ViewDeliveryStaffFrame();
        displayFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewStaffActionPerformed

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        displayFrame = new OrderListFrame();
        displayFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        displayFrame = new SellerOptionFrame();
        displayFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFoodActionPerformed
        String searchFood = txtSearchFood.getText().trim();
        if (searchFood.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please type a food name");
            return;
        }
        try {
            searchFood = searchFood.replaceAll(" ", "-");
            foodList = SpoonacularAPI.getAllItemDetailsByName(searchFood);
            if (foodList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No food details for " + searchFood + " found");
                return;
            }
            lblNext.setEnabled(true);
            lblBack.setEnabled(true);
            showFoodDetailsByIndex(foodIndex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception while using API");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchFoodActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (!validateInputs()) {
            JOptionPane.showMessageDialog(null, "Please fill all the data");
            return;
        }
        try {
            double price = Double.parseDouble(txtFoodPrice.getText().trim());
            System.out.println("price is: " + price);
            product.setCompanyId(OwnerProfile.getCompanyId());
            product.setProductName(txtFoodName.getText().trim());
            product.setProductPrice(price);
            boolean result = ProductDAO.addProduct(product);
            if (result == false) {
                JOptionPane.showMessageDialog(null, "Cannot add the product");
                return;
            }
            JOptionPane.showMessageDialog(null, "Product successfully added");
            foodList.remove(foodIndex);
            if (foodList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All varities of " + txtSearchFood.getText().trim() + " added");
                clearAll();
                return;
            }
            foodIndex = 0;
            showFoodDetailsByIndex(foodIndex);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception in DB in AddFoodFrame");
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please input numeric value for price");
            ex.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Exception in DAO Image Processing in AddFoodFrame");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        foodIndex++;
        if (foodIndex >= foodList.size()) {
            foodIndex = 0;
        }
        showFoodDetailsByIndex(foodIndex);
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        foodIndex--;
        if (foodIndex < 0) {
            foodIndex = foodList.size() - 1;
        }
        showFoodDetailsByIndex(foodIndex);
    }//GEN-LAST:event_lblBackMouseClicked

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
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JButton btnSearchFood;
    private javax.swing.JButton btnViewFood;
    private javax.swing.JButton btnViewStaff;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOwnerProfile;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFoodPrice;
    private javax.swing.JTextField txtSearchFood;
    // End of variables declaration//GEN-END:variables

    private void showFoodDetailsByIndex(int foodIndex) {
        product = foodList.get(foodIndex);
        String foodName = product.getProductName();
        if (foodName.length() >= 50) {
            foodName = foodName.substring(0, 45) + "...";
        }
        txtFoodName.setText(foodName);
        Image img = product.getProductImage();
        img = img.getScaledInstance(lblFoodImage.getWidth(), lblFoodImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblFoodImage.setIcon(icon);
    }

    private boolean validateInputs() {
        if (txtFoodName.getText().trim().isEmpty() || txtFoodPrice.getText().trim().isEmpty() || lblFoodImage.getIcon() == null) {
            return false;
        }
        return true;

    }

    private void clearAll() {
        txtFoodName.setText("");
        txtFoodPrice.setText("");
        txtSearchFood.setText("");
        lblFoodImage.setIcon(null);
        lblNext.setEnabled(false);
        lblBack.setEnabled(false);
        txtSearchFood.requestFocus();
    }

}
