import Project.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Random;

import java.sql.SQLException;


 /** Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Abi
 */
public class servicerequest extends javax.swing.JFrame {
     private String customerId;
       public servicerequest(String customerId)
       {
           this.customerId = customerId;
           initComponents();
           loadServices();
       }
        private void loadServices() {
        // Example services with prices
jComboBox1.addItem("Laptop Repair Services - ₹2,000 to ₹10,000");
jComboBox1.addItem("Computer Assembly - ₹3,000 to ₹8,000");
jComboBox1.addItem("CCTV Installation - ₹5,000 to ₹20,000");
jComboBox1.addItem("Inverter Installation - ₹2,000 to ₹5,000");
jComboBox1.addItem("Cable Management Services - ₹500 to ₹2,000");
jComboBox1.addItem("Toner Cartridge Replacement - ₹1,000 to ₹3,000");
jComboBox1.addItem("Ink Cartridge Refilling - ₹300 to ₹800");
jComboBox1.addItem("Printer Setup and Configuration - ₹500 to ₹2,000");
jComboBox1.addItem("Data Backup Services - ₹1,000 to ₹5,000");
jComboBox1.addItem("Network Setup and Configuration - ₹2,000 to ₹5,000");
jComboBox1.addItem("Software Installation - ₹500 to ₹2,000");
jComboBox1.addItem("Virus Removal Services - ₹1,000 to ₹3,000");
jComboBox1.addItem("Remote Tech Support - ₹500 to ₹2,000");
jComboBox1.addItem("Hard Drive Replacement - ₹2,000 to ₹6,000");
jComboBox1.addItem("RAM Upgrade Services - ₹1,500 to ₹4,000");
jComboBox1.addItem("Screen Replacement for Laptops - ₹3,000 to ₹8,000");
jComboBox1.addItem("Battery Replacement for Laptops - ₹1,000 to ₹3,000");
jComboBox1.addItem("CCTV Maintenance Services - ₹1,000 to ₹3,000");
jComboBox1.addItem("Inverter Maintenance Services - ₹500 to ₹2,000");
jComboBox1.addItem("Custom Cable Creation - ₹300 to ₹1,000");
jComboBox1.addItem("Pendrive Data Recovery - ₹1,000 to ₹4,000");
jComboBox1.addItem("Printer Maintenance Services - ₹500 to ₹2,000");
jComboBox1.addItem("Home Automation Consultation - ₹1,000 to ₹3,000");
jComboBox1.addItem("Wi-Fi Range Extender Setup - ₹1,000 to ₹2,500");
jComboBox1.addItem("Device Recycling Services - Free to ₹1,000");
jComboBox1.addItem("Training for Software Use - ₹1,000 to ₹3,000");
jComboBox1.addItem("Product Demonstration for Accessories - Free to ₹1,000");
jComboBox1.addItem("Installation of Connectivity Devices - ₹500 to ₹2,000");
jComboBox1.addItem("Firmware Updates for Devices - ₹500 to ₹1,500");
jComboBox1.addItem("Warranty Claims Assistance - ₹500 to ₹1,500");
jComboBox1.addItem("Laptop Diagnostic Services - ₹1,000 to ₹3,000");
jComboBox1.addItem("Computer Virus Protection Setup - ₹1,000 to ₹2,500");
jComboBox1.addItem("CCTV system Upgrades - ₹3,000 to ₹15,000");
jComboBox1.addItem("Inverter Battery Replacement - ₹2,000 to ₹5,000");
jComboBox1.addItem("Cable Testing Services - ₹500 to ₹1,500");
jComboBox1.addItem("Toner Cartridge Recycling - ₹200 to ₹500");
jComboBox1.addItem("Ink Cartridge Purchase and Installation - ₹400 to ₹1,200");
jComboBox1.addItem("Printer Troubleshooting - ₹500 to ₹1,500");
jComboBox1.addItem("Data Migration Services - ₹1,500 to ₹4,000");
jComboBox1.addItem("Network Security Setup - ₹2,000 to ₹6,000");
jComboBox1.addItem("Operating System Installation - ₹1,000 to ₹3,000");
jComboBox1.addItem("Hardware Upgrades for Computers - ₹2,000 to ₹8,000");
jComboBox1.addItem("CCTV Camera Positioning Consultation - ₹1,000 to ₹2,500");
jComboBox1.addItem("Inverter Load Testing - ₹500 to ₹1,500");
jComboBox1.addItem("Custom Cable Management Solutions - ₹1,000 to ₹3,000");
jComboBox1.addItem("Pendrive Formatting and Data Transfer - ₹300 to ₹800");
jComboBox1.addItem("Printer Connectivity Setup - ₹500 to ₹1,500");
jComboBox1.addItem("Home Network Optimization - ₹1,500 to ₹4,000");
jComboBox1.addItem("Remote Desktop Setup - ₹1,000 to ₹2,500");
jComboBox1.addItem("Backup Power Solutions Consultation - ₹1,000 to ₹3,000");
jComboBox1.addItem("CCTV System Monitoring Services - ₹1,500 to ₹5,000");
jComboBox1.addItem("Inverter System Troubleshooting - ₹1,000 to ₹3,000");
jComboBox1.addItem("Cable Installation for Networking - ₹1,000 to ₹3,000");
jComboBox1.addItem("Pendrive Data Encryption Services - ₹500 to ₹1,500");
jComboBox1.addItem("Printer Driver Installation - ₹300 to ₹1,000");
jComboBox1.addItem("Wi-Fi Network Expansion Services - ₹1,000 to ₹3,000");
jComboBox1.addItem("Device Configuration for Smart Home - ₹2,000 to ₹5,000");
jComboBox1.addItem("CCTV System Integration with Smart Devices - ₹3,000 to ₹10,000");
jComboBox1.addItem("Inverter System Maintenance Contracts - ₹1,500 to ₹4,000");
jComboBox1.addItem("Training for CCTV System Usage - ₹1,000 to ₹2,500");
jComboBox1.addItem("Haul Away & Recycling - Free to ₹1,000");
jComboBox1.addItem("Extended Warranties - ₹1,000 to ₹5,000");
jComboBox1.addItem("Repairs & Service - ₹500 to ₹10,000");
jComboBox1.addItem("Delivery Services - ₹500 to ₹2,000");
jComboBox1.addItem("Tech Support - ₹500 to ₹3,000");
jComboBox1.addItem("Product Setup Assistance - ₹500 to ₹2,000");
jComboBox1.addItem("Data Recovery Services - ₹1,000 to ₹4,000");
jComboBox1.addItem("Smart Home Device Installation - ₹1,500 to ₹4,000");
jComboBox1.addItem("Cable and Satellite Installation - ₹1,000 to ₹3,000");
jComboBox1.addItem("Mobile Device Repair Services - ₹1,000 to ₹5,000");
jComboBox1.addItem("Cloud Storage Setup - ₹1,000 to ₹3,000");
jComboBox1.addItem("Website Development Services - ₹5,000 to ₹20,000");
jComboBox1.addItem("SEO Services for Online Stores - ₹3,000 to ₹10,000");
jComboBox1.addItem("E-Waste Disposal Services - Free to ₹1,000");
jComboBox1.addItem("Custom PC Building Services - ₹3,000 to ₹10,000");
jComboBox1.addItem("Software Troubleshooting and Support - ₹500 to ₹2,000");
jComboBox1.addItem("Network Security Audits - ₹2,000 to ₹6,000");
jComboBox1.addItem("Digital Marketing Consultation - ₹2,000 to ₹5,000");
jComboBox1.addItem("Remote IT Support Services - ₹500 to ₹2,000");
jComboBox1.addItem("Training Workshops for Software Applications - ₹1,000 to ₹3,000");
jComboBox1.addItem("Subscription Services for Software - ₹500 to ₹2,000 per month");
jComboBox1.addItem("Custom Software Development - ₹10,000 to ₹50,000");
jComboBox1.addItem("Data Encryption and Security Services - ₹1,500 to ₹4,000");
jComboBox1.addItem("Virtual Assistant Services - ₹1,000 to ₹3,000 per month");
jComboBox1.addItem("Social Media Management Services - ₹2,000 to ₹5,000 per month");
        
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details page1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel2.setText("Select Service");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 160, -1));

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel3.setText("Service Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 160, -1));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 310, 30));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 310, 30));

        jButton1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, -1, 50));

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("SERVICE REQUEST");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 350, -1));

        jButton2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 120, 50));

        jButton3.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("HOME ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/detailpage.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1590, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String customerId = UserSession.getCustomerId();
        String service=(String)jComboBox1.getSelectedItem();
        String requestdate=jTextField2.getText();
        String servicereqid=generateid();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            // Extract service name
            st.executeUpdate("INSERT INTO newserv(requestid,custid,requestdate, servicename) VALUES ('"+servicereqid + "','" + customerId + "','" + requestdate + "','"+service+"')");
            
            // Show dialog with service request ID
            JOptionPane.showMessageDialog(null, "Service Request ID: " + servicereqid);
            
            // Proceed to payment module (you can create a new class for payment)
            new payment(servicereqid,customerId,service).setVisible(true);
            setVisible(false);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error making service request: " + e.getMessage());
        }
    }

    private String generateid() {
        Random random = new Random();
        return String.format("%06d", random.nextInt(999999));

        


  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Home(customerId).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
