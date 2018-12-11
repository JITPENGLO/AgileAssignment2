package agileassignment2;


import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class StaffUpdateProduct extends javax.swing.JFrame {

    /**
     * Creates new form StaffUpdateProduct
     */
    public StaffUpdateProduct() {
        initComponents();
          StoreTable();
    }

    public class Product{
    public String id;
    public String name;
    public String productType;
    public String productDesc;
    public double price;
    public int quantity;
    public String image;
    
    public Product(String id,String name,String productType, String productDesc, double price,int quantity,String image){
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.productDesc = productDesc;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }
    
    
}
public ArrayList ProductList(){
    ArrayList<Product> list = new ArrayList<Product>();
    Product p1 = new Product("P1001","Rose","Fresh Flowers","Collect on current day morning 100% pure and fresh",50.0,5,"none");
    Product p2 = new Product("P1002","Sun Flowers","Fresh Flowers","Collect on current day morning 100% pure and fresh",10.0,2,"none");
    Product p3 = new Product("P1003","Moon Flowers","Fresh Flowers","Collect on current day morning 100% pure and fresh",10.0,2,"none");
    list.add(p1);
    list.add(p2);
    list.add(p3);
    return list;
}
public void StoreTable(){
       DefaultTableModel model = (DefaultTableModel) jtbProduct.getModel();
       ArrayList<StaffUpdateProduct.Product> list = ProductList();
       Object rowData[] = new Object[7];
       
       for(int i =0;i< list.size();i++){
           rowData[0] = list.get(i).id;
           rowData[1] = list.get(i).name;
           rowData[2] = list.get(i).productType;
           rowData[3] = list.get(i).productDesc;
           rowData[4] = list.get(i).price;
           rowData[5] = list.get(i).quantity;
           rowData[6] = list.get(i).image;
           
           model.addRow(rowData);
    }
}

    public void updateProduct(){
        DefaultTableModel model = (DefaultTableModel) jtbProduct.getModel();
       int index = jtbProduct.getSelectedRow();

        int yes = JOptionPane.showConfirmDialog(null, "Do you want to update the current product?", "Update Product", JOptionPane.YES_NO_OPTION);
        if(yes == JOptionPane.YES_OPTION){
            
                if(index >= 0){
                      model.setValueAt(jtfProductID.getText(),index,0);
                      model.setValueAt(jtfProductName.getText(), index, 1);
                      model.setValueAt(jtfProductType.getText(),index,2);
                      model.setValueAt(jtaDesc.getText(), index, 3);
                      model.setValueAt(Double.parseDouble(jtfPrice.getText()), index,4);
                      model.setValueAt(Integer.parseInt(jtfQuan.getText()), index, 5);
                      model.setValueAt(jtfImage.getText(),index,6);
                   
                }
            
        }else if(yes == JOptionPane.NO_OPTION){
            jtfProductID.setText("");
            jtfProductName.setText("");
            jtfProductType.setText("");
            jtaDesc.setText("");
            jtfPrice.setText("");
            jtfQuan.setText("");
            jtfImage.setText("");
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

        jPanel2 = new javax.swing.JPanel();
        lblStaffID = new javax.swing.JLabel();
        jtfStaffID = new javax.swing.JTextField();
        lblProductID = new javax.swing.JLabel();
        jtfProductID = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        jtfProductName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jtfRM = new javax.swing.JTextField();
        lblQuan = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDesc = new javax.swing.JTextArea();
        jtfQuan = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jbtUpdate = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblCatog = new javax.swing.JLabel();
        jtfProductType = new javax.swing.JTextField();
        jtfImage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblStaffID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStaffID.setText("Staff ID :");

        jtfStaffID.setEditable(false);
        jtfStaffID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfStaffID.setForeground(new java.awt.Color(102, 102, 102));
        jtfStaffID.setText("S1001");
        jtfStaffID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblProductID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductID.setText("Product ID :");

        jtfProductID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfProductID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProductIDActionPerformed(evt);
            }
        });

        lblProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName.setText("Product Name :");

        jtfProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfProductName.setForeground(new java.awt.Color(102, 102, 102));
        jtfProductName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice.setText("Price (per) :");

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
        lblQuan.setText("Quantitie(s) :");

        lblDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDesc.setText("Product Description :");

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

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jbtUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtUpdate.setText("Update Product");
        jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateActionPerformed(evt);
            }
        });

        lblImage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblImage.setText("Product Image :");

        lblCatog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCatog.setText("Product Type :");

        jtfProductType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfProductType.setForeground(new java.awt.Color(102, 102, 102));

        jtfImage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblProductName)
                                .addComponent(lblProductID)
                                .addComponent(lblStaffID)
                                .addComponent(jtfStaffID)
                                .addComponent(jtfProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblQuan)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDesc)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jtfQuan, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblPrice)))
                                        .addGap(32, 32, 32))
                                    .addComponent(lblImage)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtfRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(129, 129, 129))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCatog))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfImage, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jbtUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStaffID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lblProductID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblProductName)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lblCatog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDesc)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblPrice)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lblQuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Type", "Product Desc", "Price(RM)", "Quantity", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProduct);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(214, 214, 214))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProductIDActionPerformed

    private void jtfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPriceActionPerformed

    private void jtfQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuanActionPerformed

    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
      
        updateProduct();
        

    }//GEN-LAST:event_jbtUpdateActionPerformed

    private void jtfImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfImageActionPerformed

    private void jtbProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProductMouseClicked
        
        int selectedRow = jtbProduct.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jtbProduct.getModel();
        jtfProductID.setText(model.getValueAt(selectedRow,0).toString());
        jtfProductName.setText(model.getValueAt(selectedRow,1).toString());
        jtfProductType.setText(model.getValueAt(selectedRow,2).toString());
        jtaDesc.setText(model.getValueAt(selectedRow,3).toString());
        jtfPrice.setText(model.getValueAt(selectedRow,4).toString());
        jtfQuan.setText(model.getValueAt(selectedRow,5).toString());
        jtfImage.setText(model.getValueAt(selectedRow,6).toString());
        
    }//GEN-LAST:event_jtbProductMouseClicked
   public int selectedIndex(){
        ArrayList<StaffUpdateProduct.Product> Arraylist = ProductList();
        int index = -1;
        
        for(int i=0;i<Arraylist.size();i++){
            if(jtfProductID.getText().equals(Arraylist.get(i).id.toString())){
                index = i;
            }
        }
        return index;
    }
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
            java.util.logging.Logger.getLogger(StaffUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffUpdateProduct().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JTextArea jtaDesc;
    private javax.swing.JTable jtbProduct;
    private javax.swing.JTextField jtfImage;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfProductID;
    private javax.swing.JTextField jtfProductName;
    private javax.swing.JTextField jtfProductType;
    private javax.swing.JTextField jtfQuan;
    private javax.swing.JTextField jtfRM;
    private javax.swing.JTextField jtfStaffID;
    private javax.swing.JLabel lblCatog;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuan;
    private javax.swing.JLabel lblStaffID;
    // End of variables declaration//GEN-END:variables
}
