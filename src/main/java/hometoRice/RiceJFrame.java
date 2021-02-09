/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometoRice;

import hometoRice.until.Service;
import java.util.List;
import hometoRice.entity.Rice;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABC
 */
public class RiceJFrame extends javax.swing.JFrame {

   private Service service = new Service();
    
    public RiceJFrame() {
        initComponents();
        List<Rice> rices = service.queryRicesFromTable();
        showRiceTable(rices);
    }

    private void showRiceTable(List<Rice>rices){
        //清空 rice_table 的內容
        DefaultTableModel model = (DefaultTableModel) rice_table.getModel();
        model.setNumRows(0); // 清空
        //逐一將資料放入 rice_table 內
        for(Rice r : rices){
            Object[] rowData = {r.getId(),r.get品名() , r.get檢驗結果(),r.get不合格原因(),r.get行政處分()};
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

        kw = new javax.swing.JTextField();
        searchBth = new javax.swing.JButton();
        clearBth = new javax.swing.JButton();
        importBth = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rice_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("台米合格單");

        kw.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        kw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kwActionPerformed(evt);
            }
        });

        searchBth.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        searchBth.setText("查詢");
        searchBth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBthActionPerformed(evt);
            }
        });

        clearBth.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        clearBth.setText("清除");
        clearBth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBthActionPerformed(evt);
            }
        });

        importBth.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        importBth.setText("匯入");
        importBth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBthActionPerformed(evt);
            }
        });

        rice_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "編號", "品名", "檢驗結果", "不合格原因", "行政處分"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rice_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clearBth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(importBth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kw, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBth, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kw, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBth))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importBth)
                    .addComponent(clearBth))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    private void kwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kwActionPerformed
//查詢  buttn
    private void searchBthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBthActionPerformed
       String keyword = kw.getText();
        List<Rice> rices = service.queryRicesFromTable(keyword);
        showRiceTable(rices);  
    }//GEN-LAST:event_searchBthActionPerformed
//清空 buttn
    private void clearBthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBthActionPerformed
        service.clearRiceTable();
        List<Rice> rices = service.queryRicesFromTable();
        showRiceTable(rices);
        if(rices.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "資料已清除");
        }else {JOptionPane.showMessageDialog(rootPane, "清除失敗");        
        }
    }//GEN-LAST:event_clearBthActionPerformed
//匯入 buttn
    private void importBthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBthActionPerformed
       String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        service.importToRiceTable(url);
        List<Rice> rices = service.queryRicesFromTable();
        showRiceTable(rices);
        if(rices.size()>0){
            JOptionPane.showMessageDialog(rootPane, "資料已匯入");
        }else { JOptionPane.showMessageDialog(rootPane, "匯入失敗無資料可供匯入");
        }
    }//GEN-LAST:event_importBthActionPerformed

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
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBth;
    private javax.swing.JButton importBth;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kw;
    private javax.swing.JTable rice_table;
    private javax.swing.JButton searchBth;
    // End of variables declaration//GEN-END:variables

   
}
