package  Pennyworth;

import static Pennyworth.OPERATIONS.Cashinfo;
import static Pennyworth.pay_electricity.AvailableBalance;
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


public class fifth extends javax.swing.JFrame {

     static  String cardno;
     static int payamt;
     static int CurrentCredits;
     static String Duedate;
      static double AvBalance;
     
    
    
   
    public fifth() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCardNo = new javax.swing.JTextField();
        txtDueDate = new javax.swing.JTextField();
        radioNetBanking = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPayAmount1 = new javax.swing.JTextField();
        lblAvailableBalance = new javax.swing.JLabel();
        btnPayCreditCardBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(25, 68, 239));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 243, 243));
        jLabel1.setText("Now pay instatly through Netbanking");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Pay Your SBI Credit Card Payment ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/netbanking.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(461, 461, 461))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(388, 388, 388))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel3.setText("SBI CARD NO.(16 digit )*");

        txtCardNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardNoFocusLost(evt);
            }
        });

        txtDueDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDueDateFocusGained(evt);
            }
        });

        radioNetBanking.setText("Net Banking");
        radioNetBanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNetBankingActionPerformed(evt);
            }
        });

        jLabel6.setText("Pay From *");

        jLabel8.setText("Payment Amount (RS. )*");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(237, 22, 22));
        jLabel9.setText("Pay Your SBI CREDIT CARD BILL");

        jLabel10.setText("Due Date");

        txtPayAmount1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPayAmount1FocusGained(evt);
            }
        });

        btnPayCreditCardBill.setBackground(new java.awt.Color(29, 198, 224));
        btnPayCreditCardBill.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnPayCreditCardBill.setText("Pay");
        btnPayCreditCardBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayCreditCardBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(149, 149, 149)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPayAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNetBanking))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAvailableBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPayCreditCardBill, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPayAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioNetBanking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvailableBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPayCreditCardBill)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 266, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void radioNetBankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNetBankingActionPerformed
        // TODO add your handling code here:
        
    if(radioNetBanking.isSelected()){      
        
        try{
            
     
            
             cardno=txtCardNo.getText();
            
            
            
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
           
            payamt=cardinfo.getInt("CurrentCredits");
       
            Duedate=cardinfo.getString("DueDate");
           

             
             System.out.println("Payamt--->"+payamt+"\nDueDate"+Duedate);
           
            
            
              DBObject find_obj=new BasicDBObject("AccountNo",OPERATIONS.Acc);
              DBCursor findQuery = coll_bank.find(find_obj);
              
              
              
              
              
              DBObject result=new BasicDBObject();
              
              result=findQuery.next();
              
              System.out.println(result);
              
              AvBalance=(int)result.get("AvailableBalance");
              
              System.out.println("avl"+AvBalance);
              
              lblAvailableBalance.setText(""+AvBalance);
              
            
              
          
       
         
     } 
         
         catch(Exception e){
     
           
         }
            
            
            
            
        }
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
     
        
    }//GEN-LAST:event_radioNetBankingActionPerformed

    
    
    
    
    private void btnPayCreditCardBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayCreditCardBillActionPerformed
     
          
        
        
        try{
            
            
            cardno=txtCardNo.getText();
     
            
            
            
            
            
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

            
            

           
            
             
             double AvBalance=0;
            
            BasicDBObject query=new BasicDBObject("CreditCard.CardNo",cardno);
            BasicDBObject fields=new BasicDBObject("CreditCard.$", 1);

            DBCursor f = coll_bank.find(query, fields);
            
            BasicDBList cardinfo_list =(BasicDBList)f.next().get("CreditCard"); 
            BasicDBObject cardinfo =(BasicDBObject)cardinfo_list.get(0);
           
            payamt=cardinfo.getInt("CurrentCredits");
       
            Duedate=cardinfo.getString("DueDate");
           

             
             
             System.out.println("Payamt--->"+payamt+"\nDueDate"+Duedate);
           
            
            
              DBObject find_obj=new BasicDBObject("AccountNo",OPERATIONS.Acc);
              DBCursor findQuery = coll_bank.find(find_obj);
              
              
              
              
              
              DBObject result=new BasicDBObject();
              
              result=findQuery.next();
              
              System.out.println(result);
              
              AvBalance=(double)result.get("AvailableBalance");
              
              System.out.println("avl"+AvBalance);
              
              
              
              if(payamt>AvBalance){
                  
                  JOptionPane.showMessageDialog(rootPane,"Available Balance is less than Amount to Pay","ERROR",JOptionPane.ERROR_MESSAGE);
                  this.dispose();
              }
              
              
              
            
              
              AvBalance=AvBalance-payamt;
             
          
           // UPDATING THE AVAILABLE BALANCE AMOUNTT             
              
           BasicDBObject newDocument = new BasicDBObject();
           newDocument.append("$set", new BasicDBObject().append("AvailableBalance",AvBalance));
           BasicDBObject searchQuery = new BasicDBObject().append("AccountNo",OPERATIONS.Acc);
           coll_bank.update(searchQuery, newDocument);
   
             
            
            
      // UPDATING THE CURRENT CREDITS TO 0 AND DUE DATE TO -----
           
               
            //STEP 3 : INCREASING THE CURRENT CREDITS 
            
            
              int amt=0;
            
              BasicDBObject query_credit = new BasicDBObject();
              query.put("CreditCard.CardNo",cardno);

              BasicDBObject data = new BasicDBObject();
              data.put("CreditCard.$.CurrentCredits",amt);
              data.put("CreditCard.$.DueDate","---");

             BasicDBObject command = new BasicDBObject();
             command.put("$set", data);

              coll_bank.update(query, command);
            
            
           
           
            
                     
   // ADDING TRANSACTION DETAILS TO THE BACKEND
           
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
           Date dateobj = new Date();
           
           DBObject curUser=new BasicDBObject("UserName",Mint_login.login_username);
            
           DBObject listItem = new BasicDBObject("Transactions", new BasicDBObject("TransactionNo",pay_electricity.TransactionNo).append("DateofTransaction",dateobj).append("TransactionDescription","Paid for Credit Card Payment : "+cardno).append("TransactionCategory","Credit Card Payment").append("TransactionAmount",payamt));
           DBObject updateQuery = new BasicDBObject("$push", listItem);
           coll.update(curUser, updateQuery);
            
           
           JOptionPane.showMessageDialog(rootPane,"Credit Card Payment Sucessfull !!!");
           OPERATIONS.reterive();
           this.dispose();
            
       
         
 
            
            
            
            
        }
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnPayCreditCardBillActionPerformed

    private void txtCardNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardNoFocusLost

        
        
    }//GEN-LAST:event_txtCardNoFocusLost

    private void txtPayAmount1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayAmount1FocusGained
        // TODO add your handling code here:
          
        try{
            
            
     
            
            
             cardno=txtCardNo.getText();
            
            
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

       
            
       
            
            BasicDBObject query=new BasicDBObject("CreditCard.CardNo",cardno);
            BasicDBObject fields=new BasicDBObject("CreditCard.$", 1);

            DBCursor f = coll_bank.find(query, fields);
            
            BasicDBList cardinfo_list =(BasicDBList)f.next().get("CreditCard"); 
            BasicDBObject cardinfo =(BasicDBObject)cardinfo_list.get(0);
           
            payamt=cardinfo.getInt("CurrentCredits");
       

           

            
             txtPayAmount1.setText(""+payamt);
             txtPayAmount1.setEditable(false);
            
             
             
            
       
         
   
            
            
            
        }
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_txtPayAmount1FocusGained

    private void txtDueDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDueDateFocusGained
        // TODO add your handling code here:
        
          
        try{
            
            
           
             cardno=txtCardNo.getText();
            
            
            
            
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

            

           
            
            
            BasicDBObject query=new BasicDBObject("CreditCard.CardNo",cardno);
            BasicDBObject fields=new BasicDBObject("CreditCard.$", 1);

            DBCursor f = coll_bank.find(query, fields);
            
            BasicDBList cardinfo_list =(BasicDBList)f.next().get("CreditCard"); 
            BasicDBObject cardinfo =(BasicDBObject)cardinfo_list.get(0);
           
            payamt=cardinfo.getInt("CurrentCredits");
       
            Duedate=cardinfo.getString("DueDate");
           

          
             txtDueDate.setText(""+Duedate);
             txtDueDate.setEditable(false);
             
             
           
 
            
            
            
        }
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    
    }//GEN-LAST:event_txtDueDateFocusGained

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(fifth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fifth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fifth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fifth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fifth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayCreditCardBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAvailableBalance;
    private javax.swing.JRadioButton radioNetBanking;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtPayAmount1;
    // End of variables declaration//GEN-END:variables
}
