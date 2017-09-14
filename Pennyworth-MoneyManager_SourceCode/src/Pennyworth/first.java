package  Pennyworth;

import static Pennyworth.OPERATIONS.Cashinfo;
import static Pennyworth.sbofindia.sbiusername;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

//Packages
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class first extends javax.swing.JFrame {

    static String cardno;
    static String nameoncard;
    static int currentcredits=0;
    static String cardType;
    
    
    public first() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPayCredit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboCreditCardType = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtCreditCardNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNameonCard = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblBillAmount = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 165, 226));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to State Bank of India's secure payment Gateway");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/sbi1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/Credit_Card.png"))); // NOI18N

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel10.setText(" PAY  WITH  SBI  CREDIT CARD ");

        jLabel4.setText("Select type of card * ");

        ComboCreditCardType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Master Card", "VISA", "Maestro", "Rupay", " " }));

        jLabel6.setText("Card Number *");

        txtCreditCardNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCreditCardNoFocusLost(evt);
            }
        });
        txtCreditCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditCardNoActionPerformed(evt);
            }
        });

        jLabel5.setText("Name on Card");

        txtNameonCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameonCardActionPerformed(evt);
            }
        });

        jLabel7.setText("Purchase Amount");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Pay Now");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreditCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboCreditCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameonCard, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel10)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboCreditCardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreditCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNameonCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Benefits on your SBI Card");

        jLabel9.setText("Convenience and savings at one place");

        jLabel11.setText("1) Balance Transfer");

        jLabel12.setText("2) Balance Transfer on EMI");

        jLabel13.setText("3) Flexipay");

        jLabel14.setText("4) Encash");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout btnPayCreditLayout = new javax.swing.GroupLayout(btnPayCredit);
        btnPayCredit.setLayout(btnPayCreditLayout);
        btnPayCreditLayout.setHorizontalGroup(
            btnPayCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPayCreditLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnPayCreditLayout.setVerticalGroup(
            btnPayCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayCreditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(159, 159, 159))
            .addGroup(btnPayCreditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnPayCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPayCredit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreditCardNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditCardNoFocusLost

        txtNameonCard.setText(""+nameoncard);
        txtNameonCard.setEditable(false);

    }//GEN-LAST:event_txtCreditCardNoFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{

            cardno=txtCreditCardNo.getText();
            nameoncard=txtNameonCard.getText();
            currentcredits=0;
            lblBillAmount.setText(""+pay_electricity.BillAmount);

            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database

            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

            try{

                BasicDBObject query=new BasicDBObject("CreditCard.CardNo",cardno);
                BasicDBObject fields=new BasicDBObject("CreditCard.$", 1);

                DBCursor f = coll_bank.find(query, fields);

                BasicDBList cardinfo_list =(BasicDBList)f.next().get("CreditCard");
                BasicDBObject cardinfo =(BasicDBObject)cardinfo_list.get(0);

                currentcredits=cardinfo.getInt("CurrentCredits");
                cardType=cardinfo.getString("CardType");

                // STEP 1 : FINDING THE CURRENT CREDITS
                new ProgressBarDelay("Transaction Completed");

                ComboCreditCardType.setSelectedItem(cardType);
                ComboCreditCardType.setEditable(false);
                ComboCreditCardType.setEnabled(false);

                // GETTING THE NAME OF THE CUSTOMER AUTOMATICALLY

                DBObject w=new BasicDBObject("AccountNo",OPERATIONS.Acc);
                DBCursor k=coll_bank.find(w);

                nameoncard=(String)k.next().get("AccountHolder");

                //STEP2 : GETTING THE BILL AMOUNT

                System.out.println("Bill Amount"+pay_electricity.BillAmount);

                //STEP 3 : INCREASING THE CURRENT CREDITS

                currentcredits=currentcredits+(int)pay_electricity.BillAmount;

                System.out.println("current credits after"+currentcredits);

                BasicDBObject query_credit = new BasicDBObject();
                query.put("CreditCard.CardNo",cardno);

                BasicDBObject data = new BasicDBObject();
                data.put("CreditCard.$.CurrentCredits",currentcredits);

                BasicDBObject command = new BasicDBObject();
                command.put("$set", data);

                coll_bank.update(query, command);

                // STEP 4 : CALLING RETERIVE _CREDITS

                OPERATIONS.reterive();
                OPERATIONS.CreditSum();

                // PUTTING THE DATA INTO TRANSACTION FIELD

                // ADDING TRANSACTION DETAILS TO THE BACKEND

                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateobj = new Date();

                DBObject curUser=new BasicDBObject("UserName",Mint_login.login_username);

                DBObject listItem = new BasicDBObject("Transactions", new BasicDBObject("TransactionNo",pay_electricity.TransactionNo).append("DateofTransaction",dateobj).append("TransactionDescription","Paid for Electricity Bill "+pay_electricity.billMonth).append("TransactionCategory","Electricity Bill").append("TransactionAmount",pay_electricity.BillAmount));
                DBObject updateQuery = new BasicDBObject("$push", listItem);
                coll.update(curUser, updateQuery);

                BasicDBObject newDocument_ElectricityBill = new BasicDBObject();
                newDocument_ElectricityBill.append("$set", new BasicDBObject().append("TotalCharges",0));
                BasicDBObject searchQuery_Consumer = new BasicDBObject().append("ConsumerNo",pay_electricity.ConsumerNo);
                coll_bank.update(searchQuery_Consumer, newDocument_ElectricityBill);

                OPERATIONS.reterivalTransaction();

                this.dispose();

            }

            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane,"Card  No Does Not Match");
                txtCreditCardNo.setText("");
            }

        }
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCreditCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditCardNoActionPerformed

    private void txtNameonCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameonCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameonCardActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new first().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboCreditCardType;
    private javax.swing.JPanel btnPayCredit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBillAmount;
    public static javax.swing.JTextField txtCreditCardNo;
    private javax.swing.JTextField txtNameonCard;
    // End of variables declaration//GEN-END:variables
}
