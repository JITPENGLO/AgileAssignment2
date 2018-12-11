/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import agileassignment2.orderList;

/**
 *
 * @author ASUS
 */
public class AddSalesOrder extends javax.swing.JFrame {

    /**
     * Creates new form StaffDeleteProduct
     */
    public AddSalesOrder() {
        initComponents();
        StoreTable();
    }

public ArrayList OrderListt(){
    ArrayList<orderList> list = new ArrayList<orderList>();
    
    /*for(int i=0; i<list.size(); i++){
        list.add();
        list.add(p2);
        list.add(p3);
    }*/
    orderList nlist = new orderList(jtfID.getText(), jtaDesc.getText(), jtfDate.getText(), jtfTime.getText(), Integer.parseInt(jtfQuan.getText()), Double.parseDouble(jtfPrice.getText())); 
    list.add(nlist);
    return list;
}
public void StoreTable(){
       DefaultTableModel model = (DefaultTableModel) jtbProduct.getModel();
       ArrayList<orderList> list = new ArrayList<orderList>();
       Object rowData[] = new Object[6];
       
       for(int i =0;i< list.size();i++){
           rowData[0] = list.get(i).id;
           rowData[1] = list.get(i).desc;
           rowData[2] = list.get(i).date;
           rowData[3] = list.get(i).time;
           rowData[4] = list.get(i).quantity;
           rowData[5] = list.get(i).price;
           
           model.addRow(rowData);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStaffID = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        lblProductID = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        jtfDate = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jtfRM = new javax.swing.JTextField();
        lblQuan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDesc = new javax.swing.JTextArea();
        jtfQuan = new javax.swing.JTextField();
        jbtDelete = new javax.swing.JButton();
        lblCatog = new javax.swing.JLabel();
        jtfTime = new javax.swing.JTextField();
        Image = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProduct = new javax.swing.JTable();
        jbtedit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Fiore Flowershop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblStaffID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStaffID.setText("Order ID        :");

        jtfID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfID.setForeground(new java.awt.Color(102, 102, 102));
        jtfID.setText("FR0000");
        jtfID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblProductID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductID.setText("Description     :");

        lblProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName.setText("Date             :");

        jtfDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfDate.setForeground(new java.awt.Color(102, 102, 102));
        jtfDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice.setText("Total Price    :");

        jtfPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfPrice.setForeground(new java.awt.Color(102, 102, 102));
        jtfPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPriceActionPerformed(evt);
            }
        });

        jtfRM.setBackground(new java.awt.Color(153, 153, 255));
        jtfRM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfRM.setText("RM");
        jtfRM.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblQuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuan.setText("Quantitie(s)   :");

        jtaDesc.setColumns(20);
        jtaDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtaDesc.setForeground(new java.awt.Color(102, 102, 102));
        jtaDesc.setRows(5);
        jScrollPane2.setViewportView(jtaDesc);

        jtfQuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfQuan.setForeground(new java.awt.Color(102, 102, 102));
        jtfQuan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuanActionPerformed(evt);
            }
        });

        jbtDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtDelete.setText("Add Sales Order");
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDeleteActionPerformed(evt);
            }
        });

        lblCatog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCatog.setText("Time            :");

        jtfTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfTime.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPrice)
                        .addGap(22, 22, 22)
                        .addComponent(jtfRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPrice))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblStaffID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblProductID)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblProductName)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblQuan)
                                .addGap(18, 18, 18)
                                .addComponent(jtfQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCatog)
                                .addGap(18, 18, 18)
                                .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStaffID)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(lblProductID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(jtfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCatog)
                    .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuan)
                    .addComponent(jtfQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(jtfRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(jbtDelete)
                .addGap(58, 58, 58)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Description", "Date", "Time", "Quantity", "Total (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbProduct);

        jbtedit.setText("Edit");
        jbtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbteditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtedit)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtedit)
                .addGap(191, 191, 191))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPriceActionPerformed

    private void jtfQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuanActionPerformed

    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)jtbProduct.getModel();
        ArrayList<orderList> list = new ArrayList();
        
        int yesno = JOptionPane.showConfirmDialog(null, "Do you want to add the sales order?", "ARE YOU SURE???", JOptionPane.YES_NO_OPTION);
        if(yesno == JOptionPane.YES_OPTION){
            orderList nlist = new orderList(jtfID.getText(), jtaDesc.getText(), jtfDate.getText(), jtfTime.getText(), Integer.parseInt(jtfQuan.getText()), Double.parseDouble(jtfPrice.getText())); 
            list.add(nlist);
            
            Object rowData[] = new Object[6];
            rowData[0] = jtfID.getText();
            rowData[1] = jtaDesc.getText();
            rowData[2] = jtfDate.getText();
            rowData[3] = jtfTime.getText();
            rowData[4] = Integer.parseInt(jtfQuan.getText());
            rowData[5] = Double.parseDouble(jtfPrice.getText());
            model.addRow(rowData);
            JOptionPane.showMessageDialog(null,"Product Add successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        /*DefaultTableModel model = (DefaultTableModel) jtbProduct.getModel();
        ArrayList<AddSalesOrder.Product> list = ProductList();
        
        int yes = JOptionPane.showConfirmDialog(null, "Do you want to delete the current product?", "Delete Product", JOptionPane.YES_NO_OPTION);
        if(yes == JOptionPane.YES_OPTION){
            for(int i =0;i< list.size();i++){
                if(jtfID.getText().equals(list.get(i).id.toString())){
            
                    model.removeRow(i);
                    jtfID.setText("");
                    jtfProductName.setText("");
                    jtfProductType.setText("");
                    jtaDesc.setText("");
                    jtfPrice.setText("");
                    jtfQuan.setText("");
                }
            }
        }else if(yes == JOptionPane.NO_OPTION){
            jtfID.setText("");
            jtfProductName.setText("");
            jtfProductType.setText("");
            jtaDesc.setText("");
            jtfPrice.setText("");
            jtfQuan.setText("");
        }*/
        
        
    }//GEN-LAST:event_jbtDeleteActionPerformed

    private void jbteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbteditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtbProduct.getModel();
        ArrayList<orderList> list = new ArrayList();
        
        for(int i = 0;i < model.getRowCount();i++){
            orderList oList = new orderList(model.getValueAt(i, 0).toString(),model.getValueAt(i,1).toString(),model.getValueAt(i, 2).toString(),
                    model.getValueAt(i, 3).toString(),Integer.parseInt(model.getValueAt(i, 4).toString()),Double.parseDouble(model.getValueAt(i, 5).toString()));
            
            list.add(oList);
        }
        
        new EditSalesOrder(list).setVisible(true);
    }//GEN-LAST:event_jbteditActionPerformed

    /*public int selectedIndex(){
        ArrayList<AddSalesOrder.Product> Arraylist = ProductList();
        int index = -1;
        
        for(int i=0;i<Arraylist.size();i++){
            if(jtfID.getText().equals(Arraylist.get(i).id.toStr
    ing())){
                index = i;
            }
        }
        return index;
    }*/
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
            java.util.logging.Logger.getLogger(AddSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSalesOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtedit;
    private javax.swing.JTextArea jtaDesc;
    private javax.swing.JTable jtbProduct;
    private javax.swing.JTextField jtfDate;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfQuan;
    private javax.swing.JTextField jtfRM;
    private javax.swing.JTextField jtfTime;
    private javax.swing.JLabel lblCatog;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuan;
    private javax.swing.JLabel lblStaffID;
    // End of variables declaration//GEN-END:variables
}
