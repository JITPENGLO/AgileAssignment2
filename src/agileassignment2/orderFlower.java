/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class orderFlower extends javax.swing.JFrame {

    private String expireDate = "1/12/2018";
    private boolean payment = false;
    private double creditLimit = 300.00;
    /**
     * Creates new form orderFlower
     */
    public orderFlower() {
        initComponents();
        setQuantity();
        jtfTotal.setText(jtfPrice.getText());
    }

    //to set the quantity from 1 to 100
    private void setQuantity(){
        for(int i = 1;i<=100;i++){
            jcbQty.addItem(i+"");
        }
    }
    
    private void calculateTotal(){
        double price = Double.parseDouble(jtfPrice.getText().substring(2));
        double qty = Double.parseDouble(jcbQty.getSelectedItem().toString());
        jtfTotal.setText("RM" + String.format("%.2f", price * qty));
    }
    
    private void restoreDefault(){
        jcbQty.setSelectedIndex(0);
        jtfTotal.setText(jtfPrice.getText());
    }
    
    private boolean hasPay(){
        try{
            Date expDate = new SimpleDateFormat("dd/MM/yyyy").parse(expireDate);
            Date nowDate = new Date();
            if(nowDate.compareTo(expDate) > 0 && payment == false){
                return false;
            }else{
                return true;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblCompanyName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlblProductName = new javax.swing.JLabel();
        jtfProdName = new javax.swing.JTextField();
        jlblProdType = new javax.swing.JLabel();
        jtfType = new javax.swing.JTextField();
        jlblPrice = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jlblQty = new javax.swing.JLabel();
        jcbQty = new javax.swing.JComboBox<>();
        jbOrder = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jlblOrder = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jlblCompanyName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblCompanyName.setText("Fiore FlowerShop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblCompanyName)
                .addGap(301, 301, 301))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlblCompanyName)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jlblProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblProductName.setText("Product Name:");

        jtfProdName.setEditable(false);
        jtfProdName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfProdName.setText("Rose");

        jlblProdType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblProdType.setText("Product Type:");

        jtfType.setEditable(false);
        jtfType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfType.setText("Fresh Flower");

        jlblPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblPrice.setText("Price:");

        jtfPrice.setEditable(false);
        jtfPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfPrice.setText("RM5.00");

        jlblQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblQty.setText("Quantity:");

        jcbQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbQtyActionPerformed(evt);
            }
        });

        jbOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbOrder.setText("Order");
        jbOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOrderActionPerformed(evt);
            }
        });

        jbCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jlblOrder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblOrder.setText("Order Product");

        jlblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblTotal.setText("Total Amount:");

        jtfTotal.setEditable(false);
        jtfTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblOrder)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblQty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblProdType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfProdName)
                                    .addComponent(jtfType)
                                    .addComponent(jtfPrice)
                                    .addComponent(jcbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jlblOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblProdType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbQtyActionPerformed
        // TODO add your handling code here:
        calculateTotal();
    }//GEN-LAST:event_jcbQtyActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        // TODO add your handling code here:
        restoreDefault();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOrderActionPerformed
        // TODO add your handling code here:
        double total = Double.parseDouble(jtfTotal.getText().substring(2));
        
        if(hasPay()){
            int i = JOptionPane.showConfirmDialog(null,"Are you sure want to order","Confirm", JOptionPane.YES_NO_OPTION);
            if(i == JOptionPane.YES_OPTION){
            if(creditLimit - total >= 0){
                creditLimit -= total;
                JOptionPane.showMessageDialog(null,"Your credit limit still left RM" + String.format("%.2f",creditLimit)
                        , "Order success", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"credit limit is not enough","Not enough",JOptionPane.INFORMATION_MESSAGE);
            }
            restoreDefault();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"You haven't pay last month invoice", "Not pay yet", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbOrderActionPerformed

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
            java.util.logging.Logger.getLogger(orderFlower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderFlower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderFlower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderFlower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderFlower().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbOrder;
    private javax.swing.JComboBox<String> jcbQty;
    private javax.swing.JLabel jlblCompanyName;
    private javax.swing.JLabel jlblOrder;
    private javax.swing.JLabel jlblPrice;
    private javax.swing.JLabel jlblProdType;
    private javax.swing.JLabel jlblProductName;
    private javax.swing.JLabel jlblQty;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfProdName;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JTextField jtfType;
    // End of variables declaration//GEN-END:variables
}
