/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyRunner;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Temporary
 */
public class ProxyInterface extends javax.swing.JFrame {
    
    private ArrayList<ProxyBasic> proxylist = new ArrayList();
    
    /**
     * Creates new form ProxyInterface
     */
    public ProxyInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ssidTable = new javax.swing.JTable();
        addSSID = new javax.swing.JButton();
        editSSID = new javax.swing.JButton();
        removeSSID = new javax.swing.JButton();
        aboutSSID = new javax.swing.JButton();
        helpSSID = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSID List");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        ssidTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network SSID", "Enabled"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ssidTable);
        ssidTableGenerator();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        addSSID.setText("Add");
        addSSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSSIDActionPerformed(evt);
            }
        });

        editSSID.setText("Edit");

        removeSSID.setText("Remove");

        aboutSSID.setText("About");

        helpSSID.setText("Help");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editSSID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSSID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeSSID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutSSID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpSSID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addSSID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editSSID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeSSID)
                        .addGap(153, 153, 153)
                        .addComponent(helpSSID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aboutSSID))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Add Network SSID");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Help");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("About");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Exit");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // If window is minimized
        setVisible(false);
    }//GEN-LAST:event_formWindowIconified

    private void addSSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSSIDActionPerformed
        addSSID();
    }//GEN-LAST:event_addSSIDActionPerformed

    private void addSSID(){
        String ssid = JOptionPane.showInputDialog("Please enter the Network SSID");
        if (ssid != null) {
            proxylist.add(new ProxyBasic(ssid));
            ssidTableGenerator();
            int proxyChoice = JOptionPane.showConfirmDialog(null, "Would you like to add proxy settings?", "Add proxy settings", JOptionPane.YES_OPTION);
            if (proxyChoice == 0) {
                //show proxy adding frame.
                ProxyInput adds = new ProxyInput((ProxyBasic) proxylist.get(proxylist.size() - 1));
                adds.setVisible(true);
            } else {
                //no proxy to add.
            }
        }
    }
    
    
     
    private void createProxyBasic(String wifiSSID, String proxyAddress, int proxyPort){
        ProxyBasic proxy = new ProxyBasic(wifiSSID, proxyAddress, proxyPort);
        //write to serialized file for background task to read and pick up.
        
        File proxyFile = new File("ProxySettings.ser");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(proxyFile);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(proxy);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProxyInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProxyInterface.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if(oos!=null)oos.close();
                if(fos!=null)fos.close();
            } catch (IOException ex) {
                Logger.getLogger(ProxyInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void displayAbout(){
        JOptionPane.showMessageDialog(null, "This app was created to address the issue of "
                + "\nhaving to manually enable the proxy in"
                + "\nWindows. This should work Windows XP and up.");
    }
    
    public static void exit(){
        System.exit(0);
    }
    
    private void ssidTableGenerator(){
        DefaultTableModel model;
        
        model = (DefaultTableModel) ssidTable.getModel();
              
        model.setRowCount(0); //reset the table.
        ssidTable.setAutoCreateRowSorter(true);
        //populate table
        Object rowData[] = new Object[2];
        for(int i = 0; i < proxylist.size(); i++){ //create correct number of rows.
            rowData[0] = proxylist.get(i).getWifiSSID();
            rowData[1] = false;
            model.addRow(rowData);
        }
    
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
            java.util.logging.Logger.getLogger(ProxyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProxyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProxyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProxyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProxyInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutSSID;
    private javax.swing.JButton addSSID;
    private javax.swing.JButton editSSID;
    private javax.swing.JButton helpSSID;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton removeSSID;
    private javax.swing.JTable ssidTable;
    // End of variables declaration//GEN-END:variables
}