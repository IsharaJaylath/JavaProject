/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author T-PC
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    Connection conn = null;
    PreparedStatement pst = null;
   
   
    ResultSet rs = null;
    public Payment() {
        initComponents();
        conn=dbConnection.ConnecrDb();
        showDate();
    }
    void showDate(){
    Date d =new Date();
    SimpleDateFormat a = new SimpleDateFormat("yyyy/MM/dd");
    jLabeldate.setText(a.format(d));
    
    
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
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldpolTerm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldfaceAmount = new javax.swing.JTextField();
        jTextFieldinterest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonpaymentCreate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldcusNic = new javax.swing.JTextField();
        jLabelsearch = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldpolAmount1 = new javax.swing.JTextField();
        jTextFieldpolTerm1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldfaceAmount1 = new javax.swing.JTextField();
        jTextFieldinterest1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButtonpRegCreate1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPolId1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldpolPayamount = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldbalance = new javax.swing.JTextField();
        jTextFieldupdatedAmount = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldupdatedTerm = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldpolamount = new javax.swing.JTextField();
        jTextFieldavailable = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabeldate = new javax.swing.JLabel();
        jTextFieldcurrentAmount = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldagentId = new javax.swing.JTextField();
        jLabelpress = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(46, 153, 153));

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinMouseExited(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin)
                    .addComponent(jLabelClose)
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.setLayout(null);

        jTextFieldpolTerm.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldpolTerm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldpolTerm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldpolTerm);
        jTextFieldpolTerm.setBounds(140, 190, 150, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Policy Term  :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 190, 114, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Face Amount   :");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 260, 120, 17);

        jTextFieldfaceAmount.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldfaceAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldfaceAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldfaceAmount);
        jTextFieldfaceAmount.setBounds(140, 260, 150, 23);

        jTextFieldinterest.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldinterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldinterest.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldinterest);
        jTextFieldinterest.setBounds(140, 330, 150, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Interest   :");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 330, 105, 17);

        jButtonpaymentCreate.setBackground(new java.awt.Color(0, 139, 195));
        jButtonpaymentCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonpaymentCreate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonpaymentCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Create.png"))); // NOI18N
        jButtonpaymentCreate.setText("Create");
        jButtonpaymentCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpaymentCreateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonpaymentCreate);
        jButtonpaymentCreate.setBounds(650, 590, 107, 33);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancel.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(490, 590, 120, 33);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer NIC:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(20, 30, 105, 17);

        jTextFieldcusNic.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldcusNic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldcusNic.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldcusNic);
        jTextFieldcusNic.setBounds(130, 30, 150, 23);

        jLabelsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Finduser.png"))); // NOI18N
        jLabelsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelsearchMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelsearch);
        jLabelsearch.setBounds(290, 30, 30, 30);

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));
        jPanel5.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Policy Amount      :");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(70, 120, 128, 17);

        jTextFieldpolAmount1.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldpolAmount1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldpolAmount1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jTextFieldpolAmount1);
        jTextFieldpolAmount1.setBounds(210, 120, 150, 23);

        jTextFieldpolTerm1.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldpolTerm1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldpolTerm1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jTextFieldpolTerm1);
        jTextFieldpolTerm1.setBounds(210, 190, 150, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Policy Term:");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(70, 190, 128, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Face Amount   :");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(70, 260, 128, 17);

        jTextFieldfaceAmount1.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldfaceAmount1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldfaceAmount1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jTextFieldfaceAmount1);
        jTextFieldfaceAmount1.setBounds(210, 260, 150, 23);

        jTextFieldinterest1.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldinterest1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldinterest1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jTextFieldinterest1);
        jTextFieldinterest1.setBounds(210, 330, 150, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Interest   :");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(80, 330, 105, 17);

        jButtonpRegCreate1.setBackground(new java.awt.Color(0, 139, 195));
        jButtonpRegCreate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonpRegCreate1.setText("Create");
        jButtonpRegCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpRegCreate1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonpRegCreate1);
        jButtonpRegCreate1.setBounds(241, 450, 79, 25);

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jPanel5.add(jButton3);
        jButton3.setBounds(93, 450, 77, 25);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Customer NIC:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(40, 30, 139, 17);

        jTextFieldPolId1.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldPolId1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPolId1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jTextFieldPolId1);
        jTextFieldPolId1.setBounds(150, 30, 150, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Finduser.png"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(320, 20, 30, 30);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(176, 156, 710, 0);

        jTextFieldpolPayamount.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldpolPayamount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldpolPayamount.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldpolPayamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldpolPayamountKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldpolPayamountKeyTyped(evt);
            }
        });
        jPanel4.add(jTextFieldpolPayamount);
        jTextFieldpolPayamount.setBounds(600, 460, 150, 23);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Enter Pay Amount      :");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(420, 460, 180, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Updated Amount:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(0, 560, 130, 17);

        jTextFieldbalance.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldbalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldbalance.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldbalance);
        jTextFieldbalance.setBounds(600, 530, 150, 23);

        jTextFieldupdatedAmount.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldupdatedAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldupdatedAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldupdatedAmount);
        jTextFieldupdatedAmount.setBounds(140, 560, 150, 23);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Updated Term:");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(10, 440, 120, 17);

        jTextFieldupdatedTerm.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldupdatedTerm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldupdatedTerm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldupdatedTerm);
        jTextFieldupdatedTerm.setBounds(140, 440, 150, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Balance:");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(420, 530, 80, 17);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Policy Amount  :");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(20, 120, 114, 17);

        jTextFieldpolamount.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldpolamount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldpolamount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldpolamount);
        jTextFieldpolamount.setBounds(140, 120, 150, 23);

        jTextFieldavailable.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldavailable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldavailable.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldavailable);
        jTextFieldavailable.setBounds(140, 390, 150, 23);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Available Term  :");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(10, 390, 114, 17);

        jLabeldate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabeldate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabeldate);
        jLabeldate.setBounds(710, 20, 173, 37);

        jTextFieldcurrentAmount.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldcurrentAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldcurrentAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextFieldcurrentAmount);
        jTextFieldcurrentAmount.setBounds(140, 510, 150, 23);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Current Amount:");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(10, 510, 120, 17);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Agent ID     :");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(430, 120, 88, 17);

        jTextFieldagentId.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldagentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldagentId.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldagentId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldagentIdKeyPressed(evt);
            }
        });
        jPanel4.add(jTextFieldagentId);
        jTextFieldagentId.setBounds(550, 120, 150, 23);

        jLabelpress.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabelpress);
        jLabelpress.setBounds(770, 460, 87, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Customer NIC Here");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(330, 40, 180, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonpaymentCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpaymentCreateActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String nic=jTextFieldcusNic.getText();
            String uTerm=jTextFieldupdatedTerm.getText();
            String cAmount=jTextFieldupdatedAmount.getText();
            String pDate=jLabeldate.getText();
            String aid=jTextFieldagentId.getText();
            
            Statement pst1=conn.createStatement();
           pst1.executeUpdate("UPDATE CustomerPolicy SET aterms='"+jTextFieldupdatedTerm.getText()
                   +"',currntAmount='"+jTextFieldupdatedAmount.getText()+"'where nic='"+jTextFieldcusNic.getText()+"'");
             JOptionPane.showMessageDialog(this, "Customer Upadate Successfully");
         
            
            String query="insert into payment(nic,updatedTerm,currentAmount,payDate,aId) values(?,?,?,?,?)";
            pst = conn.prepareStatement(query);
            pst.setString(1, nic);
            pst.setString(2,uTerm);
            pst.setString(3, cAmount);
            pst.setString(4, pDate);
            pst.setString(5,aid);
        
           
           
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Policy Register Success");
            
           
          
           
           
        }
           
           
           
          
        catch (SQLException ex) {
            Logger.getLogger(CustomerReg.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }//GEN-LAST:event_jButtonpaymentCreateActionPerformed

    private void jButtonpRegCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpRegCreate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonpRegCreate1ActionPerformed

    private void jLabelsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsearchMouseClicked
        // TODO add your handling code here:
        String query="select*from CustomerPolicy where nic=?";
        String search =jTextFieldcusNic.getText();

        try {
            pst=conn.prepareStatement(query);
            pst.setString(1,search);
            rs =pst.executeQuery();
            if(rs.next()){
             
                String polName=rs.getString("polAmount");
                jTextFieldpolamount.setText(polName);
                String polterm=rs.getString("polterm");
                jTextFieldpolTerm.setText(polterm);
                String famount=rs.getString("fAmount");
                jTextFieldfaceAmount.setText(famount);
                String interest=rs.getString("interest");
                jTextFieldinterest.setText(interest);
                String aterm=rs.getString("aterms");
                jTextFieldavailable.setText(aterm);
                String aid=rs.getString("aId");
                jTextFieldagentId.setText(aid);
             
            }
        } catch (SQLException ex) {
            Logger.getLogger(PolicyMod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelsearchMouseClicked

    private void jTextFieldpolPayamountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpolPayamountKeyPressed
        // TODO add your handling code here:
      if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        double pay = Double.parseDouble(jTextFieldpolPayamount.getText());
        double famount = Double.parseDouble(jTextFieldfaceAmount.getText());
        String cusNic =jTextFieldcusNic.getText();
        String uAmount =jTextFieldfaceAmount.getText();
        int aterm =Integer.parseInt(jTextFieldavailable.getText());
        int naTerm=aterm-1;
        double balance =pay-famount;
        jTextFieldupdatedTerm.setText(Integer.toString(naTerm));
        jTextFieldbalance.setText(Double.toString(balance)); 
        
        
        String query="select*from payment where nic=?";
        String search =jTextFieldcusNic.getText();

        
        
       try {
            pst=conn.prepareStatement(query);
            pst.setString(1,search);
            rs =pst.executeQuery();
            if(rs.next()==false){
                jTextFieldcurrentAmount.setText("0");
                double curAmount = Double.parseDouble(jTextFieldcurrentAmount.getText());
                double updAmount=curAmount+famount;
                jTextFieldupdatedAmount.setText(Double.toString(updAmount));
            }else{
                String current=rs.getString("currentAmount");
                jTextFieldcurrentAmount.setText(current);
                double curAmount = Double.parseDouble(jTextFieldcurrentAmount.getText());
                double updAmount=curAmount+famount;
                jTextFieldupdatedAmount.setText(Double.toString(updAmount));
                
              
             
            }
        } catch (SQLException ex) {
            Logger.getLogger(PolicyMod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      }
       
         
    }//GEN-LAST:event_jTextFieldpolPayamountKeyPressed

    private void jTextFieldagentIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldagentIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldagentIdKeyPressed

    private void jTextFieldpolPayamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpolPayamountKeyTyped
        // TODO add your handling code here:
        jLabelpress.setText("Press enter Key");
    }//GEN-LAST:event_jTextFieldpolPayamountKeyTyped

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        // TODO add your handling code here:
        jLabelClose.setForeground(Color.red);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        // TODO add your handling code here:
        jLabelClose.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseEntered
        // TODO add your handling code here:
        jLabelMin.setForeground(Color.gray);
    }//GEN-LAST:event_jLabelMinMouseEntered

    private void jLabelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseExited
        // TODO add your handling code here:
        jLabelMin.setForeground(Color.white);
    }//GEN-LAST:event_jLabelMinMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menuadmin reg = new Menuadmin();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonpRegCreate1;
    private javax.swing.JButton jButtonpaymentCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabelpress;
    private javax.swing.JLabel jLabelsearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextFieldPolId1;
    private javax.swing.JTextField jTextFieldagentId;
    private javax.swing.JTextField jTextFieldavailable;
    private javax.swing.JTextField jTextFieldbalance;
    private javax.swing.JTextField jTextFieldcurrentAmount;
    private javax.swing.JTextField jTextFieldcusNic;
    private javax.swing.JTextField jTextFieldfaceAmount;
    private javax.swing.JTextField jTextFieldfaceAmount1;
    private javax.swing.JTextField jTextFieldinterest;
    private javax.swing.JTextField jTextFieldinterest1;
    private javax.swing.JTextField jTextFieldpolAmount1;
    private javax.swing.JTextField jTextFieldpolPayamount;
    private javax.swing.JTextField jTextFieldpolTerm;
    private javax.swing.JTextField jTextFieldpolTerm1;
    private javax.swing.JTextField jTextFieldpolamount;
    private javax.swing.JTextField jTextFieldupdatedAmount;
    private javax.swing.JTextField jTextFieldupdatedTerm;
    // End of variables declaration//GEN-END:variables
}
