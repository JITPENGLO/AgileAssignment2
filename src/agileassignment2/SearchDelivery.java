/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class SearchDelivery extends javax.swing.JFrame {

    /**
     * Creates new form SearchDelivery
     */
    public SearchDelivery() {
        initComponents();
        addRowToTable();
    }
    public class Delivery{
        public String orderId;
        public String custID;
        public String custName;
        public String date;
        public String address;
        public int postCode;
        public double totalPrice;
        
        
        public Delivery(String OrderId, String custID, String custName, String date, String address, int postCode, double totalPrice){
            this.orderId = OrderId;
            this.custID  = custID;
            this.custName = custName;
            this.date = date;
            this.address = address;
            this.postCode = postCode;
            this.totalPrice = totalPrice;
        }
    }
    
    public ArrayList DeliveryList(){
        ArrayList<Delivery> list = new ArrayList<Delivery>();
        Delivery d1 = new Delivery("OR0001", "CU1001", "Chong Chee Bin", "1/12/2018", "No 9 Jalan SP 3/1 Taman Segar Perdana", 43200 , 18.00);
        Delivery d2 = new Delivery("OR0002", "CU1009", "Mary",  "1/12/2018", "No 8 Jalan SP 3/2 Taman Mega", 43200 , 45.00);
        Delivery d3 = new Delivery("OR0003", "CU1023", "Lim Shy Pinn",  "2/12/2018", "No 7 Jalan SP 3/1 Taman Segar Perdana", 43200 , 6.50);
        Delivery d4 = new Delivery("OR0004", "CU1036", "Lo Jit Peng",  "2/12/2018", "No 8 Jalan SP 3/1 Taman Segar Perdana", 43200 , 3.00);
        Delivery d5 = new Delivery("OR0005", "CU1045", "Tan Hooi Xin", "3/12/2018", "No 3 Jalan SP 3/1 Taman Segar Perdana", 43200 , 5.00);
        Delivery d6 = new Delivery("OR0006", "CU1103", "Yip Kin Lit",  "1/12/2018", "No 5 Jalan SP 3/1 Taman Segar Perdana", 43200 , 30.00);
        
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);
        
        return list;
    }
    public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel) jtbDelivery.getModel();
        ArrayList<Delivery> list = DeliveryList();
        Object rowData[] = new Object[7];
        
        for(int i = 0; i < list.size(); i++){
            rowData[0] = list.get(i).orderId;
            rowData[1] = list.get(i).custID;
            rowData[2] = list.get(i).custName;
            rowData[3] = list.get(i).date;
            rowData[4] = list.get(i).address;
            rowData[5] = list.get(i).postCode;
            rowData[6] = list.get(i).totalPrice;

            
            model.addRow(rowData);
        }
    }
    
    public int selectedIndex(){
        ArrayList<Delivery> list = DeliveryList();
        int index = -1;
        
         for(int i = 0; i < list.size(); i++){
             if(jtfDate.getText().equals(list.get(i).date.toString())){
                 index = i;
             }
         }
         return index;
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
        jlbCompanyName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jlbDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbDelivery = new javax.swing.JTable();
        jtfDate = new javax.swing.JTextField();
        jbtSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jlbCompanyName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlbCompanyName.setText("Fiore Flowershop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jlbCompanyName)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlbCompanyName)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jlbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setText("Search Delivery List");

        jlbDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbDate.setText("Date:");

        jtbDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "CustomerID", "CustomerName", "DeliveryDate", "Address", "Post Code", "TotalPrice(RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbDelivery);

        jtfDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jbtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtSearch.setText("Search");
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jbtSearch)
                        .addGap(26, 26, 26)
                        .addComponent(jlbTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jtfDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jtbDelivery.getModel();
        ArrayList<Delivery> list = DeliveryList();
        Object rowData[] = new Object[7];
        model.setRowCount(0);
        
        for(int i = 0; i < list.size(); i++){
            if(jtfDate.getText().equals(list.get(i).date.toString())){
                
                rowData[0] = list.get(i).orderId;
                rowData[1] = list.get(i).custID;
                rowData[2] = list.get(i).custName;
                rowData[3] = list.get(i).date;
                rowData[4] = list.get(i).address;
                rowData[5] = list.get(i).postCode;
                rowData[6] = list.get(i).totalPrice;
                
                model.addRow(rowData);
            }else if(jtfDate.getText().equals("")){
                rowData[0] = list.get(i).orderId;
                rowData[1] = list.get(i).custID;
                rowData[2] = list.get(i).custName;
                rowData[3] = list.get(i).date;
                rowData[4] = list.get(i).address;
                rowData[5] = list.get(i).postCode;
                rowData[6] = list.get(i).totalPrice;
                
                model.addRow(rowData);
            }else if(!jtfDate.getText().equals(list.get(i).date.toString())){
                JOptionPane.showMessageDialog(null, "No such date", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong date format!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(SearchDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JLabel jlbCompanyName;
    private javax.swing.JLabel jlbDate;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JTable jtbDelivery;
    private javax.swing.JTextField jtfDate;
    // End of variables declaration//GEN-END:variables
}
