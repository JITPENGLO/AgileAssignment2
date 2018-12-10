/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment2;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class SearchPickUp extends javax.swing.JFrame {

    public static final long current_time_milles = System.currentTimeMillis();
    
    ArrayList<PickUp> list = PickUpList();
    
    /**
     * Creates new form SearchPickUp
     */
    public SearchPickUp() {
        initComponents();
        addRowToTable();
    }
    
    public SearchPickUp(PickUp cPickUp){
        initComponents();
        updateList(cPickUp);
        addRowToTable();
    }
    
    private void updateList(PickUp cPickUp){
        for(int i = 0;i < list.size();i++){
            if((list.get(i).orderId).equals(cPickUp.getOrderId())){
                list.get(i).timeStamp = cPickUp.getTimeStamp();
                list.get(i).status = cPickUp.getStatus();
            }
        }
    }
    
    IndicatePickUp indicatePickUp = new IndicatePickUp();
      
    public ArrayList PickUpList(){
        ArrayList<PickUp> defaultList = new ArrayList<PickUp>();
        PickUp p1 = new PickUp("OR0001", "CU1001", "Chong Chee Bin", "1/12/2018", "10.00 AM", 18.00, "null", "Unpaid");
        PickUp p2 = new PickUp("OR0002", "CU1009", "Mary",  "1/12/2018", "10.00 AM", 45.00, "null", "Unpaid");
        PickUp p3 = new PickUp("OR0003", "CU1023", "Lim Shy Pinn",  "2/12/2018", "8.30 PM", 6.50, "null", "Unpaid");
        PickUp p4 = new PickUp("OR0004", "CU1036", "Lo Jit Peng",  "2/12/2018", "8.30 PM", 3.00, "null", "Unpaid");
        PickUp p5 = new PickUp("OR0005", "CU1045", "Tan Hooi Xin", "3/12/2018", "5.00 PM", 5.00, "null", "Unpaid");
        PickUp p6 = new PickUp("OR0006", "CU1103", "Yip Kin Lit",  "1/12/2018", "3.00 PM", 30.00, "null", "Unpaid");
        
        defaultList.add(p1);
        defaultList.add(p2);
        defaultList.add(p3);
        defaultList.add(p4);
        defaultList.add(p5);
        defaultList.add(p6);
        
        return defaultList;
    }
        
    public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel) jtbPickUp.getModel();
        ArrayList<PickUp> nList = list;
        Object rowData[] = new Object[8];
        
        for(int i = 0; i < nList.size(); i++){
            rowData[0] = nList.get(i).orderId;
            rowData[1] = nList.get(i).custID;
            rowData[2] = nList.get(i).custName;
            rowData[3] = nList.get(i).date;
            rowData[4] = nList.get(i).time;
            rowData[5] = nList.get(i).totalPrice;
            rowData[6] = nList.get(i).timeStamp;
            rowData[7] = nList.get(i).status;

            
            model.addRow(rowData);
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */               

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPickUp = new javax.swing.JTable();
        jtfDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jlbCompanyName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlbCompanyName.setText("Fiore Flowershop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jlbCompanyName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jlbCompanyName)
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setText("Search Pick Up List");

        jlbDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbDate.setText("Date:");

        jtbPickUp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "CustomerID", "Name", "Pick Up Date", "Pick Up Time", "Total Price(RM)", "TimeStamp", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbPickUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPickUpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbPickUp);

        jtfDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jlbTitle)
                        .addGap(0, 358, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtfDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbTitle)
                        .addComponent(jlbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jtbPickUp.getModel();
        ArrayList<PickUp> list = PickUpList();
        Object rowData[] = new Object[8];
        model.setRowCount(0);
        
        for(int i = 0; i < list.size(); i++){
            if(jtfDate.getText().equals(list.get(i).date.toString())){
                
                rowData[0] = list.get(i).orderId;
                rowData[1] = list.get(i).custID;
                rowData[2] = list.get(i).custName;
                rowData[3] = list.get(i).date;
                rowData[4] = list.get(i).time;
                rowData[5] = list.get(i).totalPrice;
                rowData[6] = list.get(i).timeStamp;
                rowData[7] = list.get(i).status;
                
                model.addRow(rowData);
            }else if(jtfDate.getText().equals("")){
                rowData[0] = list.get(i).orderId;
                rowData[1] = list.get(i).custID;
                rowData[2] = list.get(i).custName;
                rowData[3] = list.get(i).date;
                rowData[4] = list.get(i).time;
                rowData[5] = list.get(i).totalPrice;
                rowData[6] = list.get(i).timeStamp;
                rowData[7] = list.get(i).status;
                
                model.addRow(rowData);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtbPickUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPickUpMouseClicked
        // TODO add your handling code here:
        
        int index = jtbPickUp.getSelectedRow();
        
        TableModel model = jtbPickUp.getModel();
        
        indicatePickUp.setVisible(true);
        indicatePickUp.pack();
        indicatePickUp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        try{
        Date time = new Date(current_time_milles);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        
        indicatePickUp.jtfOrderID.setText(model.getValueAt(index, 0).toString());
        indicatePickUp.jtfCustomerID.setText(model.getValueAt(index, 1).toString());
        indicatePickUp.jtfCustomerName.setText(model.getValueAt(index, 2).toString());
        indicatePickUp.jtfTotalPrice.setText(model.getValueAt(index, 5).toString());
        indicatePickUp.jtfCollectionTime.setText(sdf.format(time));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jtbPickUpMouseClicked

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
            java.util.logging.Logger.getLogger(SearchPickUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPickUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPickUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPickUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPickUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbCompanyName;
    private javax.swing.JLabel jlbDate;
    private javax.swing.JLabel jlbTitle;
    public javax.swing.JTable jtbPickUp;
    private javax.swing.JTextField jtfDate;
    // End of variables declaration//GEN-END:variables
}
